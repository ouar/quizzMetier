package fr.gfi.cmg.QuizzCmg.metier.entite.hibernate;

// Generated 6 f�vr. 2014 13:18:48 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer id;
	private String libNom;
	private String libPrenom;
	private String libPassword;
	private Set<UserRoles> userRoleses = new HashSet<UserRoles>(0);

	public User() {
	}

	public User(String libNom, String libPrenom, String libPassword,
			Set<UserRoles> userRoleses) {
		this.libNom = libNom;
		this.libPrenom = libPrenom;
		this.libPassword = libPassword;
		this.userRoleses = userRoleses;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibNom() {
		return this.libNom;
	}

	public void setLibNom(String libNom) {
		this.libNom = libNom;
	}

	public String getLibPrenom() {
		return this.libPrenom;
	}

	public void setLibPrenom(String libPrenom) {
		this.libPrenom = libPrenom;
	}

	public String getLibPassword() {
		return this.libPassword;
	}

	public void setLibPassword(String libPassword) {
		this.libPassword = libPassword;
	}

	public Set<UserRoles> getUserRoleses() {
		return this.userRoleses;
	}

	public void setUserRoleses(Set<UserRoles> userRoleses) {
		this.userRoleses = userRoleses;
	}

}
