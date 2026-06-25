package i1;

import j1.C5327b;
import j1.InterfaceC5326a;

/* JADX INFO: renamed from: i1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5019l {
    default long O(float f10) {
        C5327b c5327b = C5327b.f51588a;
        if (!c5327b.f(j1())) {
            return AbstractC5030w.e(f10 / j1());
        }
        InterfaceC5326a interfaceC5326aB = c5327b.b(j1());
        return AbstractC5030w.e(interfaceC5326aB != null ? interfaceC5326aB.a(f10) : f10 / j1());
    }

    default float T(long j10) {
        if (!C5031x.g(C5029v.g(j10), C5031x.f48582b.b())) {
            AbstractC5020m.b("Only Sp can convert to Px");
        }
        C5327b c5327b = C5327b.f51588a;
        if (!c5327b.f(j1())) {
            return C5015h.n(C5029v.h(j10) * j1());
        }
        InterfaceC5326a interfaceC5326aB = c5327b.b(j1());
        float fH = C5029v.h(j10);
        return interfaceC5326aB == null ? C5015h.n(fH * j1()) : C5015h.n(interfaceC5326aB.b(fH));
    }

    float j1();
}
