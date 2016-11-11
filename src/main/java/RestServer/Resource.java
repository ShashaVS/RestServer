package RestServer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("home")
public class Resource {

    @GET
    @Path("get/str")
    @Produces(MediaType.TEXT_HTML)
    public String methodGETString(@QueryParam("param") String name) {
        System.out.println("methodGET name = [" + name + "]");
        return "Hello from Server, " + name;
    }

    @GET
    @Path("get/json")
    @Produces(MediaType.APPLICATION_JSON)
    public mResponse methodGETJSON(@QueryParam("name") String name, @QueryParam("age") int age) {
        System.out.println("methodGETJSON name = [" + name + "], age = [" + age + "]");
        return new mResponse("Hello from Server, " + name, age);
    }

    @POST
    @Path("post")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public String methodPOST(@FormParam("login") String login, @FormParam("password") String password) {
        System.out.println("methodPOST login = [" + login + "], password = [" + password + "]");
        return "Hello from Server, POST login = " + login;
    }
}
