import static org.junit.Assert.*;

import org.junit.Test;

public class ClnUtilsTest {

//  ユリウス通日（ユリウスつうじつ、Julian Day、JD）とは、ユリウス暦[注 1]紀元前4713年1月1日、すなわち西暦 -4712年1月1日の正午（世界時）からの日数である[1]。単にユリウス日（ユリウスび）ともいう。時刻値を示すために一般には小数が付けられる。
//	例えば、協定世界時（UTC）での2017年10月30日02:37 のユリウス日の値は、おおむね2458056.61である。(WikiPedia)
	@Test
	public void julianDayTest() {
		int year = 2017;
		int month = 10;
		int day = 30;
		double w = ClnUtils.julianDay(year, month, day);
		assertEquals(2458056, w, 1);
	}
	@Test
	public void weekDayTest() {
		int year = 2017;
		int month = 11;
		int day = 5;
		double w = ClnUtils.julianDay(year, month, day);
		int wk = ClnUtils.zeller(year, month, day);
		assertEquals(((int)w+2)%7, wk);
	}

}
