import java.util.Scanner;
public class CheckBit {
    static int checkBit(int number, int index){
        return ((number & (1 << index)) == 0) ? 0 : 1;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B= scanner.nextInt();
        int setOrNot=checkBit(A,B);
        System.out.println(setOrNot);
    }
}
