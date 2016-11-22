package com.anteoy.designPatterns.factory;
/**
 * �����ʵ�ֽӿ�
 * @author Administrator
 *
 */
public interface PersonFactory {

	//�к��ӿ�
	public Boy getBoy();
	//Ů���ӿ�
	public Girl getGirl();
	
}
