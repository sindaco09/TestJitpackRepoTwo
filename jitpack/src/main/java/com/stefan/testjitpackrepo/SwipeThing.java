package com.stefan.testjitpackrepo;

import android.content.Context;

import com.daimajia.swipe.SwipeLayout;

public class SwipeThing {

	private Context context;
	public SwipeThing(Context context) {
		this.context = context;
	}

	public SwipeLayout swipeLayout() {
		return new SwipeLayout(context);
	}
}
