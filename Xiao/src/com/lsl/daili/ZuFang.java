package com.lsl.daili;

public class ZuFang implements Fzj{
	private String b="�н�";
	private Fzj zhong;
	ZuFang(Fzj zhong){
		this.zhong=zhong;
	}
	@Override
	public void tuixiao() {
		zhong.tuixiao();
		System.out.println("����������˶����С�������:"+b);
	}

	@Override
	public void shanhou() {
		System.out.println("Ҫ���Ҵ���ȥ����:"+b);
		zhong.shanhou();
		System.out.println("��Ҳ�����������Ĳ����ˣ������ҵ���ô�õķ��ӣ��۸���ôƽ��:"+b);
	}
	
	
}
