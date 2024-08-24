public class Exam3 {
    public static void main(String[] args){

         int a=2;
         int b =50;
         int c=0;
         if (a==0||a==1){
             c=1;
         }

         for (int i=a; i<=b; i++){

             if(a%i==0){
                 c=1;
                 break;

             }
         }
         if(c==0){
             System.out.println(a+"Prime Number");
         }
         else {
             System.out.println("No");
         }



    }
}
