/*
백준4963 제목: 섬의 개수  날짜 18.4.23
난이도 : 4
분류 : 그래프 이론 , 그래프
정사각형으로 이루어져 있는 섬과 바다 지도가 주어진다. 섬의 개수를 세는 프로그램을 작성하시오

한 정사각형과 가로, 세로 또는 대각선으로 연결되어 있는 사각형은 걸어갈 수 있는 사각형이다.

두 정사각형이 같은 섬에 있으려면, 한 정사각형에서 다른 정사각형으로 걸어서 갈 수 있는 경로가 있어야 한다. 지도는 바다로 둘러쌓여 있으며, 지도 밖으로 나갈 수 없다.

-> 큐를 이용해서 그래프를 색칠한다 . ( count를 이용한 인접한 것들 색칠)
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back4963 {

    public static void main(String[] args){
        // 클래스 정의
        class Point {
            int i;
            int j;
            int value;
            Point(){
                this(0,0,0);
            }
            Point(int i, int j, int value){
                this.i = i;
                this.j = j;
                this.value = value;
            }
        }

        Scanner scanner = new Scanner(System.in);
        Queue queue = new LinkedList();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int value;

        while(true){
            Point[][] a = new Point[h][w];
            int count = 1;
            // 배열 선언 및 입력
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    value = scanner.nextInt();
                    a[i][j] = new Point(i, j, value);
                }
            }

            // 인접 알고리즘
            for(int i = 0 ; i < h; i++){
                for(int j = 0 ; j < w; j++){
                    if(a[i][j].value == 1){
                        queue.offer(a[i][j]);
                        count++;
                        a[i][j].value = count;
                        while(!queue.isEmpty()){
                            Point v = (Point)queue.poll();
                            if(v.i + 1< h && a[v.i+1][v.j].value ==1){// 앞쪽이 거짓이면 뒤쪽도 거짓이므로 . // 아래칸 6시방향
                                a[v.i+1][v.j].value =count;
                                queue.offer(a[v.i+1][v.j]);
                            }
                            if(v.j + 1< w && a[v.i][v.j + 1].value ==1) {                               // 3시방향
                                a[v.i][v.j + 1].value = count;
                                queue.offer(a[v.i][v.j+1]);
                            }
                            if(v.i +1 < h && v.j + 1 < w && a[v.i +1][v.j + 1].value ==1){              // 5시 방향
                                a[v.i +1][v.j +1].value = count;
                                queue.offer(a[v.i+1][v.j+1]);
                            }
                            if(v.i - 1 >= 0 && v.j +1 <w && a[v.i -1][v.j +1].value ==1){               // 2시 방향
                                a[v.i-1][v.j+1].value =count;
                                queue.offer(a[v.i-1][v.j+1]);
                            }
                            if(v.i -1 >= 0&& a[v.i-1][v.j].value ==1) {             // 12시 방향
                                a[v.i-1][v.j].value =count;
                                queue.offer(a[v.i-1][v.j]);
                            }
                            if(v.i-1 >=0 && v.j -1 >= 0&& a[v.i-1][v.j-1].value ==1){       // 11시방향
                                a[v.i-1][v.j-1].value =count;
                                queue.offer(a[v.i-1][v.j-1]);
                            }
                            if(v.j - 1>= 0 && a[v.i][v.j-1].value ==1){         // 9시방향
                                a[v.i][v.j-1].value = count;
                                queue.offer(a[v.i][v.j-1]);
                            }
                            if(v.i+1 < h && v.j-1 >=0 && a[v.i+1][v.j-1].value == 1){ // 7시 방향
                                a[v.i+1][v.j-1].value = count;
                                queue.offer(a[v.i+1][v.j-1]);
                            }
                        }
                    }
                }
            }
            System.out.println(count -1);

            for(int i = 0 ; i < h; i++){
                for(int j = 0 ; j < w; j++){
                    System.out.printf("%d ", a[i][j].value);
                }
                System.out.println();
            }

            w = scanner.nextInt();
            h = scanner.nextInt();
            if(w == 0 && h == 0) break;
        }
    }


}
