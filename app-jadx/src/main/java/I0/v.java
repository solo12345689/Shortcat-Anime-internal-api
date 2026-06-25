package I0;

import androidx.compose.ui.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface v extends e.b {
    default int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return E.f8653a.a(this, interfaceC1687m, interfaceC1686l, i10);
    }

    default int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return E.f8653a.b(this, interfaceC1687m, interfaceC1686l, i10);
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    C mo2measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10);

    default int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return E.f8653a.c(this, interfaceC1687m, interfaceC1686l, i10);
    }

    default int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return E.f8653a.d(this, interfaceC1687m, interfaceC1686l, i10);
    }
}
