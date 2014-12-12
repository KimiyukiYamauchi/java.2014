class Ex3{

	public String ex3_0(int n){

		String msg = "";
		if(n>0){
			msg = "その値は正です";
		}else{
			msg = "その値は０か負です";
		}
		
		return msg;

	}

	public int ex3_1(int n){
		 
		int abs = 0;
		
		if(n < 0){
			abs = -n;
		}else{
			abs = n;
		}
		
		return abs;

	}

	public String ex3_2(int a, int b){
		
		String msg = "";
		
		if(a%b == 0){
			msg = b + "は" + a + "の約数です";
		}else{
			msg = b + "は" + a + "の約数ではありません";
		}
		
		return msg;

	}

	public String ex3_3(int a, int b){
		
		String msg = "";
		
		if(a>b){
			msg = a + "の方が大きいです";
		}else if(a<b){
			msg = b + "の方が大きいです";
		}else{
			msg = "同じ値です";
		}

		return msg;

	}

	public String ex3_4(int a){
		
		String msg = "";
		
		if(a<0){
			msg = "正でない整数値です";
		}else if(a%5 == 0){
			msg = "その値は5で割り切れます";
		}else{
			msg = "その値は5で割り切れません";
		}

		return msg;

	}

	public String ex3_5(int a){
		
		String msg = "";
		
		if(a<0){
			msg = "正でない整数値です";
		}
		else if(a%10 == 0){
			msg = "その値は10の倍数です";
		}else{
			msg = "その値は10の倍数ではありません";
		}
		
		return msg;
	}
	
	public String ex3_6(int a){
		String msg = "";
		
		if(a<0){
			msg = "正でない整数値です";
		}else if(a%3 == 0){
			msg = "その値は3で割り切れます";
		}else if(a%3 == 1){
			msg = "その値を3で割った余りは1です";
		}else{
			msg = "その値を3で割った余りは2です";
		}
		
		return msg;
	}

	public String ex3_7(int a){
		String msg = "";
		
		if(a<0 || a>100){
			msg = "範囲(0～100)外の値です";
		}else if(a<60){
			msg = "不可";
		}else if(a<70){
			msg = "可";
		}else if(a<80){
			msg = "良";
		}else{
			msg = "優";
		}
		
		return msg;
	}

	public double ex3_8(double a, double b){
		double ret = 0.0;
		ret = a>b ? a : b;
		return ret;
	}

	public int ex3_9(int a, int b){
		int ret = 0;
		ret = a>b ? a-b : b-a;
		return ret;
	}

	public String ex3_10(int a, int b){
		String ret;
		int tmp;
		tmp = a>b ? a-b : b-a;
		ret = tmp<11 ? "それらの差は10以下です" : "それらの差は11以上です";
		return ret;
	}

	public int ex3_11(int a, int b, int c){
		int min = a;
		
		if(min>b){
			min = b;
			if(min>c){
				min = c;
			}
			
		}else if( min>c){
			min = c;
		}
		return min;
	}

	public int ex3_12(int a, int b, int c){
		int tmp[] = new int[3];
		tmp[0] = a;
		tmp[1] = b;
		tmp[2] = c;
		int w = 0;
		
		for(int i=0; i<tmp.length-1; i++)
			for(int j=i+1; j<tmp.length; j++)
				if(tmp[i]>tmp[j]){
					w = tmp[i];
					tmp[i] = tmp[j];
					tmp[j] = w;
				}

		return tmp[1];
	}

	public String ex3_13(int a){
		String ret = "";
		if(a==12 || (a>=1 && a<=2)){
			ret = "冬";
		}else if(a>=3 && a<=5){
			ret  = "春";
		}else if(a>=6 && a<=8){
			ret = "夏";
		}else if(a>=9 && a<=11){
			ret = "秋";
		}else{
			ret = "範囲(1～12)外の値です";
		}
		return ret;
	}
}

