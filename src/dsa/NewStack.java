package dsa;

public class NewStack {
    int top = -1;
    int[] arr;

    public NewStack(int el) {
        this.arr = new int[el];
    }

    private boolean isEmpty() {
        if (top > -1) {
            return false;
        }
        return true;
    }

    public void push(int el) {
        if (top + 1 < this.arr.length) {
            this.arr[++top] = el;
        }
    }

    public void pop() {
        if (!this.isEmpty()) {
            top--;
        }
    }

    public int top() {
        if (!this.isEmpty()) {
            return this.arr[top];
        }
        return '0';
    }
    
    public static void insertExpression(String exp){
        String sign = null;
        for (int i = 0; i < exp.length(); i++) {
            if (Character.isDigit(exp.charAt(i))) {
                
            }else{
                switch (exp) {
                    case "+":
                        
                        break;
                    default:
                        break;
                }
            }
        }
    }

}
