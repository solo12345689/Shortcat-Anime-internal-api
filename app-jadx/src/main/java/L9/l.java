package L9;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class l extends k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f11348d;

    l(m mVar, n9.j jVar, String str) {
        super(mVar, new M9.i("OnRequestInstallCallback"), jVar);
        this.f11348d = str;
    }

    @Override // L9.k, M9.h
    public final void f(Bundle bundle) {
        super.f(bundle);
        this.f11346b.e(new e((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
