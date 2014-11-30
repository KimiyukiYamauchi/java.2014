import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Ex6Test {

	@Test
	public void ex6_1_1(){
		Ex6 ex6 = new Ex6();
		int [] expected = {5, 4, 3, 2, 1};
		int [] actual = ex6.ex6_1();
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_2_1(){
		Ex6 ex6 = new Ex6();
		double [] expected = {1.1, 2.2, 3.3, 4.4, 5.5};
		double [] actual = ex6.ex6_2();
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_1(){
		Ex6 ex6 = new Ex6();
		int [] expected = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int [] actual = ex6.ex6_3(10, 0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_2(){
		Ex6 ex6 = new Ex6();
		int [] expected = {1000};
		int [] actual = ex6.ex6_3(1, 1000);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_3(){
		Ex6 ex6 = new Ex6();
		int [] expected = {1, 1, 1};
		int [] actual = ex6.ex6_3(3, 1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_4(){
		Ex6 ex6 = new Ex6();
		int [] expected = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		int [] actual = ex6.ex6_3(10, -1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_3_5(){
		Ex6 ex6 = new Ex6();
		int [] expected = {2, 2};
		int [] actual = ex6.ex6_3(2, 2);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_4_1(){
		Ex6 ex6 = new Ex6();
		int [] expected = {55, 6, 10, 1};
		int [] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] actual = ex6.ex6_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_4_2(){
		Ex6 ex6 = new Ex6();
		int [] expected = {-55, -5, -1, -10};
		int [] test = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int [] actual = ex6.ex6_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_4_3(){
		Ex6 ex6 = new Ex6();
		int [] expected = {-23, -2, 10, -11};
		int [] test = {-10, 1, -1, 10, -5, 3, 1, 2, -8, -5, -11};
		int [] actual = ex6.ex6_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_4_4(){
		Ex6 ex6 = new Ex6();
		int [] expected = {455, 46, 91, 1};
		int [] test = {50, 70, 45, 22, 91, 82, 77, 14, 3, 1};
		int [] actual = ex6.ex6_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_4_5(){
		Ex6 ex6 = new Ex6();
		int [] expected = {-455, -45, -1, -91};
		int [] test = {-50, -70, -45, -22, -91, -82, -77, -14, -3, -1};
		int [] actual = ex6.ex6_4(test);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_5_1(){
		Ex6 ex6 = new Ex6();
		int expected = 4;
		int [] test = {1, 2, 3, 4, 5, 5, 7, 8, 5, 5};
		int actual = ex6.ex6_5(test,5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_5_2(){
		Ex6 ex6 = new Ex6();
		int expected = 4;
		int [] test = {-1, -2, -3, -4, -5, -5, -7, -8, -5, -5};
		int actual = ex6.ex6_5(test,-5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_5_3(){
		Ex6 ex6 = new Ex6();
		int expected = 4;
		int [] test = {1, 2, 3, 4, -1, -2, -3, -3, -3, -1};
		int actual = ex6.ex6_5(test,-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_5_4(){
		Ex6 ex6 = new Ex6();
		int expected = -1;
		int [] test = {1, 2, 3, 4, 1, 2, 3, 3, 3, 1};
		int actual = ex6.ex6_5(test,5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_5_5(){
		Ex6 ex6 = new Ex6();
		int expected = 0;
		int [] test = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int actual = ex6.ex6_5(test,0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_6_1(){
		Ex6 ex6 = new Ex6();
		int expected = 9;
		int [] test = {1, 2, 3, 4, 5, 5, 7, 8, 5, 5};
		int actual = ex6.ex6_6(test,5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_6_2(){
		Ex6 ex6 = new Ex6();
		int expected = 9;
		int [] test = {-1, -2, -3, -4, -5, -5, -7, -8, -5, -5};
		int actual = ex6.ex6_6(test,-5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_6_3(){
		Ex6 ex6 = new Ex6();
		int expected = 9;
		int [] test = {1, 2, 3, 4, -1, -2, -3, -3, -3, -1};
		int actual = ex6.ex6_6(test,-1);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_6_4(){
		Ex6 ex6 = new Ex6();
		int expected = -1;
		int [] test = {1, 2, 3, 4, 1, 2, 3, 3, 3, 1};
		int actual = ex6.ex6_6(test,5);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_6_5(){
		Ex6 ex6 = new Ex6();
		int expected = 9;
		int [] test = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int actual = ex6.ex6_6(test,0);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex6_7_1(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 2;
		int [] expected = {1, 3, 7, 9, 11, 11};
		ex6.ex6_7(a, idx);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_7_2(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 0;
		int [] expected = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10};
		ex6.ex6_7(a, idx);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_7_3(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 9;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ex6.ex6_7(a, idx);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_7_4(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 1;
		int [] expected = {1, 3, 4, 5, 6, 7, 8, 9, 10, 10};
		ex6.ex6_7(a, idx);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_7_5(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 8;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 10, 10};
		ex6.ex6_7(a, idx);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_8_1(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 1;
		int n = 3;
		int [] expected = {1, 9, 11, 7, 9, 11};
		ex6.ex6_8(a, idx, n);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_8_2(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 2;
		int n = 5;
		int [] expected = {1, 2, 8, 9, 10, 6, 7, 8, 9, 10};
		ex6.ex6_8(a, idx, n);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_8_3(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 0;
		int n = 9;
		int [] expected = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ex6.ex6_8(a, idx, n);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_8_4(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 9;
		int n = 9;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ex6.ex6_8(a, idx, n);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_8_5(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 0;
		int n = 0;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ex6.ex6_8(a, idx, n);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_9_1(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 3, 4, 7, 9, 11};
		int idx = 2;
		int x = 99;
		int [] expected = {1, 3, 99, 4, 7, 9};
		ex6.ex6_9(a, idx, x);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_9_2(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 2;
		int x = 5;
		int [] expected = {1, 2, 5, 3, 4, 5, 6, 7, 8, 9};
		ex6.ex6_9(a, idx, x);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_9_3(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 0;
		int x = 0;
		int [] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		ex6.ex6_9(a, idx, x);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_9_4(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 9;
		int x = 9;
		int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
		ex6.ex6_9(a, idx, x);
		assertThat(a, is(expected));
	}
	@Test
	public void ex6_9_5(){
		Ex6 ex6 = new Ex6();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int idx = 5;
		int x = 100;
		int [] expected = {1, 2, 3, 4, 5, 100, 6, 7, 8, 9};
		ex6.ex6_9(a, idx, x);
		assertThat(a, is(expected));
	}

	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(Ex6Test.class.getName());
	}
}
