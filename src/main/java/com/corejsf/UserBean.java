package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("user")
@RequestScoped
public class UserBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String password;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validateUser() {
		FacesContext ctx = FacesContext.getCurrentInstance();
		ctx.getExternalContext().getFlash().put("message", name);
		
		return "welcome";
	}
}
