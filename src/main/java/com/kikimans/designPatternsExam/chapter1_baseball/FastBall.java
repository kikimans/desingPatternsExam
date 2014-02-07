/**
 * copyright kikimans
 * @Project     : designPatternsExam
 * 
 */
package com.kikimans.designPatternsExam.chapter1_baseball;


/**
 * <pre>
 * com.kikimans.designPatternsExam.chapter1
 *   |_ FastBall.java
 *
 * <pre>
 * 
 * 
 * @Date         : 2014. 2. 8. 
 * @작성자      : kikimans
 * @변경이력 :
 * @프로그램 설명 : 직구를 선택한다.
 */
public class FastBall implements QualitySelect {

	/**
	 * 
	 */
	private String quality;
	public FastBall() {
		// TODO Auto-generated constructor stub
		quality = "직구";
	}

	/* (non-Javadoc)
	 * @see com.kikimans.designPatternsExam.chapter1_baseball.QualitySelect#useQuality()
	 */
	@Override
	public String useQuality() {
		// TODO Auto-generated method stub
		return quality;
	}

}
