public class Nestedif{
    public static void main(String[]args){
        int marks=85;
        if(marks>=50){
            System.out.println("you passed the exam:");
            if(marks>=90){
                System.out.println("Grades:A+");
            }else if(marks>=75){
                System.out.println("Grade:A");
            }else{
                System.out.println("Grade:B");
            }
         }else{
            System.out.println("you failed the exam:");
         }
    }
}