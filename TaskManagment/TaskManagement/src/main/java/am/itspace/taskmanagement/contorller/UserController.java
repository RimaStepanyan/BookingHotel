package am.itspace.taskmanagement.contorller;

import am.itspace.taskmanagement.entity.User;
import am.itspace.taskmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Struct;
import java.util.List;

@Controller
public class UserController {


    @Autowired
private UserRepository userRepository;


    @GetMapping("/users")
    public String users() {
        List<User> all = userRepository.findAll();
        return "users";
    }
}
