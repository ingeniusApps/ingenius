package Rest.com.WebService.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

import javax.persistence.*;

@XmlRootElement
public class Article {

	private String ARTICLE_ID;
	private String ARTICLE_TITLE;
	private Date DATE_CREAT;
	private String CONTENT;
	

	public Article(String aRTICLE_ID, String aRTICLE_TITLE, Date dATE_CREAT,
			String cONTENT) {
		super();
		ARTICLE_ID = aRTICLE_ID;
		ARTICLE_TITLE = aRTICLE_TITLE;
		DATE_CREAT = dATE_CREAT;
		CONTENT = cONTENT;
	}

	

	public Article() {
	}

	// Setters and Getters
	public String getARTICLE_ID() {
		return ARTICLE_ID;
	}

	public void setARTICLE_ID(String aRTICLE_ID) {
		ARTICLE_ID = aRTICLE_ID;
	}

	public String getARTICLE_TITLE() {
		return ARTICLE_TITLE;
	}

	public void setARTICLE_TITLE(String aRTICLE_TITLE) {
		ARTICLE_TITLE = aRTICLE_TITLE;
	}

	public Date getDATE_CREAT() {
		return DATE_CREAT;
	}

	public void setDATE_CREAT(Date dATE_CREAT) {
		DATE_CREAT = dATE_CREAT;
	}

	public String getCONTENT() {
		return CONTENT;
	}

	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}

}
