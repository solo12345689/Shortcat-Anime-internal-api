package j9;

import R8.AbstractC2115p;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C3887q2;
import com.google.android.gms.measurement.internal.X2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f51703a;

    public n(m mVar) {
        AbstractC2115p.l(mVar);
        this.f51703a = mVar;
    }

    public final void a(Context context, Intent intent) {
        X2 x2O = X2.O(context, null, null);
        C3887q2 c3887q2A = x2O.a();
        if (intent == null) {
            c3887q2A.r().a("Receiver called with null intent");
            return;
        }
        x2O.c();
        String action = intent.getAction();
        c3887q2A.w().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c3887q2A.r().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c3887q2A.w().a("Starting wakeful intent.");
            this.f51703a.a(context, className);
        }
    }
}
