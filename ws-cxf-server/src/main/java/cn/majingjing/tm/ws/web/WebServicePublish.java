package cn.majingjing.tm.ws.web;

import javax.xml.ws.Endpoint;

/**
 * 
 * @author JingjingMa
 * @date 2017-11-29
 */
public class WebServicePublish {

    public static void main(String[] args) {
        String address = "http://127.0.0.1:8080/ws/HelloWs";
        Endpoint.publish(address , new HelloApi());
        System.out.println("发布webservice成功!");
        
    }
}
