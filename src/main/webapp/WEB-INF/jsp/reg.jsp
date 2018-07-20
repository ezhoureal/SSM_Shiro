<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<form name="form1" action="register" method="POST">
	用户名:<input type="text" value="${param.username}" name="username"/> <br/>
	密码:<input type="password" value="${param.password}" name="password"/> <br/>
	确认密码:<input type="password"  name="confirm"/> <br/>
	<script language="javascript" type="text/javascript"> 
function check()
{
if (document.form1.username.value==""){
alert("请输入登录账号!");
return false;
}
if (document.form1.password.value==""){
alert("请输入登录密码!");
return false;
}
if (document.form1.confirm.value==""){
alert("请输入重复密码!");
return false;
}
if (document.form1.password.value!=document.form1.confirm.value){
alert("对不起!重复密码不等于登录密码");
return false;
}
return true; 
}
</script> 
<input type="submit" value="提交" onClick="return check()">
</form>
<hr/>
<label style="color:red;"> ${message} </label>
</body>
</html>