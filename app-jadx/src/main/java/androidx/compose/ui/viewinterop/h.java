package androidx.compose.ui.viewinterop;

import androidx.compose.ui.e;
import q0.InterfaceC6065k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class h extends e.c implements InterfaceC6065k {
    @Override // q0.InterfaceC6065k
    public void P0(androidx.compose.ui.focus.i iVar) {
        iVar.g(getNode().isAttached() && f.g(this).hasFocusable());
    }
}
