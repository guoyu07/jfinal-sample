package demo.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller {

    public void index() {
        renderText("Welcome to JFinal's World!");
    }

    public void test() {
        renderText("test something for index.");
    }

}
