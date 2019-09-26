import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countRepitition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

       String[] queryWord = str.split("[^a-zA-Z0-9.()<>=']+");
       Map<String, Integer> myMap = new HashMap<>();


       for(int i=0;i<queryWord.length;i++)
       {

           if(myMap.get(queryWord[i]) == null)
           {
               myMap.put(queryWord[i],0);
           }
           int p= myMap.get(queryWord[i]);
           myMap.put(queryWord[i], p+1);
//           System.out.println(queryWord[i]);
       }
        System.out.println(myMap);
    }
}
