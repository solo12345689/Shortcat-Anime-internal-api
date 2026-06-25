package Q8;

import R8.AbstractC2115p;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f14485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ g0 f14486b;

    f0(g0 g0Var, d0 d0Var) {
        this.f14486b = g0Var;
        this.f14485a = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14486b.f14488b) {
            ConnectionResult connectionResultB = this.f14485a.b();
            if (connectionResultB.i()) {
                g0 g0Var = this.f14486b;
                g0Var.f14492a.startActivityForResult(GoogleApiActivity.a(g0Var.b(), (PendingIntent) AbstractC2115p.l(connectionResultB.f()), this.f14485a.a(), false), 1);
                return;
            }
            g0 g0Var2 = this.f14486b;
            if (g0Var2.f14491e.b(g0Var2.b(), connectionResultB.d(), null) != null) {
                g0 g0Var3 = this.f14486b;
                g0Var3.f14491e.x(g0Var3.b(), g0Var3.f14492a, connectionResultB.d(), 2, this.f14486b);
                return;
            }
            if (connectionResultB.d() != 18) {
                this.f14486b.l(connectionResultB, this.f14485a.a());
                return;
            }
            g0 g0Var4 = this.f14486b;
            Dialog dialogS = g0Var4.f14491e.s(g0Var4.b(), g0Var4);
            g0 g0Var5 = this.f14486b;
            g0Var5.f14491e.t(g0Var5.b().getApplicationContext(), new e0(this, dialogS));
        }
    }
}
