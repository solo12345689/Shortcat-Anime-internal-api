package app.notifee.core.model;

import android.os.Bundle;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class NotificationModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f33014a;

    public NotificationModel(Bundle bundle) {
        this.f33014a = bundle;
    }

    public NotificationAndroidModel a() {
        return NotificationAndroidModel.fromBundle(this.f33014a.getBundle("android"));
    }

    public Integer b() {
        return Integer.valueOf(c().hashCode());
    }

    public String c() {
        String string = this.f33014a.getString(DiagnosticsEntry.ID_KEY);
        Objects.requireNonNull(string);
        return string;
    }

    public Bundle toBundle() {
        return (Bundle) this.f33014a.clone();
    }
}
