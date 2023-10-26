import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        System.out.println("***************Student Grade Calculator***************\n");
        System.out.println("Enter the name of the Student");
        String name =sc.nextLine();
        System.out.println("Enter division");
        String division =sc.nextLine();
        System.out.println("Marks Obtained out of 100 in Maths");
        int maths = sc.nextInt();
        System.out.println("Marks Obtained out od 100 in Science");
        int science = sc.nextInt();
        System.out.println("Marks Obtained out of 100 in English");
        int english = sc.nextInt();
        System.out.println("Marks Obtained out of 100 in History");
        int history = sc.nextInt();
        System.out.println("Marks Obtained out of 100in Geography");
        int geography = sc.nextInt();
        int total = maths+science+english+history+geography;
        double percentage = total / 5 ;
        System.out.println(name);
        System.out.println("Divison is" + " " + division);
        System.out.println("The total is"+ " "+total);
        System.out.println("The average percentage is"+ " "+percentage);
        if(total<=500 && total>=400)
        {
            System.out.println("The grade recieved is A");
        }
        else if(total<400 && total>=300)
        {
            System.out.println("The grade recieved is B");
        }
        else if(total<300 && total>=200)
        {
            System.out.println("The grade recieved is C");
        }
        else if(total<200 && total>=100)
        {
            System.out.println("The grade recieved is D");
        }
        else if(total<100 && total>=0)
        {
            System.out.println("The grade recieved is E");
        }
        else {
            System.out.println("Invalid");
        }

}
}
