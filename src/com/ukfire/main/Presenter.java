package com.ukfire.main;

import com.ukfire.base.PresenterBase;
import com.ukfire.base.ThreadUtil;

public class Presenter extends PresenterBase<IView> implements IPresenter {

	RenovateHandler handler;

	public Presenter(IView mainView) {
		super(mainView);
		this.handler = new RenovateHandler(this);
	}

	@Override
	public void onResume() {

	}

	@Override
	public void onRenovateClick() {
		getView().startLoading("���ڻ�ȡ��������");
		ThreadUtil.execute(new RenovateRunnable(handler));
	}

}
