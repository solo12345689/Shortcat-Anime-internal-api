package R8;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class W extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f15230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2102c f15231f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected W(AbstractC2102c abstractC2102c, int i10, Bundle bundle) {
        super(abstractC2102c, Boolean.TRUE);
        Objects.requireNonNull(abstractC2102c);
        this.f15231f = abstractC2102c;
        this.f15229d = i10;
        this.f15230e = bundle;
    }

    @Override // R8.g0
    protected final /* bridge */ /* synthetic */ void a(Object obj) {
        int i10 = this.f15229d;
        if (i10 != 0) {
            this.f15231f.V(1, null);
            Bundle bundle = this.f15230e;
            f(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (e()) {
                return;
            }
            this.f15231f.V(1, null);
            f(new ConnectionResult(8, null));
        }
    }

    protected abstract boolean e();

    protected abstract void f(ConnectionResult connectionResult);
}
