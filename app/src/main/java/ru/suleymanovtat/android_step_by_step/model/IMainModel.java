package ru.suleymanovtat.android_step_by_step.model;

import java.util.ArrayList;

import io.reactivex.Flowable;
import ru.suleymanovtat.android_step_by_step.model.data.CharacterClass;
import ru.suleymanovtat.android_step_by_step.model.data.Envelope;

/**
 * Created by suleymanovtat on 03.03.2018.
 */

public interface IMainModel {

    Flowable<Envelope<ArrayList<CharacterClass>>> getRepoList(String name);

}
