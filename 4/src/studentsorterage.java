import java.util.Comparator;

class studentsorterage implements Comparator<student> {
    public int compare(student a, student b)
    {
        int agea = a.getStudage();
               int ageb  = b.getStudage();

               if(ageb == agea)
               {
                   int rolla = a.getStudid() ;
                   int rollb = b.getStudid();
                   if(rollb == rolla)
                   {
                       String namea = a.getStudName();
                       String nameb = b.getStudName();
                       return namea.compareTo(nameb);
                   }
                   return rolla - rollb;
               }
        return agea-ageb;
    }
}
