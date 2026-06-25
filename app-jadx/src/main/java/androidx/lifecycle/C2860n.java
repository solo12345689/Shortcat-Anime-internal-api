package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2860n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2860n f30247a = new C2860n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f30248b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2852f {
        @Override // androidx.lifecycle.AbstractC2852f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC5504s.h(activity, "activity");
            G.INSTANCE.c(activity);
        }
    }

    private C2860n() {
    }

    public static final void a(Context context) {
        AbstractC5504s.h(context, "context");
        if (f30248b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
