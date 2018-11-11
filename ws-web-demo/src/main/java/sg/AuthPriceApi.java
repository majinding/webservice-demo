package sg;

import cn.majingjing.tm.ws.web.HelloBean;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@HandlerChain(file = "sg-handler-chain.xml")
public class AuthPriceApi {

    @WebMethod
    public AuthPriceResp AuthPriceReq(String Version,SendAddress bean) {

        AuthPriceResp resp = new AuthPriceResp();
        resp.setVersion("hello-"+Version);
        return resp;
    }

}
