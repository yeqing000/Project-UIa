package com.client.view;
import javax.swing.*;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

public class Theme {
	//����ϵͳ�����
	public static void beauty(){
		try {
			UIManager.put("RootPane.setupButtonVisible", false); //ȥ���û���ť
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
