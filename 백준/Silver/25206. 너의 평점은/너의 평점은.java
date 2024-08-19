import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    //학점과 과목평점 맵핑
    Map<String, Double> gradeMap = new HashMap<>();
    gradeMap.put( "A+",4.5);
    gradeMap.put( "A0",4.0);
    gradeMap.put( "B+",3.5);
    gradeMap.put( "B0",3.0);
    gradeMap.put( "C+",2.5);
    gradeMap.put( "C0",2.0);
    gradeMap.put( "D+",1.5);
    gradeMap.put( "D0",1.0);
    gradeMap.put( "F",0.0);

    double totalScore=0.0;
    double totalCredite=0.0;

    String line;
    while((line =br.readLine()) != null && !line.isEmpty()){
      String[] parts=line.split(" ");
      String grade =parts[2];
      double credit=Double.parseDouble(parts[1]);

      //p는 제외
      if(grade.equals("P")){
        continue;
      }

      //학점, 과목평점을 곱한값을 총합에 추가
      totalScore +=credit*gradeMap.get(grade);
      totalCredite +=credit;
    }

    double majorGPA=totalScore/totalCredite;
    
    System.out.printf("%.6f",majorGPA);    
  }
}