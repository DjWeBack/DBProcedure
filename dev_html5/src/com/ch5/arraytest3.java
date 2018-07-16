package com.ch5;

public class arraytest3 {
	public int array2nd() {
		int i=0;
		int x=0;
		int q=0;
		int sum[]= new int[5];
		int rank[] = new int[5];
		double avgs[] = new double[5];
		String sc[][] = {
				{"학번","JAVA","ORACLE","HTML","총점","평균","석차"},
				{"1","70","90","85","","",""},
				{"2","85","75","80","","",""},
				{"3","90","95","85","","",""},
				{"4","80","75","74","","",""},
				{"5","75","90","99","","",""},

		};
		//String배열에서 int변환.
		for(x=1;x<sc.length;x++) {

			int ja = Integer.parseInt(sc[x][1]);
			int or = Integer.parseInt(sc[x][2]);
			int ht = Integer.parseInt(sc[x][3]);
			sum[q]=ja+or+ht;
			avgs[q]= sum[q]/3;
			q++;
				}
//		for(q=1;q<sc.length;q++) {
//			sc[q][4] = String.valueOf(sum[q]);
//		}
		
		System.out.println(sc[0][0]+" "+sc[0][1]+" "+sc[0][2]+" "+sc[0][3]+" "+sc[0][4]+" "+" "+" "+" "+sc[0][5]+" "+" "+" "+" "+" "+" "+sc[0][6]);
		for(i=1;i<sc.length;i++) {
			
			sc[i][4] = String.valueOf(sum[i-1]);
			sc[i][5] = String.valueOf(avgs[i-1]);
			
		}//합계
		
		for(int s=0;s<sum.length;s++) {
			for(int t=0;t<sum.length;t++)
			{
				if(sum[s] <= sum[t])
				{
					
					rank[s]++;
					
				}
				sc[s+1][6] = String.valueOf((rank[s]));
			}
		}//총점 로직
		
		for(i=1;i<sc.length;i++) {
			System.out.println(" "+sc[i][0]+" "+" "+" "+sc[i][1]+" "+" "+" "+sc[i][2]+" "+" "+" "+" "+sc[i][3]+" "+" "+sc[i][4]+" "+" "+" "+sc[i][5]+" "+" "+" "+sc[i][6]);
		}
		
		return 0;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraytest3 ayt = new arraytest3();

		ayt.array2nd();

	}

}
