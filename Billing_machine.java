import java.util.Scanner;

public class Billing_machine {
    static String Welcome = "$$ Welcome To Namma Restaurant $$";
     static int total = 0;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char o;
        System.out.println(Welcome);
        int item;
        System.out.println("Please Place you order by ");
        int i=0;
        int val=0;
        do{
            menu();
            System.out.print("entering the given number : ");
            item=sc.nextInt();
            System.out.print("number of plates : ");
            int num=sc.nextInt();
            System.out.print("your order : ");
            orders(item);
            System.out.println(" * "+num+" plates ");
            System.out.print("Do You Want To Add Other Item(y/n) : ");
            o =sc.next().charAt(0);
            total=price(item)*num;
            val += total;
        }while(o=='y');
        System.out.println("Total Amount to pay: "+val+".Rs Only");
        System.out.println("%%%%%%%% Thank You For visiting %%%%%%%%");
    }
    public static void menu()
    {
        System.out.println("1. Idly                  :20");
        System.out.println("2. Poori                 :30");
        System.out.println("3. vada                  :25");
        System.out.println("4. Plain Dosa            :20");
        System.out.println("5. Sp Dosa               :40");
        System.out.println("6. Masala Dosa           :40");
        System.out.println("7. Veg Shawarma          :80");
        System.out.println("8. Chicken Shawarma      :120");
        System.out.println("9. Chicken Soup          :100");
        System.out.println("10. Mutton Soap          :140");
        System.out.println("11. Mutton Keema         :160");
        System.out.println("12. Dum Biryani          :160");
        System.out.println("13. Chicken Biryani      :200");
        System.out.println("14. Veg Pulao            :150");
        System.out.println("15. Namma Sp Mandi       :550");

    }
    public static void orders(int a) {
        switch (a) {
            case 1:
                System.out.print("Idly 20.Rs");
                break;
            case 2:
                System.out.print("Puri 30.Rs");
                break;
            case 3:
                System.out.print("Vada 25.Rs");
                break;
            case 4:
                System.out.print("Plain Dosa 20.Rs");
                break;
            case 5:
                System.out.print("Sp Dosa 40.Rs");
                break;
            case 6:
                System.out.print("Masala Dosa 40.Rs");
                break;
            case 7:
                System.out.print("Veg Shawarma 80.Rs");
                break;
            case 8:
                System.out.print("chicken Shawarma 120.Rs");
                break;
            case 9:
                System.out.print("Chicken Soup 100.Rs");
                break;
            case 10:
                System.out.print("Mutton Soup 140.Rs");
                break;
            case 11:
                System.out.print("Mutton Keema 180.Rs");
                break;
            case 12:
                System.out.print("Dum Biryani 210.Rs");
                break;
            case 13:
                System.out.print("Chicken Biryani 240.Rs");
                break;
            case 14:
                System.out.print("Veg Pulao 150.Rs");
                break;
            case 15:
                System.out.print("Namma Sp Mandi 550.Rs");
                break;
            default:
                System.out.print("Sorry For your Inconvenience");
                System.out.println("Item Not in menu");
                break;
        }
    }
    public static int price(int a)
    {
        if(a==1)
            return 20;
        else if(a==2)
            return 30;
        else if(a==3)
            return 25;
        else if(a==4)
            return 20;
        else if(a==5)
            return 40;
        else if(a==6)
            return 40;
        else if(a==7)
            return 80;
        else if(a==8)
            return 120;
        else if(a==9)
            return 100;
        else if(a==10)
            return 140;
        else if(a==11)
            return 160;
        else if(a==12)
            return 210;
        else if(a==13)
            return 240;
        else if(a==14)
            return 150;
        else if(a==15)
            return 550;
        else
            return 0;
    }
    public static void mul(String item,String num)
    {

    }
}
