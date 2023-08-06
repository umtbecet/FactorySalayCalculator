public class Employee {
    String name;
    double salary;
    int workHours,hireYear;
    Employee(String name, double salary, int workHours, int hireYear){
        this.name= name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if (this.salary>=1000){
            return (this.salary*3)/100;
        }else {
            return 0;
        }

    }
    public double bonus(){
        if (this.workHours>40){
            return (this.workHours-40)*30;
        }else {
            return 0;
        }
    }
    public double raiseSalary(){
        int salaryYear = 2021;
        if (salaryYear-this.hireYear<10){
            return (this.salary*5)/100;
        } else if ((salaryYear-this.hireYear)>9 &&(salaryYear-this.hireYear)<20) {
            return (this.salary*10)/100;
        }else {
            return (this.salary*15)/100;
        }
    }
    public void toStringP(){
        System.out.println("Adı: "+ this.name);
        System.out.println("Maaşı: "+ this.salary);
        System.out.println("Çalışma Saati: "+ this.workHours);
        System.out.println("Başlangıç Yılı: "+ this.hireYear);
        System.out.println("Vergi: "+ this.tax());
        System.out.println("Bonus: "+ this.bonus());
        System.out.println("Maaş Artışı: "+ this.raiseSalary());
        System.out.println("Toplam Maaş: "+ (this.salary + bonus() + raiseSalary() - tax()));

    }

}
























