package demo.controller;

import com.jfinal.core.Controller;

public class ErrorController extends Controller {

    public void index() {
        renderError(getParaToInt(0));
    }

}
