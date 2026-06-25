package a1;

import U0.A0;
import U0.C2197e;
import U0.InterfaceC2228u;
import U0.W0;
import U0.X0;
import Ud.AbstractC2279u;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a1.U */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2527U {

    /* JADX INFO: renamed from: d */
    public static final a f23541d = new a(null);

    /* JADX INFO: renamed from: e */
    private static final h0.v f23542e = h0.y.e(new Function2() { // from class: a1.S
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C2527U.c((h0.z) obj, (C2527U) obj2);
        }
    }, new Function1() { // from class: a1.T
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C2527U.d(obj);
        }
    });

    /* JADX INFO: renamed from: a */
    private final C2197e f23543a;

    /* JADX INFO: renamed from: b */
    private final long f23544b;

    /* JADX INFO: renamed from: c */
    private final W0 f23545c;

    /* JADX INFO: renamed from: a1.U$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C2527U(C2197e c2197e, long j10, W0 w02, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, j10, w02);
    }

    public static final Object c(h0.z zVar, C2527U c2527u) {
        return AbstractC2279u.g(A0.a1(c2527u.f23543a, A0.L0(), zVar), A0.a1(W0.b(c2527u.f23544b), A0.M0(W0.f18785b), zVar));
    }

    public static final C2527U d(Object obj) {
        AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        h0.v vVarL0 = A0.L0();
        Boolean bool = Boolean.FALSE;
        W0 w02 = null;
        C2197e c2197e = ((!AbstractC5504s.c(obj2, bool) || (vVarL0 instanceof InterfaceC2228u)) && obj2 != null) ? (C2197e) vVarL0.b(obj2) : null;
        AbstractC5504s.e(c2197e);
        Object obj3 = list.get(1);
        h0.v vVarM0 = A0.M0(W0.f18785b);
        if ((!AbstractC5504s.c(obj3, bool) || (vVarM0 instanceof InterfaceC2228u)) && obj3 != null) {
            w02 = (W0) vVarM0.b(obj3);
        }
        AbstractC5504s.e(w02);
        return new C2527U(c2197e, w02.r(), (W0) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C2527U g(C2527U c2527u, C2197e c2197e, long j10, W0 w02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c2197e = c2527u.f23543a;
        }
        if ((i10 & 2) != 0) {
            j10 = c2527u.f23544b;
        }
        if ((i10 & 4) != 0) {
            w02 = c2527u.f23545c;
        }
        return c2527u.e(c2197e, j10, w02);
    }

    public static /* synthetic */ C2527U h(C2527U c2527u, String str, long j10, W0 w02, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = c2527u.f23544b;
        }
        if ((i10 & 4) != 0) {
            w02 = c2527u.f23545c;
        }
        return c2527u.f(str, j10, w02);
    }

    public final C2527U e(C2197e c2197e, long j10, W0 w02) {
        return new C2527U(c2197e, j10, w02, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2527U)) {
            return false;
        }
        C2527U c2527u = (C2527U) obj;
        return W0.g(this.f23544b, c2527u.f23544b) && AbstractC5504s.c(this.f23545c, c2527u.f23545c) && AbstractC5504s.c(this.f23543a, c2527u.f23543a);
    }

    public final C2527U f(String str, long j10, W0 w02) {
        return new C2527U(new C2197e(str, null, 2, null), j10, w02, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        int iHashCode = ((this.f23543a.hashCode() * 31) + W0.o(this.f23544b)) * 31;
        W0 w02 = this.f23545c;
        return iHashCode + (w02 != null ? W0.o(w02.r()) : 0);
    }

    public final C2197e i() {
        return this.f23543a;
    }

    public final W0 j() {
        return this.f23545c;
    }

    public final long k() {
        return this.f23544b;
    }

    public final String l() {
        return this.f23543a.j();
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f23543a) + "', selection=" + ((Object) W0.q(this.f23544b)) + ", composition=" + this.f23545c + ')';
    }

    public /* synthetic */ C2527U(String str, long j10, W0 w02, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, w02);
    }

    private C2527U(C2197e c2197e, long j10, W0 w02) {
        this.f23543a = c2197e;
        this.f23544b = X0.c(j10, 0, l().length());
        this.f23545c = w02 != null ? W0.b(X0.c(w02.r(), 0, l().length())) : null;
    }

    public /* synthetic */ C2527U(C2197e c2197e, long j10, W0 w02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, (i10 & 2) != 0 ? W0.f18785b.a() : j10, (i10 & 4) != 0 ? null : w02, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ C2527U(String str, long j10, W0 w02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? W0.f18785b.a() : j10, (i10 & 4) != 0 ? null : w02, (DefaultConstructorMarker) null);
    }

    private C2527U(String str, long j10, W0 w02) {
        this(new C2197e(str, null, 2, null), j10, w02, (DefaultConstructorMarker) null);
    }
}
