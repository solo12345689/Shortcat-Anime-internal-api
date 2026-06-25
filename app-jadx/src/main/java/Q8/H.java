package Q8;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class H implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f14411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f14412b;

    H(I i10, ConnectionResult connectionResult) {
        this.f14412b = i10;
        this.f14411a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i10 = this.f14412b;
        E e10 = (E) i10.f14418f.f14477j.get(i10.f14414b);
        if (e10 == null) {
            return;
        }
        if (!this.f14411a.l()) {
            e10.H(this.f14411a, null);
            return;
        }
        this.f14412b.f14417e = true;
        if (this.f14412b.f14413a.f()) {
            this.f14412b.i();
            return;
        }
        try {
            I i11 = this.f14412b;
            i11.f14413a.n(null, i11.f14413a.h());
        } catch (SecurityException e11) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e11);
            this.f14412b.f14413a.b("Failed to get service from broker.");
            e10.H(new ConnectionResult(10), null);
        }
    }
}
