/*
백준 10845 제목 : 큐  날짜 18.4.16
분류 : 큐
난이도 : 2
정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */

import java.util.Scanner;

public class Back10845 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        Queue q = new Queue();
        int t = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0 ; i < t; i++){
            String str = scanner.nextLine();
            String[] strings = str.split(" ");
            if(strings[0].equals("push")){
                q.push(Integer.valueOf(strings[1]));
            }
            else if(strings[0].equals("pop")){
                System.out.println(q.pop());
            }
            else if(strings[0].equals("size")){
                System.out.println(q.size());
            }
            else if(strings[0].equals("empty")){
                System.out.println(q.empty());
            }
            else if(strings[0].equals("front")){
                System.out.println(q.front());
            }
            else if(strings[0].equals("back")){
                System.out.println(q.back());
            }
        }
    }
}


class Queue {
    int[] array = new int[10001];
    int bk = 0;
    int fr = 0;

    void push(int x){
        array[bk] = x;
        bk++;
    }

    int pop(){
        if(bk == fr) return -1;
        return array[fr++];
    }

    int size(){
        return bk - fr;
    }
    int front(){
        if(bk == fr) return -1;
        return array[fr];
    }

    int back(){
        if(bk == fr ) return -1;
        return array[bk - 1];
    }

    int empty() {
        return bk == fr ? 1 : 0;
    }
}