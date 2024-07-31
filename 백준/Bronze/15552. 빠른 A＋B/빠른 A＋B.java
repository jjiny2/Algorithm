import java.io.*;

public class Main{
	public static void main(String[] args){
        BufferedReader br=null;
		BufferedWriter bw=null;
        try{
            br=new BufferedReader(new InputStreamReader(System.in));
		    bw=new BufferedWriter(new OutputStreamWriter(System.out));
            
            int T=Integer.parseInt(br.readLine());
            
            for(int i=0; i<T; i++){
			    String[] line=br.readLine().split(" ");
			    int a=Integer.parseInt(line[0]);
			    int b=Integer.parseInt(line[1]);
			    bw.write((a+b)+"\n");
		    }
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(br!=null)br.close();
                if(bw!=null)bw.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
		
	}
}