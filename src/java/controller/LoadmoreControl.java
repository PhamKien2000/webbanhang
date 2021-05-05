/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Dataprocess;

/**
 *
 * @author kien pham
 */
@WebServlet(name = "LoadmoreControl", urlPatterns = {"/LoadmoreControl"})
public class LoadmoreControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String amount = request.getParameter("exits");
        int iamount=Integer.parseInt(amount);
        Dataprocess dt= new Dataprocess();
        List<Product> list=dt.getNext4Product(iamount);
        PrintWriter out = response.getWriter();
        for(Product p : list){
            out.println("<div style=\" float: left; padding:15px; \" class=\"product single-product\">\n" +
"                                <div class=\"product-f-image\">\n" +
"                                    <img style=\"width:250px;height:250px; \" class=\"card-img-top\" src=\""+p.getImg()+ "\" alt=\"Card image cap\">\n" +
"                                    <div class=\"product-hover\">\n" +
"                                       <a href=\"cart?id="+p.getId()+"\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n" +

"                                        <a href=\"Detailcontroller?pid="+p.getId()+"\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n" +
        
"                                    </div>\n" +
"                                </div>\n" +
"                                \n" +
"                                <h2><a href=\"single-product.jsp\">"+p.getName()+"</a></h2>\n" +
"                                \n" +
"                                <div class=\"product-carousel-price\">\n" +
"                                    <ins>$"+p.getPrice()+"</ins> <del>$1000.00</del>\n" +
"                                </div> \n" +
"                            </div>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
