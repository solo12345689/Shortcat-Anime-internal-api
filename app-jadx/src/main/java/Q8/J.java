package Q8;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J extends AbstractC2075x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P8.e f14419c;

    public J(P8.e eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f14419c = eVar;
    }

    @Override // P8.f
    public final com.google.android.gms.common.api.internal.a a(com.google.android.gms.common.api.internal.a aVar) {
        return this.f14419c.j(aVar);
    }

    @Override // P8.f
    public final com.google.android.gms.common.api.internal.a b(com.google.android.gms.common.api.internal.a aVar) {
        return this.f14419c.l(aVar);
    }

    @Override // P8.f
    public final Looper d() {
        return this.f14419c.s();
    }
}
