package Ac;

import Td.AbstractC2163n;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: c */
    public static final a f366c = new a(null);

    /* JADX INFO: renamed from: a */
    private final JSONObject f367a;

    /* JADX INFO: renamed from: b */
    private final Lazy f368b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(JSONObject manifestJson) throws Exception {
            AbstractC5504s.h(manifestJson, "manifestJson");
            if (manifestJson.has("releaseId")) {
                throw new Exception("Legacy manifests are no longer supported");
            }
            return manifestJson.has("metadata") ? new b(manifestJson) : new Ac.a(manifestJson);
        }

        private a() {
        }
    }

    public e(JSONObject json) {
        AbstractC5504s.h(json, "json");
        this.f367a = json;
        this.f368b = AbstractC2163n.b(new InterfaceC5082a() { // from class: Ac.d
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return e.l(this.f365a);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String l(Ac.e r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 671
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.e.l(Ac.e):java.lang.String");
    }

    public abstract String b();

    public abstract JSONObject c();

    public abstract JSONObject d();

    public abstract String e();

    protected final JSONObject f() {
        return this.f367a;
    }

    public final String g() throws JSONException {
        JSONObject jSONObject = this.f367a;
        InterfaceC6014d interfaceC6014dB = O.b(String.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            String string = jSONObject.getString(DiagnosticsEntry.ID_KEY);
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObject.getDouble(DiagnosticsEntry.ID_KEY));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObject.getInt(DiagnosticsEntry.ID_KEY));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObject.getLong(DiagnosticsEntry.ID_KEY));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean(DiagnosticsEntry.ID_KEY));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObject.getJSONArray(DiagnosticsEntry.ID_KEY);
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject(DiagnosticsEntry.ID_KEY);
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObject.get(DiagnosticsEntry.ID_KEY);
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject h() throws JSONException {
        JSONObject jSONObject = this.f367a;
        if (!jSONObject.has("metadata")) {
            return null;
        }
        InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            Object string = jSONObject.getString("metadata");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObject.getDouble("metadata"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObject.getInt("metadata"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObject.getLong("metadata"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObject.getBoolean("metadata"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObject.getJSONArray("metadata");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObject.get("metadata");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final JSONObject i() {
        return this.f367a;
    }

    public abstract String j();

    /* JADX WARN: Removed duplicated region for block: B:197:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k() {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.e.k():boolean");
    }

    public String toString() {
        String string = i().toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
