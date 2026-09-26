class employee {
 int employeeid;
 String name;
 float salary;
 static String companyname="Microsoft";

 employee(){
    employeeid=00;
    name="abc";
    salary=0;
 }
} 
class Main{
    public static void main (String args[]){
        employee e1 =new employee();
        e1.employeeid=17;
        e1.name="Jamilah";
        e1.salary=6000;
        System.out.println("Employee id: "+e1.employeeid);
        System.out.println("Employee name: "+e1.name);
        System.out.println("Employee salary: "+e1.salary);
        System.out.println("Employee company: "+e1.companyname);

        employee e2 =new employee();
        System.out.println("Employee id: "+e2.employeeid);
        System.out.println("Employee name: "+e2.name);
        System.out.println("Employee salary: "+e2.salary);
        System.out.println("Employee company: "+e2.companyname);
    }
}
 