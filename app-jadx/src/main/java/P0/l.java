package p0;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import i1.C5015h;
import s0.AbstractC6338a1;
import s0.E1;
import s0.t1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, E1 e12, boolean z10, long j10, long j11) {
        return (C5015h.m(f10, C5015h.n((float) 0)) > 0 || z10) ? eVar.then(new ShadowGraphicsLayerElement(f10, e12, z10, j10, j11, null)) : eVar;
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, E1 e12, boolean z10, long j10, long j11, int i10, Object obj) {
        boolean z11;
        E1 e1A = (i10 & 2) != 0 ? t1.a() : e12;
        if ((i10 & 4) != 0) {
            z11 = false;
            if (C5015h.m(f10, C5015h.n(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        return a(eVar, f10, e1A, z11, (i10 & 8) != 0 ? AbstractC6338a1.a() : j10, (i10 & 16) != 0 ? AbstractC6338a1.a() : j11);
    }
}
