package Q8;

import P8.a;
import P8.f;
import R8.AbstractC2115p;
import R8.C2103d;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.Set;
import l9.AbstractBinderC5573d;
import l9.C5581l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends AbstractBinderC5573d implements f.a, f.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a.AbstractC0216a f14438h = k9.d.f52146c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f14440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.AbstractC0216a f14441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f14442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2103d f14443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private k9.e f14444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private U f14445g;

    public V(Context context, Handler handler, C2103d c2103d) {
        a.AbstractC0216a abstractC0216a = f14438h;
        this.f14439a = context;
        this.f14440b = handler;
        this.f14443e = (C2103d) AbstractC2115p.m(c2103d, "ClientSettings must not be null");
        this.f14442d = c2103d.g();
        this.f14441c = abstractC0216a;
    }

    static /* bridge */ /* synthetic */ void I3(V v10, C5581l c5581l) {
        ConnectionResult connectionResultC = c5581l.c();
        if (connectionResultC.l()) {
            R8.Q q10 = (R8.Q) AbstractC2115p.l(c5581l.d());
            ConnectionResult connectionResultC2 = q10.c();
            if (!connectionResultC2.l()) {
                String strValueOf = String.valueOf(connectionResultC2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                v10.f14445g.c(connectionResultC2);
                v10.f14444f.disconnect();
                return;
            }
            v10.f14445g.b(q10.d(), v10.f14442d);
        } else {
            v10.f14445g.c(connectionResultC);
        }
        v10.f14444f.disconnect();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [P8.a$f, k9.e] */
    public final void J3(U u10) {
        k9.e eVar = this.f14444f;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.f14443e.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0216a abstractC0216a = this.f14441c;
        Context context = this.f14439a;
        Handler handler = this.f14440b;
        C2103d c2103d = this.f14443e;
        this.f14444f = abstractC0216a.a(context, handler.getLooper(), c2103d, c2103d.h(), this, this);
        this.f14445g = u10;
        Set set = this.f14442d;
        if (set == null || set.isEmpty()) {
            this.f14440b.post(new S(this));
        } else {
            this.f14444f.g();
        }
    }

    public final void K3() {
        k9.e eVar = this.f14444f;
        if (eVar != null) {
            eVar.disconnect();
        }
    }

    @Override // l9.InterfaceC5575f
    public final void a3(C5581l c5581l) {
        this.f14440b.post(new T(this, c5581l));
    }

    @Override // Q8.InterfaceC2056d
    public final void c(Bundle bundle) {
        this.f14444f.a(this);
    }

    @Override // Q8.InterfaceC2056d
    public final void e(int i10) {
        this.f14445g.d(i10);
    }

    @Override // Q8.InterfaceC2064l
    public final void h(ConnectionResult connectionResult) {
        this.f14445g.c(connectionResult);
    }
}
