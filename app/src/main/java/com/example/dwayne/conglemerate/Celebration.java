package com.example.dwayne.conglemerate;


import android.media.session.MediaController;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;


public class Celebration extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_celebration, container, false);
        VideoView view = (VideoView) rootView.findViewById(R.id.videoView);
        String path = "android.resource://" + getActivity().getPackageName() + "/" + R.raw.movie4_converted;
        view.setVideoURI(Uri.parse(path));
        view.start();
        return null;

    }
        @Override
        public void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
        }
    }
