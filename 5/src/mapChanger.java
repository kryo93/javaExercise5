import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapChanger
{
    public static void main(String[] args) {
        Map<String , String> myMap = new HashMap<>();

            Scanner sc = new Scanner(System.in);

           String value = sc.nextLine();
            myMap.put("val1", value);
        value = sc.nextLine();
        myMap.put("val2", value);

        System.out.println(myMap);


            if(myMap.get("val1")!=null)
            {
                myMap.replace("val2", myMap.get("val1"));
                myMap.replace("val1", " ");
            }
        System.out.println(myMap);

    }
}
