package com.minion.timemanagement;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
		//Inflate layout of this fragment
		return inflater.inflate(R.layout.homefragment, container, false);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		//set title
		((MainActivity) getActivity()).getActionBar().setTitle(R.string.app_name);
	}
}