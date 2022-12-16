 class Student {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

     Student(String name, int age){
this.name= name;
this.age = age;
    }
}
 class Oops3{
    public static void main(String[] args) {
        Student s4 = new Student("ram", 24);
        s4.printInfo();
    }
}
