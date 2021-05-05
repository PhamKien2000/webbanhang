<%-- 
    Document   : Cart
    Created on : Oct 31, 2020, 9:42:21 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>

    <body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="HomeController">Home</a>
            </li>
            <li class="nav-item active">
                <a class="nav-link" href="ShowCart">Cart</a>
            </li>
            <li class="nav-item">
            </li>
            <li class="nav-item dropdown">
                
            </li>
            <li class="nav-item">
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>        <div class="shopping-cart">
            <div class="px-4 px-lg-0">

                <div class="pb-5">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12 p-5 bg-white rounded shadow-sm mb-5">

                                <!-- Shopping cart table -->
                                <div class="table-responsive">
                                    
                                    <table class="table">
                                        <t head>
                                            <tr>
                                                <th scope="col" class="border-0 bg-light">
                                                    <div class="p-2 px-3 text-uppercase">Sản Phẩm</div>
                                                </th>
                                                <th scope="col" class="border-0 bg-light">
                                                    <div class="py-2 text-uppercase">Đơn Giá</div>
                                                </th>
                                                <th scope="col" class="border-0 bg-light">
                                                    <div class="py-2 text-uppercase">Số Lượng</div>
                                                </th>
                                                <th scope="col" class="border-0 bg-light">
                                                    <div class="py-2 text-uppercase">Xóa</div>
                                                </th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <form id="form-id" method="post" action="ControllerOrder?ac=add"  class="tm-edit-product-form">
                                            <c:forEach items="${list}" var="o">
                                                <tr>
                                                    <th scope="row">
                                                        <div class="p-2">
                                                            <img src="${o.img}" alt="" width="70" class="img-fluid rounded shadow-sm">
                                                            <div class="ml-3 d-inline-block align-middle">
                                                                <h5 class="mb-0"> <a href="#" class="text-dark d-inline-block"><input style=" outline:none" readonly="true" name="txtProduct" value="${o.name}"></a></h5><span class="text-muted font-weight-normal font-italic"></span>
                                                            </div>
                                                        </div>
                                                    </th>
                                                    <td class="align-middle"><strong>${o.price}</strong></td>
                                                     <td class="align-middle">
                                                         <a id="sub" href="sub?id=${o.id}">
                                                             <button type="button" onclick="Sub()" class="btnSub">-</button>
                                                         </a> <strong id="result" >${o.amount}</strong>
                                                         <a href="cart?id=${o.id}">
                                                             <button type="button" onclick="Addcart()" class="btnAdd">+</button>
                                                         </a>
                                                    </td>
                                                            <td class="align-middle"><a href="remove?id=${o.id}" class="text-dark">
                                                        <button type="button" class="btn btn-danger">Delete</button>
                                                        </a>
                                                    </td>
                                                </tr> 
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                    
                                </div>
                                <!-- End -->
                            </div>
                        </div>

                        <div class="row py-5 p-4 bg-white rounded shadow-sm">
                            <div class="col-lg-6">
                                <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Customer Information</div>
                                <div class="p-4">
                                   <div class="input-group mb-4 border rounded-pill p-2">
                                        <input name="txtName" type="text" placeholder="FullName" aria-describedby="button-addon3" class="form-control border-0">
                                        
                                       
                                    </div>
                                     <div class="input-group mb-4 border rounded-pill p-2">
                                         <input name="txtAddress" type="text" placeholder="Address" aria-describedby="button-addon3" class="form-control border-0">
                                        
                                       
                                    </div>
                                     <div class="input-group mb-4 border rounded-pill p-2">
                                         <input name="txtEmail" type="text" placeholder="Email" aria-describedby="button-addon3" class="form-control border-0">
                                        
                                       
                                    </div>
                                    <div class="input-group mb-4 border rounded-pill p-2">
                                        <input name="txtPhone" type="text" placeholder="PhoneNumber" aria-describedby="button-addon3" class="form-control border-0">
                                    </div>
                                    <div class="input-group mb-4 border rounded-pill p-2">
                                        <input name="txtDate" type="date" placeholder="Date bought" aria-describedby="button-addon3" class="form-control border-0">
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6">
                                <div class="bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold">Thành tiền</div>
                                <div class="p-4">
                                    <ul class="list-unstyled mb-4">
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng tiền hàng</strong> <strong>${total}</strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Phí vận chuyển</strong><strong>Free ship</strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">VAT</strong><strong>${vat}</strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng thanh toán</strong><strong><input style=" outline:none" readonly="true" name="total" value="${sum} "></strong></li>


                                
                                        
                                            <input  type="submit" class="btn btn-primary btn-block text-uppercase "  value="Buy Product">
              </div>
                                    
                                        </form> 
                                        <script>
                                        function Sub(){
                                            let message= document.getElementById('sub').href;
                                            document.getElementById('result').innerHTML='${message}';;
                                        }
                                    </script>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>

</html>
</html>
