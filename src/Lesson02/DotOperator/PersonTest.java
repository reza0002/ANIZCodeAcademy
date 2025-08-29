package Lesson02.DotOperator;

public class PersonTest {

        public static void main(String[] args) {

            String fName = "Andreas";
            String mName = "Elias";
            String lName = "Mogensen";
            int age = 47;

            OpretNytPersonObjekt(fName, mName, lName, age);

        }

            public static void OpretNytPersonObjekt(String fName, String mName, String lName, int age)
            {

                // Opretter et nyt Person-objekt
                Person p = new Person();

                // Sætter værdier
                p.firstName = fName;
                p.middleName = mName;
                p.lastName = lName;
                p.age = age;

                //Udskriv
                p.WritePersonInfo();
            }
        }



