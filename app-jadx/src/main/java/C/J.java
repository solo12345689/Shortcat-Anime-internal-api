package C;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import l0.e;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class J implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f2025a = new J();

    private J() {
    }

    @Override // C.I
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        if (f10 > 0.0d) {
            return eVar.then(new LayoutWeightElement(AbstractC5874j.h(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // C.I
    public androidx.compose.ui.e c(androidx.compose.ui.e eVar, e.c cVar) {
        return eVar.then(new VerticalAlignElement(cVar));
    }
}
