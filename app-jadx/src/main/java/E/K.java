package E;

import R0.C2093b;
import Td.L;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ae.AbstractC2605b;
import i1.C5025r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements F.C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ I f3868a;

        a(I i10) {
            this.f3868a = i10;
        }

        @Override // F.C
        public int a() {
            return this.f3868a.s().e() + this.f3868a.s().c();
        }

        @Override // F.C
        public float b() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f3868a.o(), this.f3868a.p(), this.f3868a.e());
        }

        @Override // F.C
        public C2093b c() {
            return new C2093b(-1, -1);
        }

        @Override // F.C
        public int d() {
            return this.f3868a.s().a() == z.q.Vertical ? C5025r.f(this.f3868a.s().b()) : C5025r.g(this.f3868a.s().b());
        }

        @Override // F.C
        public float e() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f3868a.o(), this.f3868a.p());
        }

        @Override // F.C
        public Object f(int i10, Zd.e eVar) {
            Object objF = I.F(this.f3868a, i10, 0, eVar, 2, null);
            return objF == AbstractC2605b.f() ? objF : L.f17438a;
        }
    }

    public static final F.C a(I i10, boolean z10, InterfaceC2425m interfaceC2425m, int i11) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1247008005, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:33)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && interfaceC2425m.U(i10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC2425m.a(z10)) || (i11 & 48) == 32);
        Object objD = interfaceC2425m.D();
        if (z11 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new a(i10);
            interfaceC2425m.u(objD);
        }
        a aVar = (a) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return aVar;
    }
}
