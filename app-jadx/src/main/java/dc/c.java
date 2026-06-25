package Dc;

import Pc.g;
import Pc.h;
import Pc.l;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static Bundle a(Oc.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString(com.amazon.a.a.o.b.f34626S, aVar.getTitle());
        bundle.putString("subtitle", aVar.V());
        bundle.putString("body", aVar.getText());
        if (aVar.I() != null) {
            bundle.putString("color", String.format("#%08X", Integer.valueOf(aVar.I().intValue())));
        }
        if (aVar.T() != null) {
            bundle.putInt("badge", aVar.T().intValue());
        } else {
            bundle.putString("badge", null);
        }
        if (aVar.N()) {
            bundle.putString("sound", "default");
        } else if (aVar.P() != null) {
            bundle.putString("sound", "custom");
        } else {
            bundle.putString("sound", null);
        }
        if (aVar.D() != null) {
            bundle.putString("priority", aVar.D().h());
        }
        if (aVar.G() != null) {
            bundle.putLongArray("vibrationPattern", aVar.G());
        }
        bundle.putBoolean("autoDismiss", aVar.F());
        if (aVar.Q() != null) {
            bundle.putString("categoryIdentifier", aVar.Q());
        }
        bundle.putBoolean("sticky", aVar.U());
        return bundle;
    }

    public static Bundle b(Pc.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putBundle("request", c(aVar.a()));
        bundle.putLong("date", aVar.b().getTime());
        return bundle;
    }

    public static Bundle c(g gVar) {
        JSONObject jSONObjectR;
        Bundle bundle = new Bundle();
        bundle.putString("identifier", gVar.b());
        Oc.d dVarC = gVar.c();
        bundle.putBundle("trigger", dVarC == null ? null : dVarC.u());
        Bundle bundleA = a(gVar.a());
        if (bundleA.getBundle("data") == null) {
            if (dVarC instanceof Qc.a) {
                Map mapD = ((Qc.a) dVarC).a().d();
                String str = (String) mapD.get("body");
                if (Bc.e.f(str)) {
                    bundleA.putString("dataString", str);
                } else {
                    bundleA.putBundle("data", e(mapD));
                }
            } else if (((dVarC instanceof Oc.e) || (dVarC instanceof Uc.a) || dVarC == null) && (jSONObjectR = gVar.a().R()) != null) {
                bundleA.putString("dataString", jSONObjectR.toString());
            }
        }
        bundle.putBundle("content", bundleA);
        return bundle;
    }

    public static Bundle d(h hVar) {
        Bundle bundle = new Bundle();
        bundle.putString("actionIdentifier", hVar.b());
        bundle.putBundle("notification", b(hVar.c()));
        if (hVar instanceof l) {
            bundle.putString("userText", ((l) hVar).d());
        }
        return bundle;
    }

    public static Bundle e(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static Bundle f(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString(com.amazon.a.a.o.b.f34626S, bundle.getString(com.amazon.a.a.o.b.f34626S));
        String string = bundle.getString("body");
        if (Bc.e.f(string)) {
            bundle2.putString("dataString", string);
            bundle2.putString("body", bundle.getString("message"));
        } else {
            bundle2.putBundle("data", Bc.e.c(bundle));
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("type", Constants.PUSH);
        bundle3.putString("channelId", bundle.getString("channelId"));
        Bundle bundle4 = new Bundle();
        bundle4.putString("identifier", bundle.getString("google.message_id"));
        bundle4.putBundle("trigger", bundle3);
        bundle4.putBundle("content", bundle2);
        Bundle bundle5 = new Bundle();
        bundle5.putLong("date", bundle.getLong("google.sent_time"));
        bundle5.putBundle("request", bundle4);
        Bundle bundle6 = new Bundle();
        bundle6.putString("actionIdentifier", "expo.modules.notifications.actions.DEFAULT");
        bundle6.putBundle("notification", bundle5);
        return bundle6;
    }
}
