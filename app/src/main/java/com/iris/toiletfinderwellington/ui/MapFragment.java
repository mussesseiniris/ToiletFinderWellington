package com.iris.toiletfinderwellington.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.iris.toiletfinderwellington.R;
import com.iris.toiletfinderwellington.model.ToiletResponse;
import com.iris.toiletfinderwellington.netWork.RetrofitClient;
import com.iris.toiletfinderwellington.netWork.ToiletApiService;

import retrofit2.Callback;
import retrofit2.Response;
import java.util.List;
import com.iris.toiletfinderwellington.model.Feature;

import retrofit2.Call;

public class MapFragment extends Fragment implements OnMapReadyCallback {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.map_fragment, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        return view;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        LatLng wellington = new LatLng(-41.29, 174.78);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(wellington, 14));
        //Create API service
        ToiletApiService apiService = RetrofitClient.getInstance().create(ToiletApiService.class);

        //Async Request

        apiService.getFeatures().enqueue(new Callback<ToiletResponse>() {
            @Override
            public void onResponse(Call<ToiletResponse> call, Response<ToiletResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<Feature> features = response.body().getFeatures();
                    for (Feature feature : features) {
                        double lng = feature.getGeometry().getCoordinates().get(0);
                        double lat = feature.getGeometry().getCoordinates().get(1);
                        String name = feature.getProperties().getLocation();

                        googleMap.addMarker(new MarkerOptions()
                                .position(new LatLng(lat, lng))
                                .title(name));
                    }
                }
            }

            @Override
            public void onFailure(Call<ToiletResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
                                        }
