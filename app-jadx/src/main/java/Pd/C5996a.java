package pd;

import Td.z;
import Ud.S;
import expo.modules.updates.db.UpdatesDatabase;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONException;
import org.json.JSONObject;
import qd.c;

/* JADX INFO: renamed from: pd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5996a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5996a f55984a = new C5996a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f55985b = S.f(z.a("hasEmbeddedUpdate", Boolean.TRUE));

    private C5996a() {
    }

    private final JSONObject d(expo.modules.updates.d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : dVar.p().entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("updateUrl", dVar.t().toString());
        jSONObject2.put("requestHeaders", jSONObject);
        jSONObject2.put("hasEmbeddedUpdate", dVar.j());
        return jSONObject2;
    }

    public final void a(UpdatesDatabase database) {
        AbstractC5504s.h(database, "database");
        database.Q().b(database.Q().i());
    }

    public final void b(UpdatesDatabase database) {
        AbstractC5504s.h(database, "database");
        yd.k.f65039a.c(database);
    }

    public final void c(expo.modules.updates.d updatesConfiguration, UpdatesDatabase database) throws JSONException {
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        AbstractC5504s.h(database, "database");
        JSONObject jSONObjectE = e(database, updatesConfiguration.s());
        if (jSONObjectE == null) {
            g(database, updatesConfiguration);
        } else {
            if (f(updatesConfiguration, jSONObjectE)) {
                return;
            }
            a(database);
            b(database);
            g(database, updatesConfiguration);
        }
    }

    public final JSONObject e(UpdatesDatabase database, String scopeKey) {
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(scopeKey, "scopeKey");
        qd.c cVarP = database.P();
        String strF = cVarP != null ? cVarP.f(c.a.f57924b, scopeKey) : null;
        if (strF == null) {
            return null;
        }
        return new JSONObject(strF);
    }

    public final boolean f(expo.modules.updates.d updatesConfiguration, JSONObject databaseBuildData) {
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        AbstractC5504s.h(databaseBuildData, "databaseBuildData");
        Map map = f55985b;
        return AbstractC5504s.c(S.p(map, Ac.c.a(d(updatesConfiguration))), S.p(map, Ac.c.a(databaseBuildData)));
    }

    public final void g(UpdatesDatabase database, expo.modules.updates.d updatesConfiguration) throws JSONException {
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(updatesConfiguration, "updatesConfiguration");
        JSONObject jSONObjectD = d(updatesConfiguration);
        qd.c cVarP = database.P();
        if (cVarP != null) {
            c.a aVar = c.a.f57924b;
            String string = jSONObjectD.toString();
            AbstractC5504s.g(string, "toString(...)");
            cVarP.g(aVar, string, updatesConfiguration.s());
        }
    }
}
