package company.pizza;
import java.util.Scanner;
public class Pizza {
    Scanner input = new Scanner(System.in);
        private String size = "";
        private int cheese_toppings = 0;
        private int peproni_toppings = 0;
        private int ham_toppings = 0;
        public Pizza(){
            System.out.println("Enter the size of the pizza");
            set_pizza_size();
            set_toppings();
        }
        public void set_pizza_size(){
            System.out.println("Enter the Size of the pizza:");
            System.out.println("You have three options:\n Enter 1 for Small \n 2 for Medium \n 3 for large:");
            int x = input.nextInt();
        switch (x) {
            case 1 -> size = "small";
            case 2 -> size = "medium";
            case 3 -> size = "large";
            default -> {
                System.out.println("You Enter Invalid Choice.In Order to Enter Valid choice please Enter 1");
                int a = input.nextInt();
                if(a == 1){
                    set_pizza_size();
                }
            }
        }
        }
        public String get_pizza_size(){
         return size;
        }
        public void set_toppings(){
         System.out.println("Now it's time to Choose Toppings for the Pizza:");
            System.out.println("You have three options:\n Enter 1 for Cheese \n 2 for Pepproni \n 3 for Ham:");
            int x = input.nextInt();
            int b = 0;
        switch (x) {
            case 1 -> {
                System.out.println("Enter the Quantity of Cheese Toppings:");
                cheese_toppings += input.nextInt();
                System.out.println("\n want to Add more Toppings? \n Press 1\n press anything any no to Quit:");
                b = input.nextInt();
                if (b == 1){
                 set_toppings();
                }
                else {
                break;
                }
            }
            case 2 -> {
                System.out.println("Enter the Quantity of Pepproni Toppings:");
                peproni_toppings += input.nextInt();
                 System.out.println("\n want to Add more Toppings? \n Press 1\n press anything any no to Quit:");
                b = input.nextInt();
                if (b == 1){
                 set_toppings();
                }
                else {
                break;
                }
            }
            case 3 -> {
                System.out.println("Enter the Quantity of Ham Toppings:");
                ham_toppings += input.nextInt();
                 System.out.println("\n want to Add more Toppings? \n Press 1 \n press anything any no to Quit:");
                b = input.nextInt();
                if (b == 1){
                 set_toppings();
                }
                else {
                break;
                }
            }
            default -> {
                System.out.println("You Enter Invalid Choice.In Order to Enter Valid choice please Enter 1");
                int a = input.nextInt();
                if(a == 1){
                    set_toppings();
                }
            }
        }
        }
        public double cal_cost(){
            double cost;
        if (size.equals("small")){
         cost = 1.0 + (2 * (cheese_toppings + peproni_toppings + ham_toppings));
         return cost;
        }
        else if(size.equals("medium")){
        cost = 12.0 + (2 * (cheese_toppings + peproni_toppings + ham_toppings));
        return cost;
        }
        else if(size.equals("large")){
        cost = 14.0 + (2 * (cheese_toppings + peproni_toppings + ham_toppings));
        return cost;
        }
        else { 
        return 0;
        }
        }
        public String get_description(){
            System.out.println("\n\n The Description of the order is given below: \n");
            String des= "Size :" + size + "\nCheese Toppings: " + cheese_toppings + 
                    "\nPepproni Toppings: " + peproni_toppings + "\nHam Toppings: " + ham_toppings + "\nCost: " + cal_cost();
        return des;
        }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Pizza obj = new Pizza();
        System.out.println(obj.cal_cost());
        System.out.println(obj.get_description());
    }
}

