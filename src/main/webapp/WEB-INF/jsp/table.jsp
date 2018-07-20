<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%    
    String path = request.getContextPath();    
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
 %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellpadding="10" cellspacing="0">  
            <tr>  
                <th>ID</th>  
                <th>用户名</th>   
                <th>年龄</th>  
            </tr>  
              
            <c:forEach items="${people}" var="person">  
                <tr>  
                    <td>${person.id}</td>  
                    <td>${person.account}</td>  
                    <td>${person.age}</td>  
                </tr>  
            </c:forEach>  
        </table>
</body>
</html>
