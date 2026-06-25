package Y0;

import Gf.AbstractC1617k;
import Gf.C0;
import Gf.L;
import Gf.X0;
import Y0.t0;
import ae.AbstractC2605b;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: c */
    public static final a f22582c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f22583d = 8;

    /* JADX INFO: renamed from: e */
    private static final G f22584e = new G();

    /* JADX INFO: renamed from: f */
    private static final Gf.L f22585f = new c(Gf.L.f7522J);

    /* JADX INFO: renamed from: a */
    private final C2479n f22586a;

    /* JADX INFO: renamed from: b */
    private Gf.O f22587b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f22588a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2478m f22589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2478m c2478m, Zd.e eVar) {
            super(2, eVar);
            this.f22589b = c2478m;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new b(this.f22589b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f22588a;
            if (i10 == 0) {
                Td.v.b(obj);
                C2478m c2478m = this.f22589b;
                this.f22588a = 1;
                if (c2478m.n(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return Td.L.f17438a;
        }
    }

    public D(C2479n c2479n, Zd.i iVar) {
        this.f22586a = c2479n;
        this.f22587b = Gf.P.a(f22585f.w(d1.p.a()).w(iVar).w(X0.a((C0) iVar.l(C0.f7490K))));
    }

    public t0 a(q0 q0Var, U u10, Function1 function1, Function1 function12) {
        if (!(q0Var.c() instanceof C)) {
            return null;
        }
        Pair pairB = E.b(f22584e.a(((C) q0Var.c()).p(), q0Var.f(), q0Var.d()), q0Var, this.f22586a, u10, function12);
        List list = (List) pairB.getFirst();
        Object second = pairB.getSecond();
        if (list == null) {
            return new t0.b(second, false, 2, null);
        }
        C2478m c2478m = new C2478m(list, second, q0Var, this.f22586a, function1, u10);
        AbstractC1617k.d(this.f22587b, null, Gf.Q.f7532d, new b(c2478m, null), 1, null);
        return new t0.a(c2478m);
    }

    public /* synthetic */ D(C2479n c2479n, Zd.i iVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C2479n() : c2479n, (i10 & 2) != 0 ? Zd.j.f23275a : iVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends Zd.a implements Gf.L {
        public c(L.b bVar) {
            super(bVar);
        }

        @Override // Gf.L
        public void z(Zd.i iVar, Throwable th2) {
        }
    }
}
