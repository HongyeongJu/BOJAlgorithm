/*
백준 알고리즘 10828번 문제 제목 : 스택
난이도 2

정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.


스택 구현!
 */

import java.util.Scanner;

public class Back10828 {

    public static void main(String[] args){
        Stack stack = new Stack();
        Scanner scanner =new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String line;
        for(int i = 0 ; i < t ; i++){
            line = scanner.next();
           // System.out.println(line);
            if(line.equals("push")){
                int num = scanner.nextInt();
             //   System.out.println(num);
                stack.push(num);
            }
            else if(line.equals("top")){
                System.out.println(stack.top());
            }
            else if(line.equals("size")){
                System.out.println(stack.size());
            }
            else if(line.equals("empty")){
                System.out.println(stack.empty());
            }
            else if(line.equals("pop")){
                System.out.println(stack.pop());
            }
        }
    }
}


class Stack {
    int[] array = new int[10001];
    int index = -1;
    public void push(int x){
        array[++index] = x;
    }

    public int pop(){
        if(index != -1){
            return array[index--];
        }
        else{
            return -1;
        }
    }

    public int size(){
        return index + 1;
    }
    public int empty() {
        if(index == -1) return 1;
        else return 0;
    }

    public int top(){
        if(index != -1){
            return array[index];
        }
        else{
            return -1;
        }
    }
}
