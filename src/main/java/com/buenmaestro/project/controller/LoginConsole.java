/**
 * 
 */
package com.buenmaestro.project.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author lenovo
 * Clase nos permitira controlar el funcionamiento de la pantalla con el login.xhtml
 *
 */
@ManagedBean
public class LoginConsole {
   
	/**
	 * Usuario que ingresa en el login
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	private String usuario;
  private String password;
  
  
public void ingresar() {
	  System.out.println("Usuario: " + usuario);
	  //FacesContext es una clase api y JFS
	  if(usuario.equals("depredador") && password.equals("12345")) {
		// FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario", new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario Correcto","")); 
	  this.rediredirecionar("principal.xhtml");
	  
	  }else {
		  FacesContext.getCurrentInstance().addMessage("formLogin: txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y contraseña son Incorrectos",""));
	  }
  }
private void rediredirecionar(String pagina)throws IOException {
	ExternalContext ec = FacesContex.getCurrentInstance().getExternalContext();
	ec.redirect(pagina);
}
}
