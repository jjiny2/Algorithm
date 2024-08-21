import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    //5줄을 미리 저장할 배열
    String[] words=new String[5];
    //5줄이 나오니까 한줄씩 불러오기
    for(int i=0; i<5; i++){
      words[i]=br.readLine();
    }
    //최대 단어 길이는 15로 제한
    StringBuilder result=new StringBuilder();
    for(int i=0; i<15; i++){
      for(int j=0; j<5; j++){
        if(words[j] !=null && words[j].length()>i){
          result.append(words[j].charAt(i));
        }
      }
    }
    System.out.println(result.toString());
  }
}