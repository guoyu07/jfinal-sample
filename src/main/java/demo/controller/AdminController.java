package demo.controller;

import com.jfinal.core.Controller;

public class AdminController extends Controller {

    public void index() {
        renderText("后台主页");
    }

    public void err() {
        renderError(getParaToInt(0));
    }

}
