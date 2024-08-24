public class Exam2 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int arr[]={5,4,9,7,1,6,3,2};
        int a;


       for(int i=0;i<arr.length;i++){
           for (int j=0; j<arr.length; j++){
               if(arr[i]<arr[j]){
                   a=arr[i];
                   arr[i]=arr[j];
                   arr[j]=a;
               }

           }
       }
       for (int i=0; i<arr.length; i++){
           System.out.println(arr[i]);
       }


    }
}
