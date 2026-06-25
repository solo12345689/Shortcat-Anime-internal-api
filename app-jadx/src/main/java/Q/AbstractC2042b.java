package Q;

import U0.C2197e;
import U0.T0;
import U0.W0;
import U0.X0;
import a1.InterfaceC2517J;
import g1.EnumC4829i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import r0.AbstractC6225g;

/* JADX INFO: renamed from: Q.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2042b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f14106h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f14107i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2197e f14108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f14109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T0 f14110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2517J f14111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I f14112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f14113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2197e f14114g;

    /* JADX INFO: renamed from: Q.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ AbstractC2042b(C2197e c2197e, long j10, T0 t02, InterfaceC2517J interfaceC2517J, I i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, j10, t02, interfaceC2517J, i10);
    }

    private final AbstractC2042b C() {
        int iL;
        v().b();
        if (w().length() > 0 && (iL = l()) != -1) {
            T(iL);
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final AbstractC2042b E() {
        Integer numM;
        v().b();
        if (w().length() > 0 && (numM = m()) != null) {
            T(numM.intValue());
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final AbstractC2042b F() {
        int iQ;
        v().b();
        if (w().length() > 0 && (iQ = q()) != -1) {
            T(iQ);
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final AbstractC2042b H() {
        Integer numT;
        v().b();
        if (w().length() > 0 && (numT = t()) != null) {
            T(numT.intValue());
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int V() {
        return this.f14111d.b(W0.i(this.f14113f));
    }

    private final int W() {
        return this.f14111d.b(W0.k(this.f14113f));
    }

    private final int X() {
        return this.f14111d.b(W0.l(this.f14113f));
    }

    private final int a(int i10) {
        return AbstractC5874j.i(i10, w().length() - 1);
    }

    private final int g(T0 t02, int i10) {
        return this.f14111d.a(t02.o(t02.q(i10), true));
    }

    static /* synthetic */ int h(AbstractC2042b abstractC2042b, T0 t02, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC2042b.W();
        }
        return abstractC2042b.g(t02, i10);
    }

    private final int j(T0 t02, int i10) {
        return this.f14111d.a(t02.u(t02.q(i10)));
    }

    static /* synthetic */ int k(AbstractC2042b abstractC2042b, T0 t02, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC2042b.X();
        }
        return abstractC2042b.j(t02, i10);
    }

    private final int n(T0 t02, int i10) {
        while (i10 < this.f14108a.length()) {
            long jC = t02.C(a(i10));
            if (W0.i(jC) > i10) {
                return this.f14111d.a(W0.i(jC));
            }
            i10++;
        }
        return this.f14108a.length();
    }

    static /* synthetic */ int o(AbstractC2042b abstractC2042b, T0 t02, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC2042b.V();
        }
        return abstractC2042b.n(t02, i10);
    }

    private final int r(T0 t02, int i10) {
        while (i10 > 0) {
            long jC = t02.C(a(i10));
            if (W0.n(jC) < i10) {
                return this.f14111d.a(W0.n(jC));
            }
            i10--;
        }
        return 0;
    }

    static /* synthetic */ int s(AbstractC2042b abstractC2042b, T0 t02, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC2042b.V();
        }
        return abstractC2042b.r(t02, i10);
    }

    private final boolean x() {
        T0 t02 = this.f14110c;
        return (t02 != null ? t02.y(V()) : null) != EnumC4829i.f47275b;
    }

    private final int y(T0 t02, int i10) {
        int iV = V();
        if (this.f14112e.a() == null) {
            this.f14112e.c(Float.valueOf(t02.e(iV).i()));
        }
        int iQ = t02.q(iV) + i10;
        if (iQ < 0) {
            return 0;
        }
        if (iQ >= t02.n()) {
            return w().length();
        }
        float fM = t02.m(iQ) - 1;
        Float fA = this.f14112e.a();
        AbstractC5504s.e(fA);
        float fFloatValue = fA.floatValue();
        if ((x() && fFloatValue >= t02.t(iQ)) || (!x() && fFloatValue <= t02.s(iQ))) {
            return t02.o(iQ, true);
        }
        return this.f14111d.a(t02.x(AbstractC6225g.a(fA.floatValue(), fM)));
    }

    public final AbstractC2042b A() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b B() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b D() {
        v().b();
        if (w().length() > 0) {
            int iA = K.C.a(w(), W0.k(this.f14113f));
            if (iA == W0.k(this.f14113f) && iA != w().length()) {
                iA = K.C.a(w(), iA + 1);
            }
            T(iA);
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b G() {
        v().b();
        if (w().length() > 0) {
            int iB = K.C.b(w(), W0.l(this.f14113f));
            if (iB == W0.l(this.f14113f) && iB != 0) {
                iB = K.C.b(w(), iB - 1);
            }
            T(iB);
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b I() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b J() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b K() {
        v().b();
        if (w().length() > 0) {
            T(w().length());
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b L() {
        v().b();
        if (w().length() > 0) {
            T(0);
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b M() {
        Integer numF;
        v().b();
        if (w().length() > 0 && (numF = f()) != null) {
            T(numF.intValue());
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b N() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b O() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b P() {
        Integer numI;
        v().b();
        if (w().length() > 0 && (numI = i()) != null) {
            T(numI.intValue());
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b Q() {
        T0 t02;
        if (w().length() > 0 && (t02 = this.f14110c) != null) {
            T(y(t02, -1));
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b R() {
        v().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b S() {
        if (w().length() > 0) {
            this.f14113f = X0.b(W0.n(this.f14109b), W0.i(this.f14113f));
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    protected final void T(int i10) {
        U(i10, i10);
    }

    protected final void U(int i10, int i11) {
        this.f14113f = X0.b(i10, i11);
    }

    public final AbstractC2042b b(Function1 function1) {
        v().b();
        if (w().length() > 0) {
            if (W0.h(this.f14113f)) {
                AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                function1.invoke(this);
            } else if (x()) {
                T(W0.l(this.f14113f));
            } else {
                T(W0.k(this.f14113f));
            }
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b c(Function1 function1) {
        v().b();
        if (w().length() > 0) {
            if (W0.h(this.f14113f)) {
                AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                function1.invoke(this);
            } else if (x()) {
                T(W0.k(this.f14113f));
            } else {
                T(W0.l(this.f14113f));
            }
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final AbstractC2042b d() {
        v().b();
        if (w().length() > 0) {
            T(W0.i(this.f14113f));
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C2197e e() {
        return this.f14114g;
    }

    public final Integer f() {
        T0 t02 = this.f14110c;
        if (t02 != null) {
            return Integer.valueOf(h(this, t02, 0, 1, null));
        }
        return null;
    }

    public final Integer i() {
        T0 t02 = this.f14110c;
        if (t02 != null) {
            return Integer.valueOf(k(this, t02, 0, 1, null));
        }
        return null;
    }

    public final int l() {
        return K.D.a(this.f14114g.j(), W0.i(this.f14113f));
    }

    public final Integer m() {
        T0 t02 = this.f14110c;
        if (t02 != null) {
            return Integer.valueOf(o(this, t02, 0, 1, null));
        }
        return null;
    }

    public final InterfaceC2517J p() {
        return this.f14111d;
    }

    public final int q() {
        return K.D.b(this.f14114g.j(), W0.i(this.f14113f));
    }

    public final Integer t() {
        T0 t02 = this.f14110c;
        if (t02 != null) {
            return Integer.valueOf(s(this, t02, 0, 1, null));
        }
        return null;
    }

    public final long u() {
        return this.f14113f;
    }

    public final I v() {
        return this.f14112e;
    }

    public final String w() {
        return this.f14114g.j();
    }

    public final AbstractC2042b z() {
        T0 t02;
        if (w().length() > 0 && (t02 = this.f14110c) != null) {
            T(y(t02, 1));
        }
        AbstractC5504s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private AbstractC2042b(C2197e c2197e, long j10, T0 t02, InterfaceC2517J interfaceC2517J, I i10) {
        this.f14108a = c2197e;
        this.f14109b = j10;
        this.f14110c = t02;
        this.f14111d = interfaceC2517J;
        this.f14112e = i10;
        this.f14113f = j10;
        this.f14114g = c2197e;
    }
}
