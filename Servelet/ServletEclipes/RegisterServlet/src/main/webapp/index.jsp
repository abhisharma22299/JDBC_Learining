<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
<style >

.container{
width:40%;
justify-content: center;
text-align: center;
border:1px solid #e2e2e2;
margin: auto;
padding: 20px;
font-size: 25px;
margin-top: 120px;
}
#myform tr td input{
font-size: 25px;

}
</style>
</head>
<body>

<div class="container"> 
		
<h1>Register Here</h1>
<form action="RegisterServlet" method="post">


<table id="myform">
<!--Enter your name -->
<tr>
<td>Enter Your Name</td>
<td><input type="text" name="user_name"></input></td>
</tr>
<!--Enter your Password -->
<tr>
<td>Enter Your Password</td>
<td><input type="password" name="password"></input></td>
</tr>

<!--Enter your Email -->
<tr>
<td>Enter Your Email</td>
<td><input type="email" name="email"></input></td>
</tr>

<!--Select your gender -->
<tr>
<td>Select Gender</td>
<td><input type="radio" name="user_gender" value="male"/>Male &nbsp; &nbsp;  
<input type="radio" name="user_gender" value="female">Female</td>

</tr>

<!--Select your Course -->
<tr>
<td>Select S</td>
<td>
<select name="course">
<option value="#">Course</option>
<option value="Java">Java</option>
<option value="Php">Php</option>
<option value="Python">Python</option>
<option value="JavaScript">JavaScript</option>
<option value="Java">Java</option>
</select>
</td>
</tr>
<!--Enter your submit -->
<td>

</td>
<td>
<input type="reset" ></input>
<input type="submit"></input>
</td>


</table>


</form>
</div>
</body>
</html>