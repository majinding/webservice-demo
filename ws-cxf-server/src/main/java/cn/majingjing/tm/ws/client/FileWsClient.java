package cn.majingjing.tm.ws.client;

import cn.majingjing.tm.blog.webservice.api.FilePortImpl;
import cn.majingjing.tm.blog.webservice.api.TmFileBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.File;

public class FileWsClient {
    public static void upload() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(FilePortImpl.class);
        factory.setAddress("http://localhost:8080/tmblog/webservice/filedemo");
        factory.getInInterceptors().add(new org.apache.cxf.interceptor.LoggingInInterceptor());

        FilePortImpl fileWS = (FilePortImpl) factory.create();

        TmFileBean fileWrapper = new TmFileBean();
        fileWrapper.setFileName("head-small.jpg");
        fileWrapper.setFileExtension("jpg");

        String filePath = "F:\\tmp\\head-small.jpg";
        DataSource source = new FileDataSource(new File(filePath));
        fileWrapper.setFile(new DataHandler(source));
        String upload = fileWS.upload(fileWrapper);
        System.out.println(upload);
    }

    public static void down() {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(FilePortImpl.class);
        factory.setAddress("http://localhost:8080/tmblog/webservice/filedemo");
        factory.getInInterceptors().add(new org.apache.cxf.interceptor.LoggingInInterceptor());

        FilePortImpl fileWS = (FilePortImpl) factory.create();

        TmFileBean download = fileWS.download();
        String s = download.getFileName();
        System.out.println(s);
    }

    public static void main(String[] args) {
        down();
    }

}
