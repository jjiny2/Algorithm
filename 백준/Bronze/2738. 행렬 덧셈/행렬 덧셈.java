import java.io.*;
public class Main{
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

    //첫째 줄에 행렬의 크기 N과 M을 준다.
    String[] firstLine=br.readLine().split(" ");
    int N=Integer.parseInt(firstLine[0]);
    int M=Integer.parseInt(firstLine[1]);

    //A와 B를 저장할 배열 선언
    int[][] A=new int[N][M];
    int[][] B=new int[N][M];

    //행렬 A 
    for(int i=0; i<N; i++){
      String []line=br.readLine().split(" ");
      for(int j=0; j<M; j++){
        A[i][j] =Integer.parseInt(line[j]);
      }
    }

    //행렬B
    for(int i=0; i<N; i++){
      String[] line=br.readLine().split(" ");
      for(int j=0; j<M; j++){
        B[i][j]=Integer.parseInt(line[j]);
      }
    }

    //두 행렬 A와 B를 더한 결과 
    for(int i=0; i<N; i++){
      for(int j=0; j<M; j++){
        int sum=A[i][j]+B[i][j];
        bw.write(sum+" ");
      }
      bw.newLine();
    }
    bw.flush();
    br.close();
    bw.close();
  }
}