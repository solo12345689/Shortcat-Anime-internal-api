package s0;

import t0.AbstractC6580c;

/* JADX INFO: renamed from: s0.d1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6347d1 {
    public static final InterfaceC6341b1 a(int i10, int i11, int i12, boolean z10, AbstractC6580c abstractC6580c) {
        return O.a(i10, i11, i12, z10, abstractC6580c);
    }

    public static /* synthetic */ InterfaceC6341b1 b(int i10, int i11, int i12, boolean z10, AbstractC6580c abstractC6580c, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = C6344c1.f58930b.b();
        }
        if ((i13 & 8) != 0) {
            z10 = true;
        }
        if ((i13 & 16) != 0) {
            abstractC6580c = t0.k.f60205a.G();
        }
        return a(i10, i11, i12, z10, abstractC6580c);
    }
}
