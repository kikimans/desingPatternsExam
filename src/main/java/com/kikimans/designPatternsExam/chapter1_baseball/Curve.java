/**
 * copyright kikimans
 * @Project     : designPatternsExam
 * 
 */
package com.kikimans.designPatternsExam.chapter1_baseball;


/**
 * <pre>
 * com.kikimans.designPatternsExam.chapter1
 *   |_ Curve.java
 *
 * <pre>
 * 
 * 
 * @Date         : 2014. 2. 8. 
 * @작성자      : kikimans
 * @변경이력 :
 * @프로그램 설명 : 커브 구질을 선택하는 행동을 구성한다.
 */
public class Curve implements QualitySelect {
	
	private String quality;
	
	public Curve(){
		this.quality = "커브";
	}

	@Override
	public String useQuality() {
		// TODO Auto-generated method stub
		return quality;
	}

}
