import java.util.ArrayList;

public class withArrayList {
    //public static void add();

    public static void main(String[] args){
        ArrayList<Integer> stack = new ArrayList<>();
        push(stack,20);
        push(stack,30);
        push(stack,50);
        push(stack,90);
        System.out.println(stack);
        push(stack,10);
        push(stack,30);
        System.out.println( peek(stack));
        System.out.println(stack);
        pop(stack);
        System.out.println(stack);

    }

    public static void push(ArrayList<Integer> stack ,int val){
            stack.add(val);
    }
    public static void pop(ArrayList<Integer> stack){
        if(stack.isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        stack.remove(stack.size()-1);
    }
    public static int peek(ArrayList<Integer> stack){
        if(stack.isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack.get(stack.size()-1);
    }
    public static void print(ArrayList<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int val : stack) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

}

