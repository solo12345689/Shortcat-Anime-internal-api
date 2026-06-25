package io.invertase.firebase.messaging;

import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.W;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class x implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48976a = com.amazon.a.a.o.b.f.f34694a;

    private List d(String str) {
        return new ArrayList(Arrays.asList(str.split(com.amazon.a.a.o.b.f.f34694a)));
    }

    private String e(String str, String str2) {
        return str2.replace(str + com.amazon.a.a.o.b.f.f34694a, "");
    }

    @Override // io.invertase.firebase.messaging.v
    public void a(String str) {
        Pd.o oVarB = Pd.o.b();
        oVarB.d(str).apply();
        String strC = oVarB.c("all_notification_ids", "");
        if (strC.isEmpty()) {
            return;
        }
        oVarB.e("all_notification_ids", e(str, strC));
    }

    @Override // io.invertase.firebase.messaging.v
    public WritableMap b(String str) {
        String strC = Pd.o.b().c(str, null);
        if (strC != null) {
            try {
                WritableMap writableMapB = a.b(new JSONObject(strC));
                writableMapB.putString("to", str);
                return writableMapB;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    @Override // io.invertase.firebase.messaging.v
    public void c(W w10) {
        try {
            String string = a.d(u.i(w10)).toString();
            Pd.o oVarB = Pd.o.b();
            List listD = d(oVarB.c("all_notification_ids", ""));
            while (listD.size() > 99) {
                a((String) listD.get(0));
                listD.remove(0);
            }
            String strC = oVarB.c("all_notification_ids", "");
            oVarB.e(w10.f(), string);
            oVarB.e("all_notification_ids", strC + w10.f() + com.amazon.a.a.o.b.f.f34694a);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
