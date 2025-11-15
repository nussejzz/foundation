package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        //1.request method
        //2.request url
        //3.request protocol

        String method = request.getMethod();
        System.out.println("Method: " + method);
        String url = request.getRequestURL().toString();
        String uri = request.getRequestURI();
        System.out.println("URL: " + url);
        System.out.println("URI: " + uri);
        String protocol = request.getProtocol();
        System.out.println("Protocol: " + protocol);

        //4.request parameters/attribute -- name,age
        String name = request.getParameter( "name" );
        String age = request.getParameter( "age" );
        System.out.println("Name: " + name + ",  Age: " + age);

        //5.request header -- Accept
        String accept = request.getHeader( "Accept" );
        System.out.println("Accept: " + accept);
        String acceptLanguage = request.getHeader( "Accept-Language" );
        System.out.println("Accept-Language: " + acceptLanguage);
        String contentType = request.getContentType();
        System.out.println("Content-Type: " + contentType);
//        int i = 1 / 0 ;
        //6.request body
        return "OK";

    }

}
