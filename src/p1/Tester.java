package p1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = null ;
        boolean exitFixedSize = true;
        Employee e;
        while (exitFixedSize){
        System.out.println("1.Fixed sized stack \n2.Dynamic size stack \n3.Push Employee \n4.Pop Employee \n5.Exit");
        System.out.println("Enter your choose you cant go back after the choose Fixed and Dynamic stack");
        switch (sc.nextInt()){
            case 1:
                if(stack==null)
                    stack= new FixedStack();
                else
                    System.out.println("Stack is already in dynamic mode");
                break;
            case 2:
                if(stack==null){
                    stack= new DynamicStack();
                }
                else
                    System.out.println("Stack is already in fixed mode");
                break;
            case 3:
                System.out.println("Enter Employee details with : id,name,salary");

                e=new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
                stack.push(e);
                break;
            case 4:
                stack.pop();
                break;
            case 5:
                exitFixedSize=false;
        }
        }
    }
}
