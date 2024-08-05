import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    //set 설정, 중복 방지
    Set<Integer> last=new HashSet<Integer>();

    //set에 추가
    for(int i=0; i<10; i++){
      int number=Integer.parseInt(br.readLine());
      number=number%42;
      last.add(number);
    }

    bw.write(last.size()+"\n");
    bw.flush();
    br.close();
    bw.close();
  }
}