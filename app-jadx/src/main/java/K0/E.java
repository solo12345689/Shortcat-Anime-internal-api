package K0;

import I0.InterfaceC1686l;
import I0.InterfaceC1687m;
import K0.C1793i0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface E extends InterfaceC1794j {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements C1793i0.e {
        a() {
        }

        @Override // K0.C1793i0.e
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public final I0.C mo14measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
            return E.this.mo5measure3p2s80s(lVar, a10, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements C1793i0.e {
        b() {
        }

        @Override // K0.C1793i0.e
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final I0.C mo14measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
            return E.this.mo5measure3p2s80s(lVar, a10, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c implements C1793i0.e {
        c() {
        }

        @Override // K0.C1793i0.e
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final I0.C mo14measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
            return E.this.mo5measure3p2s80s(lVar, a10, j10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d implements C1793i0.e {
        d() {
        }

        @Override // K0.C1793i0.e
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final I0.C mo14measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
            return E.this.mo5measure3p2s80s(lVar, a10, j10);
        }
    }

    default int maxIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return C1793i0.f10765a.a(new a(), interfaceC1687m, interfaceC1686l, i10);
    }

    default int maxIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return C1793i0.f10765a.b(new b(), interfaceC1687m, interfaceC1686l, i10);
    }

    /* JADX INFO: renamed from: measure-3p2s80s */
    I0.C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10);

    default int minIntrinsicHeight(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return C1793i0.f10765a.c(new c(), interfaceC1687m, interfaceC1686l, i10);
    }

    default int minIntrinsicWidth(InterfaceC1687m interfaceC1687m, InterfaceC1686l interfaceC1686l, int i10) {
        return C1793i0.f10765a.d(new d(), interfaceC1687m, interfaceC1686l, i10);
    }
}
