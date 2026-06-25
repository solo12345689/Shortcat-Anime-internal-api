package Ib;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f8888a = new f();

    private f() {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Jb.b.f9479a.a();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        if (i10 == 15) {
            onLowMemory();
        }
    }
}
