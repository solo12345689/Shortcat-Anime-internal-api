package U0;

import g1.EnumC4829i;
import i1.C5025r;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C6226h;
import s0.InterfaceC6374m1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class T0 {

    /* JADX INFO: renamed from: g */
    public static final int f18773g = 8;

    /* JADX INFO: renamed from: a */
    private final S0 f18774a;

    /* JADX INFO: renamed from: b */
    private final C2215n f18775b;

    /* JADX INFO: renamed from: c */
    private final long f18776c;

    /* JADX INFO: renamed from: d */
    private final float f18777d;

    /* JADX INFO: renamed from: e */
    private final float f18778e;

    /* JADX INFO: renamed from: f */
    private final List f18779f;

    public /* synthetic */ T0(S0 s02, C2215n c2215n, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s02, c2215n, j10);
    }

    public static /* synthetic */ T0 b(T0 t02, S0 s02, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            s02 = t02.f18774a;
        }
        if ((i10 & 2) != 0) {
            j10 = t02.f18776c;
        }
        return t02.a(s02, j10);
    }

    public static /* synthetic */ int p(T0 t02, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return t02.o(i10, z10);
    }

    public final List A() {
        return this.f18779f;
    }

    public final long B() {
        return this.f18776c;
    }

    public final long C(int i10) {
        return this.f18775b.F(i10);
    }

    public final boolean D(int i10) {
        return this.f18775b.G(i10);
    }

    public final T0 a(S0 s02, long j10) {
        return new T0(s02, this.f18775b, j10, null);
    }

    public final EnumC4829i c(int i10) {
        return this.f18775b.f(i10);
    }

    public final C6226h d(int i10) {
        return this.f18775b.g(i10);
    }

    public final C6226h e(int i10) {
        return this.f18775b.h(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T0)) {
            return false;
        }
        T0 t02 = (T0) obj;
        return AbstractC5504s.c(this.f18774a, t02.f18774a) && AbstractC5504s.c(this.f18775b, t02.f18775b) && C5025r.e(this.f18776c, t02.f18776c) && this.f18777d == t02.f18777d && this.f18778e == t02.f18778e && AbstractC5504s.c(this.f18779f, t02.f18779f);
    }

    public final boolean f() {
        return this.f18775b.i() || ((float) ((int) (this.f18776c & 4294967295L))) < this.f18775b.k();
    }

    public final boolean g() {
        return ((float) ((int) (this.f18776c >> 32))) < this.f18775b.E();
    }

    public final float h() {
        return this.f18777d;
    }

    public int hashCode() {
        return (((((((((this.f18774a.hashCode() * 31) + this.f18775b.hashCode()) * 31) + C5025r.h(this.f18776c)) * 31) + Float.hashCode(this.f18777d)) * 31) + Float.hashCode(this.f18778e)) * 31) + this.f18779f.hashCode();
    }

    public final boolean i() {
        return g() || f();
    }

    public final float j(int i10, boolean z10) {
        return this.f18775b.l(i10, z10);
    }

    public final float k() {
        return this.f18778e;
    }

    public final S0 l() {
        return this.f18774a;
    }

    public final float m(int i10) {
        return this.f18775b.o(i10);
    }

    public final int n() {
        return this.f18775b.p();
    }

    public final int o(int i10, boolean z10) {
        return this.f18775b.q(i10, z10);
    }

    public final int q(int i10) {
        return this.f18775b.r(i10);
    }

    public final int r(float f10) {
        return this.f18775b.s(f10);
    }

    public final float s(int i10) {
        return this.f18775b.t(i10);
    }

    public final float t(int i10) {
        return this.f18775b.u(i10);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.f18774a + ", multiParagraph=" + this.f18775b + ", size=" + ((Object) C5025r.i(this.f18776c)) + ", firstBaseline=" + this.f18777d + ", lastBaseline=" + this.f18778e + ", placeholderRects=" + this.f18779f + ')';
    }

    public final int u(int i10) {
        return this.f18775b.v(i10);
    }

    public final float v(int i10) {
        return this.f18775b.w(i10);
    }

    public final C2215n w() {
        return this.f18775b;
    }

    public final int x(long j10) {
        return this.f18775b.x(j10);
    }

    public final EnumC4829i y(int i10) {
        return this.f18775b.y(i10);
    }

    public final InterfaceC6374m1 z(int i10, int i11) {
        return this.f18775b.A(i10, i11);
    }

    private T0(S0 s02, C2215n c2215n, long j10) {
        this.f18774a = s02;
        this.f18775b = c2215n;
        this.f18776c = j10;
        this.f18777d = c2215n.j();
        this.f18778e = c2215n.n();
        this.f18779f = c2215n.C();
    }
}
