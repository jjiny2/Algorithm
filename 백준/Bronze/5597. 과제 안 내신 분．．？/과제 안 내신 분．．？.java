import java.io.*;
import java.util.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

    //제출 학생 번호 저장할 Set
    Set<Integer> submittedStudents=new HashSet<>();

    //Set에 추가
    for(int i=0; i<28; i++){
      int studentNumber=Integer.parseInt(br.readLine());
      submittedStudents.add(studentNumber);
    }

    //제출하지 않은 학생 번호 찾기
    for(int i=1; i<=30; i++){
      if(!submittedStudents.contains(i)){ //있으면 true 없으면 false 반환
        bw.write(i+ " ");
      }
    }
    bw.flush();
    br.close();
    bw.close();
  }
}