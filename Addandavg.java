import java.util.Scanner;
class addandaverage{
    public void add(int a,int b,int c){
        int d=a+b+c;
        System.out.println("The value of d is ="+d);
    }
    public void avg(int a,int b,int c){
        int e=(a+b+c)/3;
        System.out.println("The average of a b and c is ="+e);
    }
}


public class Addandavg {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of a b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        addandaverage obj=new addandaverage();
        obj.add(a,b,c);
        obj.avg(a,b,c);
        sc.close();
        


        
    }
    
}
