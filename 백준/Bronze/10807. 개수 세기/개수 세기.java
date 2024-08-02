import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N=Integer.parseInt(br.readLine());
        String[] numbers=br.readLine().split(" ");
        int target=Integer.parseInt(br.readLine());
        int count=0;
        
        for(int i=0; i<N; i++){
            int num=Integer.parseInt(numbers[i]);
            if(num == target){
              count++;
            }
            
        }
        bw.write(count+"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}