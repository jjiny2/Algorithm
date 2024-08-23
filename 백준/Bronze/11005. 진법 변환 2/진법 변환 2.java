import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    //첫째줄에서 N과 B받기
    String[] firstLine=br.readLine().split(" ");
    int N=Integer.parseInt(firstLine[0]); //10진법 수
    int B=Integer.parseInt(firstLine[1]); //변환할 진법

    StringBuilder result = new StringBuilder();
    
    //N을 B진법으로 변환
    while(N>0){
      int remainder = N%B;
      if(remainder <10){
        result.append(remainder);
      }else{
        result.append((char)(remainder - 10 +'A')); //10이상은 a,b,c...
      }
      N /= B;
    }
    bw.write(result.reverse().toString()+"\n");
    bw.flush();
    br.close();
    bw.close();
  }
}