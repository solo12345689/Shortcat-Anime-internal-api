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
public final class b extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JSONObject json) {
        super(json);
        AbstractC5504s.h(json, "json");
    }

    private final JSONObject o() throws JSONException {
        JSONObject jSONObjectF = f();
        if (!jSONObjectF.has("extra")) {
            return null;
        }
        InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            Object string = jSONObjectF.getString("extra");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObjectF.getDouble("extra"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObjectF.getInt("extra"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObjectF.getLong("extra"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObjectF.getBoolean("extra"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("extra");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            JSONObject jSONObject = jSONObjectF.getJSONObject("extra");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObjectF.get("extra");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // Ac.e
    public String b() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObjectO = o();
        if (jSONObjectO != null) {
            boolean zHas = jSONObjectO.has("eas");
            Class cls = Boolean.TYPE;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = Double.TYPE;
            if (zHas) {
                InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
                if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
                    Object string = jSONObjectO.getString("eas");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string;
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls4))) {
                    jSONObject = (JSONObject) Double.valueOf(jSONObjectO.getDouble("eas"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls3))) {
                    jSONObject = (JSONObject) Integer.valueOf(jSONObjectO.getInt("eas"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls2))) {
                    jSONObject = (JSONObject) Long.valueOf(jSONObjectO.getLong("eas"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls))) {
                    jSONObject = (JSONObject) Boolean.valueOf(jSONObjectO.getBoolean("eas"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                    Object jSONArray = jSONObjectO.getJSONArray("eas");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray;
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                    jSONObject = jSONObjectO.getJSONObject("eas");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj = jSONObjectO.get("eas");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null || !jSONObject.has("projectId")) {
                return null;
            }
            InterfaceC6014d interfaceC6014dB2 = O.b(String.class);
            if (AbstractC5504s.c(interfaceC6014dB2, O.b(String.class))) {
                String string2 = jSONObject.getString("projectId");
                if (string2 != null) {
                    return string2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls4))) {
                return (String) Double.valueOf(jSONObject.getDouble("projectId"));
            }
            if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls3))) {
                return (String) Integer.valueOf(jSONObject.getInt("projectId"));
            }
            if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls2))) {
                return (String) Long.valueOf(jSONObject.getLong("projectId"));
            }
            if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls))) {
                return (String) Boolean.valueOf(jSONObject.getBoolean("projectId"));
            }
            if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray("projectId");
                if (jSONArray2 != null) {
                    return (String) jSONArray2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("projectId");
                if (jSONObject2 != null) {
                    return (String) jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            Object obj2 = jSONObject.get("projectId");
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        return null;
    }

    @Override // Ac.e
    public JSONObject c() throws JSONException {
        JSONObject jSONObjectO = o();
        if (jSONObjectO == null || !jSONObjectO.has("expoClient")) {
            return null;
        }
        InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            Object string = jSONObjectO.getString("expoClient");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObjectO.getDouble("expoClient"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObjectO.getInt("expoClient"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObjectO.getLong("expoClient"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObjectO.getBoolean("expoClient"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectO.getJSONArray("expoClient");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            JSONObject jSONObject = jSONObjectO.getJSONObject("expoClient");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObjectO.get("expoClient");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // Ac.e
    public JSONObject d() throws JSONException {
        JSONObject jSONObjectO = o();
        if (jSONObjectO == null || !jSONObjectO.has("expoGo")) {
            return null;
        }
        InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            Object string = jSONObjectO.getString("expoGo");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObjectO.getDouble("expoGo"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObjectO.getInt("expoGo"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObjectO.getLong("expoGo"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObjectO.getBoolean("expoGo"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectO.getJSONArray("expoGo");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            JSONObject jSONObject = jSONObjectO.getJSONObject("expoGo");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObjectO.get("expoGo");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // Ac.e
    public String e() throws JSONException {
        JSONObject jSONObjectC = c();
        if (jSONObjectC != null) {
            return jSONObjectC.getString(com.amazon.a.a.o.b.f34616I);
        }
        return null;
    }

    @Override // Ac.e
    public String j() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObjectF = f();
        InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
        boolean zC = AbstractC5504s.c(interfaceC6014dB, O.b(String.class));
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zC) {
            Object string = jSONObjectF.getString("extra");
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) string;
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls4))) {
            jSONObject = (JSONObject) Double.valueOf(jSONObjectF.getDouble("extra"));
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls3))) {
            jSONObject = (JSONObject) Integer.valueOf(jSONObjectF.getInt("extra"));
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls2))) {
            jSONObject = (JSONObject) Long.valueOf(jSONObjectF.getLong("extra"));
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls))) {
            jSONObject = (JSONObject) Boolean.valueOf(jSONObjectF.getBoolean("extra"));
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("extra");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) jSONArray;
        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            jSONObject = jSONObjectF.getJSONObject("extra");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
        } else {
            Object obj = jSONObjectF.get("extra");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) obj;
        }
        InterfaceC6014d interfaceC6014dB2 = O.b(String.class);
        if (AbstractC5504s.c(interfaceC6014dB2, O.b(String.class))) {
            String string2 = jSONObject.getString("scopeKey");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls4))) {
            return (String) Double.valueOf(jSONObject.getDouble("scopeKey"));
        }
        if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls3))) {
            return (String) Integer.valueOf(jSONObject.getInt("scopeKey"));
        }
        if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls2))) {
            return (String) Long.valueOf(jSONObject.getLong("scopeKey"));
        }
        if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("scopeKey"));
        }
        if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("scopeKey");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("scopeKey");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("scopeKey");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
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

    public final String n() throws JSONException {
        JSONObject jSONObjectF = f();
        InterfaceC6014d interfaceC6014dB = O.b(String.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            String string = jSONObjectF.getString("createdAt");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble("createdAt"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt("createdAt"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong("createdAt"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean("createdAt"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("createdAt");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("createdAt");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get("createdAt");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String p() throws JSONException {
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

    public final JSONObject q() throws JSONException {
        JSONObject jSONObjectF = f();
        InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            Object string = jSONObjectF.getString("launchAsset");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObjectF.getDouble("launchAsset"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObjectF.getInt("launchAsset"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObjectF.getLong("launchAsset"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObjectF.getBoolean("launchAsset"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("launchAsset");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            JSONObject jSONObject = jSONObjectF.getJSONObject("launchAsset");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObjectF.get("launchAsset");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String r() throws JSONException {
        JSONObject jSONObjectF = f();
        InterfaceC6014d interfaceC6014dB = O.b(String.class);
        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
            String string = jSONObjectF.getString("runtimeVersion");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble("runtimeVersion"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt("runtimeVersion"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong("runtimeVersion"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean("runtimeVersion"));
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("runtimeVersion");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("runtimeVersion");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get("runtimeVersion");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
