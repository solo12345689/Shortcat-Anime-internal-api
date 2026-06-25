package L9;

import M9.t;
import M9.w;
import android.content.Context;
import android.content.Intent;
import com.revenuecat.purchases.google.history.BillingConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: c */
    private static final M9.i f11349c = new M9.i("ReviewService");

    /* JADX INFO: renamed from: a */
    t f11350a;

    /* JADX INFO: renamed from: b */
    private final String f11351b;

    public m(Context context) {
        this.f11351b = context.getPackageName();
        if (w.a(context)) {
            this.f11350a = new t(context, f11349c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage(BillingConstants.VENDING_PACKAGE), i.f11342a, null, null);
        }
    }

    public final n9.i a() {
        M9.i iVar = f11349c;
        iVar.d("requestInAppReview (%s)", this.f11351b);
        if (this.f11350a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return n9.l.e(new a(-1));
        }
        n9.j jVar = new n9.j();
        this.f11350a.p(new j(this, jVar, jVar), jVar);
        return jVar.a();
    }
}
