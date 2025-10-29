public class withArray {
    public static int push(int arr[], int top, int val)
    {
        if(top >= arr.length)
        {
            System.out.println("Stack Overflow");
            return top;
        }

        arr[top] = val;
        return ++top;
    }
    public static void print(int arr[], int top)
    {
        if(top == 0){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0;i<top; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int pop(int arr[], int top)
    {
        if(top == 0)
        {
            System.out.println("Stack Underflow");
            return top;
        }
        return --top;
    }
    public static int peek(int arr[], int top)
    {
        if(top == 0){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top-1];
    }


    public static void main(String args[]) {
        int arr[] = new int[10];
        int top = 0;
        top = push(arr, top, 10);
        top = push(arr, top, 20);
        System.out.println(peek(arr, top));
        top = push(arr, top, 30);
        top = push(arr, top, 40);
        top = push(arr, top, 50);
        print(arr, top);
        top = pop(arr, top);
        top = pop(arr, top);
        print(arr, top);
        System.out.println(peek(arr, top));



}}
