package ci.atos.gestcantine.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequiredArgsConstructor
@RequestMapping
@Controller
public class PlatController {
    @GetMapping("dish")
    public String showPlatPage(){
        return "dish/forms";
    }



}
