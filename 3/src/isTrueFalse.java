import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class isTrueFalse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        String[] queryWord = new String[5];
        for(int i=0;i<5;i++)
        {
            queryWord[i]=sc.nextLine();
        }
        Map<String, Boolean> myMap = new HashMap<>();


        for(int i=0;i<queryWord.length;i++)
        {


            if(myMap.get(queryWord[i]) == null)
            {
                myMap.put(queryWord[i],true);
                continue;
            }

            if(myMap.get(queryWord[i]) == true)
            {
                myMap.put(queryWord[i],false);
            }


//           System.out.println(queryWord[i]);
        }
        System.out.println(myMap);
    }
}
