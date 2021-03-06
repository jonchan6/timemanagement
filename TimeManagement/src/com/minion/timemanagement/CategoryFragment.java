package com.minion.timemanagement;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CategoryFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
		//Inflate layout of this fragment
		return inflater.inflate(R.layout.categoryfragment, container, false);
	}
	
	/*
	 * Changes action bar title
	 * Allows for correct change of title when pressing back button
	 */
	@Override
	public void onResume() {
		super.onResume();
		//set title
		((MainActivity) getActivity()).getActionBar().setTitle(R.string.categories);
	}
}
