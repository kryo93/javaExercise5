import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mainFile
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> myArray = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            System.out.println("new");
            int id = sc.nextInt();
            int age = sc.nextInt();
            Scanner df = new Scanner(System.in);
            String str = df.nextLine();
            myArray.add(new student());
            myArray.get(i).setStudent(age,id,str);
        }
//        for (int i=0;i<2;i++)
//    {
//        System.out.println(myArray.get(i).getDetails());
//    }


            Collections.sort(myArray, new studentsorterage());
        for (int i=0;i<5;i++)
        {
            System.out.println(myArray.get(i).getDetails());
        }




    }
}
