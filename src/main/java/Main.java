//injection passing instance values (objects) in instead of creating them
//in your own constructor

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        var data = new ArrayList<HashMap<String,String>>();
        data.add(new HashMap<>(Map.of(
                "name", "Kevin",
                "phone", "503-555-1212"
        )));

        data.add(new HashMap<>(Map.of(
                "name", "Nina",
                "phone", "206-555-1234"
        )));

        var text = """
            NAME: {{name}}
            PHONE: {{phone}}
        """;

        //SAME FROM HERE ON DOWN FOR ANY DATA AND TEMPLATE/VIEW
        var model = new Model(data);
        var template = new Template(text);
        var view = new View(model, template); //ID dependency injection
        var c = new Controller(model, view); // more injection
        c.route("/"); //get the party started
    }
}
