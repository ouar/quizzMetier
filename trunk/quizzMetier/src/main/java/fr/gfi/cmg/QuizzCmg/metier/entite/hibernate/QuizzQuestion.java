package fr.gfi.cmg.QuizzCmg.metier.entite.hibernate;

// Generated 17 sept. 2013 17:50:17 by Hibernate Tools 3.4.0.CR1

/**
 * QuizzQuestion generated by hbm2java
 */
public class QuizzQuestion implements java.io.Serializable {

	private Integer id;
	private Question question;
	private Quizz quizz;

	public QuizzQuestion() {
	}

	public QuizzQuestion(Question question, Quizz quizz) {
		this.question = question;
		this.quizz = quizz;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Quizz getQuizz() {
		return this.quizz;
	}

	public void setQuizz(Quizz quizz) {
		this.quizz = quizz;
	}

}
