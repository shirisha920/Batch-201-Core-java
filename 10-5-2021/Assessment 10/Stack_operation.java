import java.util.*;
public class Stack_operation {
	static int[] stack =new int[5];
	static Scanner sc = new Scanner(System.in);
	static int top = -1;

	public static void main(String[] args) {
		Stack_operation stk =new Stack_operation();
		stk.pop();
		stk.push(44);
		stk.push(46);
		stk.push(78);
		stk.push(32);
		stk.push(55);
		stk.display();
		
		stk.pop();
		stk.display();
	}

	void pop() {
		
			if(isEmpty()) {
				System.out.println("stack is empty");
			}
			else {
				int popelement =stack[top];
				top--;
				System.out.println(" element poped from a stack : " + popelement);
				
			}
		}
	
	void push(int x) {
		
			if(isFull()) {
				System.out.println("Stack is full");
			}
			else {
				++top;
				stack[top] = x;
				System.out.println(x+ " Pushed into Stack " );	
			}
			
	}

	void display() {
		System.out.println("elements present in stack :");
		for(int i=0; i<=top; i ++) {
			System.out.print(stack[i] + " ");
		}
	}

    boolean isEmpty() {
		boolean b = false ;
		if(top == -1) {
			b = true ;
		}
		return b;
	}
	boolean isFull() {
		boolean b = false ;
		if(top == stack.length-1) {
			b = true ;
		}
		return b;	
	}
}
