import java.util.*;
class guess{
    int h=1;
   int guesss(){
        Random rand=new Random();
          int n=rand.nextInt(100);
          System.out.println(n);
          return n;
    }
    int user(){
        System.out.println("guess a number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
        
    }
    void correctnumber(int b,int l){
       
        if(b==l){
            System.out.println("you guessed it right");
            System.out.println("you guessed it right in "+h);
        }
        else{
         if(b>l){
            System.out.println("enter less number");
            int k;
           k = user();
           h++;
            correctnumber(k,l);
         }
         else if(l>b){
            System.out.println("enter high number");
            int m;
           m= user();
           h++;
           correctnumber(m,l);
         }
         
        
    }
}
    public static void main(String[]args){
        guess g=new guess();
        int c,d;
        d=g.guesss();
        c=g.user();
        g.correctnumber(c,d);
    }
}