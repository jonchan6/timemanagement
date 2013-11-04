package com.minion.timemanagement;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AddCategoryFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
		//Inflate layout of this fragment
		return inflater.inflate(R.layout.addcategoryfragment, container, false);
	}
	
	/*
	 * Changes action bar title
	 * Allows for correct change of title when pressing back button
	 */
	@Override
	public void onResume() {
		super.onResume();
		//set title
		((MainActivity) getActivity()).getActionBar().setTitle(R.string.add_category);
	}
}
