package com.lsl.daili;

public class MainClass {
	public static void main(String[] args) {
		Fzj f=new FangDong();
		ZuFang fang = new ZuFang(f);
		fang.tuixiao();
		fang.shanhou();
	}
}
  