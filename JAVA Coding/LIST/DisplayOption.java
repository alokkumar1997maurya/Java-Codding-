package LIST;

import java.util.*;

public class DisplayOption {
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();

        try (Scanner TakeInput = new Scanner(System.in)) {
            while(true){
                DisplayMenu();
                int choice = TakeInput.nextInt();
                if(choice==1){
                    //Add
                        System.out.print("Enter the Integer Value : ");
                        list.add(TakeInput.nextInt());
                        System.out.println("Added");

                }
                else if(choice==2){
                    // remove1
                    System.out.println("Enter to remove Number");
                    int elementToremove = TakeInput.nextInt();
                    if(list.contains(elementToremove)){
                        list.remove(Integer.valueOf(elementToremove));
                        System.out.println("Removed");
                    }else{
                        System.out.println("Element not found");
                    }
                }
                else if(choice==3){
                    // display
                    System.out.println("List is " + list);
                }
                else if(choice==4){
                    System.out.println("Good Bye");
                    break;
                }
            }
        }

   
    }
    private  static void DisplayMenu() {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Dispaly");
        System.out.println("4. Exit");
        System.out.println();
    }
}
