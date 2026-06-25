package Bd;

import android.util.Log;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f1655a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f1656b;

    static {
        String simpleName = g.class.getSimpleName();
        AbstractC5504s.g(simpleName, "getSimpleName(...)");
        f1656b = simpleName;
    }

    private g() {
    }

    public final boolean a(rd.d update, JSONObject jSONObject) {
        JSONObject jSONObjectH;
        AbstractC5504s.h(update, "update");
        if (jSONObject == null || (jSONObjectH = Ac.e.f366c.a(update.i()).h()) == null) {
            return true;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObjectH.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                AbstractC5504s.e(next);
                String lowerCase = next.toLowerCase(Locale.ROOT);
                AbstractC5504s.g(lowerCase, "toLowerCase(...)");
                jSONObject2.put(lowerCase, jSONObjectH.get(next));
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (jSONObject2.has(next2) && !AbstractC5504s.c(jSONObject.get(next2), jSONObject2.get(next2))) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            Log.e(f1656b, "Error filtering manifest using server data", e10);
            return true;
        }
    }
}
