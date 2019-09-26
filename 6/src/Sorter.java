import java.util.*;

public class Sorter
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> mySet = new TreeSet<>();
        mySet.add(sc.nextLine());
        mySet.add(sc.nextLine());
        mySet.add(sc.nextLine());
        mySet.add(sc.nextLine());
        System.out.println(mySet);

        List<String> lister = new ArrayList<>();
        for(String t : mySet)
        {
            lister.add(t);
        }
        System.out.println(lister);
    }
}
