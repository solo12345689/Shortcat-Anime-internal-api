package l6;

import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;
import l6.InterfaceC5557b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f52635A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f52636B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f52637C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f52638D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f52639E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f52640F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Throwable f52641G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private e f52642H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private n f52643I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f52644J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f52645K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private InterfaceC5557b.a f52646L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f52647s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f52648t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Object f52649u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f52650v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f52651w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f52652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f52653y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f52654z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k infra) {
        super(infra);
        AbstractC5504s.h(infra, "infra");
        this.f52652x = -1L;
        this.f52653y = -1L;
        this.f52654z = -1L;
        this.f52635A = -1L;
        this.f52636B = -1L;
        this.f52637C = -1L;
        this.f52639E = -1;
        this.f52640F = -1;
        this.f52642H = e.f52567d;
        this.f52643I = n.f52664d;
        this.f52644J = -1L;
        this.f52645K = -1L;
    }

    public final void A(long j10) {
        this.f52654z = j10;
    }

    public final void B(String str) {
        this.f52647s = str;
    }

    public final void C(long j10) {
        this.f52653y = j10;
    }

    public final void D(long j10) {
        this.f52652x = j10;
    }

    public final void E(Throwable th2) {
        this.f52641G = th2;
    }

    public final void F(InterfaceC5557b.a aVar) {
        this.f52646L = aVar;
    }

    public final void G(Object obj) {
        this.f52651w = obj;
    }

    public final void H(e eVar) {
        AbstractC5504s.h(eVar, "<set-?>");
        this.f52642H = eVar;
    }

    public final void I(Object obj) {
        this.f52649u = obj;
    }

    public final void J(long j10) {
        this.f52637C = j10;
    }

    public final void K(long j10) {
        this.f52636B = j10;
    }

    public final void L(long j10) {
        this.f52645K = j10;
    }

    public final void M(int i10) {
        this.f52640F = i10;
    }

    public final void N(int i10) {
        this.f52639E = i10;
    }

    public final void O(boolean z10) {
        this.f52638D = z10;
    }

    public final void P(String str) {
        this.f52648t = str;
    }

    public final void Q(long j10) {
        this.f52644J = j10;
    }

    public final void R(boolean z10) {
        this.f52643I = z10 ? n.f52665e : n.f52666f;
    }

    public final f S() {
        return new f(j(), this.f52647s, this.f52648t, this.f52649u, this.f52650v, this.f52651w, this.f52652x, this.f52653y, this.f52654z, this.f52635A, this.f52636B, this.f52637C, f(), n(), this.f52638D, this.f52639E, this.f52640F, this.f52641G, this.f52643I, this.f52644J, this.f52645K, null, this.f52646L, a(), o(), c(), d(), b(), r(), q(), l(), p(), AbstractC2279u.b1(k()), m(), h(), i(), g(), e());
    }

    public final void w() {
        this.f52648t = null;
        this.f52649u = null;
        this.f52650v = null;
        this.f52651w = null;
        this.f52638D = false;
        this.f52639E = -1;
        this.f52640F = -1;
        this.f52641G = null;
        this.f52642H = e.f52567d;
        this.f52643I = n.f52664d;
        this.f52646L = null;
        x();
        s();
    }

    public final void x() {
        this.f52636B = -1L;
        this.f52637C = -1L;
        this.f52652x = -1L;
        this.f52654z = -1L;
        this.f52635A = -1L;
        this.f52644J = -1L;
        this.f52645K = -1L;
        k().clear();
        u(false);
        t(null);
        v(null);
    }

    public final void y(Object obj) {
        this.f52650v = obj;
    }

    public final void z(long j10) {
        this.f52635A = j10;
    }
}
