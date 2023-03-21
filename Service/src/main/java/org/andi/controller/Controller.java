package org.andi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
public class Controller {

    @RolesAllowed({"service_read"})
    @GetMapping("/service")
    public String getPrincipal(Principal principal) {
        return "/service is accessed by user principal " + principal.getName();
    }
}
