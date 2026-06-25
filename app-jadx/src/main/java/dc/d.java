package Dc;

import android.os.Bundle;
import com.google.firebase.messaging.W;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    private static Bundle a(W.c cVar) {
        if (cVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("body", cVar.a());
        bundle.putStringArray("bodyLocalizationArgs", cVar.b());
        bundle.putString("bodyLocalizationKey", cVar.c());
        bundle.putString("channelId", cVar.d());
        bundle.putString("clickAction", cVar.e());
        bundle.putString("color", cVar.f());
        bundle.putBoolean("usesDefaultLightSettings", cVar.g());
        bundle.putBoolean("usesDefaultSound", cVar.h());
        bundle.putBoolean("usesDefaultVibrateSettings", cVar.i());
        if (cVar.j() != null) {
            bundle.putLong("eventTime", cVar.j().longValue());
        } else {
            bundle.putString("eventTime", null);
        }
        bundle.putString("icon", cVar.k());
        if (cVar.l() != null) {
            bundle.putString("imageUrl", cVar.l().toString());
        } else {
            bundle.putString("imageUrl", null);
        }
        bundle.putIntArray("lightSettings", cVar.m());
        if (cVar.n() != null) {
            bundle.putString("link", cVar.n().toString());
        } else {
            bundle.putString("link", null);
        }
        bundle.putBoolean("localOnly", cVar.o());
        if (cVar.q() != null) {
            bundle.putInt("notificationCount", cVar.q().intValue());
        } else {
            bundle.putString("notificationCount", null);
        }
        if (cVar.r() != null) {
            bundle.putInt("notificationPriority", cVar.r().intValue());
        } else {
            bundle.putString("notificationPriority", null);
        }
        bundle.putString("sound", cVar.s());
        bundle.putBoolean("sticky", cVar.t());
        bundle.putString("tag", cVar.u());
        bundle.putString("ticker", cVar.v());
        bundle.putString(com.amazon.a.a.o.b.f34626S, cVar.w());
        bundle.putStringArray("titleLocalizationArgs", cVar.x());
        bundle.putString("titleLocalizationKey", cVar.y());
        if (cVar.z() != null) {
            bundle.putLongArray("vibrateTimings", cVar.z());
        }
        if (cVar.A() != null) {
            bundle.putInt("visibility", cVar.A().intValue());
            return bundle;
        }
        bundle.putString("visibility", null);
        return bundle;
    }

    public static Bundle b(W w10) {
        Bundle bundle = new Bundle();
        bundle.putString("collapseKey", w10.c());
        bundle.putBundle("data", c(w10.d()));
        bundle.putString("from", w10.e());
        bundle.putString("messageId", w10.f());
        bundle.putString("messageType", w10.l());
        bundle.putBundle("notification", a(w10.r()));
        bundle.putInt("originalPriority", w10.s());
        bundle.putInt("priority", w10.w());
        bundle.putLong("sentTime", w10.x());
        bundle.putString("to", w10.y());
        bundle.putInt("ttl", w10.z());
        return bundle;
    }

    private static Bundle c(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("dataString", (String) map.getOrDefault("body", null));
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }
}
