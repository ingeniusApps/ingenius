package Rest.com.WebService.Resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import Rest.com.WebService.DAL.AndroidDataHandler;

@Path("/android")
public class AndroidData {

	private final static String TITLE = "title";
	private final static String USER_ID = "user_id";
	private final static String IMAGE = "image";
	private final static String VIDEO = "video";
	private final static String LONGITUDE = "longt";
	private final static String LATITUDE = "lat";
	private final static String COMMENTAIRE = "commentaire";

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean AddData(MultivaluedMap<String, String> userParams) {

		System.out.println("**** POST methode is called ****");

		String My_title = userParams.getFirst(TITLE);
		String My_user = userParams.getFirst(USER_ID);
		String My_image = userParams.getFirst(IMAGE);
		String My_video = userParams.getFirst(VIDEO);
		String My_long = userParams.getFirst(LONGITUDE);
		String My_lat = userParams.getFirst(LATITUDE);
		float My_longitude = Float.valueOf(My_long.trim()).floatValue();
		float My_latitude = Float.valueOf(My_lat.trim()).floatValue();
		String My_commentaire = userParams.getFirst(COMMENTAIRE);

		System.out.println("     ====>  Storing posted " 
				+ My_title + "  " + My_user + "  " + My_image + "  " + My_video + "  "
				+ My_longitude + "  " + My_latitude + "  " + My_commentaire);

		AndroidDataHandler.AddAndroidData(My_title , My_user, My_image, My_video,
				My_longitude, My_latitude, My_commentaire);
		return true;
	}

}
