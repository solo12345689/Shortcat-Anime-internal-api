package W;

import Td.L;
import ae.AbstractC2605b;
import i1.C5015h;
import w.AbstractC6877F;
import w.C6888a;
import w.C6919x;
import w.InterfaceC6875D;
import w.InterfaceC6904i;
import w.r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC6875D f20496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r0 f20497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final r0 f20498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final r0 f20499d;

    static {
        C6919x c6919x = new C6919x(0.4f, 0.0f, 0.6f, 1.0f);
        f20496a = c6919x;
        f20497b = new r0(120, 0, AbstractC6877F.d(), 2, null);
        f20498c = new r0(150, 0, c6919x, 2, null);
        f20499d = new r0(120, 0, c6919x, 2, null);
    }

    public static final Object d(C6888a c6888a, float f10, B.j jVar, B.j jVar2, Zd.e eVar) {
        InterfaceC6904i interfaceC6904iA = jVar2 != null ? b.f20495a.a(jVar2) : jVar != null ? b.f20495a.b(jVar) : null;
        if (interfaceC6904iA != null) {
            Object objF = C6888a.f(c6888a, C5015h.h(f10), interfaceC6904iA, null, null, eVar, 12, null);
            return objF == AbstractC2605b.f() ? objF : L.f17438a;
        }
        Object objS = c6888a.s(C5015h.h(f10), eVar);
        return objS == AbstractC2605b.f() ? objS : L.f17438a;
    }
}
