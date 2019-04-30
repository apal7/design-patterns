package com.apal.designpatterns.iterator.iterator;

import com.apal.designpatterns.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
