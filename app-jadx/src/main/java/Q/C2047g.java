package Q;

import i1.AbstractC5022o;
import i1.C5021n;
import i1.C5023p;
import i1.C5025r;
import i1.EnumC5027t;
import r0.AbstractC6225g;
import r0.C6224f;

/* JADX INFO: renamed from: Q.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2047g implements androidx.compose.ui.window.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0.e f14126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2049i f14127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f14128c = C6224f.f58329b.c();

    public C2047g(l0.e eVar, InterfaceC2049i interfaceC2049i) {
        this.f14126a = eVar;
        this.f14127b = interfaceC2049i;
    }

    @Override // androidx.compose.ui.window.s
    public long a(C5023p c5023p, long j10, EnumC5027t enumC5027t, long j11) {
        long jA = this.f14127b.a();
        if (!AbstractC6225g.b(jA)) {
            jA = this.f14128c;
        }
        this.f14128c = jA;
        return C5021n.o(C5021n.o(c5023p.i(), AbstractC5022o.d(jA)), this.f14126a.a(j11, C5025r.f48570b.a(), enumC5027t));
    }
}
