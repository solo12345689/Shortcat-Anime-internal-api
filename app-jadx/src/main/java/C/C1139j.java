package C;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import l0.e;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: C.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1139j implements InterfaceC1138i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1139j f2142a = new C1139j();

    private C1139j() {
    }

    @Override // C.InterfaceC1138i
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, boolean z10) {
        if (f10 > 0.0d) {
            return eVar.then(new LayoutWeightElement(AbstractC5874j.h(f10, Float.MAX_VALUE), z10));
        }
        throw new IllegalArgumentException(("invalid weight " + f10 + "; must be greater than zero").toString());
    }

    @Override // C.InterfaceC1138i
    public androidx.compose.ui.e b(androidx.compose.ui.e eVar, e.b bVar) {
        return eVar.then(new HorizontalAlignElement(bVar));
    }
}
