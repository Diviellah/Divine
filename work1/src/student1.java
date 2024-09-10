public class student1 {
    static String fname="Fareek";
    static String lname="Ssemakula";
    static double cgpa= 3.66;
    public void displaystudent1(){
        System.out.println("The students fname is " + fname);
        System.out.println("The students lname is " + lname);
        System.out.println("The students cgpa is " + cgpa);

    }

    public static void main(String[] args) {
        student1 pot=new student1();
        pot.displaystudent1();
    }
}
