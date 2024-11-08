class One
{
   public void methodOne() {
      System.out.println("from methodOne");
   }

   public void methodTwo() {
      System.out.println("from methodTwo");
      methodOne();   //this.methodOne();
   }
}

public class ThisExample2
{
   public static void main(String[] args)
   {
      One obj = new One();
      obj.methodTwo();
   }
}