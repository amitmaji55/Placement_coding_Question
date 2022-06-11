class InherTest
{
public static void main(String args[])
{
    result R = new result();
    result R1 = new result(60.0F,70.0F,80.0F);
    R1.calculate();
    float a = R1.gettotal();
    float b= R1.getaverage();
    System.out.println("Total marks :"+a);
    System.out.println("Average marks :"+b);
    R1.getstream();
    R1.display();
 }
}
class student
{
    int rollno;
    int idno;
    student()
    {
        rollno=0;
        idno=0;
    }
    student(int nr,int ni)
    {
        rollno=nr;
        idno=ni;
    }
}
class result
{
    float sub1,sub2,sub3;
    float tot,avg;
    String stream;
    result()
    {
        sub1=0;sub2=0;sub3=0;
        tot=0;avg=0;
        stream="";
    }
    result(float s1,float s2,float s3)
    {
        sub1=s1;
        sub2=s2;
        sub3=s3;
    }
    void calculate()
    {
        tot=sub1+sub2+sub3;
        avg=tot/3;
    }
    float gettotal()
    {
        return tot;
    }
    float getaverage()
    {
        return avg;
    }
    void getstream()
    {
        if(avg>=80)
        stream="Science";
        else if(avg>=60)
        stream="Commerce";
        else
        stream="Arts";
    }
    void display()
    {
         System.out.println("Stream :"+stream);
    }
}

        
    
        