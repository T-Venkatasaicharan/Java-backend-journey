import java.util.Scanner;
class Larg{
    void findLarg(){
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers : ?");
        int num = sc.nextInt();
        int[] ar = new int[num];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < num;i++){
            ar[i] = sc.nextInt();
        }
        for(int i = 0; i < ar.length;i++){
            if(ar[i] > max){
                max  = ar[i];
            }

        }
        System.out.println(max + " is largest in given numbers ");

    }
}
public class Largest{
    public static void main(String[] args){
        Larg l = new Larg();
        l.findLarg();
    }
}