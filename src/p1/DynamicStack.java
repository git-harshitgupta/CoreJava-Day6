package p1;

public class DynamicStack implements Stack{
    private int top = 0;
    private int size = STACK_SIZE;
    Employee[] emp = new Employee[STACK_SIZE];
    Employee[] temp;
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
        if(top<size)
            emp[top++] = e;
        else{
            System.out.println("insdie else");
            temp = new Employee[size];
            for(int i =0 ;i<size;i++){
                temp[i] = emp[i];
            }
            size=2*size;
            emp=new Employee[size];
            for(int i=0;i<temp.length;i++){
                emp[i] = temp[i];
            }
            emp[top++]=e;
        }
    }
}
