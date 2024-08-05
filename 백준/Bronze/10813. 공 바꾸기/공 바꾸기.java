import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

    String[] firstLine=br.readLine().split(" ");
    int N=Integer.parseInt(firstLine[0]);
    int M=Integer.parseInt(firstLine[1]);

    int[] baskets=new int[N]; // 바구니 배열
    for(int i=0; i<N; i++){
      baskets[i]=i+1;
    }

    //M개 공 교환
    for(int j=0; j<M; j++){
      String []line=br.readLine().split(" ");
      int current =Integer.parseInt(line[0])-1;
      int future = Integer.parseInt(line[1])-1;

      int temp =baskets[current];
      baskets[current] = baskets[future];
      baskets[future] =temp;
    }
    
    for(int k=0;k<N; k++){
      bw.write(baskets[k]+" ");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}