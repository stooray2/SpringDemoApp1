package cs.tariq.SpringApp1.resource;

import cs.tariq.SpringApp1.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = new ArrayList();
        users.add(new User(1,"Tariq","tariqk@op.ac.nz"));
        users.add(new User(2,"John","john@op.ac.nz"));
        users.add(new User(3,"Sara","sara@op.ac.nz"));
        users.add(new User(4,"Smith","smith@op.ac.nz"));

        return users;
    }
}
