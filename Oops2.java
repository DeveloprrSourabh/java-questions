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

class Oops2{
    public static void main(String[] args) {
        Student st = new Student("sourabh",12);

        st.printInfo();
    }
}