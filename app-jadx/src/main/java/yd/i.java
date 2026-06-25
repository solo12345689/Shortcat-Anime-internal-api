package yd;

import Td.AbstractC2163n;
import Ud.S;
import android.net.Uri;
import android.util.Log;
import ie.InterfaceC5082a;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pe.InterfaceC6014d;
import sd.EnumC6452b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements q {

    /* JADX INFO: renamed from: o */
    public static final a f65021o = new a(null);

    /* JADX INFO: renamed from: p */
    private static final String f65022p = q.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    private final Ac.b f65023a;

    /* JADX INFO: renamed from: b */
    private final UUID f65024b;

    /* JADX INFO: renamed from: c */
    private final String f65025c;

    /* JADX INFO: renamed from: d */
    private final Date f65026d;

    /* JADX INFO: renamed from: e */
    private final String f65027e;

    /* JADX INFO: renamed from: f */
    private final JSONObject f65028f;

    /* JADX INFO: renamed from: g */
    private final JSONArray f65029g;

    /* JADX INFO: renamed from: h */
    private final JSONObject f65030h;

    /* JADX INFO: renamed from: i */
    private final Uri f65031i;

    /* JADX INFO: renamed from: j */
    private final Map f65032j;

    /* JADX INFO: renamed from: k */
    private final Lazy f65033k;

    /* JADX INFO: renamed from: l */
    private final Lazy f65034l;

    /* JADX INFO: renamed from: m */
    private final Lazy f65035m;

    /* JADX INFO: renamed from: n */
    private final Lazy f65036n;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(Ac.b manifest, JSONObject jSONObject, expo.modules.updates.d configuration) {
            Date date;
            AbstractC5504s.h(manifest, "manifest");
            AbstractC5504s.h(configuration, "configuration");
            UUID uuidFromString = UUID.fromString(manifest.p());
            AbstractC5504s.g(uuidFromString, "fromString(...)");
            String strS = configuration.s();
            try {
                date = expo.modules.updates.g.f46458a.h(manifest.n());
            } catch (ParseException e10) {
                Log.e(i.f65022p, "Could not parse manifest createdAt string; falling back to current time", e10);
                date = new Date();
            }
            return new i(manifest, uuidFromString, strS, date, manifest.r(), manifest.q(), manifest.m(), jSONObject, configuration.t(), configuration.p(), null);
        }

        private a() {
        }
    }

    public /* synthetic */ i(Ac.b bVar, UUID uuid, String str, Date date, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, Uri uri, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, uuid, str, date, str2, jSONObject, jSONArray, jSONObject2, uri, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:321:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List j(yd.i r22) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.i.j(yd.i):java.util.List");
    }

    public static final Map k(i iVar) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = iVar.f65030h;
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        boolean zHas = jSONObject3.has("assetRequestHeaders");
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zHas) {
            InterfaceC6014d interfaceC6014dB = O.b(JSONObject.class);
            if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
                Object string = jSONObject3.getString("assetRequestHeaders");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(jSONObject3.getDouble("assetRequestHeaders"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(jSONObject3.getInt("assetRequestHeaders"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(jSONObject3.getLong("assetRequestHeaders"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(jSONObject3.getBoolean("assetRequestHeaders"));
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                Object jSONArray = jSONObject3.getJSONArray("assetRequestHeaders");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                jSONObject = jSONObject3.getJSONObject("assetRequestHeaders");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = jSONObject3.get("assetRequestHeaders");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return S.i();
        }
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC5504s.g(itKeys, "keys(...)");
        Cf.i iVarG = Cf.l.g(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : iVarG) {
            String str = (String) obj2;
            InterfaceC6014d interfaceC6014dB2 = O.b(JSONObject.class);
            if (AbstractC5504s.c(interfaceC6014dB2, O.b(String.class))) {
                Object string2 = jSONObject.getString(str);
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) string2;
            } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls4))) {
                jSONObject2 = (JSONObject) Double.valueOf(jSONObject.getDouble(str));
            } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls3))) {
                jSONObject2 = (JSONObject) Integer.valueOf(jSONObject.getInt(str));
            } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls2))) {
                jSONObject2 = (JSONObject) Long.valueOf(jSONObject.getLong(str));
            } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls))) {
                jSONObject2 = (JSONObject) Boolean.valueOf(jSONObject.getBoolean(str));
            } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray(str);
                if (jSONArray2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) jSONArray2;
            } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONObject.class))) {
                jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj3 = jSONObject.get(str);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) obj3;
            }
            linkedHashMap.put(obj2, jSONObject2);
        }
        return linkedHashMap;
    }

    private final Map l() {
        return (Map) this.f65034l.getValue();
    }

    public static final boolean n(i iVar) {
        return iVar.d().k();
    }

    public static final rd.d o(i iVar) {
        rd.d dVar = new rd.d(iVar.f65024b, iVar.f65026d, iVar.f65027e, iVar.f65025c, iVar.d().i(), iVar.f65031i, iVar.f65032j);
        if (iVar.b()) {
            dVar.v(EnumC6452b.f59351d);
        }
        return dVar;
    }

    @Override // yd.q
    public List a() {
        return (List) this.f65035m.getValue();
    }

    @Override // yd.q
    public boolean b() {
        return ((Boolean) this.f65036n.getValue()).booleanValue();
    }

    @Override // yd.q
    public rd.d c() {
        return (rd.d) this.f65033k.getValue();
    }

    @Override // yd.q
    /* JADX INFO: renamed from: m */
    public Ac.b d() {
        return this.f65023a;
    }

    private i(Ac.b bVar, UUID uuid, String str, Date date, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, Uri uri, Map map) {
        this.f65023a = bVar;
        this.f65024b = uuid;
        this.f65025c = str;
        this.f65026d = date;
        this.f65027e = str2;
        this.f65028f = jSONObject;
        this.f65029g = jSONArray;
        this.f65030h = jSONObject2;
        this.f65031i = uri;
        this.f65032j = map;
        this.f65033k = AbstractC2163n.b(new InterfaceC5082a() { // from class: yd.e
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return i.o(this.f65017a);
            }
        });
        this.f65034l = AbstractC2163n.b(new InterfaceC5082a() { // from class: yd.f
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return i.k(this.f65018a);
            }
        });
        this.f65035m = AbstractC2163n.b(new InterfaceC5082a() { // from class: yd.g
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return i.j(this.f65019a);
            }
        });
        this.f65036n = AbstractC2163n.b(new InterfaceC5082a() { // from class: yd.h
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Boolean.valueOf(i.n(this.f65020a));
            }
        });
    }
}
