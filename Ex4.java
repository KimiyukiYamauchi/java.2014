import java.util.ArrayList;
import java.util.List;

class Ex4{

	public int [] ex4_1(int [] a){
		
		int tmp;
		
		// 基本交換ソート（バブルソート） - 昇順
		for(int i=0; i<a.length-1; i++)
			for(int j=i+1; j<a.length; j++)
				if(a[i]>a[j]){
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
		
		return a;

	}

	public int [] ex4_2(int [] a){
		
		int tmp;
		
		// 単純挿入ソート - 降順
		for(int i=0; i<a.length; i++)	
			for(int j=i+1; j<a.length; j++)
				// 左より右が大きかったら挿入の操作
				if(a[i]<a[j]){
					tmp = a[j];
					for(int k=j; k>i; k--)
						a[k] = a[k-1];
					a[i] = tmp;
				}
		
		return a;

	}

	public String [] ex4_3(int [] a){
		
		String [] hantei = new String[a.length];
		
		for(int i=0; i<a.length; i++){
			hantei[i] = a[i]>0? "正" : a[i]<0? "負" : "零";
		}
		
		return hantei;

	}

	public int ex4_4(int a){
		
		int ret = 0;

		while(a > 0){
			ret++;
			a /= 10;
		}
		
		return ret;

	}

	public int ex4_5(int a){
		
		int ret = 0;
		
		for(int i=1; i<=a; i++)
			ret += i;
		
		return ret;

	}

	public int [] ex4_6(int a){
		
		int [] ret;
		
		List<Integer> tmp = new ArrayList<Integer>();
		
		for(int i=1; i<=a; i++){
			if(a%i == 0){
				tmp.add(i);
			}
		}
		
		int kosu = tmp.size();
		
		ret = new int[kosu];
		
		for(int i=0; i<kosu; i++){
			ret[i] = tmp.get(i);
		}
		
		return ret;

	}

	public boolean ex4_7(int a){
		
		boolean ret = true;
		
		for(int i=2; i<a; i++){
			if(a%i == 0){
				ret = false;
				break;
			}
		}
		
		if(a == 1){
			ret = false;
		}
		
		return ret;

	}

	public int ex4_8(int [] a){
		
		int ret = 0;
		
		for(int i : a){
			ret += i;
		}
		
		return ret;

	}

	public int ex4_9(int [] a){
		
		double ret = 0;
		
		for(int i : a){
			ret += i;
		}
		
		ret = ret / a.length;
		ret = Math.round(ret);
		return (int)ret;

	}
}

