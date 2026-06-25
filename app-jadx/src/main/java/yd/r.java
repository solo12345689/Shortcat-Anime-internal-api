package yd;

import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f65055a = new r();

    private r() {
    }

    public final d a(JSONObject manifestJson, expo.modules.updates.d configuration) {
        AbstractC5504s.h(manifestJson, "manifestJson");
        AbstractC5504s.h(configuration, "configuration");
        return d.f65004l.a(new Ac.a(manifestJson), configuration);
    }

    public final q b(JSONObject manifestJson, n responseHeaderData, JSONObject jSONObject, expo.modules.updates.d configuration) throws Exception {
        AbstractC5504s.h(manifestJson, "manifestJson");
        AbstractC5504s.h(responseHeaderData, "responseHeaderData");
        AbstractC5504s.h(configuration, "configuration");
        Integer numE = responseHeaderData.e();
        if (numE == null) {
            throw new Exception("Legacy manifests are no longer supported");
        }
        if (numE.intValue() == 0 || numE.intValue() == 1) {
            return i.f65021o.a(new Ac.b(manifestJson), jSONObject, configuration);
        }
        throw new Exception("Unsupported expo-protocol-version: " + numE);
    }
}
