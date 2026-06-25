package D;

import R0.C2093b;
import Td.L;
import ae.AbstractC2605b;
import i1.C5025r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements F.C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ B f3378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f3379b;

        a(B b10, boolean z10) {
            this.f3378a = b10;
            this.f3379b = z10;
        }

        @Override // F.C
        public int a() {
            return this.f3378a.u().e() + this.f3378a.u().c();
        }

        @Override // F.C
        public float b() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f3378a.p(), this.f3378a.q(), this.f3378a.e());
        }

        @Override // F.C
        public C2093b c() {
            return this.f3379b ? new C2093b(-1, 1) : new C2093b(1, -1);
        }

        @Override // F.C
        public int d() {
            return this.f3378a.u().a() == z.q.Vertical ? C5025r.f(this.f3378a.u().b()) : C5025r.g(this.f3378a.u().b());
        }

        @Override // F.C
        public float e() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f3378a.p(), this.f3378a.q());
        }

        @Override // F.C
        public Object f(int i10, Zd.e eVar) {
            Object objI = B.I(this.f3378a, i10, 0, eVar, 2, null);
            return objI == AbstractC2605b.f() ? objI : L.f17438a;
        }
    }

    public static final F.C a(B b10, boolean z10) {
        return new a(b10, z10);
    }
}
