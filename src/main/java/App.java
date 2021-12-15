import model.Heroes;
import model.Squads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());
    }

         get("/heroes/new",(request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        return new ModelAndView(model, "heroForm.hbs");
        }, new HandlebarsTemplateEngine());

    }
    post("/heroes", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        String name = request.queryParams("heroName");
        int age=Integer.parseInt(request.queryParams("heroAge"));
        String power=request.queryParams("heroPower");
        String weakness=request.queryParams("heroWeakness");
        Heroes heroes = new Heroes(name, age, power,weakness);
        model.put("heroes", heroes);
        return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());



        }
