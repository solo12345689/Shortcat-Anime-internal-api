package zd;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.common.LifecycleState;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: zd.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7362g {
    public static final ReactHost a(Context context) {
        ReactHost reactHost;
        AbstractC5504s.h(context, "context");
        Object applicationContext = context.getApplicationContext();
        ReactApplication reactApplication = applicationContext instanceof ReactApplication ? (ReactApplication) applicationContext : null;
        return (reactApplication == null || (reactHost = reactApplication.getReactHost()) == null) ? (ReactHost) expo.modules.updates.f.a().getReactHost().get() : reactHost;
    }

    public static final void b(ReactHost reactHost, Activity activity, String reason) {
        AbstractC5504s.h(reactHost, "<this>");
        AbstractC5504s.h(reason, "reason");
        if (reactHost.getLifecycleState() != LifecycleState.f36552c && activity != null) {
            reactHost.onHostResume(activity);
        }
        reactHost.reload(reason);
    }
}
