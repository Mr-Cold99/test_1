package collection1.homework;

import collection1.homework.custom.CustomLinkedList;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        /*
        1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип

        2. Зберегти у колекції список студентів (класс Студент теж створити)

        3. Вивести цей список

        4. Опціонально: написати реалізацію класу ArrayList або LinkedList
        */


        Random rnd=new Random();
       List<Integer> list_1=new LinkedList<>();
       List<Integer> list_2=new ArrayList<>();



        Student student_1=new Student();
        Student student_2=new Student();
        Student student_3=new Student();
        Student student_4=new Student();
        Student student_5=new Student();


            student_1.setAge(22);
            student_1.setName("Anya");
            student_1.setSubjekt("Java_Script");
                student_2.setAge(30);
                student_2.setName("Mikola");
                student_2.setSubjekt("Automotive");
                    student_3.setAge(27);
                    student_3.setName("Lev");
                    student_3.setSubjekt("Piton");
                student_4.setAge(21);
                student_4.setName("Yuri");
                student_4.setSubjekt("Java");
            student_5.setAge(26);
            student_5.setName("July");

            student_5.setSubjekt("Action_Script");
       /////// System.out.println(student_1);
        /////
        /////
        /////
        ArrayList<Student> RobotDreamsArr=new ArrayList<>();
                RobotDreamsArr.add(student_1);
                RobotDreamsArr.add(student_2);
                RobotDreamsArr.add(student_3);
                RobotDreamsArr.add(student_4);
                RobotDreamsArr.add(student_5);
                System.out.println(RobotDreamsArr);

        //////////
        /////////
        LinkedList<Student>RobotDreamsLink=new LinkedList<>();
                RobotDreamsLink.add(student_1);
                RobotDreamsLink.add(student_2);
                RobotDreamsLink.add(student_3);
                RobotDreamsLink.add(student_4);
                RobotDreamsLink.add(student_5);



                System.out.println(RobotDreamsLink);


////     1. Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип



          list1(list_1,rnd);
          list2(list_2,rnd);
            System.out.println(list_1);
            System.out.println(list_2);


////       4. Опціонально: написати реалізацію класу ArrayList або LinkedList
        CustomLinkedList<Student> custList=new CustomLinkedList<>();
        custList.add(student_1);
        custList.add(student_2);
        custList.add(student_3);
        custList.add(student_4);
        custList.add(student_5);
        System.out.println(custList);

    }



    public static void   list1(List<Integer> list_1, Random rnd){
        for(int i=0;i<10;i++){
            list_1.add(rnd.nextInt(10)+1);

       }


    }
    public static void list2(List<Integer>list_2,Random rnd){
        for (int i=0;i<2000;i++){
            list_2.add(rnd.nextInt(2000)+1);
        }
    }

}
