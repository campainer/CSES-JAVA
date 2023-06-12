import java.io.*;
import java.util.*;
public class Main
{
    static PrintWriter out=new PrintWriter((System.out));
    public static void main(String args[])throws IOException
    {
        Reader sc=new Reader();
        long n=sc.Long();
        while(n!=1){
            out.print(n+" ");
            if(n%2==0)n/=2;
            else {
                n*=3;
                n++;
            }
        }
        out.print("1");
	out.close();
    }
    
    static class Reader 
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        public String next()
        {
            while(!st.hasMoreTokens())
            {
                try
                {
                    st=new StringTokenizer(br.readLine());
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        public int Int()
        {
            return Integer.parseInt(next());
        }
        public long Long()
        {
            return Long.parseLong(next());
        }
        public double Double()
        {
            return Double.parseDouble(next());
        }
        public String Line()
        {
            try
            {
                return br.readLine();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            return null;
        }
    } 
}