package Ac;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(JSONObject json) {
        super(json);
        AbstractC5504s.h(json, "json");
    }

    @Override // Ac.e
    public String b() throws JSONException {
        JSONObject jSONObjectF = f();
        if (!jSONObjectF.has("projectId")) {
            return null;
        }
        InterfaceC6014d interfaceC6014dB = O.b(String.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            String string = jSONObjectF.getString("projectId");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble("projectId"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt("projectId"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong("projectId"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean("projectId"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("projectId");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("projectId");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get("projectId");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // Ac.e
    public JSONObject c() {
        return f();
    }

    @Override // Ac.e
    public JSONObject d() {
        return f();
    }

    @Override // Ac.e
    public String e() throws JSONException {
        JSONObject jSONObjectF = f();
        if (!jSONObjectF.has(com.amazon.a.a.o.b.f34616I)) {
            return null;
        }
        InterfaceC6014d interfaceC6014dB = O.b(String.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            String string = jSONObjectF.getString(com.amazon.a.a.o.b.f34616I);
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble(com.amazon.a.a.o.b.f34616I));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt(com.amazon.a.a.o.b.f34616I));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong(com.amazon.a.a.o.b.f34616I));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean(com.amazon.a.a.o.b.f34616I));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray(com.amazon.a.a.o.b.f34616I);
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject(com.amazon.a.a.o.b.f34616I);
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get(com.amazon.a.a.o.b.f34616I);
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // Ac.e
    public String j() throws JSONException {
        String string;
        JSONObject jSONObjectF = f();
        if (jSONObjectF.has("scopeKey")) {
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
                string = jSONObjectF.getString("scopeKey");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
                string = (String) Double.valueOf(jSONObjectF.getDouble("scopeKey"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(jSONObjectF.getInt("scopeKey"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
                string = (String) Long.valueOf(jSONObjectF.getLong("scopeKey"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(jSONObjectF.getBoolean("scopeKey"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                Object jSONArray = jSONObjectF.getJSONArray("scopeKey");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray;
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                Object jSONObject = jSONObjectF.getJSONObject("scopeKey");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject;
            } else {
                Object obj = jSONObjectF.get("scopeKey");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
        } else {
            string = null;
        }
        return string == null ? p() : string;
    }

    public JSONArray m() throws JSONException {
        JSONObject jSONObjectF = f();
        if (!jSONObjectF.has("assets")) {
            return null;
        }
        InterfaceC6014d interfaceC6014dB = O.b(JSONArray.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            Object string = jSONObjectF.getString("assets");
            if (string != null) {
                return (JSONArray) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (JSONArray) Double.valueOf(jSONObjectF.getDouble("assets"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (JSONArray) Integer.valueOf(jSONObjectF.getInt("assets"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (JSONArray) Long.valueOf(jSONObjectF.getLong("assets"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (JSONArray) Boolean.valueOf(jSONObjectF.getBoolean("assets"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            JSONArray jSONArray = jSONObjectF.getJSONArray("assets");
            if (jSONArray != null) {
                return jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("assets");
            if (jSONObject != null) {
                return (JSONArray) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        Object obj = jSONObjectF.get("assets");
        if (obj != null) {
            return (JSONArray) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
    }

    public final long n() throws JSONException {
        Long lValueOf;
        JSONObject jSONObjectF = f();
        InterfaceC6014d interfaceC6014dB = O.b(Long.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            Object string = jSONObjectF.getString("commitTime");
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) string;
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            lValueOf = (Long) Double.valueOf(jSONObjectF.getDouble("commitTime"));
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            lValueOf = (Long) Integer.valueOf(jSONObjectF.getInt("commitTime"));
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            lValueOf = Long.valueOf(jSONObjectF.getLong("commitTime"));
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            lValueOf = (Long) Boolean.valueOf(jSONObjectF.getBoolean("commitTime"));
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("commitTime");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) jSONArray;
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("commitTime");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) jSONObject;
        } else {
            Object obj = jSONObjectF.get("commitTime");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) obj;
        }
        return lValueOf.longValue();
    }

    public final String o() throws JSONException {
        JSONObject jSONObjectF = f();
        InterfaceC6014d interfaceC6014dB = O.b(String.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            String string = jSONObjectF.getString(DiagnosticsEntry.ID_KEY);
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble(DiagnosticsEntry.ID_KEY));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt(DiagnosticsEntry.ID_KEY));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong(DiagnosticsEntry.ID_KEY));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean(DiagnosticsEntry.ID_KEY));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray(DiagnosticsEntry.ID_KEY);
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject(DiagnosticsEntry.ID_KEY);
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get(DiagnosticsEntry.ID_KEY);
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public String p() throws JSONException {
        String string;
        JSONObject jSONObjectF = f();
        if (jSONObjectF.has("originalFullName")) {
            InterfaceC6014d interfaceC6014dB = O.b(String.class);
            if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
                string = jSONObjectF.getString("originalFullName");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
                string = (String) Double.valueOf(jSONObjectF.getDouble("originalFullName"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(jSONObjectF.getInt("originalFullName"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
                string = (String) Long.valueOf(jSONObjectF.getLong("originalFullName"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(jSONObjectF.getBoolean("originalFullName"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                Object jSONArray = jSONObjectF.getJSONArray("originalFullName");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray;
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                Object jSONObject = jSONObjectF.getJSONObject("originalFullName");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject;
            } else {
                Object obj = jSONObjectF.get("originalFullName");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
        } else {
            string = null;
        }
        return string == null ? g() : string;
    }
}
