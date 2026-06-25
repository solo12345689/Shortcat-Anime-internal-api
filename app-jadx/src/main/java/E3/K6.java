package E3;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class K6 extends m.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final C1375h3 f4557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f4558f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    CharSequence f4559g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f4560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    PendingIntent f4561i;

    public K6(C1375h3 c1375h3) {
        this.f4557e = c1375h3;
    }

    @Override // androidx.core.app.m.h
    public void b(androidx.core.app.l lVar) {
        CharSequence charSequence;
        Notification.MediaStyle mediaSession = new Notification.MediaStyle().setMediaSession(this.f4557e.i());
        int[] iArr = this.f4558f;
        if (iArr != null) {
            mediaSession.setShowActionsInCompactView(iArr);
        }
        if (Build.VERSION.SDK_INT >= 34 && (charSequence = this.f4559g) != null) {
            J6.a(mediaSession, charSequence, this.f4560h, this.f4561i);
            lVar.a().setStyle(mediaSession);
        } else {
            lVar.a().setStyle(mediaSession);
            Bundle bundle = new Bundle();
            bundle.putBundle("androidx.media3.session", this.f4557e.m().k());
            lVar.a().addExtras(bundle);
        }
    }
}
