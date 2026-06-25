package D;

import Gf.P;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.AbstractC5010c;
import i1.AbstractC5013f;
import i1.C5015h;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a */
    private static final float f3354a = C5015h.n(1);

    /* JADX INFO: renamed from: b */
    private static final s f3355b = new s(null, 0, false, 0.0f, new a(), 0.0f, false, P.a(Zd.j.f23275a), AbstractC5013f.b(1.0f, 0.0f, 2, null), AbstractC5010c.b(0, 0, 0, 0, 15, null), AbstractC2279u.m(), 0, 0, 0, false, z.q.Vertical, 0, 0, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f3359a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f3360b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, int i11) {
            super(0);
            this.f3359a = i10;
            this.f3360b = i11;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final B invoke() {
            return new B(this.f3359a, this.f3360b);
        }
    }

    public static final B c(int i10, int i11, InterfaceC2425m interfaceC2425m, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1470655220, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:80)");
        }
        Object[] objArr = new Object[0];
        h0.v vVarA = B.f3307y.a();
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && interfaceC2425m.c(i10)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && interfaceC2425m.c(i11)) || (i12 & 48) == 32);
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new b(i10, i11);
            interfaceC2425m.u(objD);
        }
        B b10 = (B) h0.d.e(objArr, vVarA, null, (InterfaceC5082a) objD, interfaceC2425m, 0, 4);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return b10;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements I0.C {

        /* JADX INFO: renamed from: a */
        private final int f3356a;

        /* JADX INFO: renamed from: b */
        private final int f3357b;

        /* JADX INFO: renamed from: c */
        private final Map f3358c = S.i();

        a() {
        }

        @Override // I0.C
        public int getHeight() {
            return this.f3357b;
        }

        @Override // I0.C
        public int getWidth() {
            return this.f3356a;
        }

        @Override // I0.C
        public Map z() {
            return this.f3358c;
        }

        @Override // I0.C
        public void A() {
        }
    }
}
