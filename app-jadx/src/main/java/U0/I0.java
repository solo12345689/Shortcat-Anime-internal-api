package U0;

import U0.C2197e;
import Y0.AbstractC2485u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g1.C4821a;
import g1.C4831k;
import i1.C5029v;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;
import s0.C1;
import s0.C6385r0;
import u0.AbstractC6712g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class I0 implements C2197e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1.p f18732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y0.L f18734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Y0.H f18735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y0.I f18736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC2485u f18737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f18738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f18739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C4821a f18740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g1.q f18741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c1.e f18742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f18743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C4831k f18744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1 f18745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final F f18746o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC6712g f18747p;

    public /* synthetic */ I0(long j10, long j11, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j12, C4821a c4821a, g1.q qVar, c1.e eVar, long j13, C4831k c4831k, C1 c12, F f10, AbstractC6712g abstractC6712g, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, l10, h10, i10, abstractC2485u, str, j12, c4821a, qVar, eVar, j13, c4831k, c12, f10, abstractC6712g);
    }

    public static /* synthetic */ I0 b(I0 i02, long j10, long j11, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j12, C4821a c4821a, g1.q qVar, c1.e eVar, long j13, C4831k c4831k, C1 c12, F f10, AbstractC6712g abstractC6712g, int i11, Object obj) {
        long jG = (i11 & 1) != 0 ? i02.g() : j10;
        return i02.a(jG, (i11 & 2) != 0 ? i02.f18733b : j11, (i11 & 4) != 0 ? i02.f18734c : l10, (i11 & 8) != 0 ? i02.f18735d : h10, (i11 & 16) != 0 ? i02.f18736e : i10, (i11 & 32) != 0 ? i02.f18737f : abstractC2485u, (i11 & 64) != 0 ? i02.f18738g : str, (i11 & 128) != 0 ? i02.f18739h : j12, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? i02.f18740i : c4821a, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? i02.f18741j : qVar, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? i02.f18742k : eVar, (i11 & 2048) != 0 ? i02.f18743l : j13, (i11 & 4096) != 0 ? i02.f18744m : c4831k, (i11 & 8192) != 0 ? i02.f18745n : c12, (i11 & 16384) != 0 ? i02.f18746o : f10, (i11 & 32768) != 0 ? i02.f18747p : abstractC6712g);
    }

    public final I0 a(long j10, long j11, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j12, C4821a c4821a, g1.q qVar, c1.e eVar, long j13, C4831k c4831k, C1 c12, F f10, AbstractC6712g abstractC6712g) {
        return new I0(C6385r0.s(j10, g()) ? this.f18732a : g1.p.f47302a.b(j10), j11, l10, h10, i10, abstractC2485u, str, j12, c4821a, qVar, eVar, j13, c4831k, c12, f10, abstractC6712g, (DefaultConstructorMarker) null);
    }

    public final float c() {
        return this.f18732a.a();
    }

    public final long d() {
        return this.f18743l;
    }

    public final C4821a e() {
        return this.f18740i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i02 = (I0) obj;
        return v(i02) && w(i02);
    }

    public final AbstractC6358h0 f() {
        return this.f18732a.i();
    }

    public final long g() {
        return this.f18732a.b();
    }

    public final AbstractC6712g h() {
        return this.f18747p;
    }

    public int hashCode() {
        int iY = C6385r0.y(g()) * 31;
        AbstractC6358h0 abstractC6358h0F = f();
        int iHashCode = (((((iY + (abstractC6358h0F != null ? abstractC6358h0F.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + C5029v.i(this.f18733b)) * 31;
        Y0.L l10 = this.f18734c;
        int iHashCode2 = (iHashCode + (l10 != null ? l10.hashCode() : 0)) * 31;
        Y0.H h10 = this.f18735d;
        int iG = (iHashCode2 + (h10 != null ? Y0.H.g(h10.i()) : 0)) * 31;
        Y0.I i10 = this.f18736e;
        int i11 = (iG + (i10 != null ? Y0.I.i(i10.m()) : 0)) * 31;
        AbstractC2485u abstractC2485u = this.f18737f;
        int iHashCode3 = (i11 + (abstractC2485u != null ? abstractC2485u.hashCode() : 0)) * 31;
        String str = this.f18738g;
        int iHashCode4 = (((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C5029v.i(this.f18739h)) * 31;
        C4821a c4821a = this.f18740i;
        int iF = (iHashCode4 + (c4821a != null ? C4821a.f(c4821a.h()) : 0)) * 31;
        g1.q qVar = this.f18741j;
        int iHashCode5 = (iF + (qVar != null ? qVar.hashCode() : 0)) * 31;
        c1.e eVar = this.f18742k;
        int iHashCode6 = (((iHashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31) + C6385r0.y(this.f18743l)) * 31;
        C4831k c4831k = this.f18744m;
        int iHashCode7 = (iHashCode6 + (c4831k != null ? c4831k.hashCode() : 0)) * 31;
        C1 c12 = this.f18745n;
        int iHashCode8 = (iHashCode7 + (c12 != null ? c12.hashCode() : 0)) * 31;
        F f10 = this.f18746o;
        int iHashCode9 = (iHashCode8 + (f10 != null ? f10.hashCode() : 0)) * 31;
        AbstractC6712g abstractC6712g = this.f18747p;
        return iHashCode9 + (abstractC6712g != null ? abstractC6712g.hashCode() : 0);
    }

    public final AbstractC2485u i() {
        return this.f18737f;
    }

    public final String j() {
        return this.f18738g;
    }

    public final long k() {
        return this.f18733b;
    }

    public final Y0.H l() {
        return this.f18735d;
    }

    public final Y0.I m() {
        return this.f18736e;
    }

    public final Y0.L n() {
        return this.f18734c;
    }

    public final long o() {
        return this.f18739h;
    }

    public final c1.e p() {
        return this.f18742k;
    }

    public final F q() {
        return this.f18746o;
    }

    public final C1 r() {
        return this.f18745n;
    }

    public final C4831k s() {
        return this.f18744m;
    }

    public final g1.p t() {
        return this.f18732a;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) C6385r0.z(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) C5029v.j(this.f18733b)) + ", fontWeight=" + this.f18734c + ", fontStyle=" + this.f18735d + ", fontSynthesis=" + this.f18736e + ", fontFamily=" + this.f18737f + ", fontFeatureSettings=" + this.f18738g + ", letterSpacing=" + ((Object) C5029v.j(this.f18739h)) + ", baselineShift=" + this.f18740i + ", textGeometricTransform=" + this.f18741j + ", localeList=" + this.f18742k + ", background=" + ((Object) C6385r0.z(this.f18743l)) + ", textDecoration=" + this.f18744m + ", shadow=" + this.f18745n + ", platformStyle=" + this.f18746o + ", drawStyle=" + this.f18747p + ')';
    }

    public final g1.q u() {
        return this.f18741j;
    }

    public final boolean v(I0 i02) {
        if (this == i02) {
            return true;
        }
        return C5029v.e(this.f18733b, i02.f18733b) && AbstractC5504s.c(this.f18734c, i02.f18734c) && AbstractC5504s.c(this.f18735d, i02.f18735d) && AbstractC5504s.c(this.f18736e, i02.f18736e) && AbstractC5504s.c(this.f18737f, i02.f18737f) && AbstractC5504s.c(this.f18738g, i02.f18738g) && C5029v.e(this.f18739h, i02.f18739h) && AbstractC5504s.c(this.f18740i, i02.f18740i) && AbstractC5504s.c(this.f18741j, i02.f18741j) && AbstractC5504s.c(this.f18742k, i02.f18742k) && C6385r0.s(this.f18743l, i02.f18743l) && AbstractC5504s.c(this.f18746o, i02.f18746o);
    }

    public final boolean w(I0 i02) {
        return AbstractC5504s.c(this.f18732a, i02.f18732a) && AbstractC5504s.c(this.f18744m, i02.f18744m) && AbstractC5504s.c(this.f18745n, i02.f18745n) && AbstractC5504s.c(this.f18747p, i02.f18747p);
    }

    public final I0 x(I0 i02) {
        return i02 == null ? this : K0.b(this, i02.f18732a.b(), i02.f18732a.i(), i02.f18732a.a(), i02.f18733b, i02.f18734c, i02.f18735d, i02.f18736e, i02.f18737f, i02.f18738g, i02.f18739h, i02.f18740i, i02.f18741j, i02.f18742k, i02.f18743l, i02.f18744m, i02.f18745n, i02.f18746o, i02.f18747p);
    }

    public final I0 y(I0 i02) {
        return x(i02);
    }

    public /* synthetic */ I0(g1.p pVar, long j10, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j11, C4821a c4821a, g1.q qVar, c1.e eVar, long j12, C4831k c4831k, C1 c12, F f10, AbstractC6712g abstractC6712g, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, j10, l10, h10, i10, abstractC2485u, str, j11, c4821a, qVar, eVar, j12, c4831k, c12, f10, abstractC6712g);
    }

    public /* synthetic */ I0(AbstractC6358h0 abstractC6358h0, float f10, long j10, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j11, C4821a c4821a, g1.q qVar, c1.e eVar, long j12, C4831k c4831k, C1 c12, F f11, AbstractC6712g abstractC6712g, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6358h0, f10, j10, l10, h10, i10, abstractC2485u, str, j11, c4821a, qVar, eVar, j12, c4831k, c12, f11, abstractC6712g);
    }

    private I0(g1.p pVar, long j10, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j11, C4821a c4821a, g1.q qVar, c1.e eVar, long j12, C4831k c4831k, C1 c12, F f10, AbstractC6712g abstractC6712g) {
        this.f18732a = pVar;
        this.f18733b = j10;
        this.f18734c = l10;
        this.f18735d = h10;
        this.f18736e = i10;
        this.f18737f = abstractC2485u;
        this.f18738g = str;
        this.f18739h = j11;
        this.f18740i = c4821a;
        this.f18741j = qVar;
        this.f18742k = eVar;
        this.f18743l = j12;
        this.f18744m = c4831k;
        this.f18745n = c12;
        this.f18746o = f10;
        this.f18747p = abstractC6712g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ I0(long j10, long j11, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j12, C4821a c4821a, g1.q qVar, c1.e eVar, long j13, C4831k c4831k, C1 c12, F f10, AbstractC6712g abstractC6712g, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        long j14 = (i11 & 1) != 0 ? C6385r0.f58985b.j() : j10;
        long jA = (i11 & 2) != 0 ? C5029v.f48578b.a() : j11;
        Y0.L l11 = (i11 & 4) != 0 ? null : l10;
        Y0.H h11 = (i11 & 8) != 0 ? null : h10;
        Y0.I i12 = (i11 & 16) != 0 ? null : i10;
        AbstractC2485u abstractC2485u2 = (i11 & 32) != 0 ? null : abstractC2485u;
        String str2 = (i11 & 64) != 0 ? null : str;
        long jA2 = (i11 & 128) != 0 ? C5029v.f48578b.a() : j12;
        C4821a c4821a2 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : c4821a;
        g1.q qVar2 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : qVar;
        c1.e eVar2 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : eVar;
        long j15 = (i11 & 2048) != 0 ? C6385r0.f58985b.j() : j13;
        C4831k c4831k2 = (i11 & 4096) != 0 ? null : c4831k;
        long j16 = j14;
        C1 c13 = (i11 & 8192) != 0 ? null : c12;
        F f11 = (i11 & 16384) != 0 ? null : f10;
        long j17 = jA;
        Y0.L l12 = l11;
        C4831k c4831k3 = c4831k2;
        Y0.H h12 = h11;
        Y0.I i13 = i12;
        AbstractC2485u abstractC2485u3 = abstractC2485u2;
        String str3 = str2;
        long j18 = jA2;
        C4821a c4821a3 = c4821a2;
        g1.q qVar3 = qVar2;
        c1.e eVar3 = eVar2;
        long j19 = j15;
        this(j16, j17, l12, h12, i13, abstractC2485u3, str3, j18, c4821a3, qVar3, eVar3, j19, c4831k3, c13, f11, (i11 & 32768) != 0 ? null : abstractC6712g, (DefaultConstructorMarker) null);
    }

    private I0(long j10, long j11, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j12, C4821a c4821a, g1.q qVar, c1.e eVar, long j13, C4831k c4831k, C1 c12, F f10, AbstractC6712g abstractC6712g) {
        this(g1.p.f47302a.b(j10), j11, l10, h10, i10, abstractC2485u, str, j12, c4821a, qVar, eVar, j13, c4831k, c12, f10, abstractC6712g, (DefaultConstructorMarker) null);
    }

    private I0(AbstractC6358h0 abstractC6358h0, float f10, long j10, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j11, C4821a c4821a, g1.q qVar, c1.e eVar, long j12, C4831k c4831k, C1 c12, F f11, AbstractC6712g abstractC6712g) {
        this(g1.p.f47302a.a(abstractC6358h0, f10), j10, l10, h10, i10, abstractC2485u, str, j11, c4821a, qVar, eVar, j12, c4831k, c12, f11, abstractC6712g, (DefaultConstructorMarker) null);
    }
}
