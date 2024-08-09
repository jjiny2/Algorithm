import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
    //문장 받기
    String sentence=br.readLine();
    //문장 안 알파벳 대문자로 통일하기
    sentence= sentence.toUpperCase();
    //알파벳 빈도를 저장할 배열
    int[] frequency= new int[26];

    for(int i=0; i<sentence.length(); i++){
      //알파벳 하나씩 받기
      char alpanet = sentence.charAt(i);
      if(alpanet >='A' && alpanet <='Z'){
        frequency[alpanet-'A']++; //해당 index에 알파벳 빈도수를 저장할 수 있게 하기
      }
    }

    //가장 많이 등장한 알파벳 찾기
    int max=-1;
    char most ='?';
    boolean isDuplicated=false;

    for(int i=0; i<26; i++){
      if(frequency[i]>max){
        max=frequency[i];
        most=(char)(i+'A');
        isDuplicated=false;
      }else if(frequency[i] == max){
        isDuplicated=true;
      }
    }

    if(isDuplicated){
      bw.write("?");
    }else {
      bw.write(most);
    }

    bw.flush();
    br.close();
    bw.close();
  }
}