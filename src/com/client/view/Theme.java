package com.client.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class Theme {
	//����ϵͳ�����
	public static void beauty(){
		try {
            UIManager.put("RootPane.setupButtonVisible", false); //ȥ���û���ť
            //��������
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch (Exception e) {
            e.printStackTrace();
		}
	}
	 /*
     * ʹ�ô��ھ���,����Toolkit���ȡ��Ļ�ֱ���
     */
	/*private void setCenter() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width/2;
		int screenHeight = screenSize.height/2;
		int height = this.getHeight();
		int width = this.getWidth();
		this.setLocation(screenWidth-width/2, screenHeight-height/2);
	}*/
	

}
