package Class;
import java.util.Scanner;

public class Class_1_homework {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student valera=new Student();
        Proffesor prof=new Proffesor();
        prof.setCenturu(25);
        prof.setNun("Vasyly");
        prof.setCognonen("Ivsnovich");

         valera.setName(input.next());
         valera.setSurname("Kravets");
         valera.setAge(29);
         System.out.println(valera.getName()+" "+valera.getSurname()+" "+valera.getAge());
         System.out.println(prof.getNun()+" "+prof.getCognonen()+" "+prof.getCenturu());

         prof.std.setSurname(valera.getSurname()+input.next());



         System.out.println(prof.std.getSurname());





    }
}
