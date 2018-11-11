package sg;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Date;

/**
 * 
 * @author JingjingMa
 * @date 2017-11-29
 */
@XStreamAlias("Send_Address")
public class SendAddress {

	@XStreamAlias("DeviceType")
	private String deviceType;

	@XStreamAlias("DeviceID")
	private String deviceID;


	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
}
