package Ba;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactContext;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final ViewGroup a(ReactContext reactContext) {
        Window window;
        View decorView;
        View rootView;
        AbstractC5504s.h(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return null;
        }
        return (ViewGroup) rootView.findViewById(i.f.f48067d);
    }

    public static final View b(ReactContext reactContext) {
        Window window;
        View decorView;
        AbstractC5504s.h(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getRootView();
    }
}
