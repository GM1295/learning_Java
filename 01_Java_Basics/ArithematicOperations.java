public class ArithematicOperations {

      public int adddition(int num1, int num2)
      {
        return num1+num2;
      }
      public int subtraction(int num1, int num2)
      {
        return num1-num2;
      }
      public int division(int num1, int num2)
      {
        return num1/num2;
      }
      public int multiplication(int num1, int num2)
      {
        return num1*num2;
      }
      public int largerNumber(int num1,int num2)
      {
        return num1>num2?num1:num2;
      }
    public static void main(String[] args) {
        ArithematicOperations obj=new ArithematicOperations();
        System.out.println("addition : "+obj.adddition(10, 20));
        System.out.println("subtraction : "+obj.subtraction(10, 20));
        System.out.println("division : "+obj.division(10, 20));
        System.out.println("multipication : "+obj.multiplication(10, 20));
        
    }
    
}
