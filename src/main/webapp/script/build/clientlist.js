var ClientList = React.createClass({displayName: "ClientList",
    getInitialState: function () {
        return {data: []};
    },
    componentDidMount: function () {
        $.get(this.props.source, function (result) {
            this.setState({data: result});
        }.bind(this)).error(function(xhr,errorText,errorType,sssss){
            console.info(xhr.status);
            console.info(errorText);
            console.info(errorType);
        });
    },
    render: function () {
        var clientList = this.state.data;

        var clientHtml = clientList.map(function (itemObj) {
            return (React.createElement("tr", {key: itemObj.id}, 
            React.createElement("td", null, " ", itemObj.id), 
            React.createElement("td", null, " ", itemObj.clientName), 
            React.createElement("td", null, " ", itemObj.clientId), 
            React.createElement("td", null, " ", itemObj.clientSecret)
            ));
        });

        return ( React.createElement("table", {className: "table table-bordered table-hover"}, 
            React.createElement("thead", null, 
            React.createElement("tr", null, React.createElement("th", null, " ID "), React.createElement("th", null, " 客户端名称 "), React.createElement("th", null, " 客户端id "), React.createElement("th", null, " 客户端密钥 "))
            ), 
            React.createElement("tbody", null, clientHtml)
            ));
    }
});

ReactDOM.render( React.createElement(ClientList, {source: "http://localhost:8080/oauth2login/client/list2"}), document.getElementById('test'));
