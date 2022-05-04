package Algorithms.백준.단계별로풀어보기.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_17478 {

    public static StringBuilder complete;
    public static boolean flag = true;

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        make(N);

        System.out.print(complete);
    }

    static void make(int N) {

        if(N < 0) return;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < N; i++) {
            stringBuilder.append("____");
        }

        String line = stringBuilder.toString();

        stringBuilder = new StringBuilder();

        if(N == 0) stringBuilder.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");

        if(flag) {
            stringBuilder.append(line).append("\"재귀함수가 뭔가요?\"").append("\n");
            stringBuilder.append(line).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");;
            flag = false;
        }else {
            stringBuilder.append(line).append("\"재귀함수가 뭔가요?\"").append("\n");
            stringBuilder.append(line).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
            stringBuilder.append(line).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
            stringBuilder.append(line).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");
        }

        if(complete != null) {
            stringBuilder.append(complete).append("\n");
        }
        stringBuilder.append(line).append("라고 답변하였지.");

        complete = stringBuilder;

        N--;
        make(N);
    }
}
