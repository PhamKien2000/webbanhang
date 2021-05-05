/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Account;
import entity.Category;
import entity.Image;
import entity.Order;
import entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kien pham
 */
public class Dataprocess {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
   public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user = "sa";
            String pass = "123456";
            String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=ShoppingOnline";
            try {
                conn = DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;

    }
    public static void main(String[] args) {
       Dataprocess dt=new Dataprocess();
       ArrayList<Product> list=dt.getProductByCId("C01");
       for(Product p : list)
            System.out.println(p);
    }
    public boolean checkLogin(String user,String pass){
        boolean f=false;
        String sql="Select*from tblAdmins where _idAdmin=? and _passWord=?";
        Connection conn=getConnection();
       try {
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, user);
           ps.setString(2, pass);
           ResultSet rs=ps.executeQuery();
           f=rs.next();
           rs.close();
           ps.close();
           conn.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return f;
    }
     public boolean addAccount(String id, String fullName, String pass, String birthday, String address, int phone) {
        int f = 0;
        String sql = "Insert into tblAdmins values(?,?,?,?,?,?)";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, fullName);
            ps.setString(3, pass);
            ps.setString(4, birthday);
            ps.setString(5, address);
            ps.setInt(6, phone);
            

            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }
         public ArrayList<Account> getAccount() {
        ArrayList<Account> list = new ArrayList<Account>();
        String sql = "Select * from tblAdmins  ";
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Account s = new Account();
                s.setId(rs.getString(1));
                s.setFullName(rs.getString(2));
                s.setPass(rs.getString(3));
                s.setBirthday(rs.getString(4));
                s.setAddress(rs.getString(5));
                s.setPhone(rs.getInt(6));
                list.add(s);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
         public boolean addCategory(String id, String name,String img) {
        int f = 0;
        String sql = "INSERT INTO tblCategory VALUES(?,?,?)";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, name);
             ps.setString(3, img);
            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }

    public ArrayList<Category> getCategory() {
        ArrayList<Category> list = new ArrayList<Category>();
        String sql = "Select * From tblCategory ";
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Category c = new Category();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setImg(rs.getString(3));
                list.add(c);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public boolean delCategory(String id) {
        int f = 0;
        String sql = "DELETE FROM tblCategory WHERE _idCategory=?";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }
    public Category getCategoryId(String id) {
        Category c = null;
        String sql = "Select * from tblCategory where _idCategory=?";
        try {
            PreparedStatement st = getConnection().prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                c = new Category();
                c.setId(rs.getString(1));
                c.setName(rs.getString(2));
                c.setImg(rs.getString(3));
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public boolean updateCategory(String id, String name, String img) {
        int f = 0;
        String sql = "UPDATE tblCategory SET _nameCategory=?,_img=? WHERE _idCategory=?";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql); 
            ps.setString(1, name);
            ps.setString(2, img);
            ps.setString(3, id);
            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }
    public boolean addProduct(int id, String name, float price,String idCate,String description, String img){
        int f=0;
        String sql="Insert into tblProduct values(?,?,?,?,?,?)";
        Connection conn =getConnection();
       try {
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setInt(1, id);
           ps.setString(2, name);
           ps.setFloat(3, price);
           
           ps.setString(4, idCate);  
           ps.setString(5, description);
           ps.setString(6, img);
           f=ps.executeUpdate();
           ps.close();
           conn.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
                return f>0;
    }
    public  ArrayList<Product> getProduct()
            {
                ArrayList<Product> list =new ArrayList<Product>();
                        String sql="Select *from tblProduct";
       try {
           Statement st=getConnection().createStatement();
           ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
               Product p=new Product();
               p.setId(rs.getInt(1));
               p.setName(rs.getString(2));
               p.setPrice(rs.getFloat(3));
              
               p.setIdCa(rs.getString(4));
               p.setDescription(rs.getString(5));
               p.setImg(rs.getString(6));
               
               
               list.add(p);
               
           }
           rs.close();
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
             
            }
     public  ArrayList<Product> getProductByCId(String id)
            {
                ArrayList<Product> list =new ArrayList<Product>();
                        String sql="Select *from tblProduct\n" +
"where _idCategory = ? ";
       try {
           PreparedStatement st = getConnection().prepareStatement(sql);
            st.setString(1, id);
           ResultSet rs=st.executeQuery();
           
           while(rs.next()){
               Product p=new Product();
               p.setId(rs.getInt(1));
               p.setName(rs.getString(2));
               p.setPrice(rs.getFloat(3));
              
               p.setIdCa(rs.getString(4));
               p.setDescription(rs.getString(5));
               p.setImg(rs.getString(6));
               
               
               list.add(p);
               
           }
           rs.close();
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
             
            }
     public  ArrayList<Product> getProdductnew()
            {
                ArrayList<Product> list =new ArrayList<Product>();
                        String sql="SELECT TOP(6) WITH TIES * from tblProduct ORDER BY _idProduct desc; ";
       try {
           Statement st=getConnection().createStatement();
           ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
               Product p=new Product();
               p.setId(rs.getInt(1));
               p.setName(rs.getString(2));
               p.setPrice(rs.getFloat(3));
               
               p.setIdCa(rs.getString(4));
               p.setDescription(rs.getString(5));
               p.setImg(rs.getString(6));
               
               
               list.add(p);
               
           }
           rs.close();
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
             
            }
    public Product getProductId(String id) {
        Product c = null;
        String sql = "Select * from tblProduct where _idProduct=?";
        try {
            PreparedStatement st = getConnection().prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                c = new Product();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setPrice(rs.getFloat(3));
                c.setAmount(1);
                c.setIdCa(rs.getString(4));
                c.setDescription(rs.getString(5));
                c.setImg(rs.getString(6));
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public  ArrayList<Product> getTop6Product()
            {
                ArrayList<Product> list =new ArrayList<Product>();
                        String sql="select top 6 * from tblProduct";
       try {
           Statement st=getConnection().createStatement();
           ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
               Product p=new Product();
               p.setId(rs.getInt(1));
               p.setName(rs.getString(2));
               p.setPrice(rs.getFloat(3));
              
               p.setIdCa(rs.getString(4));
               p.setDescription(rs.getString(5));
               p.setImg(rs.getString(6));
               
               
               list.add(p);
               
           }
           rs.close();
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
             
            }
    public  ArrayList<Product> getTop4Product()
            {
                ArrayList<Product> list =new ArrayList<Product>();
                        String sql="select top 4 * from tblProduct";
       try {
           Statement st=getConnection().createStatement();
           ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
               Product p=new Product();
               p.setId(rs.getInt(1));
               p.setName(rs.getString(2));
               p.setPrice(rs.getFloat(3));
              
               p.setIdCa(rs.getString(4));
               p.setDescription(rs.getString(5));
               p.setImg(rs.getString(6));
               
               
               list.add(p);
               
           }
           rs.close();
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
             
            }
    public ArrayList<Product> getNext4Product(int amount) {
        ArrayList<Product> list = new ArrayList<Product>();
        String sql = "Select * from tblProduct order by _idProduct offset ? rows fetch next 4 rows only";
        try {
            PreparedStatement st = getConnection().prepareStatement(sql);
            st.setInt(1, amount);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getFloat(3));
                p.setIdCa(rs.getString(4));
                p.setDescription(rs.getString(5));
                p.setImg(rs.getString(6));
                list.add(p);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public Product getLast() {
        Product c = null;
        String sql = "select top 1 * from tblProduct \n" +
"                order by _idProduct desc";
        try {
            Statement st=getConnection().createStatement();
           ResultSet rs=st.executeQuery(sql);
            while (rs.next()) {
                c = new Product();
                c.setId(rs.getInt(1));
                c.setName(rs.getString(2));
                c.setPrice(rs.getFloat(3));
                
                c.setIdCa(rs.getString(4));
                c.setDescription(rs.getString(5));
                c.setImg(rs.getString(6));
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public boolean delProduct(String id) {
        int f = 0;
        String sql = "DELETE FROM tblProduct WHERE _idProduct=?";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }
    public boolean updateProduct(int id, String name, float price,int amount,String idCate,String description, String img) {
        int f = 0;
        String sql = "UPDATE tblProduct SET _nameProduct=?,_price=?,_idCategory=?,_description=?,_image=? WHERE _idProduct=?";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql); 
           
           ps.setString(1, name);
           ps.setFloat(2, price);
           
           ps.setString(3, idCate);
           ps.setString(4, description);
           ps.setString(5, img);
            ps.setInt(6, id);
            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }

    
    public boolean addImg(String idproduct, String imgdetail, String img1,String img2,String img3){
        int f=0;
        String sql="Insert into tblColorImg values(?,?,?,?,?)";
        Connection conn =getConnection();
       try {
           PreparedStatement ps= conn.prepareStatement(sql);
           ps.setString(1, idproduct);
           ps.setString(2, imgdetail);
           ps.setString(3, img1);
           ps.setString(4, img2);
           ps.setString(5, img3);  

           f=ps.executeUpdate();
           ps.close();
           conn.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
                return f>0;
    }
    public  ArrayList<Image> getImage()
            {
                ArrayList<Image> list =new ArrayList<Image>();
                        String sql="Select *from tblColorImg ";
       try {
           Statement st=getConnection().createStatement();
           ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
               Image p=new Image();
               p.setIdproduct(rs.getString(1));
               p.setImgdetail(rs.getString(2));
               p.setImg1(rs.getString(3));
               p.setImg2(rs.getString(4));
               p.setImg3(rs.getString(5));
               list.add(p);
               
           }
           rs.close();
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
             
            }
    public Image getImg(String id) {
        Image c = null;
        String sql = "Select * from tblColorImg where _imgDetail=?";
        try {
            PreparedStatement st = getConnection().prepareStatement(sql);
            st.setString(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                c = new Image();
                c.setIdproduct(rs.getString(1));
                c.setImgdetail(rs.getString(2));
                c.setImg1(rs.getString(3));
                c.setImg2(rs.getString(4));
                c.setImg3(rs.getString(5));
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public boolean delImg(String id) {
        int f = 0;
        String sql = "DELETE FROM tblColorImg WHERE _imgDetail=?";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }
    public boolean updateImg(String id, String imgDetail,String img1,String img2,String img3 ) {
        int f = 0;
        String sql = "UPDATE tblColorImg SET _idProduct=?,_imgColor1=?,_imgColor2=?,_imgColor3=? WHERE _imgDetail=?";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql); 
           
           ps.setString(1, id);
           ps.setString(2, img1);
           ps.setString(3, img2);
           ps.setString(4, img3);
           ps.setString(5, imgDetail);
            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }
    public boolean addOrder(String product, String fullName , int phone,  String address, String email, String date, float total) {
        int f = 0;
        String sql = "Insert into tblOrder values(?,?,?,?,?,?,?)";
        Connection conn = getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product);
            ps.setString(2, fullName);
            ps.setInt(3, phone);
            ps.setString(4, address);
            ps.setString(5, email);
             ps.setString(6, date);
             ps.setFloat(7, total);

            f = ps.executeUpdate();
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f > 0;
    }
    public  ArrayList<Order> getCart()
            {
                ArrayList<Order> list =new ArrayList<Order>();
                        String sql="Select *from tblOrder";
       try {
           Statement st=getConnection().createStatement();
           ResultSet rs=st.executeQuery(sql);
           while(rs.next()){
               Order p=new Order();
               p.setId(rs.getInt(1));
               p.setProduct(rs.getString(2));
               p.setNameCus(rs.getString(3));
               p.setPhone(rs.getInt(4));
               p.setAddress(rs.getString(5));
               p.setEmail(rs.getString(6));
                p.setDaybuy(rs.getString(7));
                p.setToalPrice(rs.getFloat(8));
               list.add(p);
               
           }
           rs.close();
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
             
            }
     public  List<Product> searchByName(String txtSearch) 
            {
                ArrayList<Product> list =new ArrayList<Product>();
                       String sql="select * from tblProduct where _nameProduct like ?";
       try {
           PreparedStatement st = getConnection().prepareStatement(sql);
            st.setString(1, "%" + txtSearch + "%");
           ResultSet rs=st.executeQuery();
           while(rs.next()){
               Product p=new Product();
               p.setId(rs.getInt(1));
               p.setName(rs.getString(2));
               p.setPrice(rs.getFloat(3));
              
               p.setIdCa(rs.getString(4));
               p.setDescription(rs.getString(5));
               p.setImg(rs.getString(6));
               
               
               list.add(p);
               
           }
           rs.close();
           st.close();
       } catch (SQLException ex) {
           Logger.getLogger(Dataprocess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
             
            }
    
}
