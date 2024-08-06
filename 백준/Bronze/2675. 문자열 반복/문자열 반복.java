import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    //테스트 케이스 개수
    int T=Integer.parseInt(br.readLine());

    //테스트 케이스 처리
    for(int i=0; i<T; i++){
      //반복횟수와 문자열받기
      String[] line=br.readLine().split(" ");
      int R=Integer.parseInt(line[0]);
      String S=line[1];

      //결과를 저장할 객체
      StringBuilder result=new StringBuilder();

      //S를 반복해서 넣기
      for(int j=0; j<S.length(); j++){
        char c=S.charAt(j);

        for(int k=0; k<R; k++){
          result.append(c);
        }
      }
      bw.write(result.toString()+"\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}