package sb;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.facebook.react.C3279t;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactHost;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface h {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(Runnable runnable);
    }

    default C3279t a(ReactActivity reactActivity, C3279t c3279t) {
        return null;
    }

    default ViewGroup b(Activity activity) {
        return null;
    }

    a c(ReactActivity reactActivity, ReactHost reactHost);

    default boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return false;
    }

    default void d(ReactActivity reactActivity, C3279t c3279t) {
    }
}
