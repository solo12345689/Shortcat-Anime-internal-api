package Q8;

import P8.a;
import R8.AbstractC2102c;
import R8.InterfaceC2109j;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class I implements AbstractC2102c.InterfaceC0263c, U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.f f14413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2054b f14414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC2109j f14415c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f14416d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14417e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2057e f14418f;

    public I(C2057e c2057e, a.f fVar, C2054b c2054b) {
        this.f14418f = c2057e;
        this.f14413a = fVar;
        this.f14414b = c2054b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC2109j interfaceC2109j;
        if (!this.f14417e || (interfaceC2109j = this.f14415c) == null) {
            return;
        }
        this.f14413a.n(interfaceC2109j, this.f14416d);
    }

    @Override // R8.AbstractC2102c.InterfaceC0263c
    public final void a(ConnectionResult connectionResult) {
        this.f14418f.f14481n.post(new H(this, connectionResult));
    }

    @Override // Q8.U
    public final void b(InterfaceC2109j interfaceC2109j, Set set) {
        if (interfaceC2109j == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new ConnectionResult(4));
        } else {
            this.f14415c = interfaceC2109j;
            this.f14416d = set;
            i();
        }
    }

    @Override // Q8.U
    public final void c(ConnectionResult connectionResult) {
        E e10 = (E) this.f14418f.f14477j.get(this.f14414b);
        if (e10 != null) {
            e10.I(connectionResult);
        }
    }

    @Override // Q8.U
    public final void d(int i10) {
        E e10 = (E) this.f14418f.f14477j.get(this.f14414b);
        if (e10 != null) {
            if (e10.f14404i) {
                e10.I(new ConnectionResult(17));
            } else {
                e10.e(i10);
            }
        }
    }
}
