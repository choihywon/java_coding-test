package backjoon_1181;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class backjoon_1181 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sb.readLine());
		String list[] = new String[n];
		
		for(int i =0; i<n;i++)
		{
			list[i] = sb.readLine();
		}
		
		for(int i =0; i<n; i++)
		{
			for(int j = i+1; j <n; j++)
			{
				if(list[i].length() > list[j].length())
				{
					String temp;
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;	
				}
				else if(list[i].length() == list[j].length())
				{
					if(list[i].compareTo(list[j]) > 0)
					{
						String temp;
						temp = list[j];
						list[j] = list[i];
						list[i] = temp;
					}
					
				}	
			}
		}
		
		for(int i=0; i<n; i++) 
		{
			if(i!=0) {
				if(list[i].compareTo(list[i-1])!=0)
					System.out.println(list[i]);
			}
			else
				System.out.println(list[i]);
		}
		
	}

}
