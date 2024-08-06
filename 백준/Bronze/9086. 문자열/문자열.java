import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

    //케이스 개수
    int count=Integer.parseInt(br.readLine());

    for(int i=0; i<count; i++){
      //문자열받기
      String line=br.readLine();

      //첫글자, 마지막글자 추출하기
      char start=line.charAt(0);
      char end=line.charAt(line.length() - 1);

      bw.write(start+""+end+"\n");

    }
    bw.flush();
    br.close();
    bw.close();
  }
}