package sg;


import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Send_Address")
public class AuthPriceResp {


    @XStreamAlias("Version")
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
