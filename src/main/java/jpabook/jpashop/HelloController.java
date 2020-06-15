package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Transactional
//같은 영속성 컨텍스트에선 식별자가 같으면 같은 엔티티로 식별한다.

@Controller
public class HelloController {
    /*
       model - spring ui model이라는 데이터를 싫어서 컨트롤 데이터에 싫어서 넘길 수 있다.
       return은 화면이름이다.

       resource에 템플릿츠가 있다.
       뷰 네임을 hello.html을 만들어주면 거기에 자동으로 붙는다.
    * */
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello";
    }
}
