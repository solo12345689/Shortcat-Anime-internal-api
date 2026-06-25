package xd;

import Td.z;
import Ud.S;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: xd.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7132c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f64354i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f64355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f64356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f64357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f64358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f64359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f64360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f64361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f64362h;

    /* JADX INFO: renamed from: xd.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C7132c a(String json) {
            Long lValueOf;
            String string;
            String string2;
            String string3;
            Long lValueOf2;
            Long l10;
            String string4;
            String str;
            String string5;
            String str2;
            JSONArray jSONArray;
            ArrayList arrayList;
            AbstractC5504s.h(json, "json");
            try {
                JSONObject jSONObject = new JSONObject(json);
                InterfaceC6014d interfaceC6014dB = O.b(Long.class);
                boolean zC = AbstractC5504s.c(interfaceC6014dB, O.b(String.class));
                Class cls = Boolean.TYPE;
                Class cls2 = Long.TYPE;
                Class cls3 = Integer.TYPE;
                Class cls4 = Double.TYPE;
                if (zC) {
                    Object string6 = jSONObject.getString(DiagnosticsEntry.TIMESTAMP_KEY);
                    if (string6 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                    lValueOf = (Long) string6;
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls4))) {
                    lValueOf = (Long) Double.valueOf(jSONObject.getDouble(DiagnosticsEntry.TIMESTAMP_KEY));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls3))) {
                    lValueOf = (Long) Integer.valueOf(jSONObject.getInt(DiagnosticsEntry.TIMESTAMP_KEY));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls2))) {
                    lValueOf = Long.valueOf(jSONObject.getLong(DiagnosticsEntry.TIMESTAMP_KEY));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls))) {
                    lValueOf = (Long) Boolean.valueOf(jSONObject.getBoolean(DiagnosticsEntry.TIMESTAMP_KEY));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                    Object jSONArray2 = jSONObject.getJSONArray(DiagnosticsEntry.TIMESTAMP_KEY);
                    if (jSONArray2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                    lValueOf = (Long) jSONArray2;
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                    Object jSONObject2 = jSONObject.getJSONObject(DiagnosticsEntry.TIMESTAMP_KEY);
                    if (jSONObject2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                    lValueOf = (Long) jSONObject2;
                } else {
                    Object obj = jSONObject.get(DiagnosticsEntry.TIMESTAMP_KEY);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                    lValueOf = (Long) obj;
                }
                long jLongValue = lValueOf.longValue();
                InterfaceC6014d interfaceC6014dB2 = O.b(String.class);
                if (AbstractC5504s.c(interfaceC6014dB2, O.b(String.class))) {
                    string = jSONObject.getString("message");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls4))) {
                    string = (String) Double.valueOf(jSONObject.getDouble("message"));
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls3))) {
                    string = (String) Integer.valueOf(jSONObject.getInt("message"));
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls2))) {
                    string = (String) Long.valueOf(jSONObject.getLong("message"));
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls))) {
                    string = (String) Boolean.valueOf(jSONObject.getBoolean("message"));
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONArray.class))) {
                    Object jSONArray3 = jSONObject.getJSONArray("message");
                    if (jSONArray3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string = (String) jSONArray3;
                } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONObject.class))) {
                    Object jSONObject3 = jSONObject.getJSONObject("message");
                    if (jSONObject3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string = (String) jSONObject3;
                } else {
                    Object obj2 = jSONObject.get("message");
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string = (String) obj2;
                }
                String str3 = string;
                InterfaceC6014d interfaceC6014dB3 = O.b(String.class);
                if (AbstractC5504s.c(interfaceC6014dB3, O.b(String.class))) {
                    string2 = jSONObject.getString("code");
                    if (string2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls4))) {
                    string2 = (String) Double.valueOf(jSONObject.getDouble("code"));
                } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls3))) {
                    string2 = (String) Integer.valueOf(jSONObject.getInt("code"));
                } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls2))) {
                    string2 = (String) Long.valueOf(jSONObject.getLong("code"));
                } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls))) {
                    string2 = (String) Boolean.valueOf(jSONObject.getBoolean("code"));
                } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(JSONArray.class))) {
                    Object jSONArray4 = jSONObject.getJSONArray("code");
                    if (jSONArray4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string2 = (String) jSONArray4;
                } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(JSONObject.class))) {
                    Object jSONObject4 = jSONObject.getJSONObject("code");
                    if (jSONObject4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string2 = (String) jSONObject4;
                } else {
                    Object obj3 = jSONObject.get("code");
                    if (obj3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string2 = (String) obj3;
                }
                String str4 = string2;
                InterfaceC6014d interfaceC6014dB4 = O.b(String.class);
                if (AbstractC5504s.c(interfaceC6014dB4, O.b(String.class))) {
                    string3 = jSONObject.getString("level");
                    if (string3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(cls4))) {
                    string3 = (String) Double.valueOf(jSONObject.getDouble("level"));
                } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(cls3))) {
                    string3 = (String) Integer.valueOf(jSONObject.getInt("level"));
                } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(cls2))) {
                    string3 = (String) Long.valueOf(jSONObject.getLong("level"));
                } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(cls))) {
                    string3 = (String) Boolean.valueOf(jSONObject.getBoolean("level"));
                } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(JSONArray.class))) {
                    Object jSONArray5 = jSONObject.getJSONArray("level");
                    if (jSONArray5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string3 = (String) jSONArray5;
                } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(JSONObject.class))) {
                    Object jSONObject5 = jSONObject.getJSONObject("level");
                    if (jSONObject5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string3 = (String) jSONObject5;
                } else {
                    Object obj4 = jSONObject.get("level");
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    string3 = (String) obj4;
                }
                String str5 = string3;
                if (jSONObject.has("duration")) {
                    InterfaceC6014d interfaceC6014dB5 = O.b(Long.class);
                    if (AbstractC5504s.c(interfaceC6014dB5, O.b(String.class))) {
                        Object string7 = jSONObject.getString("duration");
                        if (string7 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                        }
                        lValueOf2 = (Long) string7;
                    } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(cls4))) {
                        lValueOf2 = (Long) Double.valueOf(jSONObject.getDouble("duration"));
                    } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(cls3))) {
                        lValueOf2 = (Long) Integer.valueOf(jSONObject.getInt("duration"));
                    } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(cls2))) {
                        lValueOf2 = Long.valueOf(jSONObject.getLong("duration"));
                    } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(cls))) {
                        lValueOf2 = (Long) Boolean.valueOf(jSONObject.getBoolean("duration"));
                    } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(JSONArray.class))) {
                        Object jSONArray6 = jSONObject.getJSONArray("duration");
                        if (jSONArray6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                        }
                        lValueOf2 = (Long) jSONArray6;
                    } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(JSONObject.class))) {
                        Object jSONObject6 = jSONObject.getJSONObject("duration");
                        if (jSONObject6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                        }
                        lValueOf2 = (Long) jSONObject6;
                    } else {
                        Object obj5 = jSONObject.get("duration");
                        if (obj5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                        }
                        lValueOf2 = (Long) obj5;
                    }
                    l10 = lValueOf2;
                } else {
                    l10 = null;
                }
                if (jSONObject.has("updateId")) {
                    InterfaceC6014d interfaceC6014dB6 = O.b(String.class);
                    if (AbstractC5504s.c(interfaceC6014dB6, O.b(String.class))) {
                        string4 = jSONObject.getString("updateId");
                        if (string4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(cls4))) {
                        string4 = (String) Double.valueOf(jSONObject.getDouble("updateId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(cls3))) {
                        string4 = (String) Integer.valueOf(jSONObject.getInt("updateId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(cls2))) {
                        string4 = (String) Long.valueOf(jSONObject.getLong("updateId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(cls))) {
                        string4 = (String) Boolean.valueOf(jSONObject.getBoolean("updateId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(JSONArray.class))) {
                        Object jSONArray7 = jSONObject.getJSONArray("updateId");
                        if (jSONArray7 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) jSONArray7;
                    } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(JSONObject.class))) {
                        Object jSONObject7 = jSONObject.getJSONObject("updateId");
                        if (jSONObject7 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) jSONObject7;
                    } else {
                        Object obj6 = jSONObject.get("updateId");
                        if (obj6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) obj6;
                    }
                    str = string4;
                } else {
                    str = null;
                }
                if (jSONObject.has("assetId")) {
                    InterfaceC6014d interfaceC6014dB7 = O.b(String.class);
                    if (AbstractC5504s.c(interfaceC6014dB7, O.b(String.class))) {
                        string5 = jSONObject.getString("assetId");
                        if (string5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(cls4))) {
                        string5 = (String) Double.valueOf(jSONObject.getDouble("assetId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(cls3))) {
                        string5 = (String) Integer.valueOf(jSONObject.getInt("assetId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(cls2))) {
                        string5 = (String) Long.valueOf(jSONObject.getLong("assetId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(cls))) {
                        string5 = (String) Boolean.valueOf(jSONObject.getBoolean("assetId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(JSONArray.class))) {
                        Object jSONArray8 = jSONObject.getJSONArray("assetId");
                        if (jSONArray8 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string5 = (String) jSONArray8;
                    } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(JSONObject.class))) {
                        Object jSONObject8 = jSONObject.getJSONObject("assetId");
                        if (jSONObject8 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string5 = (String) jSONObject8;
                    } else {
                        Object obj7 = jSONObject.get("assetId");
                        if (obj7 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string5 = (String) obj7;
                    }
                    str2 = string5;
                } else {
                    str2 = null;
                }
                if (jSONObject.has("stacktrace")) {
                    InterfaceC6014d interfaceC6014dB8 = O.b(JSONArray.class);
                    if (AbstractC5504s.c(interfaceC6014dB8, O.b(String.class))) {
                        Object string8 = jSONObject.getString("stacktrace");
                        if (string8 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                        }
                        jSONArray = (JSONArray) string8;
                    } else if (AbstractC5504s.c(interfaceC6014dB8, O.b(cls4))) {
                        jSONArray = (JSONArray) Double.valueOf(jSONObject.getDouble("stacktrace"));
                    } else if (AbstractC5504s.c(interfaceC6014dB8, O.b(cls3))) {
                        jSONArray = (JSONArray) Integer.valueOf(jSONObject.getInt("stacktrace"));
                    } else if (AbstractC5504s.c(interfaceC6014dB8, O.b(cls2))) {
                        jSONArray = (JSONArray) Long.valueOf(jSONObject.getLong("stacktrace"));
                    } else if (AbstractC5504s.c(interfaceC6014dB8, O.b(cls))) {
                        jSONArray = (JSONArray) Boolean.valueOf(jSONObject.getBoolean("stacktrace"));
                    } else if (AbstractC5504s.c(interfaceC6014dB8, O.b(JSONArray.class))) {
                        jSONArray = jSONObject.getJSONArray("stacktrace");
                        if (jSONArray == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                        }
                    } else if (AbstractC5504s.c(interfaceC6014dB8, O.b(JSONObject.class))) {
                        Object jSONObject9 = jSONObject.getJSONObject("stacktrace");
                        if (jSONObject9 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                        }
                        jSONArray = (JSONArray) jSONObject9;
                    } else {
                        Object obj8 = jSONObject.get("stacktrace");
                        if (obj8 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                        }
                        jSONArray = (JSONArray) obj8;
                    }
                } else {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    ArrayList arrayList2 = new ArrayList(length);
                    for (int i10 = 0; i10 < length; i10++) {
                        arrayList2.add(jSONArray.getString(i10));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return new C7132c(jLongValue, str3, str4, str5, l10, str, str2, arrayList);
            } catch (JSONException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public C7132c(long j10, String message, String code, String level, Long l10, String str, String str2, List list) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(code, "code");
        AbstractC5504s.h(level, "level");
        this.f64355a = j10;
        this.f64356b = message;
        this.f64357c = code;
        this.f64358d = level;
        this.f64359e = l10;
        this.f64360f = str;
        this.f64361g = str2;
        this.f64362h = list;
    }

    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject(S.l(z.a(DiagnosticsEntry.TIMESTAMP_KEY, Long.valueOf(this.f64355a)), z.a("message", this.f64356b), z.a("code", this.f64357c), z.a("level", this.f64358d)));
        Long l10 = this.f64359e;
        if (l10 != null) {
            jSONObject.put("duration", l10.longValue());
        }
        String str = this.f64360f;
        if (str != null) {
            jSONObject.put("updateId", str);
        }
        String str2 = this.f64361g;
        if (str2 != null) {
            jSONObject.put("assetId", str2);
        }
        List list = this.f64362h;
        if (list != null && !list.isEmpty()) {
            jSONObject.put("stacktrace", new JSONArray((Collection) this.f64362h));
        }
        String string = jSONObject.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public final String b() {
        return this.f64361g;
    }

    public final String c() {
        return this.f64357c;
    }

    public final String d() {
        return this.f64358d;
    }

    public final String e() {
        return this.f64356b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7132c)) {
            return false;
        }
        C7132c c7132c = (C7132c) obj;
        return this.f64355a == c7132c.f64355a && AbstractC5504s.c(this.f64356b, c7132c.f64356b) && AbstractC5504s.c(this.f64357c, c7132c.f64357c) && AbstractC5504s.c(this.f64358d, c7132c.f64358d) && AbstractC5504s.c(this.f64359e, c7132c.f64359e) && AbstractC5504s.c(this.f64360f, c7132c.f64360f) && AbstractC5504s.c(this.f64361g, c7132c.f64361g) && AbstractC5504s.c(this.f64362h, c7132c.f64362h);
    }

    public final List f() {
        return this.f64362h;
    }

    public final long g() {
        return this.f64355a;
    }

    public final String h() {
        return this.f64360f;
    }

    public int hashCode() {
        int iHashCode = ((((((Long.hashCode(this.f64355a) * 31) + this.f64356b.hashCode()) * 31) + this.f64357c.hashCode()) * 31) + this.f64358d.hashCode()) * 31;
        Long l10 = this.f64359e;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.f64360f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64361g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f64362h;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "UpdatesLogEntry(timestamp=" + this.f64355a + ", message=" + this.f64356b + ", code=" + this.f64357c + ", level=" + this.f64358d + ", duration=" + this.f64359e + ", updateId=" + this.f64360f + ", assetId=" + this.f64361g + ", stacktrace=" + this.f64362h + ")";
    }
}
