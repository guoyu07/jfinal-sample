package demo.config;

import com.jfinal.config.*;
import com.jfinal.template.Engine;
import demo.routes.AdminRoutes;
import demo.routes.FrontRoutes;

public class AppConfig extends JFinalConfig {

    public void configConstant(Constants me) {
        me.setDevMode(true);
    }

    public void configRoute(Routes me) {
        // 添加前台路由
        me.add(new FrontRoutes());
        // 添加后台路由
        me.add(new AdminRoutes());
    }

    public void configEngine(Engine me) {

    }

    public void configPlugin(Plugins me) {

    }

    public void configInterceptor(Interceptors me) {

    }

    public void configHandler(Handlers me) {

    }

}
