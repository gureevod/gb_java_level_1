public class HomeWorkApp5 {

    public static class Employee {
        String fullName;
        String position;
        String email;
        String phone;
        int salary;
        int age;

        public Employee(String fullName, String position, String email, String phone, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }
        public void showAllInfo() {
            System.out.println("Имя: " + this.fullName);
            System.out.println("Должность: " + this.position);
            System.out.println("Email: " + this.email);
            System.out.println("Телефон: " + this.phone);
            System.out.println("Зарплата: " + this.salary);
            System.out.println("Возраст: " + this.age);
            System.out.println("-----------------------------");
        }
    }


    public static void main(String[] args) {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Petr Petrov", "Doctor", "docpetrov@gmail.com", "89113332211",79000, 40);
        emplArray[1] = new Employee("Sergey Ivanov", "PR", "sergeyPR@gmail.com", "89113312219",25000, 26);
        emplArray[2] = new Employee("Luke Besson", "SEO", "bigBoss@gmail.com", "89117777777",420000, 41);
        emplArray[3] = new Employee("Karl Jr", "Cleaner", "cleanKarl@gmail.com", "89113349632",79000, 63);
        emplArray[4] = new Employee("Stan Evil", "QA", "evilQA@gmail.com", "89116666666",174000, 39);
        System.out.println(emplArray.length);
        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].age > 40) {
                emplArray[i].showAllInfo();
            }
        }
    }

}
