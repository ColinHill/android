package com.example.dataproto2;

public class Player {

	private boolean Paused = false;
	int stopPosition = 0;
	

	public boolean isPaused() {
		return Paused;
	}

	public void setPaused(boolean isPaused) {
		this.Paused = isPaused;
	}
	
}
