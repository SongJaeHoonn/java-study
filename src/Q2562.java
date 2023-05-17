import java.io.*;
import java.util.StringTokenizer;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] num = new int[9];
        for(int i = 0; i < 9; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        int max = num[0];
        int i = 0;
        int indexNum = 0;
        for(i = 0; i < 9; i++){
            if(max < num[i]) {
                max = num[i];
                indexNum = i;
            }
        }

        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(indexNum + 1));
        bw.flush();
    }
}
