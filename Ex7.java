class Ex7{

	public int ex7_1(int a, int b){
		
		int [] tmp = {a, b};
		
		return ex7_1(tmp);
	}

	public int ex7_1(int a, int b, int c){
		
		int [] tmp = {a, b, c};
		
		return ex7_1(tmp);
	}

	public int ex7_1(int [] a){
		
		int min = a[0];
		
		for(int i=1; i<a.length; i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		
		return min;
	}

	public int ex7_2(int x){
		
		double ret = x;
		
		return (int)ex7_2(ret);
	}

	public long ex7_2(long x){
		
		double ret = x;
		
		return (long)ex7_2(ret);
	}

	public float ex7_2(float x){

		double ret = x;
		
		return (float)ex7_2(ret);
	}

	public double ex7_2(double x){
		
		double ret = x;
		
		if(x<0){
			ret = -ret;
		}
		
		return ret;
	}

	public String ex7_3(byte x){
		
		String ret = "";
		
		for(int i = 7; i>=0; i--){
			ret += ((x >>> i & 1) == 1) ? '1' : '0';
		}
		
		return ret;
	}

	public String ex7_3(short x){
		
		String ret = "";
		
		for(int i = 15; i>=0; i--){
			ret += ((x >>> i & 1) == 1) ? '1' : '0';
		}
		
		return ret;
	}

	public String ex7_3(int x){
		
		String ret = "";
		
		for(int i = 31; i>=0; i--){
			ret += ((x >>> i & 1) == 1) ? '1' : '0';
		}
		
		return ret;
	}

	public String ex7_3(long x){
		
		String ret = "";
		
		for(int i = 63; i>=0; i--){
			ret += ((x >>> i & 1) == 1) ? '1' : '0';
		}
		
		return ret;
	}
}