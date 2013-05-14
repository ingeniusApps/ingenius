package Rest.com.WebService.Resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import Rest.com.WebService.DAL.UtilisateurHandler;

@Path("/user")
public class UtilisateurRsc {
	
	private final static String LOGIN = "MyLogin";
	private final static String PASSWORD = "MyPassword";


	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public int postUser(MultivaluedMap<String, String> userParams) {

		System.out.println("**** POST methode is called ****");
		
		String My_login = userParams.getFirst(LOGIN);
		String My_password = userParams.getFirst(PASSWORD);
		
		System.out.println("     ====>  Storing posted " + My_login + "  " + My_password);
		int find = UtilisateurHandler.SearchForUser(My_login, My_password);
		return find;
	}

}
