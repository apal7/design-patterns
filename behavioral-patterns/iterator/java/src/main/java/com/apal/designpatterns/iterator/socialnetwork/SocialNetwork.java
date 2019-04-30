package com.apal.designpatterns.iterator.socialnetwork;

import com.apal.designpatterns.iterator.iterator.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
