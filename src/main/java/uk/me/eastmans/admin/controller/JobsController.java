package uk.me.eastmans.admin.controller;

import uk.me.eastmans.admin.view.HtmlProducer;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by markeastman on 26/09/2016.
 */
@Path("jobs")
public class JobsController {
    @Inject
    private HtmlProducer uiProducer;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @RolesAllowed("ADMIN")
    public String home(@Context HttpServletRequest request, @Context HttpServletResponse response )
        throws IOException {
        Map model = new HashMap();
        model.put( "username", "Mark Eastman" );
        return uiProducer.process(request,response, "jobs", model);
    }
}
