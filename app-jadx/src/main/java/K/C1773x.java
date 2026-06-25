package K;

import a1.AbstractC2519L;
import a1.C2551s;
import a1.C2552t;
import a1.C2557y;
import a1.C2558z;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: K.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1773x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f10349g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C1773x f10350h = new C1773x(0, null, 0, 0, null, null, null, 127, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C1773x f10351i = new C1773x(0, Boolean.FALSE, C2558z.f23658b.f(), 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 121, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f10353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Boolean f10356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c1.e f10357f;

    /* JADX INFO: renamed from: K.x$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1773x a() {
            return C1773x.f10350h;
        }

        private a() {
        }
    }

    public /* synthetic */ C1773x(int i10, Boolean bool, int i11, int i12, AbstractC2519L abstractC2519L, Boolean bool2, c1.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bool, i11, i12, abstractC2519L, bool2, eVar);
    }

    private final boolean b() {
        Boolean bool = this.f10353b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final int c() {
        C2557y c2557yF = C2557y.f(this.f10352a);
        int iL = c2557yF.l();
        C2557y.a aVar = C2557y.f23651b;
        if (C2557y.i(iL, aVar.d())) {
            c2557yF = null;
        }
        return c2557yF != null ? c2557yF.l() : aVar.b();
    }

    private final c1.e d() {
        c1.e eVar = this.f10357f;
        return eVar == null ? c1.e.f33423c.b() : eVar;
    }

    private final int f() {
        C2558z c2558zK = C2558z.k(this.f10354c);
        int iQ = c2558zK.q();
        C2558z.a aVar = C2558z.f23658b;
        if (C2558z.n(iQ, aVar.i())) {
            c2558zK = null;
        }
        return c2558zK != null ? c2558zK.q() : aVar.h();
    }

    public final int e() {
        C2551s c2551sJ = C2551s.j(this.f10355d);
        int iP = c2551sJ.p();
        C2551s.a aVar = C2551s.f23628b;
        if (C2551s.m(iP, aVar.i())) {
            c2551sJ = null;
        }
        return c2551sJ != null ? c2551sJ.p() : aVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1773x)) {
            return false;
        }
        C1773x c1773x = (C1773x) obj;
        return C2557y.i(this.f10352a, c1773x.f10352a) && AbstractC5504s.c(this.f10353b, c1773x.f10353b) && C2558z.n(this.f10354c, c1773x.f10354c) && C2551s.m(this.f10355d, c1773x.f10355d) && AbstractC5504s.c(null, null) && AbstractC5504s.c(this.f10356e, c1773x.f10356e) && AbstractC5504s.c(this.f10357f, c1773x.f10357f);
    }

    public final C2552t g(boolean z10) {
        return new C2552t(z10, c(), b(), f(), e(), null, d(), null);
    }

    public int hashCode() {
        int iJ = C2557y.j(this.f10352a) * 31;
        Boolean bool = this.f10353b;
        int iHashCode = (((((iJ + (bool != null ? bool.hashCode() : 0)) * 31) + C2558z.o(this.f10354c)) * 31) + C2551s.n(this.f10355d)) * 961;
        Boolean bool2 = this.f10356e;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        c1.e eVar = this.f10357f;
        return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C2557y.k(this.f10352a)) + ", autoCorrectEnabled=" + this.f10353b + ", keyboardType=" + ((Object) C2558z.p(this.f10354c)) + ", imeAction=" + ((Object) C2551s.o(this.f10355d)) + ", platformImeOptions=" + ((Object) null) + "showKeyboardOnFocus=" + this.f10356e + ", hintLocales=" + this.f10357f + ')';
    }

    private C1773x(int i10, Boolean bool, int i11, int i12, AbstractC2519L abstractC2519L, Boolean bool2, c1.e eVar) {
        this.f10352a = i10;
        this.f10353b = bool;
        this.f10354c = i11;
        this.f10355d = i12;
        this.f10356e = bool2;
        this.f10357f = eVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1773x(int i10, Boolean bool, int i11, int i12, AbstractC2519L abstractC2519L, Boolean bool2, c1.e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int iD = (i13 & 1) != 0 ? C2557y.f23651b.d() : i10;
        Boolean bool3 = (i13 & 2) != 0 ? null : bool;
        int i14 = (i13 & 4) != 0 ? C2558z.f23658b.i() : i11;
        int i15 = (i13 & 8) != 0 ? C2551s.f23628b.i() : i12;
        AbstractC2519L abstractC2519L2 = (i13 & 16) != 0 ? null : abstractC2519L;
        Boolean bool4 = (i13 & 32) != 0 ? null : bool2;
        this(iD, bool3, i14, i15, abstractC2519L2, bool4, (i13 & 64) == 0 ? eVar : null, null);
    }
}
