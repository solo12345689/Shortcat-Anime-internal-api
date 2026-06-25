package a1;

import U0.T0;
import android.view.inputmethod.CursorAnchorInfo;
import r0.C6226h;

/* JADX INFO: renamed from: a1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2535c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2535c f23581a = new C2535c();

    private C2535c() {
    }

    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, T0 t02, C6226h c6226h) {
        int iR;
        int iR2;
        if (!c6226h.q() && (iR = t02.r(c6226h.l())) <= (iR2 = t02.r(c6226h.e()))) {
            while (true) {
                builder.addVisibleLineBounds(t02.s(iR), t02.v(iR), t02.t(iR), t02.m(iR));
                if (iR == iR2) {
                    break;
                }
                iR++;
            }
        }
        return builder;
    }
}
