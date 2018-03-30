

//import java.util.Collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;


public class UnitExercise1 {


    public static void main(String[] args)


    {
        List<Person> people = Arrays.asList(
                new Person("mayur", "mahadeshwar", 28),
                new Person("sham ", "sham ", 28),
                new Person("cham", "cham", 32),
                new Person("chammy", "chammy", 28));


        //UnitExercise1.printAll(people);





        //step 1 sort the list


        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });

        // step 2 create a method that prints all elements of the list



       // UnitExercise1.printConditionally(people,p -> p.getLastname().startsWith("C"));


    }




    private static void printConditionally(List<Person>input, Condition condition)
    {

        for (Person p:input)
        {
            if (condition.test(p))
                System.out.println(p);
        }

    }



        private static void printAll(List<Person> peopleinput)

    {
                for (Person p : peopleinput)
                {
                    System.out.println(p);
                }
    }

        //step 3 create a method that prints all people that have last name with c







}
