package corejava;
import java.time.LocalDate;
import java.util.Scanner;

class Declare {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static {
        System.out.println("WE WELCOME YOUR CAR TO HAVE AN AMAZING EXPERIENCE");
        System.out.println("---------------------------------------------------");
        System.out.println("PLease enter today's customer count: ");
        n = sc.nextInt();
        System.out.println("---------------------------------------------------");
    }
    int totalBill, discount, netpayable;
    String type;
    int a;
    int arr[][] = new int[n][3];
    int current = 0;
    static int sum = 0;
    static int i=0,id;
}

class Menu extends Declare {
    void menu() {
        int ch;
        System.out.println("------Menu for Car Washing-------");
        System.out.println("1. Hand Washing");
        System.out.println("2. Drive Through Tunnel Wash");
        System.out.println("3. Full-Service Car Wash");
        System.out.println("Enter Your Choice:");
        ch = sc.nextInt();
        arr[i][1] = ch;
        sc.nextLine();
        switch (ch) {
            case 1:
                System.out.println("Hand Washing will cost for $20.");
                this.totalBill = 20;
                break;
            case 2:
                System.out.println("Drive Through Tunnel Wash will cost you $50.");
                this.totalBill = 50;
                break;
            case 3:
                System.out.println("Full-Service Car Wash will cost you $100.");
                this.totalBill = 100;
                break;
            default:
                System.out.println("Please enter valid Choice.");
                menu();
        }
    }
    
}

class Calculate extends Menu {
    void calculate() {
        System.out.println("Please enter customer Type: (Premium/Normal) ");
        this.type = sc.nextLine();
        if (type.equalsIgnoreCase("Premium")) {
            arr[i][2] = 1;
        }else {
            arr[i][2] = 2;
        }
        if (type.equalsIgnoreCase("Premium")) {
            discount = (totalBill * 10) / 100;
            netpayable = totalBill - discount;
            System.out.println("As a Premium user, customer will get 10% Additional discount on your total bill.");
            arr[i][0] = netpayable;
        } else if (type.equalsIgnoreCase("Normal")) {
            discount = (totalBill * 5) / 100;
            netpayable = totalBill - discount;
            arr[i][0] = netpayable;
            System.out.println("As a Normal user, customer will get 5% General discount on your total bill.");
        } else {
            System.out.println("Please enter valid type.");
            calculate();
        }
    }
}

class Print extends Calculate {
    void printDetails() {
        LocalDate date = LocalDate.now();
        System.out.println("Date of Service: " + date);
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Customer's net payable amount = $" + arr[i][0]);
        System.out.println("---------------------------------------------------");
    }
}

class Revenue extends Print {
    void calculateRevenue() {
        for(int k = 0;k<n;k++){
            sum = sum + arr[k][0];
        }
        System.out.println("Your today's generated revenue is $" + sum);
        System.out.println("---------------------------------------------------");
    }
}
public class Carwash extends Revenue {
    int find;
    void find(){
        System.out.println("Please enter the first digit of id of the customer's total bill you want to find: ");
        find = sc.nextInt();
        System.out.println("The data is given below: ");
        System.out.println("The id is " + find + "AA");
        if (arr[find][2] == 1) {
            System.out.println("Customer type: Premium");
        }else{System.out.println("Customer type: Normal");}
        if (arr[find][1] == 1) {
            System.out.println("Service taken : Hand Washing");
        }else if(arr[find][1] == 2){
            System.out.println("Service taken : Drive Through Tunnel Wash");
        }else{
            System.out.println("Service taken : Full-Service Car Wash");
        }
        System.out.println("The total bill of the customer is $" + arr[find][0]);
        System.out.println();
        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {
        Carwash obj = new Carwash();

        for (i = 0; i < n; i++) {
            id = i;
            System.out.println("Customer " + (i+1) + " id is " + i + "AA");
            obj.menu();
            obj.calculate();
            obj.printDetails();
        }
        obj.calculateRevenue();
        int h = 1;
        while (h == 1) {
            System.out.println("Do you want to find someone's bill payment? (1:yes,2:no)");
            h = sc.nextInt();
            if (h == 2) {
                System.out.println("Thank you for using our services today.");
                System.out.println("---------------------------------------------------");
                break;
            }else{
                obj.find();
            }
        }
    }
}
