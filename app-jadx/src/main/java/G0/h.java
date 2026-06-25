package g0;

import Td.L;
import Y.AbstractC2409g1;
import Y.B1;
import Y.InterfaceC2400d1;
import Y.InterfaceC2425m;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.C5487a;
import kotlin.jvm.internal.V;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC4820b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f47186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f47187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC2400d1 f47188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f47189e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends C5487a implements Function2 {
        a(Object obj) {
            super(2, obj, h.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        public final void a(InterfaceC2425m interfaceC2425m, int i10) {
            ((h) this.receiver).h(interfaceC2425m, i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }
    }

    public h(int i10, boolean z10, Object obj) {
        this.f47185a = i10;
        this.f47186b = z10;
        this.f47187c = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L r(h hVar, Object obj, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        hVar.i(obj, interfaceC2425m, AbstractC2409g1.a(i10) | 1);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L s(h hVar, Object obj, Object obj2, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        hVar.j(obj, obj2, interfaceC2425m, AbstractC2409g1.a(i10) | 1);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L t(h hVar, Object obj, Object obj2, Object obj3, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        hVar.k(obj, obj2, obj3, interfaceC2425m, AbstractC2409g1.a(i10) | 1);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L u(h hVar, Object obj, Object obj2, Object obj3, Object obj4, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        hVar.n(obj, obj2, obj3, obj4, interfaceC2425m, AbstractC2409g1.a(i10) | 1);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L v(h hVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        hVar.p(obj, obj2, obj3, obj4, obj5, interfaceC2425m, AbstractC2409g1.a(i10) | 1);
        return L.f17438a;
    }

    private final void x(InterfaceC2425m interfaceC2425m) {
        InterfaceC2400d1 interfaceC2400d1A;
        if (!this.f47186b || (interfaceC2400d1A = interfaceC2425m.A()) == null) {
            return;
        }
        interfaceC2425m.v(interfaceC2400d1A);
        if (i.e(this.f47188d, interfaceC2400d1A)) {
            this.f47188d = interfaceC2400d1A;
            return;
        }
        List list = this.f47189e;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f47189e = arrayList;
            arrayList.add(interfaceC2400d1A);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i.e((InterfaceC2400d1) list.get(i10), interfaceC2400d1A)) {
                list.set(i10, interfaceC2400d1A);
                return;
            }
        }
        list.add(interfaceC2400d1A);
    }

    private final void y() {
        if (this.f47186b) {
            InterfaceC2400d1 interfaceC2400d1 = this.f47188d;
            if (interfaceC2400d1 != null) {
                interfaceC2400d1.invalidate();
                this.f47188d = null;
            }
            List list = this.f47189e;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC2400d1) list.get(i10)).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object h(InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(this.f47185a);
        x(interfaceC2425mG);
        int iC = i10 | (interfaceC2425mG.U(this) ? i.c(0) : i.f(0));
        Object obj = this.f47187c;
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function2) V.e(obj, 2)).invoke(interfaceC2425mG, Integer.valueOf(iC));
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new a(this));
        }
        return objInvoke;
    }

    public Object i(final Object obj, InterfaceC2425m interfaceC2425m, final int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(this.f47185a);
        x(interfaceC2425mG);
        int iC = interfaceC2425mG.U(this) ? i.c(1) : i.f(1);
        Object obj2 = this.f47187c;
        AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((InterfaceC5096o) V.e(obj2, 3)).invoke(obj, interfaceC2425mG, Integer.valueOf(iC | i10));
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new Function2() { // from class: g0.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return h.r(this.f47169a, obj, i10, (InterfaceC2425m) obj3, ((Integer) obj4).intValue());
                }
            });
        }
        return objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return h((InterfaceC2425m) obj, ((Number) obj2).intValue());
    }

    public Object j(final Object obj, final Object obj2, InterfaceC2425m interfaceC2425m, final int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(this.f47185a);
        x(interfaceC2425mG);
        int iC = interfaceC2425mG.U(this) ? i.c(2) : i.f(2);
        Object obj3 = this.f47187c;
        AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((ie.p) V.e(obj3, 4)).invoke(obj, obj2, interfaceC2425mG, Integer.valueOf(iC | i10));
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new Function2() { // from class: g0.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return h.s(this.f47160a, obj, obj2, i10, (InterfaceC2425m) obj4, ((Integer) obj5).intValue());
                }
            });
        }
        return objInvoke;
    }

    public Object k(final Object obj, final Object obj2, final Object obj3, InterfaceC2425m interfaceC2425m, final int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(this.f47185a);
        x(interfaceC2425mG);
        int iC = interfaceC2425mG.U(this) ? i.c(3) : i.f(3);
        Object obj4 = this.f47187c;
        AbstractC5504s.f(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((ie.q) V.e(obj4, 5)).invoke(obj, obj2, obj3, interfaceC2425mG, Integer.valueOf(iC | i10));
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new Function2() { // from class: g0.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return h.t(this.f47164a, obj, obj2, obj3, i10, (InterfaceC2425m) obj5, ((Integer) obj6).intValue());
                }
            });
        }
        return objInvoke;
    }

    @Override // ie.r
    public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return n(obj, obj2, obj3, obj4, (InterfaceC2425m) obj5, ((Number) obj6).intValue());
    }

    @Override // ie.s
    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return p(obj, obj2, obj3, obj4, obj5, (InterfaceC2425m) obj6, ((Number) obj7).intValue());
    }

    public Object n(final Object obj, final Object obj2, final Object obj3, final Object obj4, InterfaceC2425m interfaceC2425m, final int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(this.f47185a);
        x(interfaceC2425mG);
        int iC = interfaceC2425mG.U(this) ? i.c(4) : i.f(4);
        Object obj5 = this.f47187c;
        AbstractC5504s.f(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objL = ((ie.r) V.e(obj5, 6)).l(obj, obj2, obj3, obj4, interfaceC2425mG, Integer.valueOf(iC | i10));
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new Function2() { // from class: g0.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return h.u(this.f47179a, obj, obj2, obj3, obj4, i10, (InterfaceC2425m) obj6, ((Integer) obj7).intValue());
                }
            });
        }
        return objL;
    }

    public Object p(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, InterfaceC2425m interfaceC2425m, final int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(this.f47185a);
        x(interfaceC2425mG);
        int iC = interfaceC2425mG.U(this) ? i.c(5) : i.f(5);
        Object obj6 = this.f47187c;
        AbstractC5504s.f(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objM = ((ie.s) V.e(obj6, 7)).m(obj, obj2, obj3, obj4, obj5, interfaceC2425mG, Integer.valueOf(i10 | iC));
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new Function2() { // from class: g0.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return h.v(this.f47172a, obj, obj2, obj3, obj4, obj5, i10, (InterfaceC2425m) obj7, ((Integer) obj8).intValue());
                }
            });
        }
        return objM;
    }

    public final void z(Object obj) {
        if (AbstractC5504s.c(this.f47187c, obj)) {
            return;
        }
        boolean z10 = this.f47187c == null;
        this.f47187c = obj;
        if (z10) {
            return;
        }
        y();
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return i(obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
    }

    @Override // ie.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(obj, obj2, (InterfaceC2425m) obj3, ((Number) obj4).intValue());
    }

    @Override // ie.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return k(obj, obj2, obj3, (InterfaceC2425m) obj4, ((Number) obj5).intValue());
    }
}
