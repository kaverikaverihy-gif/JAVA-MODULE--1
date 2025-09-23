class Return {
    public static void main(String[] args) {
        System.out.println("Starting of program");
        checknumber(5);
        System.out.println("End of program");
}
public static void checknumber(int num){
    if(num<0){
        System.out.println("negative number");
        return;
    }
    System.out.println("Postive number or zero");
}
}