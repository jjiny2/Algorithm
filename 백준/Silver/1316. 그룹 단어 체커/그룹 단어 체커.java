import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    //그룹 단어의 개수
    int count=Integer.parseInt(br.readLine());
    int groupWordCount = 0;

    //단어를 입력받기
    for(int i=0; i<count; i++){
      String word=br.readLine();
      if(isGroupWord(word)){
        groupWordCount++;
      }
    }
    bw.write(String.valueOf(groupWordCount));
    bw.flush();
    br.close();
    bw.close();
  }
  public static boolean isGroupWord(String word){
    boolean[] seen=new boolean[26];
    char lastChar='\0';

    for(int i=0; i<word.length(); i++){
      char currentChar=word.charAt(i);

      if(currentChar !=lastChar){
        if(seen[currentChar-'a']){
          return false;
        }
        seen[currentChar-'a']=true;
        lastChar=currentChar;
      }
    }
    return true;
  }
}