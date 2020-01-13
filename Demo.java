abstract class Depositor {
   private int code;
   abstract void Credit();
   abstract void Debit();
   Depositor() {
      System.out.println("depositor details are printed");
      
   }
   public int balance()
   {
       System.out.println("remaining balance is printed");
       return 1;
   }
   
}
class Cr extends Depositor 
{ 
    void Credit() { 
  
        System.out.println("amount credited");
        System.out.println(balance());
       
    }
    void Debit() { 
  
        System.out.println("amount debitted"); 
        System.out.println(balance());
    }
   
}
public class Demo{
    public static void main(String[] args) 
    { 
        Depositor d1 = new Cr();
        d1.Credit();
        d1.Debit();
        
    } 
}
