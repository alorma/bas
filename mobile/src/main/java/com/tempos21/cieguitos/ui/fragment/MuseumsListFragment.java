package com.tempos21.cieguitos.ui.fragment;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.sergibc.sdk.data.Museo;
import com.example.sergibc.sdk.data.MuseumData;
import com.tempos21.cieguitos.ui.activity.ListaPlantasActivity;
import com.tempos21.cieguitos.ui.adapter.MuseumsSimpleRectangularAdapter;

import java.util.List;

/**
 * Created by Bernat on 25/10/2014.
 */
public class MuseumsListFragment extends ListFragment {

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		getListView().setDivider(null);
		List<Museo> items = MuseumData.getInstance().getMuseos();
		setListAdapter(new MuseumsSimpleRectangularAdapter(getActivity(), items));
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);

		Intent intent = new Intent(getActivity(), ListaPlantasActivity.class);
		startActivity(intent);
	}
}
