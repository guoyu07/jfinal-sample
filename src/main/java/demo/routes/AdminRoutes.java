package demo.routes;

import com.jfinal.config.Routes;
import demo.controller.AdminController;
import demo.controller.ErrorController;

public class AdminRoutes extends Routes {

    @Override
    public void config() {
        add("/admin", AdminController.class);
        add("/err", ErrorController.class);
    }

}
