package cn.majingjing.tm.ws.web;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author JingjingMa
 * @date 2017-11-29
 */
@XStreamAlias("HelloBean")
public class HelloBean {

	private Integer id;
	private String name;
	@XStreamAlias("nowTime")
	private Date time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
