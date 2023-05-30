import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Week8_treasure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());  //보물 개수 입력
        String[] xyvalue = new String[num]; //x,y,value 입력할 배열
        int[] treasuress = new int[num * 3];    //x,y,value 각각 idx에 넣을 배열
        for(int i = 0; i < num; i++){   //x,y,value 입력
            xyvalue[i] = br.readLine();
        }
        int idx = 0;
        for(int i = 0; i < num; i++){
            StringTokenizer st = new StringTokenizer(xyvalue[i], " ");
            for(int j = idx; j < idx + 3; j++){
                treasuress[j] = Integer.parseInt(st.nextToken());
            }
            idx += 3;
        }

        Treasure[] t = new Treasure[num];   //객체 배열 생성
        int j = 0;
        for(int i = 0; i < num; i++){
            t[i] = new Treasure(treasuress[j], treasuress[j + 1], treasuress[j + 2]);   //객체 배열에 각각 x,y,value 값 넣기
            j += 3;
        }
        Position p = new Position(2, 1);    //객체 p 생성

        int min = getDistance(p.x, p.y, t[0].x, t[0].y);    //거리 최소값 초기화
        int result = 0; //거리가 최소일 때의 인덱스값 초기화
        for(int i = 0; i < t.length; i++){
            if((min >= getDistance(p.x, p.y, t[i].x, t[i].y)) && (getDistance(p.x, p.y, t[i].x, t[i].y) <= 3)){
                min = getDistance(p.x,p.y,t[i].x,t[i].y);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();    //ArrayList 이용해서 같은 거리일 때 인덱스값 add
        for(int i = 0; i < t.length; i++){
            if(min == getDistance(p.x,p.y,t[i].x,t[i].y)){
                list.add(i);
            }
        }
        int maxValue = t[list.get(0)].value;    //최대밸류값 초기화
        for(int i = 0; i < list.size(); i++) {
            if (maxValue <= t[list.get(i)].value) {
                maxValue = t[list.get(i)].value;
                result = list.get(i);   //밸류가 최대일 때 인덱스값 result에 저장
            }
        }
        bw.write(xyvalue[result]);  //출력
        bw.flush();
    }

    // 보물의 위치 좌표와 가치를 나타내는 클래스
    static class Treasure {
        // 필드 변수 선언. 보물의 좌표 x, y와 보물의 가치 value
        protected int x;
        protected int y;
        protected int value;

        // 생성자 선언
        public Treasure(int x, int y, int value){
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    // 은찬이의 위치를 나타내는 클래스
    static class Position {
        // 필드 변수 선언. 좌표 x, y
        protected int x;
        protected int y;
        // 생성자 선언
        public Position(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static int getDistance(int x1, int y1, int x2, int y2) {
        // 햔재 은찬이의 위치로부터 보물까지의 거리를 반환. 은찬이의 좌표는 (x1, y1), 목표 보물의 좌표는 (x2, y2)
        return (Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }
}