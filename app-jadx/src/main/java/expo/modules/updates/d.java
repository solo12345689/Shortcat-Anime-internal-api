package expo.modules.updates;

import Df.r;
import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import Ud.a0;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import be.AbstractC3048a;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import ie.InterfaceC5082a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nd.EnumC5782f;
import od.C5862f;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f46408u = new b(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f46409v = d.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f46411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f46412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f46413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f46414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f46415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f46416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f46417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f46418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f46419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f46420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f46421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f46422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f46423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f46424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f46425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f46426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f46427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Map f46428s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f46429t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46430a = new c("NEVER", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f46431b = new b("ERROR_RECOVERY_ONLY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f46432c = new C0744d("WIFI_ONLY", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f46433d = new C0743a("ALWAYS", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f46434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f46435f;

        /* JADX INFO: renamed from: expo.modules.updates.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0743a extends a {
            C0743a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // expo.modules.updates.d.a
            public String b() {
                return "ALWAYS";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // expo.modules.updates.d.a
            public String b() {
                return "ERROR_RECOVERY_ONLY";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // expo.modules.updates.d.a
            public String b() {
                return "NEVER";
            }
        }

        /* JADX INFO: renamed from: expo.modules.updates.d$a$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0744d extends a {
            C0744d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // expo.modules.updates.d.a
            public String b() {
                return "WIFI_ONLY";
            }
        }

        static {
            a[] aVarArrA = a();
            f46434e = aVarArrA;
            f46435f = AbstractC3048a.a(aVarArrA);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f46430a, f46431b, f46432c, f46433d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f46434e.clone();
        }

        public abstract String b();

        private a(String str, int i10) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(Context context, Map map) {
            Object obj;
            Boolean boolValueOf = null;
            if (map != null) {
                if (map.containsKey("disableAntiBrickingMeasures")) {
                    obj = map.get("disableAntiBrickingMeasures");
                    if (!(obj instanceof Boolean)) {
                        AbstractC5504s.e(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key disableAntiBrickingMeasures");
                    }
                } else {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES")) {
                    InterfaceC6014d interfaceC6014dB = O.b(Boolean.class);
                    boolValueOf = AbstractC5504s.c(interfaceC6014dB, O.b(String.class)) ? (Boolean) bundle.getString("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES") : AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE)) ? Boolean.valueOf(bundle.getBoolean("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES")) : AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES")) : (Boolean) bundle.get("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES");
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(Context context, Map map, boolean z10, e eVar) {
            if (!z10 || eVar == null) {
                return o(context, map);
            }
            return false;
        }

        private final boolean l(Context context, Map map) {
            Object obj;
            Boolean boolValueOf = null;
            if (map != null) {
                if (map.containsKey("enabled")) {
                    obj = map.get("enabled");
                    if (!(obj instanceof Boolean)) {
                        AbstractC5504s.e(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key enabled");
                    }
                } else {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.ENABLED")) {
                    InterfaceC6014d interfaceC6014dB = O.b(Boolean.class);
                    boolValueOf = AbstractC5504s.c(interfaceC6014dB, O.b(String.class)) ? (Boolean) bundle.getString("expo.modules.updates.ENABLED") : AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE)) ? Boolean.valueOf(bundle.getBoolean("expo.modules.updates.ENABLED")) : AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.ENABLED")) : (Boolean) bundle.get("expo.modules.updates.ENABLED");
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.Map m(android.content.Context r4, java.util.Map r5) {
            /*
                r3 = this;
                r0 = 0
                if (r5 == 0) goto L45
                java.lang.String r1 = "requestHeaders"
                boolean r2 = r5.containsKey(r1)
                if (r2 != 0) goto Ld
                r5 = r0
                goto L15
            Ld:
                java.lang.Object r5 = r5.get(r1)
                boolean r2 = r5 instanceof java.util.Map
                if (r2 == 0) goto L1b
            L15:
                java.util.Map r5 = (java.util.Map) r5
                if (r5 != 0) goto L1a
                goto L45
            L1a:
                return r5
            L1b:
                java.lang.AssertionError r4 = new java.lang.AssertionError
                kotlin.jvm.internal.AbstractC5504s.e(r5)
                java.lang.Class r5 = r5.getClass()
                java.lang.String r5 = r5.getSimpleName()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "UpdatesConfiguration failed to initialize: bad value of type "
                r0.append(r2)
                r0.append(r5)
                java.lang.String r5 = " provided for key "
                r0.append(r5)
                r0.append(r1)
                java.lang.String r5 = r0.toString()
                r4.<init>(r5)
                throw r4
            L45:
                if (r4 == 0) goto Lad
                android.content.pm.PackageManager r5 = r4.getPackageManager()
                java.lang.String r4 = r4.getPackageName()
                r1 = 128(0x80, float:1.794E-43)
                android.content.pm.ApplicationInfo r4 = r5.getApplicationInfo(r4, r1)
                android.os.Bundle r4 = r4.metaData
                java.lang.String r5 = "expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY"
                boolean r1 = r4.containsKey(r5)
                if (r1 != 0) goto L60
                goto Lab
            L60:
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                pe.d r1 = kotlin.jvm.internal.O.b(r0)
                pe.d r0 = kotlin.jvm.internal.O.b(r0)
                boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r1, r0)
                if (r0 == 0) goto L76
                java.lang.String r4 = r4.getString(r5)
            L74:
                r0 = r4
                goto Lab
            L76:
                java.lang.Class r0 = java.lang.Boolean.TYPE
                pe.d r0 = kotlin.jvm.internal.O.b(r0)
                boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r1, r0)
                if (r0 == 0) goto L8d
                boolean r4 = r4.getBoolean(r5)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                java.lang.String r4 = (java.lang.String) r4
                goto L74
            L8d:
                java.lang.Class r0 = java.lang.Integer.TYPE
                pe.d r0 = kotlin.jvm.internal.O.b(r0)
                boolean r0 = kotlin.jvm.internal.AbstractC5504s.c(r1, r0)
                if (r0 == 0) goto La4
                int r4 = r4.getInt(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.String r4 = (java.lang.String) r4
                goto L74
            La4:
                java.lang.Object r4 = r4.get(r5)
                java.lang.String r4 = (java.lang.String) r4
                goto L74
            Lab:
                if (r0 != 0) goto Laf
            Lad:
                java.lang.String r0 = "{}"
            Laf:
                expo.modules.updates.g r4 = expo.modules.updates.g.f46458a
                java.util.Map r4 = r4.d(r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.updates.d.b.m(android.content.Context, java.util.Map):java.util.Map");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri n(Context context, Map map) {
            String string;
            Object obj;
            if (map != null) {
                if (map.containsKey("updateUrl")) {
                    obj = map.get("updateUrl");
                    if (!(obj instanceof Uri)) {
                        AbstractC5504s.e(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key updateUrl");
                    }
                } else {
                    obj = null;
                }
                Uri uri = (Uri) obj;
                if (uri != null) {
                    return uri;
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.EXPO_UPDATE_URL")) {
                    InterfaceC6014d interfaceC6014dB = O.b(String.class);
                    string = AbstractC5504s.c(interfaceC6014dB, O.b(String.class)) ? bundle.getString("expo.modules.updates.EXPO_UPDATE_URL") : AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE)) ? (String) Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_UPDATE_URL")) : AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE)) ? (String) Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_UPDATE_URL")) : (String) bundle.get("expo.modules.updates.EXPO_UPDATE_URL");
                } else {
                    string = null;
                }
                if (string != null) {
                    return Uri.parse(string);
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(Context context, Map map) {
            Object obj;
            Boolean boolValueOf = null;
            if (map != null) {
                if (map.containsKey("hasEmbeddedUpdate")) {
                    obj = map.get("hasEmbeddedUpdate");
                    if (!(obj instanceof Boolean)) {
                        AbstractC5504s.e(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key hasEmbeddedUpdate");
                    }
                } else {
                    obj = null;
                }
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.HAS_EMBEDDED_UPDATE")) {
                    InterfaceC6014d interfaceC6014dB = O.b(Boolean.class);
                    boolValueOf = AbstractC5504s.c(interfaceC6014dB, O.b(String.class)) ? (Boolean) bundle.getString("expo.modules.updates.HAS_EMBEDDED_UPDATE") : AbstractC5504s.c(interfaceC6014dB, O.b(Boolean.TYPE)) ? Boolean.valueOf(bundle.getBoolean("expo.modules.updates.HAS_EMBEDDED_UPDATE")) : AbstractC5504s.c(interfaceC6014dB, O.b(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.HAS_EMBEDDED_UPDATE")) : (Boolean) bundle.get("expo.modules.updates.HAS_EMBEDDED_UPDATE");
                }
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map p(Context context, Map map, boolean z10, e eVar) {
            Map mapC;
            if (eVar != null && (mapC = eVar.c()) != null) {
                if (d.f46408u.t(context, map, mapC) || z10) {
                    return mapC;
                }
                Log.w(d.f46409v, "Invalid update requestHeaders override, falling back to embedded requestHeaders - override requestHeaders: " + mapC);
            }
            return m(context, map);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String q(android.content.Context r5, java.util.Map r6) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.updates.d.b.q(android.content.Context, java.util.Map):java.lang.String");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri r(Context context, Map map, boolean z10, e eVar) {
            return (!z10 || eVar == null) ? n(context, map) : eVar.d();
        }

        private final boolean t(Context context, Map map, Map map2) {
            return u(m(context, map), map2);
        }

        public final d i(Context context, d config, e eVar) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(config, "config");
            Map map = config.f46428s;
            return new d(context, map, j(context, map), eVar);
        }

        public final EnumC5782f s(Context context, Map map) throws IOException {
            if (!l(context, map)) {
                return EnumC5782f.f54121b;
            }
            if (r(context, map, j(context, map), context != null ? e.f46451c.b(context) : null) == null) {
                return EnumC5782f.f54122c;
            }
            String strQ = q(context, map);
            return (strQ == null || strQ.length() == 0) ? EnumC5782f.f54123d : EnumC5782f.f54120a;
        }

        public final boolean u(Map originalEmbeddedRequestHeaders, Map map) {
            AbstractC5504s.h(originalEmbeddedRequestHeaders, "originalEmbeddedRequestHeaders");
            if (map == null) {
                return true;
            }
            Set setKeySet = originalEmbeddedRequestHeaders.keySet();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                AbstractC5504s.g(lowerCase, "toLowerCase(...)");
                arrayList.add(r.k1(lowerCase).toString());
            }
            Set setF1 = AbstractC2279u.f1(arrayList);
            Set setC = a0.c(DiagnosticsTracker.HOST_KEY);
            Set setKeySet2 = map.keySet();
            ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(setKeySet2, 10));
            Iterator it2 = setKeySet2.iterator();
            while (it2.hasNext()) {
                String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
                AbstractC5504s.g(lowerCase2, "toLowerCase(...)");
                arrayList2.add(r.k1(lowerCase2).toString());
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (setC.contains((String) it3.next())) {
                        return false;
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (!setF1.contains((String) it4.next())) {
                        return false;
                    }
                }
            }
            return true;
        }

        private b() {
        }
    }

    public d(String scopeKey, Uri updateUrl, Uri originalEmbeddedUpdateUrl, String str, int i10, a checkOnLaunch, boolean z10, boolean z11, Map requestHeaders, Map originalEmbeddedRequestHeaders, String str2, Map map, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Map map2) {
        AbstractC5504s.h(scopeKey, "scopeKey");
        AbstractC5504s.h(updateUrl, "updateUrl");
        AbstractC5504s.h(originalEmbeddedUpdateUrl, "originalEmbeddedUpdateUrl");
        AbstractC5504s.h(checkOnLaunch, "checkOnLaunch");
        AbstractC5504s.h(requestHeaders, "requestHeaders");
        AbstractC5504s.h(originalEmbeddedRequestHeaders, "originalEmbeddedRequestHeaders");
        this.f46410a = scopeKey;
        this.f46411b = updateUrl;
        this.f46412c = originalEmbeddedUpdateUrl;
        this.f46413d = str;
        this.f46414e = i10;
        this.f46415f = checkOnLaunch;
        this.f46416g = z10;
        this.f46417h = z11;
        this.f46418i = requestHeaders;
        this.f46419j = originalEmbeddedRequestHeaders;
        this.f46420k = str2;
        this.f46421l = map;
        this.f46422m = z12;
        this.f46423n = z13;
        this.f46424o = z14;
        this.f46425p = z15;
        this.f46426q = z16;
        this.f46427r = z17;
        this.f46428s = map2;
        this.f46429t = AbstractC2163n.b(new InterfaceC5082a() { // from class: nd.d
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return expo.modules.updates.d.d(this.f54119a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5862f d(d dVar) {
        String str = dVar.f46420k;
        if (str != null) {
            return new C5862f(str, dVar.f46421l, dVar.f46422m, dVar.f46423n);
        }
        return null;
    }

    public final a e() {
        return this.f46415f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC5504s.c(this.f46410a, dVar.f46410a) && AbstractC5504s.c(this.f46411b, dVar.f46411b) && AbstractC5504s.c(this.f46412c, dVar.f46412c) && AbstractC5504s.c(this.f46413d, dVar.f46413d) && this.f46414e == dVar.f46414e && this.f46415f == dVar.f46415f && this.f46416g == dVar.f46416g && this.f46417h == dVar.f46417h && AbstractC5504s.c(this.f46418i, dVar.f46418i) && AbstractC5504s.c(this.f46419j, dVar.f46419j) && AbstractC5504s.c(this.f46420k, dVar.f46420k) && AbstractC5504s.c(this.f46421l, dVar.f46421l) && this.f46422m == dVar.f46422m && this.f46423n == dVar.f46423n && this.f46424o == dVar.f46424o && this.f46425p == dVar.f46425p && this.f46426q == dVar.f46426q && this.f46427r == dVar.f46427r && AbstractC5504s.c(this.f46428s, dVar.f46428s);
    }

    public final C5862f f() {
        return (C5862f) this.f46429t.getValue();
    }

    public final boolean g() {
        return this.f46426q;
    }

    public final boolean h() {
        return this.f46425p;
    }

    public int hashCode() {
        int iHashCode = ((((this.f46410a.hashCode() * 31) + this.f46411b.hashCode()) * 31) + this.f46412c.hashCode()) * 31;
        String str = this.f46413d;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f46414e)) * 31) + this.f46415f.hashCode()) * 31) + Boolean.hashCode(this.f46416g)) * 31) + Boolean.hashCode(this.f46417h)) * 31) + this.f46418i.hashCode()) * 31) + this.f46419j.hashCode()) * 31;
        String str2 = this.f46420k;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f46421l;
        int iHashCode4 = (((((((((((((iHashCode3 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.f46422m)) * 31) + Boolean.hashCode(this.f46423n)) * 31) + Boolean.hashCode(this.f46424o)) * 31) + Boolean.hashCode(this.f46425p)) * 31) + Boolean.hashCode(this.f46426q)) * 31) + Boolean.hashCode(this.f46427r)) * 31;
        Map map2 = this.f46428s;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f46424o;
    }

    public final boolean j() {
        return this.f46416g;
    }

    public final boolean k() {
        return this.f46427r;
    }

    public final int l() {
        return this.f46414e;
    }

    public final Map m() {
        return this.f46419j;
    }

    public final Uri n() {
        return this.f46412c;
    }

    public final boolean o() {
        return this.f46417h;
    }

    public final Map p() {
        return this.f46418i;
    }

    public final String q() throws Exception {
        String str = this.f46413d;
        if (str == null || str.length() == 0) {
            throw new Exception("No runtime version provided in configuration");
        }
        return this.f46413d;
    }

    public final String r() {
        return this.f46413d;
    }

    public final String s() {
        return this.f46410a;
    }

    public final Uri t() {
        return this.f46411b;
    }

    public String toString() {
        return "UpdatesConfiguration(scopeKey=" + this.f46410a + ", updateUrl=" + this.f46411b + ", originalEmbeddedUpdateUrl=" + this.f46412c + ", runtimeVersionRaw=" + this.f46413d + ", launchWaitMs=" + this.f46414e + ", checkOnLaunch=" + this.f46415f + ", hasEmbeddedUpdate=" + this.f46416g + ", originalHasEmbeddedUpdate=" + this.f46417h + ", requestHeaders=" + this.f46418i + ", originalEmbeddedRequestHeaders=" + this.f46419j + ", codeSigningCertificate=" + this.f46420k + ", codeSigningMetadata=" + this.f46421l + ", codeSigningIncludeManifestResponseCertificateChain=" + this.f46422m + ", codeSigningAllowUnsignedManifests=" + this.f46423n + ", enableExpoUpdatesProtocolV0CompatibilityMode=" + this.f46424o + ", enableBsdiffPatchSupport=" + this.f46425p + ", disableAntiBrickingMeasures=" + this.f46426q + ", hasUpdatesOverride=" + this.f46427r + ", cachedOverrideMap=" + this.f46428s + ")";
    }

    public d(Context context, Map map) {
        this(context, map, f46408u.j(context, map), context != null ? e.f46451c.b(context) : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r30, java.util.Map r31, boolean r32, expo.modules.updates.e r33) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.updates.d.<init>(android.content.Context, java.util.Map, boolean, expo.modules.updates.e):void");
    }
}
