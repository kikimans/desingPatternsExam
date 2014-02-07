/**
 * copyright kikimans
 * @Project     : designPatternsExam
 * 
 */
package com.kikimans.designPatternsExam.chapter1_baseball;

/**
 * <pre>
 * com.kikimans.designPatternsExam.chapter1_baseball
 *   |_ Ryu.java
 *
 * <pre>
 * 
 * 
 * @Date         : 2014. 2. 8. 
 * @작성자      : kikimans
 * @변경이력 :
 * @프로그램 설명 : 선수 클래스 
 */
public class Ryu extends Pitcher {

	/**
	 * 
	 */
	private static final String NAME = "류현진";
	
	public Ryu() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.kikimans.designPatternsExam.chapter1_baseball.Pitcher#playerName()
	 */
	@Override
	public void playerName() {
		// TODO Auto-generated method stub
		
		System.out.println("제 이름은 " + NAME + " 입니다. ");

	}

}
