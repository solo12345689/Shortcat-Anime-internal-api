package C;

import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface I {
    static /* synthetic */ androidx.compose.ui.e b(I i10, androidx.compose.ui.e eVar, float f10, boolean z10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        return i10.a(eVar, f10, z10);
    }

    androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10);

    androidx.compose.ui.e c(androidx.compose.ui.e eVar, e.c cVar);
}
