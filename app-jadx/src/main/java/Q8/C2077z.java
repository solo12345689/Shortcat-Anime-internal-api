package Q8;

import Q8.ComponentCallbacks2C2055c;

/* JADX INFO: renamed from: Q8.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C2077z implements ComponentCallbacks2C2055c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2057e f14521a;

    C2077z(C2057e c2057e) {
        this.f14521a = c2057e;
    }

    @Override // Q8.ComponentCallbacks2C2055c.a
    public final void a(boolean z10) {
        C2057e c2057e = this.f14521a;
        c2057e.f14481n.sendMessage(c2057e.f14481n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
