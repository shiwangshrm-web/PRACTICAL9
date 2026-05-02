package mes.shiwang.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mes.shiwang.DTO.studentdetails;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class studentApi {
    @GetMapping("/student")
    public studentdetails getMethodName() {
        studentdetails obj = new studentdetails();
        obj.setName("Shiwang");
        obj.setDiv("A");
        obj.setRollno(21);
        return obj;
    }
}
