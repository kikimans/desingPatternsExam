package com.kikimans.designPatternsExam.chapter1_baseball;

/**
 * <pre>
 * com.kikimans.designPatternsExam.chapter1_baseball
 *   |_ Pitcher.java
 *
 * <pre>
 * 
 * 
 * @Date         : 2014. 2. 8. 
 * @작성자      : kikimans
 * @변경이력 :
 * @프로그램 설명 : 투수 추상 클래스 
 */
public abstract class Pitcher {

	private QualitySelect quality;
	
	public void setQuality(QualitySelect qs) {
		// TODO Auto-generated method stub
		this.quality = qs;
	}
	
	public void ballthrow(){
		String qualityStr = quality.useQuality();
		
		System.out.println(qualityStr + "를 선택 하여 던지다. ");
	}
	
	public abstract void playerName();

	public QualitySelect getQuality() {
		return quality;
	}
	
	
	
}
