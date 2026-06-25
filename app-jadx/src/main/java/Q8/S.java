package Q8;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class S implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ V f14435a;

    S(V v10) {
        this.f14435a = v10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14435a.f14445g.c(new ConnectionResult(4));
    }
}
