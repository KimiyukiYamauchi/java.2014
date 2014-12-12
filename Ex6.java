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

	public int ex6_5(int [] a, int key){
		
		int ret = -1;
		
		for(int i=0; i<a.length; i++){
			if(a[i] == key){
				ret = i;
				break;
			}
		}
		
		return ret;
	}

	public int ex6_6(int [] a, int key){
		
		int ret = -1;
		
		for(int i=a.length-1; i>0; i--){
			if(a[i] == key){
				ret = i;
				break;
			}
		}
		
		return ret;
	}

	public void ex6_7(int [] a, int idx){
		
		for(int i=idx; i<a.length-1; i++){
			a[i] = a[i+1];
		}
		
		return;
	}

	public void ex6_8(int [] a, int idx, int n){
		
		for(int i=idx; i<a.length && i+n<a.length; i++){
			a[i] = a[i+n];
		}
		
		return;
	}

	public void ex6_9(int [] a, int idx, int x){
		
		// 挿入位置以降の要素を後ろに１つずつずらす
		for(int i = a.length-2; i>=idx; i--){
			a[i+1] = a[i];
		}
		
		a[idx] = x; // idx位置に値を代入
		
		return;
	}

	public void ex6_10(int [] a, int [] b){
		
		int len = a.length <= b.length ? a.length : b.length;
		
		for(int i=0, tmp=0; i<len; i++){
			tmp = a[i];
			a[i] = b[i];
			b[i] = tmp;
		}
		
		return;
	}

	public int [] ex6_11(int [] a){
		
		int [] ret = new int[a.length];
		
		for(int i=0; i<a.length; i++){
			ret[i] = a[i];
		}

		return ret;
	}

	public int [] ex6_12(int [] a, int x){
		
		int count = 0;
		
		for(int i : a){
			if(i == x){
				count++;
			}
		}
		
		int [] ret = new int[count];

		for(int i=0, j=0; i<a.length; i++){
			if(a[i] == x){
				ret[j] = i;
				j++;
			}
		}

		return ret;
	}

	public int [] ex6_13(int [] a, int idx){
		
		int [] ret;
		
		if(a.length>0 && idx >= 0 && idx<a.length){
			ret = new int[a.length-1];
			for(int i=0, j=0; i<a.length; i++){
				if(i != idx){
					ret[j] = a[i];
					j++;
				}
			}
		}else{
			ret = new int[a.length];
			for(int i=0; i<a.length; i++){
				ret[i] = a[i];
			}
		}

		return ret;
	}
	
	public int [] ex6_14(int [] a, int idx, int n){
		
		if(idx < 0 || idx >= a.length || n < 0){
			idx = 0;
			n = 0;
		}
		
		if(a.length < idx + n){
			n = a.length - idx;
		}

		int [] ret = new int[a.length-n];
		
		for(int i=0, j=0; i<a.length && j<ret.length; i++, j++){
			if(i == idx){
				i = i+n;
			}
			ret[j] = a[i];
		}
		
		return ret;
	}
	
	public int [] ex6_15(int [] a, int idx, int x){
		
		if(idx >= a.length){
			idx = a.length;
		}else if(idx < 0){
			idx = 0;
		}
		
		int [] ret = new int[a.length+1];
		
		for(int i=0, j=0; i<ret.length; i++, j++){
			if(i == idx){
				ret[i] = x;
				j--;
			}else{
                ret[i] = a[j];
			}
		}
		
		return ret;
	}
}