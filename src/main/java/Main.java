import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

import java.net.URI;
import java.net.URISyntaxException;

import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;
import static spark.Spark.get;

import com.heroku.sdk.jdbc.DatabaseUrl;

public class Main {

  public static void main(String[] args) {

    port(Integer.valueOf(System.getenv("PORT")));
    staticFileLocation("/public");

    get("/", (req, res) -> "Hello World!\nPlease go to niels-hello-world.herokuapp.com/yourname for a personalized Hello.");
    get("/:name", (req, res) -> "Hello World, dear " + req.params(":name") + "!");
    
    
  }

}
