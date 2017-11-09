package demo.routes;

import com.jfinal.config.Routes;
import demo.controller.HelloController;
import demo.controller.IndexController;

public class FrontRoutes extends Routes {

    @Override
    public void config() {
        add("/", IndexController.class);
        add("/hello", HelloController.class);
    }

}
