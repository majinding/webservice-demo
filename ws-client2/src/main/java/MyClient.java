import br.com.hodielog.ReturnData;
import br.com.hodielog.SoapHodie;
import br.com.hodielog.SoapHodieSoap;
import org.junit.Test;

import java.net.URL;

/**
 * @Author JingjingMa
 * @Date 2019/9/20 13:24
 */
public class MyClient {

    @Test
    public void call(){
        URL resource = MyClient.class.getClassLoader().getResource("hodiewsR.xml.wsdl");

        SoapHodie soapHodie = new SoapHodie(resource);
        SoapHodieSoap soapHodieSoap = soapHodie.getSoapHodieSoap();
        ReturnData anjun = soapHodieSoap.shipments("2019-09-12", "anjun", "100999");
        System.out.println(anjun.getItemItens().getCItem().size());
        System.out.println(anjun.getItemItens().getCItem().get(0).getStringId());
    }

}
