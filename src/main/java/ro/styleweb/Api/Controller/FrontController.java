package ro.styleweb.Api.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontController {

    @GetMapping("/")
    public ResponseEntity<?> indexAction() {
        return ResponseEntity.ok("Under construction...");
    }
}
