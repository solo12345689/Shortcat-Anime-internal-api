package If;

import If.k;
import Lf.Q;
import Td.AbstractC2156g;
import Td.L;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class r extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f9169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final a f9170n;

    public r(int i10, a aVar, Function1 function1) {
        super(i10, function1);
        this.f9169m = i10;
        this.f9170n = aVar;
        if (aVar == a.f9114a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + O.b(e.class).v() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ Object d1(r rVar, Object obj, Zd.e eVar) throws Throwable {
        Q qC;
        Object objF1 = rVar.f1(obj, true);
        if (!(objF1 instanceof k.a)) {
            return L.f17438a;
        }
        k.e(objF1);
        Function1 function1 = rVar.f9134b;
        if (function1 == null || (qC = Lf.x.c(function1, obj, null, 2, null)) == null) {
            throw rVar.c0();
        }
        AbstractC2156g.a(qC, rVar.c0());
        throw qC;
    }

    private final Object e1(Object obj, boolean z10) {
        Function1 function1;
        Q qC;
        Object objD = super.d(obj);
        if (k.i(objD) || k.h(objD)) {
            return objD;
        }
        if (!z10 || (function1 = this.f9134b) == null || (qC = Lf.x.c(function1, obj, null, 2, null)) == null) {
            return k.f9163b.c(L.f17438a);
        }
        throw qC;
    }

    private final Object f1(Object obj, boolean z10) {
        return this.f9170n == a.f9116c ? e1(obj, z10) : T0(obj);
    }

    @Override // If.e, If.w
    public Object d(Object obj) {
        return f1(obj, false);
    }

    @Override // If.e, If.w
    public Object e(Object obj, Zd.e eVar) {
        return d1(this, obj, eVar);
    }

    @Override // If.e
    protected boolean q0() {
        return this.f9170n == a.f9115b;
    }
}
