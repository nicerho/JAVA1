package test;

public class Button {
	OnClickListner listener;
	
	public void setOnClickListener(OnClickListner listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}

	static interface OnClickListner{
		void onClick();
	}
}
