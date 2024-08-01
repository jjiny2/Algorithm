import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String line;
        
        while((line=br.readLine())!=null){
            st=new StringTokenizer(line," ");
            
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            
            bw.write((A+B)+"\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}