import java.io.*;

public class Week5_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[] num = new int[t];
        for(int i = 0; i < t; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        int q = 25, qNum = 0;
        int d = 10, dNum = 0;
        int n = 5, nNum = 0;
        int p = 1, pNum = 0;
        for(int i = 0; i < t; i++){
            qNum = num[i] / q;
            dNum = (num[i] - (q * qNum)) / d;
            nNum = (num[i] - (q * qNum) - (d * dNum)) / n;
            pNum = (num[i] - (q * qNum) - (d * dNum) - (n * nNum)) / p;
            bw.write(String.valueOf(qNum) + " " + String.valueOf(dNum) + " " + String.valueOf(nNum) + " " + String.valueOf(pNum));
            bw.write("\n");
        }
        bw.flush();
    }
}
