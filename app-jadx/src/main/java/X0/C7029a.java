package x0;

import i1.AbstractC5026s;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import s0.AbstractC6347d1;
import s0.AbstractC6370l0;
import s0.C6344c1;
import s0.C6385r0;
import s0.InterfaceC6341b1;
import s0.InterfaceC6364j0;
import u0.C6706a;
import u0.InterfaceC6711f;

/* JADX INFO: renamed from: x0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7029a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC6341b1 f63407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC6364j0 f63408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5011d f63409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC5027t f63410d = EnumC5027t.f48573a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63411e = C5025r.f48570b.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63412f = C6344c1.f58930b.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C6706a f63413g = new C6706a();

    private final void a(InterfaceC6711f interfaceC6711f) {
        InterfaceC6711f.B0(interfaceC6711f, C6385r0.f58985b.a(), 0L, 0L, 0.0f, null, null, androidx.compose.ui.graphics.c.f26737b.a(), 62, null);
    }

    public final void b(int i10, long j10, InterfaceC5011d interfaceC5011d, EnumC5027t enumC5027t, Function1 function1) {
        this.f63409c = interfaceC5011d;
        this.f63410d = enumC5027t;
        InterfaceC6341b1 interfaceC6341b1B = this.f63407a;
        InterfaceC6364j0 interfaceC6364j0A = this.f63408b;
        if (interfaceC6341b1B == null || interfaceC6364j0A == null || ((int) (j10 >> 32)) > interfaceC6341b1B.getWidth() || ((int) (j10 & 4294967295L)) > interfaceC6341b1B.getHeight() || !C6344c1.i(this.f63412f, i10)) {
            interfaceC6341b1B = AbstractC6347d1.b((int) (j10 >> 32), (int) (4294967295L & j10), i10, false, null, 24, null);
            interfaceC6364j0A = AbstractC6370l0.a(interfaceC6341b1B);
            this.f63407a = interfaceC6341b1B;
            this.f63408b = interfaceC6364j0A;
            this.f63412f = i10;
        }
        this.f63411e = j10;
        C6706a c6706a = this.f63413g;
        long jD = AbstractC5026s.d(j10);
        C6706a.C0912a c0912aN = c6706a.N();
        InterfaceC5011d interfaceC5011dA = c0912aN.a();
        EnumC5027t enumC5027tB = c0912aN.b();
        InterfaceC6364j0 interfaceC6364j0C = c0912aN.c();
        long jD2 = c0912aN.d();
        C6706a.C0912a c0912aN2 = c6706a.N();
        c0912aN2.j(interfaceC5011d);
        c0912aN2.k(enumC5027t);
        c0912aN2.i(interfaceC6364j0A);
        c0912aN2.l(jD);
        interfaceC6364j0A.p();
        a(c6706a);
        function1.invoke(c6706a);
        interfaceC6364j0A.k();
        C6706a.C0912a c0912aN3 = c6706a.N();
        c0912aN3.j(interfaceC5011dA);
        c0912aN3.k(enumC5027tB);
        c0912aN3.i(interfaceC6364j0C);
        c0912aN3.l(jD2);
        interfaceC6341b1B.a();
    }

    public final void c(InterfaceC6711f interfaceC6711f, float f10, androidx.compose.ui.graphics.d dVar) {
        InterfaceC6341b1 interfaceC6341b1 = this.f63407a;
        if (!(interfaceC6341b1 != null)) {
            H0.a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC6711f.m0(interfaceC6711f, interfaceC6341b1, 0L, this.f63411e, 0L, 0L, f10, null, dVar, 0, 0, 858, null);
    }

    public final InterfaceC6341b1 d() {
        return this.f63407a;
    }
}
