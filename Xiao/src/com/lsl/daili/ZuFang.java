package com.lsl.daili;

public class ZuFang implements Fzj{
	private String b="中介";
	private Fzj zhong;
	ZuFang(Fzj zhong){
		this.zhong=zhong;
	}
	@Override
	public void tuixiao() {
		zhong.tuixiao();
		System.out.println("这里的年轻人都很有‘活力’:"+b);
	}

	@Override
	public void shanhou() {
		System.out.println("要不我带你去看看:"+b);
		zhong.shanhou();
		System.out.println("我也觉得这个价真的不贵了！很难找到这么好的房子，价格还这么平民:"+b);
	}
	
	
}
