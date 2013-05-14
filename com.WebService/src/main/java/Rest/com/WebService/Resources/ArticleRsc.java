package Rest.com.WebService.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import Rest.com.WebService.DAL.ArticleHandler;
import Rest.com.WebService.model.*;;

@Path("/article")
public class ArticleRsc {
	
	static int authentic = 0;
	
	@Context
	UriInfo uriInfo;
	@Context
	Request request;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	static public List<Article> GetArticleData() {
		return ArticleHandler.GetArticles();
	}
	

}
