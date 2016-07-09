var ClientList = React.createClass({
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
            return (<tr key = {itemObj.id}>
            <td> {itemObj.id}</td>
            <td> {itemObj.clientName}</td>
            <td> {itemObj.clientId}</td>
            <td> {itemObj.clientSecret}</td>
            </tr>);
        });

        return ( <table className = 'table table-bordered table-hover'>
            <thead>
            <tr><th> ID </th><th> 客户端名称 </th><th> 客户端id </th><th> 客户端密钥 </th></tr>
            </thead>
            <tbody>{clientHtml}</tbody>
            </table>);
    }
});

ReactDOM.render( <ClientList source = "http://localhost:8080/client/list2" />, document.getElementById('test'));
