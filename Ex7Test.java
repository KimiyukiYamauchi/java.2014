import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Ex7Test {

	@Test
	public void ex7_1_1(){
		Ex7 ex7 = new Ex7();
		int a = 8;
		int b = -9;
		int expected = -9;
		int actual = ex7.ex7_1(a, b);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_2(){
		Ex7 ex7 = new Ex7();
		int a = -11;
		int b = 9;
		int expected = -11;
		int actual = ex7.ex7_1(a, b);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_3(){
		Ex7 ex7 = new Ex7();
		int a = 3;
		int b = 3;
		int expected = 3;
		int actual = ex7.ex7_1(a, b);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_4(){
		Ex7 ex7 = new Ex7();
		int a = 0;
		int b = 0;
		int expected = 0;
		int actual = ex7.ex7_1(a, b);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_5(){
		Ex7 ex7 = new Ex7();
		int a = -1;
		int b = -1;
		int expected = -1;
		int actual = ex7.ex7_1(a, b);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_6(){
		Ex7 ex7 = new Ex7();
		int a = 1;
		int b = 0;
		int c = -1;
		int expected = -1;
		int actual = ex7.ex7_1(a, b, c);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_7(){
		Ex7 ex7 = new Ex7();
		int a = -1;
		int b = -2;
		int c = -3;
		int expected = -3;
		int actual = ex7.ex7_1(a, b, c);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_8(){
		Ex7 ex7 = new Ex7();
		int a = 0;
		int b = 0;
		int c = 1;
		int expected = 0;
		int actual = ex7.ex7_1(a, b, c);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_9(){
		Ex7 ex7 = new Ex7();
		int a = -1;
		int b = -1;
		int c = 0;
		int expected = -1;
		int actual = ex7.ex7_1(a, b, c);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_10(){
		Ex7 ex7 = new Ex7();
		int a = 10000;
		int b = 10000;
		int c = 10001;
		int expected = 10000;
		int actual = ex7.ex7_1(a, b, c);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_11(){
		Ex7 ex7 = new Ex7();
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int expected = 1;
		int actual = ex7.ex7_1(a);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_12(){
		Ex7 ex7 = new Ex7();
		int [] a = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
		int expected = -10;
		int actual = ex7.ex7_1(a);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_13(){
		Ex7 ex7 = new Ex7();
		int [] a = {-10, 1, -1, 10, -5, 3, 1, 2, -8, -5, -11};
		int expected = -11;
		int actual = ex7.ex7_1(a);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_14(){
		Ex7 ex7 = new Ex7();
		int [] a = {50, 70, 45, 22, 91, 82, 77, 14, 3, 1};
		int expected = 1;
		int actual = ex7.ex7_1(a);
		assertThat(actual, is(expected));
	}
	@Test
	public void ex7_1_15(){
		Ex7 ex7 = new Ex7();
		int [] a = {-50, -70, -45, -22, -91, -82, -77, -14, -3, -1};
		int expected = -91;
		int actual = ex7.ex7_1(a);
		assertThat(actual, is(expected));
	}


	// エントリーポイント
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main(Ex7Test.class.getName());
	}
}
