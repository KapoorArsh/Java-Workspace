package corejava;
import java.util.Scanner;

public class Stud {
    Scanner sc = new Scanner(System.in);
    String fullName,doa,stream;
    int id = 1000;
    int userId,courses,ch;
    double fees,totalFees;

    void choice(){
        System.out.println("Choose from the menu given below: ");
        System.out.println("1 for new \n2 for registration \n3 for calculate \n4 for view\n 5 for Exit");
        ch = sc.nextInt();
        switch(ch){
            case 1: neww();break;
            case 2: register(); break;
            case 3: calculate();break;
            case 4: view();break;
            case 5: break;
            default: System.out.println("Choose from the above menu");break;
        }
    }
void end() {
	System.out.println("Thank you for registering");
}
    void neww(){
        id = id + 1;
        System.out.println("Your id: " + id);
        sc.nextLine();
        System.out.println("Enter your full name: ");
        fullName = sc.nextLine();
        choice();
    }
    void register(){
        System.out.println("Enter your id:");
        userId = sc.nextInt();
        if(userId == id){
        sc.nextLine();
        System.out.println("Enter the stream you want to get enrolledd in(Choose from BBA or BCIS):");
        stream = sc.next();
        if(stream.equals("BCIS") || stream.equals("BBA")){
            course();
        }
        else{
            System.out.println("Enter valid stream");
        }
        System.out.println("Enter your date of submission(ddmmyy):");
        doa = sc.next();
        }else{
            System.out.println("Enter valid id");
        }
        choice();
    }
    void course(){
        if(stream.equals("BCIS")){
            fees = 350000;
        } else{
            fees=30000;
        }
    }
    void calculate(){
        System.out.println("Enter your id:");
        userId = sc.nextInt();
        if(userId == id){
        System.out.println("Enter the number of courses you want per year: ");
        courses = sc.nextInt();
        totalFees = fees + (courses * 50000);
        }else{
            System.out.println("Enter valid id");
        }
        choice();
    }
    void view(){
        System.out.println("Enter your id: ");
        userId = sc.nextInt();
        if(userId == id){
            System.out.println("Your name: " + fullName);
            System.out.println("Your stream: " + stream);
            System.out.println("Your date of admission: " + doa);
            System.out.println("Number of courses: " + courses);
            System.out.println("Total fees: " + totalFees);
        }else{
            System.out.println("Enter valid id");
        }
        choice();
    }
    public static void main(String[] args) {
        Stud[] s = new Stud[5];
        for (int i = 0; i < 5; i++) {
            s[i] = new Stud();
            s[i].choice();
        }
        Stud obj = new Stud();
        obj.end();
    }
}

