package colection2;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class MainHomework {
    public static void main(String[] args) {
        /*
        1. У циклі на 1000 повтореннь сгенерувати випадкові числі діапазоном від 1 до 50 за зберегти їх у різні типи колекцій сет

        2. Вивести всі 3 варіанти на консоль
         */

        Set<Integer>hashset=new HashSet<>();
        Set<Integer>treset=new TreeSet<>();
        Set<Integer>linkedhashset=new LinkedHashSet<>();
        Set<Integer>copyonwritearrayset=new CopyOnWriteArraySet<>();
        final Random rnd=new Random();

        for (int i=1; i<=1000;i++) {
            hashset.add(rnd.nextInt(50)+1);
            treset.add(rnd.nextInt(50)+1);
            linkedhashset.add(rnd.nextInt(50)+1);
            copyonwritearrayset.add(rnd.nextInt(50)+1);
        }

        System.out.println(hashset);
        System.out.println(treset);
        System.out.println(linkedhashset);
        System.out.println(copyonwritearrayset);
    }
}
