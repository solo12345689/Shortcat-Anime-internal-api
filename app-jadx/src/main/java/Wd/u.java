package wd;

import java.util.Date;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f63151b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f63152a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a(String jsonString) throws JSONException {
            JSONObject jSONObject;
            String string;
            JSONObject jSONObject2;
            String string2;
            JSONObject jSONObject3;
            String string3;
            String string4;
            AbstractC5504s.h(jsonString, "jsonString");
            JSONObject jSONObject4 = new JSONObject(jsonString);
            boolean zHas = jSONObject4.has("extra");
            t tVar = null;
            Class cls = Boolean.TYPE;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = Double.TYPE;
            if (zHas) {
                InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
                if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
                    Object string5 = jSONObject4.getString("extra");
                    if (string5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string5;
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls4))) {
                    jSONObject = (JSONObject) Double.valueOf(jSONObject4.getDouble("extra"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls3))) {
                    jSONObject = (JSONObject) Integer.valueOf(jSONObject4.getInt("extra"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls2))) {
                    jSONObject = (JSONObject) Long.valueOf(jSONObject4.getLong("extra"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls))) {
                    jSONObject = (JSONObject) Boolean.valueOf(jSONObject4.getBoolean("extra"));
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                    Object jSONArray = jSONObject4.getJSONArray("extra");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray;
                } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                    jSONObject = jSONObject4.getJSONObject("extra");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj = jSONObject4.get("extra");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                if (jSONObject.has("signingInfo")) {
                    InterfaceC6014d interfaceC6014dB2 = O.b(JSONObject.class);
                    if (AbstractC5504s.c(interfaceC6014dB2, O.b(String.class))) {
                        Object string6 = jSONObject.getString("signingInfo");
                        if (string6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject3 = (JSONObject) string6;
                    } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls4))) {
                        jSONObject3 = (JSONObject) Double.valueOf(jSONObject.getDouble("signingInfo"));
                    } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls3))) {
                        jSONObject3 = (JSONObject) Integer.valueOf(jSONObject.getInt("signingInfo"));
                    } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls2))) {
                        jSONObject3 = (JSONObject) Long.valueOf(jSONObject.getLong("signingInfo"));
                    } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls))) {
                        jSONObject3 = (JSONObject) Boolean.valueOf(jSONObject.getBoolean("signingInfo"));
                    } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONArray.class))) {
                        Object jSONArray2 = jSONObject.getJSONArray("signingInfo");
                        if (jSONArray2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject3 = (JSONObject) jSONArray2;
                    } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONObject.class))) {
                        jSONObject3 = jSONObject.getJSONObject("signingInfo");
                        if (jSONObject3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        Object obj2 = jSONObject.get("signingInfo");
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject3 = (JSONObject) obj2;
                    }
                } else {
                    jSONObject3 = null;
                }
                if (jSONObject3 != null) {
                    InterfaceC6014d interfaceC6014dB3 = O.b(String.class);
                    if (AbstractC5504s.c(interfaceC6014dB3, O.b(String.class))) {
                        string3 = jSONObject3.getString("projectId");
                        if (string3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls4))) {
                        string3 = (String) Double.valueOf(jSONObject3.getDouble("projectId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls3))) {
                        string3 = (String) Integer.valueOf(jSONObject3.getInt("projectId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls2))) {
                        string3 = (String) Long.valueOf(jSONObject3.getLong("projectId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls))) {
                        string3 = (String) Boolean.valueOf(jSONObject3.getBoolean("projectId"));
                    } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(JSONArray.class))) {
                        Object jSONArray3 = jSONObject3.getJSONArray("projectId");
                        if (jSONArray3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string3 = (String) jSONArray3;
                    } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(JSONObject.class))) {
                        Object jSONObject5 = jSONObject3.getJSONObject("projectId");
                        if (jSONObject5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string3 = (String) jSONObject5;
                    } else {
                        Object obj3 = jSONObject3.get("projectId");
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string3 = (String) obj3;
                    }
                    InterfaceC6014d interfaceC6014dB4 = O.b(String.class);
                    if (AbstractC5504s.c(interfaceC6014dB4, O.b(String.class))) {
                        string4 = jSONObject3.getString("scopeKey");
                        if (string4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(cls4))) {
                        string4 = (String) Double.valueOf(jSONObject3.getDouble("scopeKey"));
                    } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(cls3))) {
                        string4 = (String) Integer.valueOf(jSONObject3.getInt("scopeKey"));
                    } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(cls2))) {
                        string4 = (String) Long.valueOf(jSONObject3.getLong("scopeKey"));
                    } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(cls))) {
                        string4 = (String) Boolean.valueOf(jSONObject3.getBoolean("scopeKey"));
                    } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(JSONArray.class))) {
                        Object jSONArray4 = jSONObject3.getJSONArray("scopeKey");
                        if (jSONArray4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) jSONArray4;
                    } else if (AbstractC5504s.c(interfaceC6014dB4, O.b(JSONObject.class))) {
                        Object jSONObject6 = jSONObject3.getJSONObject("scopeKey");
                        if (jSONObject6 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) jSONObject6;
                    } else {
                        Object obj4 = jSONObject3.get("scopeKey");
                        if (obj4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) obj4;
                    }
                    tVar = new t(string3, string4);
                }
            }
            InterfaceC6014d interfaceC6014dB5 = O.b(String.class);
            if (AbstractC5504s.c(interfaceC6014dB5, O.b(String.class))) {
                string = jSONObject4.getString("type");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(cls4))) {
                string = (String) Double.valueOf(jSONObject4.getDouble("type"));
            } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(cls3))) {
                string = (String) Integer.valueOf(jSONObject4.getInt("type"));
            } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(cls2))) {
                string = (String) Long.valueOf(jSONObject4.getLong("type"));
            } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(cls))) {
                string = (String) Boolean.valueOf(jSONObject4.getBoolean("type"));
            } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(JSONArray.class))) {
                Object jSONArray5 = jSONObject4.getJSONArray("type");
                if (jSONArray5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray5;
            } else if (AbstractC5504s.c(interfaceC6014dB5, O.b(JSONObject.class))) {
                Object jSONObject7 = jSONObject4.getJSONObject("type");
                if (jSONObject7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject7;
            } else {
                Object obj5 = jSONObject4.get("type");
                if (obj5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj5;
            }
            if (AbstractC5504s.c(string, "noUpdateAvailable")) {
                return new b(tVar);
            }
            if (!AbstractC5504s.c(string, "rollBackToEmbedded")) {
                throw new Error("Invalid message messageType: " + string);
            }
            expo.modules.updates.g gVar = expo.modules.updates.g.f46458a;
            InterfaceC6014d interfaceC6014dB6 = O.b(JSONObject.class);
            if (AbstractC5504s.c(interfaceC6014dB6, O.b(String.class))) {
                Object string7 = jSONObject4.getString("parameters");
                if (string7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) string7;
            } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(cls4))) {
                jSONObject2 = (JSONObject) Double.valueOf(jSONObject4.getDouble("parameters"));
            } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(cls3))) {
                jSONObject2 = (JSONObject) Integer.valueOf(jSONObject4.getInt("parameters"));
            } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(cls2))) {
                jSONObject2 = (JSONObject) Long.valueOf(jSONObject4.getLong("parameters"));
            } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(cls))) {
                jSONObject2 = (JSONObject) Boolean.valueOf(jSONObject4.getBoolean("parameters"));
            } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(JSONArray.class))) {
                Object jSONArray6 = jSONObject4.getJSONArray("parameters");
                if (jSONArray6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) jSONArray6;
            } else if (AbstractC5504s.c(interfaceC6014dB6, O.b(JSONObject.class))) {
                jSONObject2 = jSONObject4.getJSONObject("parameters");
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj6 = jSONObject4.get("parameters");
                if (obj6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) obj6;
            }
            InterfaceC6014d interfaceC6014dB7 = O.b(String.class);
            if (AbstractC5504s.c(interfaceC6014dB7, O.b(String.class))) {
                string2 = jSONObject2.getString("commitTime");
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(cls4))) {
                string2 = (String) Double.valueOf(jSONObject2.getDouble("commitTime"));
            } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(cls3))) {
                string2 = (String) Integer.valueOf(jSONObject2.getInt("commitTime"));
            } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(cls2))) {
                string2 = (String) Long.valueOf(jSONObject2.getLong("commitTime"));
            } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(cls))) {
                string2 = (String) Boolean.valueOf(jSONObject2.getBoolean("commitTime"));
            } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(JSONArray.class))) {
                Object jSONArray7 = jSONObject2.getJSONArray("commitTime");
                if (jSONArray7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) jSONArray7;
            } else if (AbstractC5504s.c(interfaceC6014dB7, O.b(JSONObject.class))) {
                Object jSONObject8 = jSONObject2.getJSONObject("commitTime");
                if (jSONObject8 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) jSONObject8;
            } else {
                Object obj7 = jSONObject2.get("commitTime");
                if (obj7 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) obj7;
            }
            return new c(gVar.h(string2), tVar);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends u {
        public b(t tVar) {
            super(tVar, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c extends u {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Date f63153c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Date commitTime, t tVar) {
            super(tVar, null);
            AbstractC5504s.h(commitTime, "commitTime");
            this.f63153c = commitTime;
        }

        public final Date b() {
            return this.f63153c;
        }
    }

    public /* synthetic */ u(t tVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(tVar);
    }

    public final t a() {
        return this.f63152a;
    }

    private u(t tVar) {
        this.f63152a = tVar;
    }
}
