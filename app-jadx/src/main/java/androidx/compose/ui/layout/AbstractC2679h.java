package androidx.compose.ui.layout;

import I0.InterfaceC1692s;

/* JADX INFO: renamed from: androidx.compose.ui.layout.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2679h {
    public static final Object a(I0.A a10) {
        Object objJ = a10.j();
        InterfaceC1692s interfaceC1692s = objJ instanceof InterfaceC1692s ? (InterfaceC1692s) objJ : null;
        if (interfaceC1692s != null) {
            return interfaceC1692s.I0();
        }
        return null;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, Object obj) {
        return eVar.then(new LayoutIdElement(obj));
    }
}
