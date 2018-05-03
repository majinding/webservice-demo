package cn.majingjing.tm.blog.webservice.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

public class WsHttpClient {

    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();

            // 设置通用的请求属性

//            Accept-Encoding: gzip,deflate
//            Content-Type: text/xml;charset=UTF-8
//            SOAPAction: "xxxxxxxxxxxxxxxxxx"
//            Content-Length: 293
//            Host: 127.0.0.1:8888
//            Connection: Keep-Alive
//            User-Agent: Apache-HttpClient/4.1.1 (java 1.5)
//            Cookie: sap-usercontext=sap-client=300
//            Cookie2: $Version=1
//            Authorization: Basic aaaaaaaaaaaaaaa3Nv

            conn.setRequestProperty("Accept-Encoding", "gzip,deflate");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
//            conn.setRequestProperty("SOAPAction", "uxxxxxxxxxxxxxxxxxx");
//            String Authorization = DatatypeConverter.printBase64Binary("aaa:bbb".getBytes("UTF-8"));
//            System.out.println(Authorization);
//            conn.setRequestProperty("Authorization", "Basic aaaaaaaaaaaaaaa3Nv");


            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();

            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception{
        //发送 POST

        String url = "http://127.0.0.1:9999/tmblog/webservice/hellodemo";
        String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:api=\"http://api.webservice.blog.tm.majingjing.cn/\">\n" +
                "   <soapenv:Header/>\n" +
                "   <soapenv:Body>\n" +
                "      <api:helloStr>\n" +
                "         <!--Optional:-->\n" +
                "         <arg0>aaaa</arg0>\n" +
                "      </api:helloStr>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";

        String sr= WsHttpClient.sendPost(url, xml);
        System.out.println(sr);


    }
}
