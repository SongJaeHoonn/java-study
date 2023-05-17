import java.io.*;
import java.util.StringTokenizer;

public class Week4_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int[] numArr = new int[count];
        StringTokenizer st = new StringTokenizer(num, " ");
        for(int i = 0; i < count; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        int maxNum = numArr[0];
        int minNum = numArr[0];
        for(int i = 1; i < count; i++) {
            if (numArr[i] > maxNum) {
                maxNum = numArr[i];
            }
            if(numArr[i] < minNum){
                minNum = numArr[i];
            }
        }
        bw.write(String.valueOf(minNum) + " " +String.valueOf(maxNum));
        bw.flush();
    }
}
