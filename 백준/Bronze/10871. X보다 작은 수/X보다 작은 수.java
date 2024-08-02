import java.io.*;
public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstLine=br.readLine().split(" ");
    int num=Integer.parseInt(firstLine[0]);
    int x=Integer.parseInt(firstLine[1]);

    String[] numbers=br.readLine().split(" ");
    StringBuilder answer=new StringBuilder();
    
    for(int i=0; i<num; i++){
      int currentNumber=Integer.parseInt(numbers[i]);
      if(currentNumber<x){
        answer.append(currentNumber+" ");
      }
    }
    bw.write(answer.toString()+"\n");
    bw.flush();
    br.close();
    bw.close();

  }
}