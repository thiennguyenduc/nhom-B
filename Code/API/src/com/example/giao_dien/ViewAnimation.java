package com.example.giao_dien;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public class ViewAnimation extends Animation {
	float centerX, centerY;

	public ViewAnimation() {
	}

	@Override
	public void initialize(int width, int height, int parentWidth, int parentHeight) {
		// TODO Auto-generated method stub
		super.initialize(width, height, parentWidth, parentHeight);
		centerX = width / 2.0f;
		centerY = height / 2.0f;
		setDuration(2500);
		setFillAfter(true);
		setInterpolator(new LinearInterpolator());
	}
	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {
		// TODO Auto-generated method stub
		super.applyTransformation(interpolatedTime, t);
		final Matrix matrix = t.getMatrix();
		matrix.setScale(interpolatedTime, interpolatedTime);
		matrix.preTranslate(-centerX, -centerY);
		matrix.postTranslate(centerX, centerY);
	}
}
