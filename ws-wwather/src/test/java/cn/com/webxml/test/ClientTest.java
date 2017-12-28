package cn.com.webxml.test;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

/**
 * @author majj@genvision.cn
 * @date 2016-5-20 下午12:53:57
 */
public class ClientTest {
	
	
	
	public static void main(String[] args) {

		WeatherWebService wws = new WeatherWebService();
		WeatherWebServiceSoap wwsp = wws.getWeatherWebServiceSoap();

		ArrayOfString aos = wwsp.getWeatherbyCityName("上海");

		for (String s : aos.getString()) {
			System.out.println(s);
		}

	}
}
