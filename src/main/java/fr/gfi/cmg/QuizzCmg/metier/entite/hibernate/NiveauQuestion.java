package fr.gfi.cmg.QuizzCmg.metier.entite.hibernate;

// Generated 2 ao�t 2013 10:03:09 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * NiveauQuestion generated by hbm2java
 */
public class NiveauQuestion implements java.io.Serializable {

	private Integer id;
	private String libNiveau;
	private Set<Question> questions = new HashSet<Question>(0);

	public NiveauQuestion() {
	}

	public NiveauQuestion(String libNiveau, Set<Question> questions) {
		this.libNiveau = libNiveau;
		this.questions = questions;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibNiveau() {
		return this.libNiveau;
	}

	public void setLibNiveau(String libNiveau) {
		this.libNiveau = libNiveau;
	}

	public Set<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

}
