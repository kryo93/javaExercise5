import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class replaceAndEmpty
{
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++)
        {
            System.out.println("Enter the " + (i+1) + " Name");
            String str = sc.nextLine();
            myList.add(str);
        }
        myList.set(0, "Harry");
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);
    }
}
