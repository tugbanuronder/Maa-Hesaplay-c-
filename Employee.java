public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYears;
    int year;


    Employee(String name, double salary, int workHours , int hireYears){

        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYears=hireYears;

    }

    public double tax(){

        if(this.salary < 1000){

            return 0.0;
        }
        if(this.salary > 1000){

            return (this.salary) * 0.03;
        }
        else{

            System.out.println("Geçersiz maaş değeri girdiniz.");
            return 0.0;
        }
    }

    public double bonus(){

        if(this.workHours > 40){

            return (this.workHours - 40) * 30;
        }
        else{

            return 0.0;
        }
    }

    public double raiseSalary(){

        this.year = 2021 - (this.hireYears);

        if(this.year<10){

            return (this.salary) * 0.05;
        }
        if(9<this.year && this.year<20){

            return (this.salary) * 0.10;
        }
        if(this.year>19 ){

            return (this.salary) * 0.15;
        }
        else{

            System.out.println("Yanlış değer girdiniz.");
            return 0.0;
        }
    }

    public void tostring(){

        System.out.println("Adı :" + this.name);
        System.out.println("Maaşı :" + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı :" + this.hireYears);
        System.out.println("Vergi :" + tax());
        System.out.println("Bonus :" + bonus());
        System.out.println("Maaş artışı :" + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş :" + (this.salary - tax() + bonus() + raiseSalary()));
    }


}
