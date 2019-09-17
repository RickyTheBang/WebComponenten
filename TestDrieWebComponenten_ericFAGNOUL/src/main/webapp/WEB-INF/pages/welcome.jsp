<%--
  Created by IntelliJ IDEA.
  User: ERICF
  Date: 09/09/2019
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType='text/html;charset=UTF-8' language='java' %>
<html>
<head>
    <title>Welcome ${sessionName}</title>
</head>
<body>
<h1>Welcome ${sessionName}</h1>
<%--sessionstarttime?--%>
${sessionStartTime}
<form action='logOut' method='GET'>
    <input type='submit' value='Log out'><br/>
</form>


</body>
</html>
