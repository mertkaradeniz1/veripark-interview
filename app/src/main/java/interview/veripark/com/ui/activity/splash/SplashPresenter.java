package interview.veripark.com.ui.activity.splash;

import android.os.Handler;
import android.os.Looper;

import javax.inject.Inject;

import interview.veripark.com.data.DataManager;
import interview.veripark.com.ui.base.BasePresenter;

/**
 * Created by mertKaradeniz on 7.11.2021
 * <p>
 * This is an interview project.
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V>
        implements SplashMvpPresenter<V> {

    private long milliseconds = 2000;

    @Inject
    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void onAttach(V mvpView) {
        super.onAttach(mvpView);

        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = () -> getMvpView().openMainActivity();
        handler.postDelayed(runnable, milliseconds);
    }
}
