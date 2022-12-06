package ro.styleweb.Api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ro.styleweb.Api.doa.UserDOA;
import ro.styleweb.Api.service.UserService;

@Controller
public class FrontController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public ResponseEntity<UserDOA> indexAction() {
        return ResponseEntity.ok(userService.getUser());
    }
}
