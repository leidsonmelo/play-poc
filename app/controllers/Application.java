package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.twirl.api.Html;

public class Application extends Controller {

    public Result index() {
        return ok(views.html.index.render("Play Framework."));
    }
    
}
