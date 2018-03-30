


interface MyNumber{
boolean computeTest( int n );

        }


        public class NumericTest {


            public static void main(String[] args) {


                MyNumber iseven= (n) -> (n%2)==0;
                System.out.println(iseven.getClass());

            }


}

