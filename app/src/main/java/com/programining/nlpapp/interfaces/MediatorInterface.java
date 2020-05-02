package com.programining.nlpapp.interfaces;

import androidx.fragment.app.Fragment;

public interface MediatorInterface {
    void changeFragmentTo(Fragment fragmentToDisplay, String fragmentTag);

    void goBack();
}
