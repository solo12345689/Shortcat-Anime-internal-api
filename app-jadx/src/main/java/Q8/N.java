package Q8;

import android.app.Activity;
import com.google.android.gms.common.C3333a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class N extends g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n9.j f14422f;

    private N(InterfaceC2061i interfaceC2061i) {
        super(interfaceC2061i, C3333a.n());
        this.f14422f = new n9.j();
        this.f14492a.d("GmsAvailabilityHelper", this);
    }

    public static N t(Activity activity) {
        InterfaceC2061i interfaceC2061iD = AbstractC2060h.d(activity);
        N n10 = (N) interfaceC2061iD.b("GmsAvailabilityHelper", N.class);
        if (n10 == null) {
            return new N(interfaceC2061iD);
        }
        if (n10.f14422f.a().n()) {
            n10.f14422f = new n9.j();
        }
        return n10;
    }

    @Override // Q8.AbstractC2060h
    public final void g() {
        super.g();
        this.f14422f.d(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    @Override // Q8.g0
    protected final void m(ConnectionResult connectionResult, int i10) {
        String strE = connectionResult.e();
        if (strE == null) {
            strE = "Error connecting to Google Play services";
        }
        this.f14422f.b(new P8.b(new Status(connectionResult, strE, connectionResult.d())));
    }

    @Override // Q8.g0
    protected final void n() {
        Activity activityF = this.f14492a.f();
        if (activityF == null) {
            this.f14422f.d(new P8.b(new Status(8)));
            return;
        }
        int iG = this.f14491e.g(activityF);
        if (iG == 0) {
            this.f14422f.e(null);
        } else {
            if (this.f14422f.a().n()) {
                return;
            }
            s(new ConnectionResult(iG, null), 0);
        }
    }

    public final n9.i u() {
        return this.f14422f.a();
    }
}
