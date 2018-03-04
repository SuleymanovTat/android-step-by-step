package ru.suleymanovtat.android_step_by_step.presenter;

import java.util.ArrayList;

import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subscribers.DisposableSubscriber;
import ru.suleymanovtat.android_step_by_step.model.MainModel;
import ru.suleymanovtat.android_step_by_step.model.data.CharacterClass;
import ru.suleymanovtat.android_step_by_step.model.data.Envelope;
import ru.suleymanovtat.android_step_by_step.view.IMainView;

/**
 * Created by suleymanovtat on 03.03.2018.
 */

public class MainActivityPresenter implements IMainPresenter {


    private MainModel model;

    private IMainView view;

    public MainActivityPresenter(IMainView view) {
        this.view = view;
        model = new MainModel();
    }

    @Override
    public void onSearchButtonClick() {
         model.getRepoList(view.getUserName()).subscribe(new DisposableSubscriber<Envelope<ArrayList<CharacterClass>>>() {
            @Override
            public void onNext(Envelope<ArrayList<CharacterClass>> arrayListEnvelope) {
                if (arrayListEnvelope != null && !arrayListEnvelope.getResponse().isEmpty()) {
                    view.showData(arrayListEnvelope.getResponse());
                } else {
                    view.showEmptyList();
                }
            }

            @Override
            public void onError(Throwable t) {
                view.showError(t.getMessage());
            }

            @Override
            public void onComplete() {

            }
        });
    }
}
