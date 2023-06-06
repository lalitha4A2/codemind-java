import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int P,T,I,R;
        P=sc.nextInt();
        T=sc.nextInt();
        R=sc.nextInt();
        I=(P*T*R)/100;
        System.out.println(I);
        sc.close();
    }
}