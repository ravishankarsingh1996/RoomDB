package com.appstudioz.roomdb;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class UserViewModel extends AndroidViewModel {

    private UserRepository mRepository;

    private LiveData<List<User>> mAllUser;

    public UserViewModel (Application application) {
        super(application);
        mRepository = new UserRepository(application);
        mAllUser = mRepository.getAllUser();
    }

    LiveData<List<User>> getAllWords() { return mAllUser; }

    public void insert(User user) { mRepository.insert(user); }
}
