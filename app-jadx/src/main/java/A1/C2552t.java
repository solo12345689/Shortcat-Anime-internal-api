package a1;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a1.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2552t {

    /* JADX INFO: renamed from: g */
    public static final a f23639g = new a(null);

    /* JADX INFO: renamed from: h */
    private static final C2552t f23640h = new C2552t(false, 0, false, 0, 0, null, null, 127, null);

    /* JADX INFO: renamed from: a */
    private final boolean f23641a;

    /* JADX INFO: renamed from: b */
    private final int f23642b;

    /* JADX INFO: renamed from: c */
    private final boolean f23643c;

    /* JADX INFO: renamed from: d */
    private final int f23644d;

    /* JADX INFO: renamed from: e */
    private final int f23645e;

    /* JADX INFO: renamed from: f */
    private final c1.e f23646f;

    /* JADX INFO: renamed from: a1.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2552t a() {
            return C2552t.f23640h;
        }

        private a() {
        }
    }

    public /* synthetic */ C2552t(boolean z10, int i10, boolean z11, int i11, int i12, AbstractC2519L abstractC2519L, c1.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, i10, z11, i11, i12, abstractC2519L, eVar);
    }

    public final boolean b() {
        return this.f23643c;
    }

    public final int c() {
        return this.f23642b;
    }

    public final c1.e d() {
        return this.f23646f;
    }

    public final int e() {
        return this.f23645e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2552t)) {
            return false;
        }
        C2552t c2552t = (C2552t) obj;
        return this.f23641a == c2552t.f23641a && C2557y.i(this.f23642b, c2552t.f23642b) && this.f23643c == c2552t.f23643c && C2558z.n(this.f23644d, c2552t.f23644d) && C2551s.m(this.f23645e, c2552t.f23645e) && AbstractC5504s.c(null, null) && AbstractC5504s.c(this.f23646f, c2552t.f23646f);
    }

    public final int f() {
        return this.f23644d;
    }

    public final AbstractC2519L g() {
        return null;
    }

    public final boolean h() {
        return this.f23641a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f23641a) * 31) + C2557y.j(this.f23642b)) * 31) + Boolean.hashCode(this.f23643c)) * 31) + C2558z.o(this.f23644d)) * 31) + C2551s.n(this.f23645e)) * 961) + this.f23646f.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f23641a + ", capitalization=" + ((Object) C2557y.k(this.f23642b)) + ", autoCorrect=" + this.f23643c + ", keyboardType=" + ((Object) C2558z.p(this.f23644d)) + ", imeAction=" + ((Object) C2551s.o(this.f23645e)) + ", platformImeOptions=" + ((Object) null) + ", hintLocales=" + this.f23646f + ')';
    }

    private C2552t(boolean z10, int i10, boolean z11, int i11, int i12, AbstractC2519L abstractC2519L, c1.e eVar) {
        this.f23641a = z10;
        this.f23642b = i10;
        this.f23643c = z11;
        this.f23644d = i11;
        this.f23645e = i12;
        this.f23646f = eVar;
    }

    public /* synthetic */ C2552t(boolean z10, int i10, boolean z11, int i11, int i12, AbstractC2519L abstractC2519L, c1.e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? C2557y.f23651b.b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? C2558z.f23658b.h() : i11, (i13 & 16) != 0 ? C2551s.f23628b.a() : i12, (i13 & 32) != 0 ? null : abstractC2519L, (i13 & 64) != 0 ? c1.e.f33423c.b() : eVar, null);
    }
}
