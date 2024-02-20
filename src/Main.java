package src;

import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String[]arfv){
        System.out.println("PriintMoi");

        try(FileWriter file=new FileWriter("Mimi.json")){
            JSONObject e= new JSONObject();
            e.put("Nom","Maelia");
            file.write(e.toJSONString());
            file.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}