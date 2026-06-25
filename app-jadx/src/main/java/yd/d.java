package yd;

import Td.AbstractC2163n;
import android.net.Uri;
import android.util.Log;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Date;
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
import rd.C6306a;
import sd.EnumC6452b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements q {

    /* JADX INFO: renamed from: l */
    public static final a f65004l = new a(null);

    /* JADX INFO: renamed from: m */
    private static final String f65005m = d.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    private final Ac.a f65006a;

    /* JADX INFO: renamed from: b */
    private final UUID f65007b;

    /* JADX INFO: renamed from: c */
    private final String f65008c;

    /* JADX INFO: renamed from: d */
    private final Date f65009d;

    /* JADX INFO: renamed from: e */
    private final String f65010e;

    /* JADX INFO: renamed from: f */
    private final JSONArray f65011f;

    /* JADX INFO: renamed from: g */
    private final Uri f65012g;

    /* JADX INFO: renamed from: h */
    private final Map f65013h;

    /* JADX INFO: renamed from: i */
    private final Lazy f65014i;

    /* JADX INFO: renamed from: j */
    private final Lazy f65015j;

    /* JADX INFO: renamed from: k */
    private final boolean f65016k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Ac.a manifest, expo.modules.updates.d configuration) {
            AbstractC5504s.h(manifest, "manifest");
            AbstractC5504s.h(configuration, "configuration");
            UUID uuidFromString = UUID.fromString(manifest.o());
            AbstractC5504s.g(uuidFromString, "fromString(...)");
            return new d(manifest, uuidFromString, configuration.s(), new Date(manifest.n()), configuration.q(), manifest.m(), configuration.n(), configuration.m(), null);
        }

        private a() {
        }
    }

    public /* synthetic */ d(Ac.a aVar, UUID uuid, String str, Date date, String str2, JSONArray jSONArray, Uri uri, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, date, str2, jSONArray, uri, map);
    }

    public static final List g(d dVar) {
        String string;
        String string2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        ArrayList arrayList = new ArrayList();
        C6306a c6306a = new C6306a("bundle-" + dVar.f65007b, "js");
        c6306a.C(true);
        c6306a.v("index.android.bundle");
        arrayList.add(c6306a);
        JSONArray jSONArray3 = dVar.f65011f;
        if (jSONArray3 != null && jSONArray3.length() > 0) {
            int length = dVar.f65011f.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject = dVar.f65011f.getJSONObject(i10);
                    C6306a c6306a2 = new C6306a(jSONObject.getString("packagerHash"), jSONObject.getString("type"));
                    AbstractC5504s.e(jSONObject);
                    boolean zHas = jSONObject.has("resourcesFilename");
                    Class cls = Boolean.TYPE;
                    Class cls2 = Long.TYPE;
                    Class cls3 = Integer.TYPE;
                    Class cls4 = Double.TYPE;
                    if (zHas) {
                        InterfaceC6014d interfaceC6014dB = O.b(String.class);
                        if (AbstractC5504s.c(interfaceC6014dB, O.b(String.class))) {
                            string = jSONObject.getString("resourcesFilename");
                            if (string == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls4))) {
                            string = (String) Double.valueOf(jSONObject.getDouble("resourcesFilename"));
                        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls3))) {
                            string = (String) Integer.valueOf(jSONObject.getInt("resourcesFilename"));
                        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls2))) {
                            string = (String) Long.valueOf(jSONObject.getLong("resourcesFilename"));
                        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(cls))) {
                            string = (String) Boolean.valueOf(jSONObject.getBoolean("resourcesFilename"));
                        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONArray.class))) {
                            Object jSONArray4 = jSONObject.getJSONArray("resourcesFilename");
                            if (jSONArray4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string = (String) jSONArray4;
                        } else if (AbstractC5504s.c(interfaceC6014dB, O.b(JSONObject.class))) {
                            Object jSONObject2 = jSONObject.getJSONObject("resourcesFilename");
                            if (jSONObject2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string = (String) jSONObject2;
                        } else {
                            Object obj = jSONObject.get("resourcesFilename");
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string = (String) obj;
                        }
                    } else {
                        string = null;
                    }
                    c6306a2.G(string);
                    if (jSONObject.has("resourcesFolder")) {
                        InterfaceC6014d interfaceC6014dB2 = O.b(String.class);
                        if (AbstractC5504s.c(interfaceC6014dB2, O.b(String.class))) {
                            string2 = jSONObject.getString("resourcesFolder");
                            if (string2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls4))) {
                            string2 = (String) Double.valueOf(jSONObject.getDouble("resourcesFolder"));
                        } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls3))) {
                            string2 = (String) Integer.valueOf(jSONObject.getInt("resourcesFolder"));
                        } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls2))) {
                            string2 = (String) Long.valueOf(jSONObject.getLong("resourcesFolder"));
                        } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(cls))) {
                            string2 = (String) Boolean.valueOf(jSONObject.getBoolean("resourcesFolder"));
                        } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONArray.class))) {
                            Object jSONArray5 = jSONObject.getJSONArray("resourcesFolder");
                            if (jSONArray5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string2 = (String) jSONArray5;
                        } else if (AbstractC5504s.c(interfaceC6014dB2, O.b(JSONObject.class))) {
                            Object jSONObject3 = jSONObject.getJSONObject("resourcesFolder");
                            if (jSONObject3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string2 = (String) jSONObject3;
                        } else {
                            Object obj2 = jSONObject.get("resourcesFolder");
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string2 = (String) obj2;
                        }
                    } else {
                        string2 = null;
                    }
                    c6306a2.H(string2);
                    if (jSONObject.has("scales")) {
                        InterfaceC6014d interfaceC6014dB3 = O.b(JSONArray.class);
                        if (AbstractC5504s.c(interfaceC6014dB3, O.b(String.class))) {
                            Object string3 = jSONObject.getString("scales");
                            if (string3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) string3;
                        } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls4))) {
                            jSONArray = (JSONArray) Double.valueOf(jSONObject.getDouble("scales"));
                        } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls3))) {
                            jSONArray = (JSONArray) Integer.valueOf(jSONObject.getInt("scales"));
                        } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls2))) {
                            jSONArray = (JSONArray) Long.valueOf(jSONObject.getLong("scales"));
                        } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(cls))) {
                            jSONArray = (JSONArray) Boolean.valueOf(jSONObject.getBoolean("scales"));
                        } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(JSONArray.class))) {
                            jSONArray = jSONObject.getJSONArray("scales");
                            if (jSONArray == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                        } else if (AbstractC5504s.c(interfaceC6014dB3, O.b(JSONObject.class))) {
                            Object jSONObject4 = jSONObject.getJSONObject("scales");
                            if (jSONObject4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) jSONObject4;
                        } else {
                            Object obj3 = jSONObject.get("scales");
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) obj3;
                        }
                        jSONArray2 = jSONArray;
                    } else {
                        jSONArray2 = null;
                    }
                    if (jSONArray2 != null && jSONArray2.length() > 1) {
                        c6306a2.I(Float.valueOf((float) jSONObject.optDouble("scale")));
                        int length2 = jSONArray2.length();
                        Float[] fArr = new Float[length2];
                        for (int i11 = 0; i11 < length2; i11++) {
                            fArr[i11] = Float.valueOf(0.0f);
                        }
                        int length3 = jSONArray2.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            fArr[i12] = Float.valueOf((float) jSONArray2.getDouble(i12));
                        }
                        c6306a2.J(fArr);
                    }
                    arrayList.add(c6306a2);
                } catch (JSONException e10) {
                    Log.e(f65005m, "Could not read asset from manifest", e10);
                }
            }
        }
        return arrayList;
    }

    public static final rd.d i(d dVar) {
        rd.d dVar2 = new rd.d(dVar.f65007b, dVar.f65009d, dVar.f65010e, dVar.f65008c, dVar.d().i(), dVar.f65012g, dVar.f65013h);
        dVar2.v(EnumC6452b.f59350c);
        return dVar2;
    }

    @Override // yd.q
    public List a() {
        return (List) this.f65015j.getValue();
    }

    @Override // yd.q
    public boolean b() {
        return this.f65016k;
    }

    @Override // yd.q
    public rd.d c() {
        return (rd.d) this.f65014i.getValue();
    }

    @Override // yd.q
    /* JADX INFO: renamed from: h */
    public Ac.a d() {
        return this.f65006a;
    }

    private d(Ac.a aVar, UUID uuid, String str, Date date, String str2, JSONArray jSONArray, Uri uri, Map map) {
        this.f65006a = aVar;
        this.f65007b = uuid;
        this.f65008c = str;
        this.f65009d = date;
        this.f65010e = str2;
        this.f65011f = jSONArray;
        this.f65012g = uri;
        this.f65013h = map;
        this.f65014i = AbstractC2163n.b(new InterfaceC5082a() { // from class: yd.b
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return d.i(this.f65002a);
            }
        });
        this.f65015j = AbstractC2163n.b(new InterfaceC5082a() { // from class: yd.c
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return d.g(this.f65003a);
            }
        });
    }
}
