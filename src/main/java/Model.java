import java.util.ArrayList;
import java.util.HashMap;

public class Model{
    private ArrayList<HashMap<String, String>> data;

    Model(ArrayList<HashMap<String,String>> data){
        this.data = data;
    }
    public ArrayList<HashMap<String, String>> getData(){
        return this.data;
    }
}
