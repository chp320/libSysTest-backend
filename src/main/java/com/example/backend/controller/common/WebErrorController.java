package com.example.backend.controller.common;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * router 사용을 위해 springboot 에 ErrorController 를 구현
 * - 잘못된 url 입력 시 에러페이지 보이지 않게하기 위함 (f/w 에서 자동으로 /error 로 리다이렉트하며, 이를 받아서 처리할 페이지로 index.html 지정)
 * - 예시)
 * Whitelabel Error Page
 * This application has no explicit mapping for /error, so you are seeing this as a fallback.
 *
 * Fri Sep 06 01:31:18 KST 2024
 * There was an unexpected error (type=Not Found, status=404).
 */
@Controller
public class WebErrorController implements ErrorController {

    @GetMapping("/error")
    public String redirectRoot() {
        return "index.html";
    }

    public String getErrorPath() {
        return "/error";
    }
}
