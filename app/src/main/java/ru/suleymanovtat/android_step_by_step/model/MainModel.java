package ru.suleymanovtat.android_step_by_step.model;

import java.util.ArrayList;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import ru.suleymanovtat.android_step_by_step.model.api.ApiInterface;
import ru.suleymanovtat.android_step_by_step.model.api.ApiModule;
import ru.suleymanovtat.android_step_by_step.model.data.CharacterClass;
import ru.suleymanovtat.android_step_by_step.model.data.Envelope;

/**
 * Created by suleymanovtat on 03.03.2018.
 */

public class MainModel implements IMainModel {


    ApiInterface apiInterface = ApiModule.getApiInterface();

    @Override
    public Flowable<Envelope<ArrayList<CharacterClass>>> getRepoList(String name) {
        return apiInterface.getCharactersClasses(name).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
