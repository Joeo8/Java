package com.example.RequestProject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/RequestDemo01")
public class RequestProject extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                /*
        *   request 请求对象
        *   response 响应对象
        * */
        // 1. 网页的请求方式
        String method = request.getMethod() ;
        System.out.println(method);                                     //           -->           GET
        // 2. 返回服务器虚拟路径
        String contextPath = request.getContextPath();      //     /RequestProject_war_exploded
        System.out.println(contextPath);
        // 3. 寻求当前请求的地址路径
        String serveltPath = request.getServletPath();
        System.out.println(serveltPath);                              //          /RequestDemo01
        // 4. 获取请求的参数
        String queryString = request.getQueryString();
        System.out.println(queryString);                             //             name=Jolly
        // 5.获取键值对的参数
        Map<String , String[]>  paramaterMap = request.getParameterMap() ;
//        System.out.println(paramaterMap);                       //   org.apache.catalina.util.ParameterMap@73e958ac
        Set<String> Strings = paramaterMap.keySet();
        for(String key :  Strings){
            System.out.println("KEY :  "+key);                      //              KEY :  name
            //System.out.println("VALUE :  "+paramaterMap.get(key));  // VALUE :  [Ljava.lang.String;@6d4adb62
            String[] tempKeys = paramaterMap.get(key);
            for ( String tempKey : tempKeys ){
                System.out.println(tempKey);                              //          Jolly
            }
        }
        // 6.直接获取Key值
        System.out.println("----------------------------------");
        String key  = request.getParameter("name");
        System.out.println(key);                                                         // Jolly
        // 7. 获取URI服务地址, 请求的完整路径
        String uri =  request.getRequestURI();
        System.out.println(uri);
        // 8. 获取协议
        String protocol  = request.getProtocol();
        System.out.println(protocol);
        // 9. 获取客户端Ip地址
        String ipAddress = request.getRemoteAddr();
        System.out.println(ipAddress);
        // 10. 获取端口号
        int port = request.getServerPort();
        System.out.println(port);


        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("来自服务器的响应");

    }
}
