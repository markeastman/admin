package uk.me.eastmans.admin.controller;

import uk.me.eastmans.admin.service.PersonService;
import uk.me.eastmans.admin.view.HtmlProducer;
import uk.me.eastmans.admin.view.SecurityFilter;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by markeastman on 26/09/2016.
 */
@Path("logout")
public class LogoutController  {
    @Inject
    private HtmlProducer uiProducer;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @PermitAll
    public void logout(@Context HttpServletRequest request, @Context HttpServletResponse response)
            throws IOException {
        HttpSession session = request.getSession();
        session.setAttribute(SecurityFilter.USER_KEY, null);
        response.sendRedirect("login");
    }

}
