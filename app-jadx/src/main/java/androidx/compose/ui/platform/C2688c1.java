package androidx.compose.ui.platform;

import Y0.AbstractC2485u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import g1.C4821a;
import g1.C4831k;
import i1.C5029v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import u0.AbstractC6712g;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2688c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f27421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f27422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Y0.L f27423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Y0.H f27424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Y0.I f27425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AbstractC2485u f27426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f27427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f27428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4821a f27429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g1.q f27430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c1.e f27431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f27432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C4831k f27433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private s0.C1 f27434n;

    public /* synthetic */ C2688c1(long j10, long j11, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j12, C4821a c4821a, g1.q qVar, c1.e eVar, long j13, C4831k c4831k, s0.C1 c12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, l10, h10, i10, abstractC2485u, str, j12, c4821a, qVar, eVar, j13, c4831k, c12);
    }

    public final void a(long j10) {
        this.f27432l = j10;
    }

    public final void b(C4821a c4821a) {
        this.f27429i = c4821a;
    }

    public final void c(long j10) {
        this.f27421a = j10;
    }

    public final void d(String str) {
        this.f27427g = str;
    }

    public final void e(long j10) {
        this.f27422b = j10;
    }

    public final void f(Y0.H h10) {
        this.f27424d = h10;
    }

    public final void g(Y0.I i10) {
        this.f27425e = i10;
    }

    public final void h(Y0.L l10) {
        this.f27423c = l10;
    }

    public final void i(long j10) {
        this.f27428h = j10;
    }

    public final void j(s0.C1 c12) {
        this.f27434n = c12;
    }

    public final void k(C4831k c4831k) {
        this.f27433m = c4831k;
    }

    public final void l(g1.q qVar) {
        this.f27430j = qVar;
    }

    public final U0.I0 m() {
        return new U0.I0(this.f27421a, this.f27422b, this.f27423c, this.f27424d, this.f27425e, this.f27426f, this.f27427g, this.f27428h, this.f27429i, this.f27430j, this.f27431k, this.f27432l, this.f27433m, this.f27434n, (U0.F) null, (AbstractC6712g) null, 49152, (DefaultConstructorMarker) null);
    }

    private C2688c1(long j10, long j11, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j12, C4821a c4821a, g1.q qVar, c1.e eVar, long j13, C4831k c4831k, s0.C1 c12) {
        this.f27421a = j10;
        this.f27422b = j11;
        this.f27423c = l10;
        this.f27424d = h10;
        this.f27425e = i10;
        this.f27426f = abstractC2485u;
        this.f27427g = str;
        this.f27428h = j12;
        this.f27429i = c4821a;
        this.f27430j = qVar;
        this.f27431k = eVar;
        this.f27432l = j13;
        this.f27433m = c4831k;
        this.f27434n = c12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C2688c1(long j10, long j11, Y0.L l10, Y0.H h10, Y0.I i10, AbstractC2485u abstractC2485u, String str, long j12, C4821a c4821a, g1.q qVar, c1.e eVar, long j13, C4831k c4831k, s0.C1 c12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
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
        Y0.H h12 = h11;
        Y0.I i13 = i12;
        AbstractC2485u abstractC2485u3 = abstractC2485u2;
        String str3 = str2;
        long j16 = jA2;
        C4821a c4821a3 = c4821a2;
        g1.q qVar3 = qVar2;
        c1.e eVar3 = eVar2;
        long j17 = j15;
        this(j14, jA, l11, h12, i13, abstractC2485u3, str3, j16, c4821a3, qVar3, eVar3, j17, (i11 & 4096) != 0 ? null : c4831k, (i11 & 8192) != 0 ? null : c12, null);
    }
}
