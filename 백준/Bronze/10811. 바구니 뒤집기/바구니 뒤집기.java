import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstLine=br.readLine().split(" ");
    int N=Integer.parseInt(firstLine[0]);//바구니 개수
    int M=Integer.parseInt(firstLine[1]);//바구니 역순 바꿀 횟수

    //바구니 초기 설정
    int[] baskets=new int[N];
    for(int i=0; i<N; i++){
      baskets[i]=i+1;
    }

    //바구니 역순 변환
    for(int j=0; j<M; j++){
      String []range=br.readLine().split(" ");
      int start=Integer.parseInt(range[0])-1;
      int end=Integer.parseInt(range[1])-1;

      //부분 배열을 역순으로 바꾸기 
      while(start<end){
        int temp=baskets[start];
        baskets[start] = baskets[end];
        baskets[end] = temp; 
        start++;
        end--;

      }
    }

    for(int i=0; i<N; i++){
      bw.write(baskets[i]+" ");
    }
    bw.newLine();
    bw.flush();
    br.close();
    bw.close();


  }
}