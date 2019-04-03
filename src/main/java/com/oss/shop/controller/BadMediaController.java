package com.oss.shop.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@RestController
public class BadMediaController {

    @PostMapping("/badmedia")
    @ResponseBody
    public Object reflect(HttpServletRequest request) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.createObjectNode();
        ((ObjectNode) rootNode).put("contentType", request.getHeader(HttpHeaders.CONTENT_TYPE));
        String body = new String(((ContentCachingRequestWrapper) request).getContentAsByteArray(), StandardCharsets.UTF_8);
        body = URLDecoder.decode(body, StandardCharsets.UTF_8.name());
        ((ObjectNode) rootNode).put("body", body);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
    }
}
