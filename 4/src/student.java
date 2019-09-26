public class student
{
    private int studId;
    private int studAge;
    private String studName;

    public void setStudent(int studage,int studid, String name) {
        this.studAge = studage;
        this.studId = studid;
        this.studName = name;
    }
    public String getDetails()
    {
        String str = Integer.toString(this.studId) + " " + Integer.toString(this.studAge) + " " + this.studName;
        return str;
    }
    public int getStudid()
    {
        return  this.studId;
    }
    public int getStudage()
    {
        return  this.studAge;
    }
    public String getStudName()
    {
        return  this.studName;
    }
}
