

import java.util.Arrays;
import java.util.List;


public class StreamsMain {


    public static void main(String[] args) {
        List<Person> mylist=Arrays.asList(
                new Person("charles","dd",24),
                new Person("lewis","carroll",42),
                new Person("Thomas","carlis",51),
                new Person("Charlotte","bronte",45),
                new Person("Matt","Arnold",34));


        mylist.stream().forEach(p -> System.out.println(p.getFirstname()));

    }
}
