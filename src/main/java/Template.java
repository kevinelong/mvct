import java.util.HashMap;

public class Template{
    String text;
    Template(String text){
        this.text = text;
    }
    public String getText(HashMap<String,String> item){
        String output = this.text; // is this a real copy?
        for(String k : item.keySet()){
            String v = item.get(k);
            output = output.replace(String.format("{{%s}}", k), v);
        }
        return output;
    }
}
