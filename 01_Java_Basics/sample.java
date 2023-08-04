
public class sample
{
    String name;
    int age;
    String course;
     public void setDetails(String name,int age,String course)
     {
        this.name=name;
        this.age=age;
        this.course=course;
     }
     public void showdetails()
     {
            System.out.println("name of student is "+name+" and age is "+age+" studies is course "+course);
     }
    public static void main(String[] args) {
       sample student=new sample();
       student.setDetails("saurabh", 18 ,"c++");
       student.showdetails();

    }
}