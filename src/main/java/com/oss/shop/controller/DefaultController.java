package com.oss.shop.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class DefaultController implements ErrorController {

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public RedirectView handleErrorWithRedirect() throws IOException {
        return new RedirectView("/swagger-ui.html", true);
    }

    @RequestMapping(value = "/")
    public RedirectView redirect() throws IOException {
        return new RedirectView("/swagger-ui.html", true);
    }

    @RequestMapping(value = "/unauth")
    public RedirectView redirectInvalid() throws IOException {
        return new RedirectView("/invalid-token.html", true);
    }
}
