package Ub;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements LifecycleEventListener, ActivityEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f19456a;

    public x(d appContext) {
        AbstractC5504s.h(appContext, "appContext");
        this.f19456a = new WeakReference(appContext);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        AbstractC5504s.h(activity, "activity");
        d dVar = (d) this.f19456a.get();
        if (dVar != null) {
            dVar.J(activity, i10, i11, intent);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        d dVar = (d) this.f19456a.get();
        if (dVar != null) {
            dVar.M();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        d dVar = (d) this.f19456a.get();
        if (dVar != null) {
            dVar.N();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        d dVar = (d) this.f19456a.get();
        if (dVar != null) {
            dVar.O();
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
        AbstractC5504s.h(intent, "intent");
        d dVar = (d) this.f19456a.get();
        if (dVar != null) {
            dVar.P(intent);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onUserLeaveHint(Activity activity) {
        AbstractC5504s.h(activity, "activity");
        d dVar = (d) this.f19456a.get();
        if (dVar != null) {
            dVar.Q();
        }
    }
}
