package uk.me.eastmans.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by markeastman on 26/09/2016.
 */
@Controller
public class FormEntityController {

    @GetMapping("/form")
    public String index(Model model) {
        return "form";
    }
}

/*
package uk.me.eastmans.admin.controller;

import uk.me.eastmans.admin.service.UserMessageService;

import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;


@Path("form")
public class FormEntityController extends BaseController {

    @Inject
    private UserMessageService userMessageService;

    @GET
    @Produces(MediaType.TEXT_HTML)
    @PermitAll
    public String form()
            throws IOException {

        return processUI("form");
    }

    public String formCreate( MultivaluedMap<String,Object> form )
            throws IOException {
        // We want to handle errors and then also process the form if none exist

        // We can now handle the form parameters and validate them
        System.out.println("We have form " + form );
        form.forEach(new BiConsumer<String, List<Object>>() {
            @Override
            public void accept(String s, List<Object> objects) {
                System.out.println( "We have a name " + s + " with objects " + objects);
            }
        });

        Map model = new HashMap();
        model.put("authenticationError", "invalid user or password");
        return processUI("form", model);
    }
}
*/
