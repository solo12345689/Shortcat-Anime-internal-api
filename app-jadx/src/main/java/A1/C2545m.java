package a1;

import U0.C2197e;
import U0.W0;
import U0.X0;
import b1.AbstractC2968a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a1.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2545m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23617f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f23618g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2518K f23619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23623e;

    /* JADX INFO: renamed from: a1.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C2545m(C2197e c2197e, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2197e, j10);
    }

    private final void q(int i10) {
        if (!(i10 >= 0)) {
            AbstractC2968a.a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f23621c = i10;
    }

    private final void r(int i10) {
        if (!(i10 >= 0)) {
            AbstractC2968a.a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f23620b = i10;
    }

    public final void a() {
        this.f23622d = -1;
        this.f23623e = -1;
    }

    public final void b(int i10, int i11) {
        long jB = X0.b(i10, i11);
        this.f23619a.c(i10, i11, "");
        long jA = AbstractC2546n.a(X0.b(this.f23620b, this.f23621c), jB);
        r(W0.l(jA));
        q(W0.k(jA));
        if (l()) {
            long jA2 = AbstractC2546n.a(X0.b(this.f23622d, this.f23623e), jB);
            if (W0.h(jA2)) {
                a();
            } else {
                this.f23622d = W0.l(jA2);
                this.f23623e = W0.k(jA2);
            }
        }
    }

    public final char c(int i10) {
        return this.f23619a.a(i10);
    }

    public final W0 d() {
        if (l()) {
            return W0.b(X0.b(this.f23622d, this.f23623e));
        }
        return null;
    }

    public final int e() {
        return this.f23623e;
    }

    public final int f() {
        return this.f23622d;
    }

    public final int g() {
        int i10 = this.f23620b;
        int i11 = this.f23621c;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int h() {
        return this.f23619a.b();
    }

    public final long i() {
        return X0.b(this.f23620b, this.f23621c);
    }

    public final int j() {
        return this.f23621c;
    }

    public final int k() {
        return this.f23620b;
    }

    public final boolean l() {
        return this.f23622d != -1;
    }

    public final void m(int i10, int i11, String str) {
        if (i10 < 0 || i10 > this.f23619a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f23619a.b());
        }
        if (i11 < 0 || i11 > this.f23619a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f23619a.b());
        }
        if (i10 <= i11) {
            this.f23619a.c(i10, i11, str);
            r(str.length() + i10);
            q(i10 + str.length());
            this.f23622d = -1;
            this.f23623e = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
    }

    public final void n(int i10, int i11) {
        if (i10 < 0 || i10 > this.f23619a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f23619a.b());
        }
        if (i11 < 0 || i11 > this.f23619a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f23619a.b());
        }
        if (i10 < i11) {
            this.f23622d = i10;
            this.f23623e = i11;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
    }

    public final void o(int i10) {
        p(i10, i10);
    }

    public final void p(int i10, int i11) {
        if (i10 < 0 || i10 > this.f23619a.b()) {
            throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f23619a.b());
        }
        if (i11 < 0 || i11 > this.f23619a.b()) {
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f23619a.b());
        }
        if (i10 <= i11) {
            r(i10);
            q(i11);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
    }

    public final C2197e s() {
        return new C2197e(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return this.f23619a.toString();
    }

    private C2545m(C2197e c2197e, long j10) {
        this.f23619a = new C2518K(c2197e.j());
        this.f23620b = W0.l(j10);
        this.f23621c = W0.k(j10);
        this.f23622d = -1;
        this.f23623e = -1;
        int iL = W0.l(j10);
        int iK = W0.k(j10);
        if (iL < 0 || iL > c2197e.length()) {
            throw new IndexOutOfBoundsException("start (" + iL + ") offset is outside of text region " + c2197e.length());
        }
        if (iK < 0 || iK > c2197e.length()) {
            throw new IndexOutOfBoundsException("end (" + iK + ") offset is outside of text region " + c2197e.length());
        }
        if (iL <= iK) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + iL + " > " + iK);
    }
}
