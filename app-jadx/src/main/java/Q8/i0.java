package Q8;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class i0 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC2060h f14495a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f14496b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ j0 f14497c;

    i0(j0 j0Var, AbstractC2060h abstractC2060h, String str) {
        this.f14495a = abstractC2060h;
        this.f14496b = str;
        Objects.requireNonNull(j0Var);
        this.f14497c = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        j0 j0Var = this.f14497c;
        if (j0Var.k() > 0) {
            AbstractC2060h abstractC2060h = this.f14495a;
            if (j0Var.l() != null) {
                bundle = j0Var.l().getBundle(this.f14496b);
            } else {
                bundle = null;
            }
            abstractC2060h.f(bundle);
        }
        if (j0Var.k() >= 2) {
            this.f14495a.j();
        }
        if (j0Var.k() >= 3) {
            this.f14495a.h();
        }
        if (j0Var.k() >= 4) {
            this.f14495a.k();
        }
        if (j0Var.k() >= 5) {
            this.f14495a.g();
        }
    }
}
