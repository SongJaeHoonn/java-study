import java.io.*;
public class Week6_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        int[] numArr = new int[26];
        int max = 0;
        char result = 0;
        for(int i = 0 ; i < str.length(); i++){
            int num = str.charAt(i) - 'A';
            numArr[num]++;
        }
        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] > max){
                max = numArr[i];
                result = (char)(i + 'A');
            }else if(max == numArr[i]){
                result = '?';
            }
        }
        bw.write(result);
        bw.flush();
    }
 }

