package com.ch5;

//각 항목별로 클래스를 나눈다.
//각 항복별로 배열을 각각 잡는다.
		
public class SukChaDap {
	public String[][] initData() {//파라미터에 선언된 변수는 지역변수이고, 배열이므로 원본의 주소번지를 갖는다.
		//배열을 리턴값으로 지정한다.
		System.out.println("initData 호출 성공");
		String[][] datas = {
							 {"1","이순신","70","80","90"}
							,{"2","김유신","55","72","89"}
							,{"3","권율","66","88","99"}
							};
		return datas;
	}
	public int[] Hap(String[][] datas) {
		System.out.println("Hap 호출 성공");
		int[] haps = new int[3];
			for(int i=0;i<datas.length;i++) {//datas[i].length - 컬럼수
				haps[i] = Integer.parseInt(datas[i][2]) + Integer.parseInt(datas[i][3]) +Integer.parseInt(datas[i][4]);
			}
		return haps;
	}
	public double[] Avg(int[] haps) {
		System.out.println("Avg 호출 성공");
		double[] Avg = new double[3];
		for(int i=0;i<haps.length;i++) {
			Avg[i] = haps[i]/3.0;
		}
		return Avg;
	}
	public int[] ranking(double[] Avg, int[] haps) {
		System.out.println("ranking 호출 성공");
		int[] ranks = new int[3];
		for(int i=0;i<Avg.length;i++) {
			for(int j=0;j<Avg.length;j++) {
				if(haps[i] < haps[j]) {
					ranks[i]++;
				}
			}
		}
		return ranks;
	}
	public void sugJuckAccount(String[][] datas) {
		System.out.println("sugJuckAccount 호출 성공");
		for(int i=0;i<datas.length;i++) {
			//for(int j=0;j<datas[i].length;j++) {
				System.out.printf("%3s %8s %5s %5s %5s %n", datas[i][0],datas[i][1],datas[i][2],datas[i][3],datas[i][4]);
			//}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SukChaDap sjApp = new SukChaDap();
		String[][] datas = new String[3][5]; //datas는 주소번지이다. - new - 주소번지 - 부르면 - 주소번지
		datas = sjApp.initData();//데이터 초기화-데이터수집-정보를 갖고 있다.
		int[] haps = sjApp.Hap(datas);//호출할땐 변수이름만,메소드 선언할 땐 타입도 같이 /리턴값 호출
		for(int i=0;i<haps.length;i++) {
			System.out.println(haps[i]);
			}
		double[] Avg = sjApp.Avg(haps);
		for(int i=0;i<Avg.length;i++) {
			System.out.println(Avg[i]);
			}
		int[] ranks = sjApp.ranking(Avg,haps);
		for(int i=0;i<Avg.length;i++) {
			for(int j=0;j<haps.length;j++) {
			}
			System.out.println(ranks[i]);
			}
		sjApp.sugJuckAccount(datas);
	}
}
