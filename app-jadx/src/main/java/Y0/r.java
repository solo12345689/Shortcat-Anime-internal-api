package Y0;

import Y0.K;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final InterfaceC2484t a(String str, L l10, int i10, K.d dVar) {
        return new C2482q(str, l10, i10, dVar, null);
    }

    public static /* synthetic */ InterfaceC2484t b(String str, L l10, int i10, K.d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            l10 = L.f22613b.g();
        }
        if ((i11 & 4) != 0) {
            i10 = H.f22594b.b();
        }
        if ((i11 & 8) != 0) {
            dVar = new K.d(new K.a[0]);
        }
        return a(str, l10, i10, dVar);
    }
}
