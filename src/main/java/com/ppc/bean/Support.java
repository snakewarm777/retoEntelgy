package com.ppc.bean;

import java.io.Serializable;

public class Support implements Serializable{
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String url;
private String text;
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}


}

