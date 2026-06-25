package I0;

import Y.B0;
import Y.C0;
import Y.InterfaceC2464z0;
import Y.M1;
import Y.W0;
import Y.b2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.compose.ui.layout.u f8679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.compose.ui.layout.u f8680g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f8674a = b2.e(Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f8675b = b2.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2464z0 f8676c = W0.a(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B0 f8677d = M1.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2464z0 f8678e = W0.a(1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8681h = S.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f8682i = S.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f8683j = S.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8684k = S.a();

    public T(String str) {
        this.f8679f = androidx.compose.ui.layout.w.a(str + " source");
        this.f8680g = androidx.compose.ui.layout.w.a(str + " target");
    }

    public final long a() {
        return this.f8681h;
    }

    public final long b() {
        return this.f8682i;
    }

    public androidx.compose.ui.layout.u c() {
        return this.f8679f;
    }

    public final long d() {
        return this.f8683j;
    }

    public androidx.compose.ui.layout.u e() {
        return this.f8680g;
    }

    public final long f() {
        return this.f8684k;
    }

    public boolean g() {
        return ((Boolean) this.f8675b.getValue()).booleanValue();
    }

    public void h(float f10) {
        this.f8678e.k(f10);
    }

    public void i(boolean z10) {
        this.f8675b.setValue(Boolean.valueOf(z10));
    }

    public final void j(long j10) {
        this.f8681h = j10;
    }

    public void k(long j10) {
        this.f8677d.m(j10);
    }

    public void l(float f10) {
        this.f8676c.k(f10);
    }

    public final void m(long j10) {
        this.f8682i = j10;
    }

    public final void n(long j10) {
        this.f8683j = j10;
    }

    public final void o(long j10) {
        this.f8684k = j10;
    }

    public void p(boolean z10) {
        this.f8674a.setValue(Boolean.valueOf(z10));
    }
}
