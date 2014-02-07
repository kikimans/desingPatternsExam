package com.kikimans.designPatternsExam.chapter1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.kikimans.designPatternsExam.chapter1_baseball.Curve;
import com.kikimans.designPatternsExam.chapter1_baseball.FastBall;
import com.kikimans.designPatternsExam.chapter1_baseball.Pitcher;
import com.kikimans.designPatternsExam.chapter1_baseball.QualitySelect;
import com.kikimans.designPatternsExam.chapter1_baseball.Ryu;
import com.kikimans.designPatternsExam.chapter1_baseball.park;

/**
 * 
 * <pre>
 * com.kikimans.designPatternsExam.chapter1
 *   |_ baseballTest.java
 *
 * <pre>
 * 
 * 
 * @Date         : 2014. 2. 7. 
 * @작성자      : kikimans
 * @변경이력 :
 * @프로그램 설명 : Strategy Pattern 를 이용한 야구 예제 
 */
public class baseballTest {

	@Test
	public void test_character_display() {
		Pitcher p = new park();
		QualitySelect qs = new Curve();
		p.setQuality(qs);
		assertThat(qs.useQuality(), is("커브"));		
		
		p.playerName();
		p.ballthrow();
		
		p.setQuality(qs = new FastBall());
		assertThat(qs.useQuality(), is("직구"));
		p.ballthrow();
		
		p = new Ryu();
		qs = new FastBall();
		
		p.playerName();
		p.setQuality(qs);
		assertThat(p.getQuality().useQuality(), is("직구"));
		p.ballthrow();
		
		
		
	}

}
