package L9;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f11340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f11341b = new Handler(Looper.getMainLooper());

    h(m mVar) {
        this.f11340a = mVar;
    }

    @Override // L9.c
    public final n9.i a(Activity activity, b bVar) {
        if (bVar.b()) {
            return n9.l.f(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        n9.j jVar = new n9.j();
        intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, new g(this, this.f11341b, jVar));
        activity.startActivity(intent);
        return jVar.a();
    }

    @Override // L9.c
    public final n9.i b() {
        return this.f11340a.a();
    }
}
