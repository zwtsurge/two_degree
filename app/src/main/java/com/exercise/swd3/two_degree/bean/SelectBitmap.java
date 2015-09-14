package com.exercise.swd3.two_degree.bean;

import android.graphics.Bitmap;

import java.io.Serializable;
import java.util.List;

public class SelectBitmap implements Serializable {

	private List<Bitmap> allBitmap;

	public List<Bitmap> getAllBitmap() {
		return allBitmap;
	}

	public void setAllBitmap(List<Bitmap> allBitmap) {
		this.allBitmap = allBitmap;
	}
	
	
}
