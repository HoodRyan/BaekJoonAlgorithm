import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String K = br.readLine();
            int k = Integer.parseInt(K.substring(K.length()-1));    //문자열 K의 맨 끝자리 구하기
            if(k%2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
