<%-- 
    Document   : RegistAccount
    Created on : 08-Dec-2020, 21:04:06
    Author     : kien pham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dang ky</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
    </head>
    <body>
        <style>
            .divider-text {
    position: relative;
    text-align: center;
    margin-top: 15px;
    margin-bottom: 15px;
}
.divider-text span {
    padding: 7px;
    font-size: 12px;
    position: relative;   
    z-index: 2;
}
.divider-text:after {
    content: "";
    position: absolute;
    width: 100%;
    border-bottom: 1px solid #ddd;
    top: 55%;
    left: 0;
    z-index: 1;
}

.btn-facebook {
    background-color: #405D9D;
    color: #fff;
}
.btn-twitter {
    background-color: #42AEEC;
    color: #fff;
}
        </style>





        <form method="POST" action="ControllerAccount?ac=add"> 
            <div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Create Account</h4>
	<p class="text-center">Get started with your free account</p>
	<p>
		<a href="" class="btn btn-block btn-twitter"> <i class="fab fa-twitter"></i>   Login via Twitter</a>
		<a href="" class="btn btn-block btn-facebook"> <i class="fab fa-facebook-f"></i>   Login via facebook</a>
	</p>
	<p class="divider-text">
        <span class="bg-light">OR</span>
    </p>
	<form>
	<div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-id-card"></i> </span>
		 </div>
            <input name="txtID" class="form-control" placeholder="ID Admin" type="text">
        
    </div> <!-- form-group// -->
    <div class="form-group input-group">
		<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-user"></i> </span>
		 </div>
            <input name="txtFullName" class="form-control" placeholder="Full Name" type="text">
        
    </div>
        <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-lock"></i> </span>
		</div>
            <input class="form-control" name="txtPass" placeholder="Create password" type="password">
    </div>
     <!-- form-group// -->
         <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-birthday-cake"></i> </span>
		</div>
             <input class="form-control" name="txtBirthday" placeholder="Date of birth" type="date">
    </div> <!-- form-group// -->  

    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-address-card"></i> </span>
		</div>
		
    	<input name="txtAddress" class="form-control" placeholder="Address" type="text">
    </div>
    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-phone"></i> </span>
		</div>
		
    	<input name="txtPhone" class="form-control" placeholder="Phone number" type="text">
    </div> <!-- form-group// -->
<!--    <div class="form-group input-group">
    	<div class="input-group-prepend">
		    <span class="input-group-text"> <i class="fa fa-building"></i> </span>
		</div>
		<select class="form-control">
			<option selected=""> Select job type</option>
			<option>Designer</option>
			<option>Manager</option>
			<option>Accaunting</option>
		</select>
	</div>  form-group end.// -->
 <!-- form-group// -->
                                    
    <div class="form-group">
        <button type="submit" class="btn btn-primary btn-block"> Create Account  </button>
              	
    </div> <!-- form-group// -->      
    <p class="text-center">Have an account? <a href="Login.jsp">Log In</a> </p>                                                                 
</form>
</article>
</div> <!-- card.// -->

</div> 
        </form>
    </body>



