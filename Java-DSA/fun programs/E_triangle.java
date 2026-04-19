
    import java.util.Scanner;
    public class E_triangle{
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the number of loops to run...");
    int a=scan.nextInt();
    
    for(int i=1;i<=a;i+=1){

        for(int k=1;k<=a-i;k++){
            System.out.print(" ");
        }
   
    for( int j=1;j<=((i*2)-1);j++){

        System.out.print("*");

    }
    System.out.println();
    
}
scan.close();
    }
}
