/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Image;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "ControllerImg", urlPatterns = {"/ControllerImg"})
public class ControllerImg extends HttpServlet {

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
         String action = request.getParameter("ac");
        if ("add".equals(action)) {
            String idproduc = request.getParameter("cbimg");
            String imgdetail = request.getParameter("txtdetail");
            String img1=request.getParameter("txtimg1");
            String img2=request.getParameter("txtimg2");
            String img3 = request.getParameter("txtimg3");

            Dataprocess dt = new Dataprocess();
            if (dt.addImg(idproduc, imgdetail, img1, img2, img3)) {
                ArrayList<Image> list = dt.getImage();
                request.setAttribute("list", list);
                RequestDispatcher rd = request.getRequestDispatcher("viewimg.jsp");
                rd.forward(request, response);

            } else {
                response.sendRedirect("error.jsp?code=1");
            }
        }
        if ("del".equals(action)) {
            String id = request.getParameter("id");
            Dataprocess dt = new Dataprocess();
            if (dt.delImg(id)) {
                ArrayList<Image> list = dt.getImage();
                request.setAttribute("list", list);
                RequestDispatcher rd = request.getRequestDispatcher("viewimg.jsp");
                rd.forward(request, response);

            } else {
                response.sendRedirect("Error.jsp?code=1");
            }
        }
        if ("edit".equals(action)) {
            String id = request.getParameter("id");
            Dataprocess dt = new Dataprocess();
            Product c = dt.getProductId(id);
            request.setAttribute("sDetail", c);
            RequestDispatcher rd = request.getRequestDispatcher("edit-product.jsp");
            rd.forward(request, response);
        }
//        if ("update".equals(action)) {
//            String id = request.getParameter("txtID");
//            String name = request.getParameter("txtName");
//            String temp=request.getParameter("txtPrice");
//            float price=Float.parseFloat(temp);
//            String temp2=request.getParameter("txtAmount");
//            int amount=Integer.parseInt(temp2);
//            String cate = request.getParameter("cbCategory");
//            String des = request.getParameter("txtdes");
//            String img = request.getParameter("img");
//            Dataprocess dt = new Dataprocess();
//            if (dt.updateImg(id, img, img, img, img){
//                ArrayList<Product> list = dt.getProduct();
//                request.setAttribute("list", list);
//                RequestDispatcher rd = request.getRequestDispatcher("products.jsp");
//                rd.forward(request, response);
//
//            } else {
//                response.sendRedirect("Erorr.jsp?code=1");
//            }
//        }
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
