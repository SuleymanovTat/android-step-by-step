package ru.suleymanovtat.android_step_by_step.view;

import java.util.List;

import ru.suleymanovtat.android_step_by_step.model.data.CharacterClass;

/**
 * Created by suleymanovtat on 03.03.2018.
 */

public interface IMainView {

    void showData(List<CharacterClass> list);

    void showError(String error);

    void showEmptyList();

    String getUserName();
}
