package K0;

import androidx.compose.ui.e;
import ie.InterfaceC5082a;

/* JADX INFO: renamed from: K0.k0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1797k0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e.c cVar, InterfaceC5082a interfaceC5082a) {
        C1799l0 ownerScope$ui_release = cVar.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new C1799l0((InterfaceC1795j0) cVar);
            cVar.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        AbstractC1796k.o(cVar).getSnapshotObserver().i(ownerScope$ui_release, C1799l0.f10777b.a(), interfaceC5082a);
    }
}
