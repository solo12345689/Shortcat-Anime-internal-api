package G;

import R0.C2093b;
import Td.L;
import ae.AbstractC2605b;
import i1.C5025r;

/* JADX INFO: renamed from: G.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1590d {

    /* JADX INFO: renamed from: G.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements F.C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C f6830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f6831b;

        a(C c10, boolean z10) {
            this.f6830a = c10;
            this.f6831b = z10;
        }

        @Override // F.C
        public int a() {
            return this.f6830a.C().e() + this.f6830a.C().c();
        }

        @Override // F.C
        public float b() {
            return D.g(this.f6830a.C(), this.f6830a.F());
        }

        @Override // F.C
        public C2093b c() {
            return this.f6831b ? new C2093b(this.f6830a.F(), 1) : new C2093b(1, this.f6830a.F());
        }

        @Override // F.C
        public int d() {
            return this.f6830a.C().a() == z.q.Vertical ? C5025r.f(this.f6830a.C().b()) : C5025r.g(this.f6830a.C().b());
        }

        @Override // F.C
        public float e() {
            return y.a(this.f6830a);
        }

        @Override // F.C
        public Object f(int i10, Zd.e eVar) {
            Object objZ = C.Z(this.f6830a, i10, 0.0f, eVar, 2, null);
            return objZ == AbstractC2605b.f() ? objZ : L.f17438a;
        }
    }

    public static final F.C a(C c10, boolean z10) {
        return new a(c10, z10);
    }
}
