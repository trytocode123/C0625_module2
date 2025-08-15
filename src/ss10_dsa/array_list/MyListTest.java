package ss10_dsa.array_list;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Nguyen Van A");
        Student b = new Student(2, "Nguyen Van B");
        Student c = new Student(3, "Nguyen Van C");
        Student d = new Student(4, "Nguyen Van D");
        Student e = new Student(5, "Nguyen Van E");

        MyArrayList<Student> myArrayList = new MyArrayList<>();

        myArrayList.add(a);
        myArrayList.add(b);
        myArrayList.add(c);
        myArrayList.add(d);
        myArrayList.add(e, 2);
        myArrayList.remove(0);
        myArrayList.add(new Student(5, "Nguyen Van F"), 2);
        MyArrayList<Student> newList = myArrayList.clone();
        for (int i = 0; i < newList.size(); i++) {
            Student student = (Student) newList.elements[i];
            System.out.println(newList.elements[i]);
            System.out.println(student.getId());
            System.out.println(student.getName());
        }


        for (int i = 0; i < myArrayList.size(); i++) {
            Student student = (Student) myArrayList.elements[i];
            System.out.println(myArrayList.elements[i]);
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }

}
