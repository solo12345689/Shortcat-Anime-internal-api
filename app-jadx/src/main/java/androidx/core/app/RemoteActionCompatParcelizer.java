package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f28738a = (IconCompat) aVar.v(remoteActionCompat.f28738a, 1);
        remoteActionCompat.f28739b = aVar.l(remoteActionCompat.f28739b, 2);
        remoteActionCompat.f28740c = aVar.l(remoteActionCompat.f28740c, 3);
        remoteActionCompat.f28741d = (PendingIntent) aVar.r(remoteActionCompat.f28741d, 4);
        remoteActionCompat.f28742e = aVar.h(remoteActionCompat.f28742e, 5);
        remoteActionCompat.f28743f = aVar.h(remoteActionCompat.f28743f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f28738a, 1);
        aVar.D(remoteActionCompat.f28739b, 2);
        aVar.D(remoteActionCompat.f28740c, 3);
        aVar.H(remoteActionCompat.f28741d, 4);
        aVar.z(remoteActionCompat.f28742e, 5);
        aVar.z(remoteActionCompat.f28743f, 6);
    }
}
