package Q8;

import R8.AbstractC2115p;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionResult f14463b;

    d0(ConnectionResult connectionResult, int i10) {
        AbstractC2115p.l(connectionResult);
        this.f14463b = connectionResult;
        this.f14462a = i10;
    }

    final int a() {
        return this.f14462a;
    }

    final ConnectionResult b() {
        return this.f14463b;
    }
}
