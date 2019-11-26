
package v6;

import cn.majingjing.tm.blog.webservice.api.HelloBean;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.majingjing.tm.blog.webservice.api package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.majingjing.tm.blog.webservice.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloMapBean }
     * 
     */
    public HelloMapBean createHelloMapBean() {
        return new HelloMapBean();
    }

    /**
     * Create an instance of {@link HelloMapBean.Hmap }
     * 
     */
    public HelloMapBean.Hmap createHelloMapBeanHmap() {
        return new HelloMapBean.Hmap();
    }

    /**
     * Create an instance of {@link cn.majingjing.tm.blog.webservice.api.HelloBean }
     * 
     */
    public cn.majingjing.tm.blog.webservice.api.HelloBean createHelloBean() {
        return new HelloBean();
    }

    /**
     * Create an instance of {@link HelloBeanArray }
     * 
     */
    public HelloBeanArray createHelloBeanArray() {
        return new HelloBeanArray();
    }

    /**
     * Create an instance of {@link HelloMapBeanArray }
     * 
     */
    public HelloMapBeanArray createHelloMapBeanArray() {
        return new HelloMapBeanArray();
    }

    /**
     * Create an instance of {@link HelloMapBean.Hmap.Entry }
     * 
     */
    public HelloMapBean.Hmap.Entry createHelloMapBeanHmapEntry() {
        return new HelloMapBean.Hmap.Entry();
    }

}
