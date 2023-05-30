import java.io.*;


public class Q10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        String wordArr = "";
        String word = br.readLine();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != word.charAt(word.length() - i - 1)){
                answer = 0;
                break;
            }else{
                answer = 1;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
