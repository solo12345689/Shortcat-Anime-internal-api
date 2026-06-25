package Q8;

import R8.AbstractC2115p;
import android.app.Activity;
import com.google.android.gms.common.C3333a;
import com.google.android.gms.common.ConnectionResult;
import t.C6552b;

/* JADX INFO: renamed from: Q8.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2074w extends g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C6552b f14517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C2057e f14518g;

    C2074w(InterfaceC2061i interfaceC2061i, C2057e c2057e, C3333a c3333a) {
        super(interfaceC2061i, c3333a);
        this.f14517f = new C6552b();
        this.f14518g = c2057e;
        this.f14492a.d("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C2057e c2057e, C2054b c2054b) {
        InterfaceC2061i interfaceC2061iD = AbstractC2060h.d(activity);
        C2074w c2074w = (C2074w) interfaceC2061iD.b("ConnectionlessLifecycleHelper", C2074w.class);
        if (c2074w == null) {
            c2074w = new C2074w(interfaceC2061iD, c2057e, C3333a.n());
        }
        AbstractC2115p.m(c2054b, "ApiKey cannot be null");
        c2074w.f14517f.add(c2054b);
        c2057e.b(c2074w);
    }

    private final void v() {
        if (this.f14517f.isEmpty()) {
            return;
        }
        this.f14518g.b(this);
    }

    @Override // Q8.AbstractC2060h
    public final void h() {
        super.h();
        v();
    }

    @Override // Q8.g0, Q8.AbstractC2060h
    public final void j() {
        super.j();
        v();
    }

    @Override // Q8.g0, Q8.AbstractC2060h
    public final void k() {
        super.k();
        this.f14518g.c(this);
    }

    @Override // Q8.g0
    protected final void m(ConnectionResult connectionResult, int i10) {
        this.f14518g.D(connectionResult, i10);
    }

    @Override // Q8.g0
    protected final void n() {
        this.f14518g.E();
    }

    final C6552b t() {
        return this.f14517f;
    }
}
