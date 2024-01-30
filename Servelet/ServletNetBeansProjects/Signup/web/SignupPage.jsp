<%-- 
    Document   : SignupPage
    Created on : 28-Jan-2024, 1:27:16 pm
    Author     : Abhishek Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <!--https://materializecss.com/getting-started.html -->
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: url(IMG/portfolio3.jpg);background-size: cover;background-attachment: fixed;">
        <div class="container ">
            <div class="row ">
                <div class="col m6 offset-m3">
                    
                
                <div class="card ">
                    <div class="card-content "> 
                        <div class="center-align">
                             <h3>Register here</h3>
                            
                        </div>
                        <h5 id="msg"></h5>
                                    <br />
                                    <div class="form center-align">
                                        
                                        <!--//creating form-->
                                        
                                        <form method="post"action="Register" id="myform">
                                             <div class="input-field ">
          <input name="user_name" placeholder="Placeholder" id="first_name" type="text" class="validate">
          <label for="first_name">First Name</label>
        </div>
                                                                                   <div class="input-field ">
          <input name="user_email" placeholder="Enter Your Email" id="Email" type="text" class="validate">
          <label for="first_name">Email</label>
        </div>
                                                                                   <div class="input-field ">
          <input name="user_password" placeholder="Enter Your Password" id="password" type="password" class="validate">
          <label for="first_name">Password</label>
        </div>
                                            <button type="submit" class="btn">Submit</button>
                                        </form>
                                    </div>
                                    <div class="loader center-align" style="display: none">
                                        <!--// cllass ll-->
                                          <div class="preloader-wrapper big active">
    <div class="spinner-layer spinner-blue-only">
      <div class="circle-clipper left">
        <div class="circle"></div>
      </div><div class="gap-patch">
        <div class="circle"></div>
      </div><div class="circle-clipper right">
        <div class="circle"></div>
      </div>
    </div>
  </div>
                                        <h5>Please Wait.............</h5>
                                    </div>
                                    
                                    
</div>
                
                </div>
                
                </div>
            </div>
        </div>
        <!--JQuery-->
        <script src="https://code.jquery.com/jquery-3.7.1.min.js" 
        integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
        
        <script>
    $(document).ready(function(){
    
    console.log("Page is ready")
    
    
    $("#myform").on('submit',function(event )
    
            
        {
            event.preventDefault();
            var f=$(this).serialize();
            console.log(f);
       $(".loader").show();
       $(".form").hide();
        $.ajax({
                url:"Register",
                data:f,
                type:'POST',
                sucess:function(data,textStatus,jqXHR){
                     $(".loader").hide();
       $(".form").show();
                    console.log("sucess") 
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    console.log("erre")
                                       $(".loader").hide();
       $(".form").show();   
                    }
            })
        })
    });
    </script
    </body>
</html>
//use user;
//CREATE TABLE Persons (
//    ID int ,
//    FirstName varchar(255) NOT NULL,
//    Email varchar(255),
//    Password varchar(255)
//   
//);
// 