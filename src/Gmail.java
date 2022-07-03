import java.util.ArrayList;
import java.util.Scanner;

public class Gmail {
    ArrayList<javabeam> account=new ArrayList<javabeam>();

   public static void main(String[] args){
     Gmail mygmail=new Gmail();
       Scanner input=new Scanner(System.in);
      System.out.println("enter 1 for register and 2 for login");
      int choice= input.nextInt();
      if(choice==1){
          javabeam user=new javabeam();
          Scanner input3=new Scanner(System.in);
         System.out.println("enten name");

         user.setName(input3.nextLine());
          System.out.println("enten address");
          user.setAddress(input3.nextLine());



          System.out.println("enten email");
          user.setEmail(input3.nextLine());
          System.out.println("enten password");
          user.setPassword(input3.nextLine());
          mygmail.account.add(user);
      }
     else{
         Scanner input2=new Scanner(System.in);
         System.out.println("enter emai");
         String emai=input2.nextLine();
         System.out.println("enter password");
         String password=input2.nextLine();

         if(mygmail.account.size()>0){
             for(int i=0;i<mygmail.account.size();i++){
                 if(mygmail.account.get(i).getEmail().equals(emai) && mygmail.account.get(i).getPassword().equals(password)){
                     System.out.println("welcome"+mygmail.account.get(i).getName());
                     break;
                 }
             }
         }
         else{
             System.out.println("please register first");
         }
      }


   }
}
