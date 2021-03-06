package fr.gfi.cmg.QuizzCmg.metier.entite.hibernate;

// Generated 6 juil. 2012 16:25:17 by Hibernate Tools 3.4.0.CR1

/**
 * ReponseId generated by hbm2java
 */
public class ReponseId implements java.io.Serializable {

	private int idReponse;
	private int refQuestion;

	public ReponseId() {
	}

	public ReponseId(int idReponse, int refQuestion) {
		this.idReponse = idReponse;
		this.refQuestion = refQuestion;
	}

	public int getIdReponse() {
		return this.idReponse;
	}

	public void setIdReponse(int idReponse) {
		this.idReponse = idReponse;
	}

	public int getRefQuestion() {
		return this.refQuestion;
	}

	public void setRefQuestion(int refQuestion) {
		this.refQuestion = refQuestion;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReponseId))
			return false;
		ReponseId castOther = (ReponseId) other;

		return (this.getIdReponse() == castOther.getIdReponse()) && (this.getRefQuestion() == castOther.getRefQuestion());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdReponse();
		result = 37 * result + this.getRefQuestion();
		return result;
	}

}
