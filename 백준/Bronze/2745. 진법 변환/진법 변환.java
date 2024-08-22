import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    //N과 B 받기
    String[] firstLine=br.readLine().split(" ");
    String N=firstLine[0];
    int B=Integer.parseInt(firstLine[1]);

    //결과계산
    int result =0;
    int length = N.length();

    for(int i =0; i<length; i++){
      char c=N.charAt(i);
      int value;
      //숫자
      if('0'<=c && c<='9'){
        value = c-'0';
      }else{
        //알파벳
        value = c-'A'+10; //A가 10부터 시작해서 +10
      }
      //10진수 변환
      result = result*B +value;
    }
    System.out.println(result);
  }
}