package p1;

import java.util.Arrays;

public class FixedStack implements Stack {
    private Employee[] emp = new Employee[STACK_SIZE];
    private int top=0;
    @Override
    public void pop() {
        if(top==0){
            System.out.println("The stack is empty");
        }
        else{
            top--;
        }
    }

    @Override
    public void push(Employee e) {
            if(top<STACK_SIZE){
        System.out.println("inside push");
        emp[top++]=e;
    }
        else{
        System.out.println("The stack is full");
    }
    }




    @Override
    public String toString() {
        return "emp=" + Arrays.toString(emp) ;
    }
}
