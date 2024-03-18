package java.polymorphism;
/*Employee(name,Id,basic,da,hra)

void showSalary()

Teaching staff:

GP(GradePay=6000/7000/8000)

salary=basic+ da (150% of basic+GP) + hra (20% of
basic+GP)

NonTeaching staff:

salary=basic+ da (100% of basic) + hra (10% of basic)

Teaching and NonTeaching are derived from the class Employee.

The method void showSalary() is overridden.Implement using dynamic method dispatch */

class Employee {
    String name;
    int id;
    float basic;
    float da;
    float hra;

    Employee(String p, int q, float r, float s, float t) {
        name = p;
        id = q;
        basic = r;
        da = s;
        hra = t;
    }

    void showSalary() {
        System.out.println("employee type not defined");
    }
}

class teaching extends Employee {
    teaching(String p, int q, float r, float s, float t) {
        super(p, q, r, s, t);
    }

    float gp = 6000;
    float sal = basic + da * ((150 * basic) / 100) + hra * (((basic * 20) / 100) + gp);

    void showSalary() {
        System.out.println("salary of teaching staff is:" + sal);
    }

}

class NonTeaching extends Employee {
    NonTeaching(String p, int q, float r, float s, float t) {
        super(p, q, r, s, t);
    }

    float sal = basic + da * (basic) + hra * ((basic * 10) / 100);

    void showSalary() {
        System.out.println("salary of non teaching staff is" + sal);
    }
}

class show{
    public static void main(String[] args) {
        Employee e;
        teaching t = new teaching("Vijay",1,200000.0f,5000.0f,2000.0f);
        NonTeaching n = new NonTeaching("Sandeep", 2,25000.0f, 400.0f, 2000.0f);
        e=t;
        e.showSalary();;
        e=n;
        e.showSalary();
    }
}