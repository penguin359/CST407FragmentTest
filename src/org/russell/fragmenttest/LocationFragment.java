package org.russell.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LocationFragment extends Fragment{

	@Override
	public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
		View view = inflater.inflate(R.layout.fragment_location, container, false);
		return view;
	}
}
