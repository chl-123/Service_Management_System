<%--
  Created by IntelliJ IDEA.
  User: chl
  Date: 2021/7/17
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://${pageContext.request.serverName }:${pageContext.request.serverPort }${pageContext.request.contextPath }/AfterServiceSystem"/>
    <link rel="stylesheet" href="layui/css/layui.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="layui/layui.js"></script>
    <script>
        $(function(){

            window.pageNum=1;
            window.pageSize= 5;
            window.departmentName="设计部";
            window.userName="陈洪龙";
            window.status=null;
            var staff={
                "pageNum":window.pageNum,
                "pageSize":window.pageSize,
                "admin":{
                    "userName"     :window.userName,
                    "status"       : window.status,
                },
                "department": {
                    "departmentName":window.departmentName,
                }
            };
            var staff=JSON.stringify(staff);
            var url="http://localhost:8081/ServiceManagementSystem/admin/test/page.json"
            // var ajaxResult = $.ajax({
            //     "url": url,
            //     "type":"post",
            //     "contentType" : "application/json;charset=UTF-8",
            //     "data": staff,
            //     "async":false,
            //     "dataType":"json"
            // });

            // console.log(ajaxResult);

            var department={
                "departmentName":window.departmentName,
            }
            var departments=JSON.stringify(department);
            var url="http://localhost:8081/ServiceManagementSystem/admin/test3/page.json"
            var ajaxResult = $.ajax({
                "url": url,
                "type":"post",
                "contentType" : "application/json;charset=UTF-8",
                "data": departments,
                "async":false,
                "dataType":"json"
            });

            console.log(ajaxResult);

            var url="http://localhost:8081/ServiceManagementSystem/get/GearCase/info.json"
            var ajaxResult3 = $.ajax({
                "url": url,
                "type":"post",
                "async":false,
                "dataType":"json"
            });

            console.log(ajaxResult3);

            var url="http://localhost:8081/ServiceManagementSystem/get/clients/info.json"
            var ajaxResult4 = $.ajax({
                "url": url,
                "type":"post",
                "async":false,
                "dataType":"json"
            });

            console.log(ajaxResult4);

            var url="http://localhost:8081/ServiceManagementSystem/get/departments/info.json"
            var ajaxResult4 = $.ajax({
                "url": url,
                "type":"post",
                "async":false,
                "dataType":"json"
            });

            console.log(ajaxResult4);

            var url="http://localhost:8081/ServiceManagementSystem/get/problems/info.json"
            var ajaxResult4 = $.ajax({
                "url": url,
                "type":"post",
                "async":false,
                "dataType":"json"
            });

            console.log(ajaxResult4);



        });

    </script>
</head>
<body>

</body>
</html>
