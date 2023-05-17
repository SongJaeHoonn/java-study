import java.io.*;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        StringTokenizer kt = new StringTokenizer(n, " ");
        int x = Integer.parseInt(kt.nextToken());
        int y = Integer.parseInt(kt.nextToken());
        int result;
        String num = br.readLine();
        int[] numArr = new int[x];
        StringTokenizer st = new StringTokenizer(num, " ");
        for(int i = 0; i < x; i++){
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < x; i++){
            if(numArr[i] <= y){
                result = numArr[i];
//                System.out.print(result + " ");
                bw.write(result + " ");

            }
        }
        bw.flush();
    }
}
