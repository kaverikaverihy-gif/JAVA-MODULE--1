public class logicalor{
    public static void main(String[]args){
        boolean isstudent=true;
        boolean isteacher=false;
        if(isstudent||isteacher){
            System.out.println("You can enter the campus.");
        }else{
            System.out.println("Access denied");
        }
    }
}