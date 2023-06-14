package test3;

public class Button {
	Ocl listener;
	
	public void setListener(Ocl listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}
	static interface Ocl{
		void onClick();
	}
}
