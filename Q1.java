package Pac1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner ob1=new Scanner(System.in);
        System.out.println("Enter string");
        String name=ob1.nextLine();
        ob1.close();
        for(int i=0;i<name.length();i++)
                {
                    char ch=name.charAt(i);
                    System.out.println(ch);
                    
        }
    }
}
