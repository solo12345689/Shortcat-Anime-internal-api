package w;

import Y.AbstractC2393b0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.h2;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5498l;
import w.C6885N;
import w.C6885N.a;

/* JADX INFO: renamed from: w.O, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6886O {

    /* JADX INFO: renamed from: w.O$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f62411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6885N.a f62412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f62413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6884M f62414d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, C6885N.a aVar, Object obj2, C6884M c6884m) {
            super(0);
            this.f62411a = obj;
            this.f62412b = aVar;
            this.f62413c = obj2;
            this.f62414d = c6884m;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m971invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m971invoke() {
            if (AbstractC5504s.c(this.f62411a, this.f62412b.i()) && AbstractC5504s.c(this.f62413c, this.f62412b.l())) {
                return;
            }
            this.f62412b.t(this.f62411a, this.f62413c, this.f62414d);
        }
    }

    /* JADX INFO: renamed from: w.O$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6885N f62415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6885N.a f62416b;

        /* JADX INFO: renamed from: w.O$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Y.X {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6885N f62417a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C6885N.a f62418b;

            public a(C6885N c6885n, C6885N.a aVar) {
                this.f62417a = c6885n;
                this.f62418b = aVar;
            }

            @Override // Y.X
            public void dispose() {
                this.f62417a.j(this.f62418b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6885N c6885n, C6885N.a aVar) {
            super(1);
            this.f62415a = c6885n;
            this.f62416b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Y.X invoke(Y.Y y10) {
            this.f62415a.f(this.f62416b);
            return new a(this.f62415a, this.f62416b);
        }
    }

    public static final h2 a(C6885N c6885n, float f10, float f11, C6884M c6884m, String str, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-644770905, i10, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)");
        }
        int i12 = i10 << 3;
        h2 h2VarB = b(c6885n, Float.valueOf(f10), Float.valueOf(f11), u0.f(C5498l.f52289a), c6884m, str2, interfaceC2425m, (i10 & 1022) | (57344 & i12) | (i12 & 458752), 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return h2VarB;
    }

    public static final h2 b(C6885N c6885n, Object obj, Object obj2, s0 s0Var, C6884M c6884m, String str, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        C6885N c6885n2;
        Object obj3;
        Object obj4;
        C6884M c6884m2;
        if ((i11 & 16) != 0) {
            str = "ValueAnimation";
        }
        String str2 = str;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1062847727, i10, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");
        }
        Object objD = interfaceC2425m.D();
        InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
        if (objD == aVar.a()) {
            c6885n2 = c6885n;
            obj3 = obj;
            obj4 = obj2;
            c6884m2 = c6884m;
            C6885N.a aVar2 = c6885n2.new a(obj3, obj4, s0Var, c6884m2, str2);
            interfaceC2425m.u(aVar2);
            objD = aVar2;
        } else {
            c6885n2 = c6885n;
            obj3 = obj;
            obj4 = obj2;
            c6884m2 = c6884m;
        }
        C6885N.a aVar3 = (C6885N.a) objD;
        boolean z10 = true;
        boolean z11 = ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.F(obj3)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC2425m.F(obj4)) || (i10 & 384) == 256);
        if ((((57344 & i10) ^ 24576) <= 16384 || !interfaceC2425m.F(c6884m2)) && (i10 & 24576) != 16384) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objD2 = interfaceC2425m.D();
        if (z12 || objD2 == aVar.a()) {
            objD2 = new a(obj3, aVar3, obj4, c6884m2);
            interfaceC2425m.u(objD2);
        }
        AbstractC2393b0.g((InterfaceC5082a) objD2, interfaceC2425m, 0);
        boolean zF = interfaceC2425m.F(c6885n2);
        Object objD3 = interfaceC2425m.D();
        if (zF || objD3 == aVar.a()) {
            objD3 = new b(c6885n2, aVar3);
            interfaceC2425m.u(objD3);
        }
        AbstractC2393b0.b(aVar3, (Function1) objD3, interfaceC2425m, 6);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return aVar3;
    }

    public static final C6885N c(String str, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 1) != 0) {
            str = "InfiniteTransition";
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1013651573, i10, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)");
        }
        Object objD = interfaceC2425m.D();
        if (objD == InterfaceC2425m.f22370a.a()) {
            objD = new C6885N(str);
            interfaceC2425m.u(objD);
        }
        C6885N c6885n = (C6885N) objD;
        c6885n.k(interfaceC2425m, 0);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c6885n;
    }
}
