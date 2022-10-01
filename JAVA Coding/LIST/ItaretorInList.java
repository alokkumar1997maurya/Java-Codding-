package LIST;

import java.util.*;

public class ItaretorInList {
    public static void main(String[] args) {

        List<String> tvNames = new ArrayList<>();

        tvNames.add("ZEE");
        tvNames.add("NDTV");
        tvNames.add("HotStar");
        System.out.print("01. Itaretion using by forEach and Lambda Expression : ");

        tvNames.forEach(tvName -> {
            System.out.print(tvName + ", ");
        });
        System.out.println();

        System.out.print("02. By using Itaretor :");
        Iterator itr = tvNames.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());
        }

        System.out.println();
        System.out.print("03. By using For-Each loop : ");
        for (String nam : tvNames) {
            System.out.print(nam + " ");
        }

        // BY using for loop
        System.out.println();
        System.out.print("04. By using of for Loop :");
        for (int i = 0; i < tvNames.size(); i++) {
            System.out.print(" " + tvNames.get(i));
        }
    }
}
