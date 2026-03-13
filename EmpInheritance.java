import java.util.Scanner;
class Employee
{
   int empid;
   String name,address;
   double salary;

   Employee(int no,String na,double sal,String addr)
   {
       empid=no;
       name=na;
       salary=sal;
       address=addr;
   }
}
class Teacher extends Employee
{
    String dept,subj;
    Teacher(int no,String na,double sal,String addr,String dep,String sub)
    {
        super(no,na,sal,addr);
        dept=dep;
        subj=sub;
    }
    void display()
    {
        System.out.println("Employeid:"+empid);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
        System.out.println("Address:"+address);
        System.out.println("Department:"+dept);
        System.out.println("Subject:"+subj);
    }
}
class EmpInheritance
{
    public static void main(String[]args)
    {
        System.out.println("\nEnter he no.of Employees");
        Scanner s=new Scanner(System.in);
        int num =s.nextInt();
        Teacher arr[]=new Teacher[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("\nEnter Employee-"+(i+1)+"details:id,Employee Name,Salary,Address,Department,Subject");
            int empid=s.nextInt();
            String name=s.next();
            double salary=s.nextDouble();
            String address=s.next();
            String dept=s.next();
            String subject=s.next();
            arr[i]=new Teacher(empid,name,salary,address,dept,subject);
        }
        System.out.println("\n**Information of all the employee's**");
        for(int i=0;i<num;i++)
        {
            System.out.println("\nEmployee-"+(i+1)+"details");
            System.out.println("-------------------------");
            arr[i].display();
        }
        s.close();
    }
}
   
