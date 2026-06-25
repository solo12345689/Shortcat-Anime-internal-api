package Q8;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C3333a;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 extends AbstractC2060h implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected volatile boolean f14488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final AtomicReference f14489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f14490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final C3333a f14491e;

    g0(InterfaceC2061i interfaceC2061i, C3333a c3333a) {
        super(interfaceC2061i);
        this.f14489c = new AtomicReference(null);
        this.f14490d = new d9.h(Looper.getMainLooper());
        this.f14491e = c3333a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ConnectionResult connectionResult, int i10) {
        this.f14489c.set(null);
        m(connectionResult, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f14489c.set(null);
        n();
    }

    private static final int p(d0 d0Var) {
        if (d0Var == null) {
            return -1;
        }
        return d0Var.a();
    }

    @Override // Q8.AbstractC2060h
    public final void e(int i10, int i11, Intent intent) {
        d0 d0Var = (d0) this.f14489c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f14491e.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (d0Var == null) {
                        return;
                    }
                    if (d0Var.b().d() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (d0Var != null) {
                l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, d0Var.b().toString()), p(d0Var));
                return;
            }
            return;
        }
        if (d0Var != null) {
            l(d0Var.b(), d0Var.a());
        }
    }

    @Override // Q8.AbstractC2060h
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f14489c.set(bundle.getBoolean("resolving_error", false) ? new d0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // Q8.AbstractC2060h
    public final void i(Bundle bundle) {
        super.i(bundle);
        d0 d0Var = (d0) this.f14489c.get();
        if (d0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", d0Var.a());
        bundle.putInt("failed_status", d0Var.b().d());
        bundle.putParcelable("failed_resolution", d0Var.b().f());
    }

    @Override // Q8.AbstractC2060h
    public void j() {
        super.j();
        this.f14488b = true;
    }

    @Override // Q8.AbstractC2060h
    public void k() {
        super.k();
        this.f14488b = false;
    }

    protected abstract void m(ConnectionResult connectionResult, int i10);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p((d0) this.f14489c.get()));
    }

    public final void s(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        d0 d0Var = new d0(connectionResult, i10);
        do {
            atomicReference = this.f14489c;
            if (w.Y.a(atomicReference, null, d0Var)) {
                this.f14490d.post(new f0(this, d0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
