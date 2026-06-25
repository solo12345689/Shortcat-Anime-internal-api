package R8;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectionResult f15269a;

    public c0(ConnectionResult connectionResult) {
        AbstractC2115p.b(connectionResult.i(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.f15269a = connectionResult;
    }
}
