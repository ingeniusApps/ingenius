package Rest.com.WebService.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Utilisateur {


		private String USER_ID;
		private String LOGIN;
		private String PASSWORD;

		public Utilisateur(String uSER_ID, String lOGIN, String pASSWORD) {
			super();
			USER_ID = uSER_ID;
			LOGIN = lOGIN;
			PASSWORD = pASSWORD;
		}

		public Utilisateur() {
		}

		public String getUSER_ID() {
			return USER_ID;
		}

		public void setUSER_ID(String uSER_ID) {
			USER_ID = uSER_ID;
		}

		public String getLOGIN() {
			return LOGIN;
		}

		public void setLOGIN(String lOGIN) {
			LOGIN = lOGIN;
		}

		public String getPASSWORD() {
			return PASSWORD;
		}

		public void setPASSWORD(String pASSWORD) {
			PASSWORD = pASSWORD;
		}

	}
