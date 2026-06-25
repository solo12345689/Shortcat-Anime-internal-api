package G;

import A.k;
import F.InterfaceC1535f;
import Gf.P;
import Td.L;
import Ud.AbstractC2279u;
import Ud.S;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ae.AbstractC2605b;
import i1.C5015h;
import i1.C5025r;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.K;
import oe.AbstractC5874j;
import w.InterfaceC6904i;
import w.m0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a */
    private static final float f6758a = C5015h.n(56);

    /* JADX INFO: renamed from: b */
    private static final u f6759b = new u(AbstractC2279u.m(), 0, 0, 0, z.q.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, k.a.f94a, new a(), false, null, null, P.a(Zd.j.f23275a), 393216, null);

    /* JADX INFO: renamed from: c */
    private static final b f6760c = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5011d {

        /* JADX INFO: renamed from: a */
        private final float f6764a = 1.0f;

        /* JADX INFO: renamed from: b */
        private final float f6765b = 1.0f;

        b() {
        }

        @Override // i1.InterfaceC5011d
        public float getDensity() {
            return this.f6764a;
        }

        @Override // i1.InterfaceC5019l
        public float j1() {
            return this.f6765b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f6766a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f6767b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function2 f6768c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f6769d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC1535f f6770e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ float f6771f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InterfaceC6904i f6772g;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function2 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ K f6773a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ z.u f6774b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(K k10, z.u uVar) {
                super(2);
                this.f6773a = k10;
                this.f6774b = uVar;
            }

            public final void a(float f10, float f11) {
                this.f6773a.f52256a += this.f6774b.a(f10 - this.f6773a.f52256a);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function2 function2, int i10, InterfaceC1535f interfaceC1535f, float f10, InterfaceC6904i interfaceC6904i, Zd.e eVar) {
            super(2, eVar);
            this.f6768c = function2;
            this.f6769d = i10;
            this.f6770e = interfaceC1535f;
            this.f6771f = f10;
            this.f6772g = interfaceC6904i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(z.u uVar, Zd.e eVar) {
            return ((c) create(uVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = new c(this.f6768c, this.f6769d, this.f6770e, this.f6771f, this.f6772g, eVar);
            cVar.f6767b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f6766a;
            if (i10 == 0) {
                Td.v.b(obj);
                z.u uVar = (z.u) this.f6767b;
                this.f6768c.invoke(uVar, kotlin.coroutines.jvm.internal.b.d(this.f6769d));
                boolean z10 = this.f6769d > this.f6770e.d();
                int iA = (this.f6770e.a() - this.f6770e.d()) + 1;
                if (((z10 && this.f6769d > this.f6770e.a()) || (!z10 && this.f6769d < this.f6770e.d())) && Math.abs(this.f6769d - this.f6770e.d()) >= 3) {
                    this.f6770e.c(uVar, z10 ? AbstractC5874j.e(this.f6769d - iA, this.f6770e.d()) : AbstractC5874j.i(this.f6769d + iA, this.f6770e.d()), 0);
                }
                float fB = this.f6770e.b(this.f6769d) + this.f6771f;
                K k10 = new K();
                InterfaceC6904i interfaceC6904i = this.f6772g;
                a aVar = new a(k10, uVar);
                this.f6766a = 1;
                if (m0.e(0.0f, fB, 0.0f, interfaceC6904i, aVar, this, 4, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f6775a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f6776b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5082a f6777c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, float f10, InterfaceC5082a interfaceC5082a) {
            super(0);
            this.f6775a = i10;
            this.f6776b = f10;
            this.f6777c = interfaceC5082a;
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final C1588b invoke() {
            return new C1588b(this.f6775a, this.f6776b, this.f6777c);
        }
    }

    public static final Object d(InterfaceC1535f interfaceC1535f, int i10, float f10, InterfaceC6904i interfaceC6904i, Function2 function2, Zd.e eVar) {
        Object objE = interfaceC1535f.e(new c(function2, i10, interfaceC1535f, f10, interfaceC6904i, null), eVar);
        return objE == AbstractC2605b.f() ? objE : L.f17438a;
    }

    public static final Object e(C c10, Zd.e eVar) throws Throwable {
        if (c10.v() + 1 >= c10.F()) {
            return L.f17438a;
        }
        Object objN = C.n(c10, c10.v() + 1, 0.0f, null, eVar, 6, null);
        return objN == AbstractC2605b.f() ? objN : L.f17438a;
    }

    public static final Object f(C c10, Zd.e eVar) throws Throwable {
        if (c10.v() - 1 < 0) {
            return L.f17438a;
        }
        Object objN = C.n(c10, c10.v() - 1, 0.0f, null, eVar, 6, null);
        return objN == AbstractC2605b.f() ? objN : L.f17438a;
    }

    public static final long g(n nVar, int i10) {
        long j10 = (((long) i10) * ((long) (nVar.j() + nVar.h()))) + ((long) nVar.e()) + ((long) nVar.c());
        int iG = nVar.a() == z.q.Horizontal ? C5025r.g(nVar.b()) : C5025r.f(nVar.b());
        return AbstractC5874j.f(j10 - ((long) (iG - AbstractC5874j.m(nVar.l().a(iG, nVar.h(), nVar.e(), nVar.c(), i10 - 1, i10), 0, iG))), 0L);
    }

    public static final long h(u uVar, int i10) {
        int iG = uVar.a() == z.q.Horizontal ? C5025r.g(uVar.b()) : C5025r.f(uVar.b());
        return AbstractC5874j.m(uVar.l().a(iG, uVar.h(), uVar.e(), uVar.c(), 0, i10), 0, iG);
    }

    public static final float i() {
        return f6758a;
    }

    public static final u j() {
        return f6759b;
    }

    public static final C k(int i10, float f10, InterfaceC5082a interfaceC5082a, InterfaceC2425m interfaceC2425m, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            f10 = 0.0f;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1210768637, i11, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:86)");
        }
        Object[] objArr = new Object[0];
        h0.v vVarA = C1588b.f6787L.a();
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && interfaceC2425m.c(i10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC2425m.b(f10)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && interfaceC2425m.U(interfaceC5082a)) || (i11 & 384) == 256);
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new d(i10, f10, interfaceC5082a);
            interfaceC2425m.u(objD);
        }
        C1588b c1588b = (C1588b) h0.d.e(objArr, vVarA, null, (InterfaceC5082a) objD, interfaceC2425m, 0, 4);
        c1588b.m0().setValue(interfaceC5082a);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c1588b;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements I0.C {

        /* JADX INFO: renamed from: a */
        private final int f6761a;

        /* JADX INFO: renamed from: b */
        private final int f6762b;

        /* JADX INFO: renamed from: c */
        private final Map f6763c = S.i();

        a() {
        }

        @Override // I0.C
        public int getHeight() {
            return this.f6762b;
        }

        @Override // I0.C
        public int getWidth() {
            return this.f6761a;
        }

        @Override // I0.C
        public Map z() {
            return this.f6763c;
        }

        @Override // I0.C
        public void A() {
        }
    }
}
