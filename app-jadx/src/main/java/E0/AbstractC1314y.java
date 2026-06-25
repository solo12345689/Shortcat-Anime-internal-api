package E0;

import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;

/* JADX INFO: renamed from: E0.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1314y {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC1313x interfaceC1313x, boolean z10) {
        return eVar.then(new PointerHoverIconModifierElement(interfaceC1313x, z10));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC1313x interfaceC1313x, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(eVar, interfaceC1313x, z10);
    }
}
