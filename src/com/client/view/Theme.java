package com.client.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class Theme {
	//调用系统主题包
	public static void beauty(){
		try {
            UIManager.put("RootPane.setupButtonVisible", false); //去除用户按钮
            //设置主题
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch (Exception e) {
            e.printStackTrace();
		}
	}
	 /*
     * 使得窗口居中,适用Toolkit类获取屏幕分辨率
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
