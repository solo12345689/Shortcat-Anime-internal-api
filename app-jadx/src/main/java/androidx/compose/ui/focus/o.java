package androidx.compose.ui.focus;

import K0.InterfaceC1794j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface o extends InterfaceC1794j {
    static /* synthetic */ boolean j0(o oVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i11 & 1) != 0) {
            i10 = d.f26651b.b();
        }
        return oVar.q(i10);
    }

    boolean q(int i10);
}
