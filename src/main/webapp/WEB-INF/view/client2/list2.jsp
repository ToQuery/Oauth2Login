<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resource/plugin/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script>
        var ctx = "";
    </script>
</head>
<body>

<div id="test"></div>
<script src="${pageContext.request.contextPath}/resource/plugin/react/react.js"></script>
<script src="${pageContext.request.contextPath}/resource/plugin/react/react-dom.js"></script>
<script src="${pageContext.request.contextPath}/resource/plugin/browser.min.js"></script>
<script src="${pageContext.request.contextPath}/resource/plugin/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="${pageContext.request.contextPath}/resource/plugin/bootstrap/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/script/build/clientlist.js"></script>


<%--<script type="text/babel" src="http://localhost:8080${pageContext.request.contextPath}/script/client/clientlist.js"></script>
<script type="text/babel">
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

ReactDOM.render( <ClientList source = "http://localhost:8080${pageContext.request.contextPath}/client/list2" />, document.getElementById('test'));
</script>--%>
</body>
</html>