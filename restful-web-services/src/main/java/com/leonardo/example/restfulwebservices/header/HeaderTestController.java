package com.leonardo.example.restfulwebservices.header;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/header-test")
public class HeaderTestController {

    Logger logger = LoggerFactory.getLogger(HeaderTestController.class);

    @GetMapping("/printMyHeaderValue")
    public void getHeaderValue (@RequestHeader(value="jwtToken") String acceptedToken) {
        logger.info("my token-->:"+acceptedToken);
    }

    @GetMapping("/printAllHeaderByValue")
    public void getHeaderByArgValue (HttpServletRequest request) {
        String acceptedToken = request.getHeader("jwtToken");
        logger.info("my token-->:"+acceptedToken);
        String anotherHeader = request.getHeader("anotherHeader");
        logger.info("Another Header-->:"+anotherHeader);
    }

}
