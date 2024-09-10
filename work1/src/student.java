public class student {
    String fname="Divine";
    String lname="Namakula";
    double cgpa= 4.8;
    public void displaystudent(){
        System.out.println("The students fname is " + fname);
        System.out.println("The students lname is " + lname);
        System.out.println("The students cgpa is " + cgpa);

    }

    public static void main(String[] args) {
        student pot=new student();
        pot.displaystudent();
    }
}
