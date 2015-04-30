package com.client.view;
import javax.swing.*;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class Theme {
	//调用系统主题包
	public static void beauty(){
		try {
			UIManager.put("RootPane.setupButtonVisible", false); //去除用户按钮
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
