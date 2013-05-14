package Rest.com.WebService.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Android_data {

	private String ANDROID_DATA_ID;
	private String USER_ID;
	private String IMAGE;
	private String VIDEO;
	private float LONGITUDE;
	private float LATITUDE;
	private String COMMENTAIRE;
	private String TITLE;

	public Android_data(String aNDROID_DATA_ID, String uSER_ID, String iMAGE,
			String vIDEO, float lONGITUDE, float lATITUDE, String cOMMENTAIRE,
			String tITLE) {
		super();
		ANDROID_DATA_ID = aNDROID_DATA_ID;
		USER_ID = uSER_ID;
		IMAGE = iMAGE;
		VIDEO = vIDEO;
		LONGITUDE = lONGITUDE;
		LATITUDE = lATITUDE;
		COMMENTAIRE = cOMMENTAIRE;
		TITLE = tITLE;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getANDROID_DATA_ID() {
		return ANDROID_DATA_ID;
	}

	public void setANDROID_DATA_ID(String aNDROID_DATA_ID) {
		ANDROID_DATA_ID = aNDROID_DATA_ID;
	}

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getIMAGE() {
		return IMAGE;
	}

	public void setIMAGE(String iMAGE) {
		IMAGE = iMAGE;
	}

	public String getVIDEO() {
		return VIDEO;
	}

	public void setVIDEO(String vIDEO) {
		VIDEO = vIDEO;
	}

	public float getLONGITUDE() {
		return LONGITUDE;
	}

	public void setLONGITUDE(float lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}

	public float getLATITUDE() {
		return LATITUDE;
	}

	public void setLATITUDE(float lATITUDE) {
		LATITUDE = lATITUDE;
	}

	public String getCOMMENTAIRE() {
		return COMMENTAIRE;
	}

	public void setCOMMENTAIRE(String cOMMENTAIRE) {
		COMMENTAIRE = cOMMENTAIRE;
	}

}
