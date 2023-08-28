public class School {
    public class Student {
        String name = ("");
    
        int age= 0;
        //Color color;
        //Sex sex;
    
        //void eating(Lunch lunch){
          //NOSSO CÓDIGO AQUI
        }
        /*void drinking(Juice juice){
          //NOSSO CÓDIGO AQUI
        }
        void running(){
          //NOSSO CÓDIGO AQUI
        }*/
    
    public static void main(String[] args) throws Exception {
      Student student1 = new Student();
      student1.name= "John";
      student1.age= 12;
      //student1.color= Color.FAIR;
      //student1.sex= Sex.MALE;

      Student student2 = new Student();
      student2.name= "Sophia";
      student2.age= 10;
      //student2.color= Color.FAIR;
      //student2.sex= Sex.FEMALE;

      Student student3 = new Student();
      student3.name= "Lily";
      student3.age= 11;
      //student3.color= Color.DARK;
      //student3.sex= Sex.FEMALE;
    }
}