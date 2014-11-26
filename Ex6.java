class Ex6{

	public int [] ex6_1(){
		
		int [] ret = {5, 4, 3, 2, 1};
		
		return ret;
	}

	public double [] ex6_2(){
		
		double [] ret = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		return ret;
	}

	public int [] ex6_3(int a, int b){
		
		int [] ret = new int[a];

		for(int i=0; i<ret.length; i++){
			ret[i] = b;
		}
		
		return ret;
	}

	public int [] ex6_4(int [] a){
		
		int [] ret = new int[4];
		double tmp = 0.0;
		
		ret[2] = a[0];
		ret[3] = a[0];
		for(int i : a){
			tmp += i;
			if(ret[2]<i){
				ret[2] = i;
			}
			if(ret[3]>i){
				ret[3] = i;
			}
		}
		
		ret[0] = (int)tmp;
		ret[1] = (int)Math.round(tmp/a.length);
		
		return ret;
	}
}