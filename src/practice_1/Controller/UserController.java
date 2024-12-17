package practice_1.Controller;

import practice_1.service.service_interface.UserInterface;
import practice_1.view.UserView;
import practice_1.view.component.BaseView;

public class UserController {

    private UserView userView;
    private UserInterface userService;

    BaseView baseView =new BaseView();

    public UserController(UserView userView, UserInterface userService) {
        this.userView = userView;
        this.userService = userService;
    }

    public void createUser(){
        baseView.baseView();
        userService.createUser();
    }

}
