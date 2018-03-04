package ru.suleymanovtat.android_step_by_step.model.api;

import java.util.ArrayList;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ru.suleymanovtat.android_step_by_step.model.data.CharacterClass;
import ru.suleymanovtat.android_step_by_step.model.data.Envelope;

/**
 * Created by suleymanovtat on 03.03.2018.
 */

public interface ApiInterface {

    @GET("characters-classes/{id}")
    Flowable<Envelope<ArrayList<CharacterClass>>> getCharactersClasses(@Path("id") String id);
}
