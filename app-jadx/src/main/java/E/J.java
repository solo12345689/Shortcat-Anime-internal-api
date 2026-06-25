package E;

import Gf.P;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.AbstractC5013f;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a */
    private static final u f3861a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f3865a = new b();

        b() {
            super(1);
        }

        public final List a(int i10) {
            return AbstractC2279u.m();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f3866a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f3867b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11) {
            super(0);
            this.f3866a = i10;
            this.f3867b = i11;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final I invoke() {
            return new I(this.f3866a, this.f3867b);
        }
    }

    static {
        a aVar = new a();
        List listM = AbstractC2279u.m();
        z.q qVar = z.q.Vertical;
        f3861a = new u(null, 0, false, 0.0f, aVar, false, P.a(Zd.j.f23275a), AbstractC5013f.b(1.0f, 0.0f, 2, null), 0, b.f3865a, listM, 0, 0, 0, false, qVar, 0, 0);
    }

    public static final I b(int i10, int i11, InterfaceC2425m interfaceC2425m, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(29186956, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)");
        }
        Object[] objArr = new Object[0];
        h0.v vVarA = I.f3821v.a();
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && interfaceC2425m.c(i10)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && interfaceC2425m.c(i11)) || (i12 & 48) == 32);
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new c(i10, i11);
            interfaceC2425m.u(objD);
        }
        I i14 = (I) h0.d.e(objArr, vVarA, null, (InterfaceC5082a) objD, interfaceC2425m, 0, 4);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return i14;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements I0.C {

        /* JADX INFO: renamed from: a */
        private final int f3862a;

        /* JADX INFO: renamed from: b */
        private final int f3863b;

        /* JADX INFO: renamed from: c */
        private final Map f3864c = S.i();

        a() {
        }

        @Override // I0.C
        public int getHeight() {
            return this.f3863b;
        }

        @Override // I0.C
        public int getWidth() {
            return this.f3862a;
        }

        @Override // I0.C
        public Map z() {
            return this.f3864c;
        }

        @Override // I0.C
        public void A() {
        }
    }
}
