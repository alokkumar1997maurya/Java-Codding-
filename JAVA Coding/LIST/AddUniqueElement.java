package LIST;

import java.util.*;
public class AddUniqueElement {
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();
            System.out.println("Enter the 5 value");

            try (Scanner TakeInput = new Scanner(System.in)) {
                for(int i=0 ; i<9; i++){
                    int temp = TakeInput.nextInt();

                    if(!list.contains(temp)){
                        list.add(temp);

                    }
                  
                }
            }

            Collections.sort(list);
       
            System.out.println(list);
    }
}
