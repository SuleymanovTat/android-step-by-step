package ru.suleymanovtat.android_step_by_step.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import ru.suleymanovtat.android_step_by_step.R;
import ru.suleymanovtat.android_step_by_step.model.data.CharacterClass;
import ru.suleymanovtat.android_step_by_step.presenter.MainActivityPresenter;
import ru.suleymanovtat.android_step_by_step.view.adapters.RecyclerViewAdapter;

public class MainActivity extends AppCompatActivity implements IMainView, View.OnClickListener {

    private MainActivityPresenter presenter;
    private Button btnSearch;
    private EditText edSearch;
    private RecyclerView recycList;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainActivityPresenter(this);
        edSearch = findViewById(R.id.edSearch);
        btnSearch = findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);
        recycList = findViewById(R.id.recycList);
        adapter = new RecyclerViewAdapter();
        recycList.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        presenter.onSearchButtonClick();
    }

    @Override
    public void showData(List<CharacterClass> list) {
        adapter.setRepoList(list);
    }

    @Override
    public void showError(String error) {
        makeToast(error);
    }

    @Override
    public void showEmptyList() {
        makeToast(getString(R.string.empty_repo_list));
    }

    @Override
    public String getUserName() {
        return edSearch.getText().toString();
    }


    private void makeToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}
