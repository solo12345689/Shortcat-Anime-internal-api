package Jc;

import android.app.NotificationChannelGroup;
import android.os.Build;
import android.os.Bundle;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r4.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f9488a;

    public a(e eVar) {
        this.f9488a = eVar;
    }

    private ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f9488a.a(N.a(it.next())));
        }
        return arrayList;
    }

    @Override // Jc.d
    public Bundle a(NotificationChannelGroup notificationChannelGroup) {
        Bundle bundle = new Bundle();
        bundle.putString(DiagnosticsEntry.ID_KEY, b(notificationChannelGroup));
        bundle.putString("name", notificationChannelGroup.getName().toString());
        if (Build.VERSION.SDK_INT >= 28) {
            bundle.putString(com.amazon.a.a.o.b.f34645c, notificationChannelGroup.getDescription());
            bundle.putBoolean("isBlocked", notificationChannelGroup.isBlocked());
        }
        bundle.putParcelableArrayList("channels", c(notificationChannelGroup.getChannels()));
        return bundle;
    }

    protected String b(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }
}
