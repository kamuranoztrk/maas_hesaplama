public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    //double vergi= 0.0;
    //int bonus= 0;
    //double zam= 0;
    public Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax(){
        if(this.salary > 1000){
            double vergi = this.salary * 0.03;
            //this.salary -= vergi;
        }else {
            System.out.println("Verginiz yoktur!");
        }
        return 0;
    }
    public double bonus(){
        if(this.workHours > 40){
            double bonus = (this.workHours-40) * 30;
            return bonus;
        }else{
            return 0;
        }
    }
    int buYıl = 2021;
    public double riseSalary(){
        if(buYıl - hireYear < 10){
            double zam = this.salary * 0.05;
            return zam;
        }else if ((buYıl - hireYear) >=10  && (buYıl - hireYear) < 20){
            double zam = this.salary * 0.01;
            return zam;
        } else if ((buYıl - hireYear) >=20){
            double zam = this.salary * 0.15;
            return zam;
        }
        return 0;
    }

    public void run(){
        System.out.println("-------------");
        System.out.println(" işçi : " + this.name);
        System.out.println(" Maaşı : " + this.salary);
        System.out.println(" Çalışma saati : " + this.workHours);
        System.out.println(" Bşlangıç yılı : " + this.hireYear);
        System.out.println(" Vergi : " + tax());
        System.out.println(" Bonus : " + bonus());
        System.out.println(" Maaş artışı : " + riseSalary());
        System.out.println(" Vergi ve Bonuslar ile birlikte maaş : " + (bonus() + this.salary - tax()));
        System.out.println(" Toplam maaş : " + (bonus() + riseSalary() + this.salary - tax()));
    }


}
