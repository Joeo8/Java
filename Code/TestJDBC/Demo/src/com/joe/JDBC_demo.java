package com.joe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
   感受JDBC的基本使用，执行流程
*/
public class JDBC_demo {
    public static void main(String[] args) {

        PreparedStatement psmt = null ;
        Connection conn = null ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bookshop?serverTimezone = GMT ";
            String user = "joeo8";
            String password = "123456";
            conn = DriverManager.getConnection(url,user,password);
            String sql = "INSERT INTO b_user (u_id,u_name,u_state) VALUE (?,?,?)";
            psmt = conn.prepareStatement(sql);
            //参数下标从1开始不再是从0开始计数
            psmt.setString(1,null);
            psmt.setString(2,"aaa");
            psmt.setString(3,"1");
            int insertResults = psmt.executeUpdate();
            if (insertResults > 0){
                System.out.println("插入成功！");
            }else{
                System.out.println("插入失败！");
            }
            psmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("finally 执行！");
            if (psmt != null){
                try {
                    psmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
