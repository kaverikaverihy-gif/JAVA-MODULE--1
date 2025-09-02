import java.util.*;
class strinput{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  string");
        String st1=sc.nextLine();
        String st2=sc.nextLine();
        st1=st1.toUpperCase();
        st2=st2.toLowerCase();
        if(st1.equals(st2)){
         System.out.println("Both the strings are equal");    
        }
        else{
            System.out.println("Both the strings are not equal");
        }
     }
}