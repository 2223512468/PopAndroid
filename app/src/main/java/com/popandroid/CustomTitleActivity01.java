package com.popandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;


public class CustomTitleActivity01 extends Activity {
	private ImageButton titleBtn;
	
	private TitlePopup titlePopup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_title);
		
		initView();
		
		initData();
	}
	

	private void initView(){
		titleBtn = (ImageButton) findViewById(R.id.title_btn);
		titleBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				titlePopup.show(v);
			}
		});
				
		titlePopup = new TitlePopup(this, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
	}
	

	private void initData(){
		titlePopup.addAction(new ActionItem(this, "发起聊天", R.drawable.mm_title_btn_compose_normal));
		titlePopup.addAction(new ActionItem(this, "听筒模式", R.drawable.mm_title_btn_receiver_normal));
		titlePopup.addAction(new ActionItem(this, "登录网页", R.drawable.mm_title_btn_keyboard_normal));
		titlePopup.addAction(new ActionItem(this, "扫一扫",  R.drawable.mm_title_btn_qrcode_normal));
	}
	
}
