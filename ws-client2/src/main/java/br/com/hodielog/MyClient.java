package br.com.hodielog;

import org.junit.Test;

/**
 * @Author JingjingMa
 * @Date 2019/9/20 13:24
 */
public class MyClient {

    @Test
    public void call(){
        SoapHodie soapHodie = new SoapHodie();
        SoapHodieSoap soapHodieSoap = soapHodie.getSoapHodieSoap();
        ReturnData anjun = soapHodieSoap.shipments("2019-09-12", "anjun", "100999");
        System.out.println(anjun.getItemItens().getCItem().size());
        System.out.println(anjun.getItemItens().getCItem().get(0).stringId);
    }

}
