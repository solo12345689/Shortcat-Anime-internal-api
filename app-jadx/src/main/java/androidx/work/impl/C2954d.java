package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: androidx.work.impl.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2954d implements i4.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f32845a = G1.h.a(Looper.getMainLooper());

    @Override // i4.q
    public void a(Runnable runnable) {
        this.f32845a.removeCallbacks(runnable);
    }

    @Override // i4.q
    public void b(long j10, Runnable runnable) {
        this.f32845a.postDelayed(runnable, j10);
    }
}
