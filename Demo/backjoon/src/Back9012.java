/*
백준 9012 제목 괄호 날짜 18.4.20
괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.

여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
난이도 :2

괄호 검사하면 된다. 스택을 이용한다.

 */

import java.util.Scanner;

public class Back9012 {

    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i < n; i++){
            String str = scanner.nextLine();
            if(isVPS(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean isVPS(String str){
        Stack1 st = new Stack1();
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) =='('){
                st.push('(');
            }else if(str.charAt(i) ==')'){
                if(st.isEmpty()) return false;
                if(st.pop() != '(') break;
            }
        }

        if(st.isEmpty()) return true;
        else return false;
    }
}

class Stack1 {
    char[] datas = new char[50];
    int top = -1;

    public boolean isFull() {
        return top ==(datas.length - 1);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char data){
        if(!isFull()) datas[++top] = data;
    }

    public char pop(){
        return datas[top--];
    }

    public char peek(){
        return datas[top];
    }
}
