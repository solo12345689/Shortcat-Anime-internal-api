package io.sentry.android.replay;

import Df.InterfaceC1279l;
import Td.AbstractC2163n;
import ie.InterfaceC5082a;
import io.sentry.C5191e;
import io.sentry.C5322z3;
import io.sentry.H;
import io.sentry.InterfaceC5315y1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements InterfaceC5315y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f50127d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f50128e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Lazy f50129f = AbstractC2163n.a(Td.q.f17463c, C0782a.f50134a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HashSet f50130g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5322z3 f50131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f50133c;

    /* JADX INFO: renamed from: io.sentry.android.replay.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0782a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0782a f50134a = new C0782a();

        C0782a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Df.p invoke() {
            return new Df.p("_[a-z]");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Df.p b() {
            return (Df.p) a.f50129f.getValue();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c implements C5322z3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C5322z3.a f50135a;

        public c(C5322z3.a aVar) {
            this.f50135a = aVar;
        }

        private final io.sentry.util.network.a b(C5191e c5191e, H h10) {
            if (!AbstractC5504s.c(c5191e.y(), "http") && !AbstractC5504s.c(c5191e.r(), "http")) {
                return null;
            }
            h10.c("sentry:replayNetworkDetails");
            return null;
        }

        @Override // io.sentry.C5322z3.a
        public C5191e a(C5191e breadcrumb, H hint) {
            AbstractC5504s.h(breadcrumb, "breadcrumb");
            AbstractC5504s.h(hint, "hint");
            C5322z3.a aVar = this.f50135a;
            if (aVar != null) {
                breadcrumb = aVar.a(breadcrumb, hint);
            }
            if (breadcrumb != null) {
                b(breadcrumb, hint);
            }
            return breadcrumb;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends LinkedHashMap {
        d() {
        }

        public /* bridge */ boolean a(C5191e c5191e) {
            return super.containsKey(c5191e);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof C5191e) {
                return a((C5191e) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            return false;
        }

        public /* bridge */ io.sentry.util.network.a d(C5191e c5191e) {
            android.support.v4.media.session.b.a(super.get(c5191e));
            return null;
        }

        public /* bridge */ Set e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set entrySet() {
            return e();
        }

        public /* bridge */ Set f() {
            return super.keySet();
        }

        public /* bridge */ io.sentry.util.network.a g(C5191e c5191e, io.sentry.util.network.a aVar) {
            android.support.v4.media.session.b.a(super.getOrDefault(c5191e, aVar));
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof C5191e)) {
                return null;
            }
            d((C5191e) obj);
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof C5191e)) {
                return obj2;
            }
            android.support.v4.media.session.b.a(obj2);
            g((C5191e) obj, null);
            return null;
        }

        public /* bridge */ int h() {
            return super.size();
        }

        public /* bridge */ Collection i() {
            return super.values();
        }

        public /* bridge */ io.sentry.util.network.a j(C5191e c5191e) {
            android.support.v4.media.session.b.a(super.remove(c5191e));
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set keySet() {
            return f();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            return false;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 32;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return h();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection values() {
            return i();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof C5191e)) {
                return null;
            }
            j((C5191e) obj);
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f50137a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(InterfaceC1279l it) {
            AbstractC5504s.h(it, "it");
            String upperCase = String.valueOf(Df.r.q1(it.getValue())).toUpperCase(Locale.ROOT);
            AbstractC5504s.g(upperCase, "toUpperCase(...)");
            return upperCase;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f50130g = hashSet;
    }

    public a() {
        this.f50133c = Collections.synchronizedMap(new d());
    }

    private final boolean c(C5191e c5191e) {
        Object obj = c5191e.t().get("url");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return false;
        }
        Map mapT = c5191e.t();
        AbstractC5504s.g(mapT, "getData(...)");
        if (!mapT.containsKey("http.start_timestamp")) {
            return false;
        }
        Map mapT2 = c5191e.t();
        AbstractC5504s.g(mapT2, "getData(...)");
        return mapT2.containsKey("http.end_timestamp");
    }

    private final String d(String str) {
        return f50127d.b().j(str, e.f50137a);
    }

    private final io.sentry.rrweb.i e(C5191e c5191e) {
        double dLongValue;
        double dLongValue2;
        Object obj = c5191e.t().get("http.start_timestamp");
        Object obj2 = c5191e.t().get("http.end_timestamp");
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.f(c5191e.x().getTime());
        iVar.s("resource.http");
        Object obj3 = c5191e.t().get("url");
        AbstractC5504s.f(obj3, "null cannot be cast to non-null type kotlin.String");
        iVar.q((String) obj3);
        if (obj instanceof Double) {
            dLongValue = ((Number) obj).doubleValue();
        } else {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type kotlin.Long");
            dLongValue = ((Long) obj).longValue();
        }
        iVar.u(dLongValue / 1000.0d);
        if (obj2 instanceof Double) {
            dLongValue2 = ((Number) obj2).doubleValue();
        } else {
            AbstractC5504s.f(obj2, "null cannot be cast to non-null type kotlin.Long");
            dLongValue2 = ((Long) obj2).longValue();
        }
        iVar.r(dLongValue2 / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        android.support.v4.media.session.b.a(this.f50133c.remove(c5191e));
        Map mapT = c5191e.t();
        AbstractC5504s.g(mapT, "getData(...)");
        for (Map.Entry entry : mapT.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (f50130g.contains(str)) {
                AbstractC5504s.e(str);
                linkedHashMap.put(d(Df.r.W0(Df.r.K(str, "content_length", "body_size", false, 4, null), ".", null, 2, null)), value);
            }
        }
        iVar.o(linkedHashMap);
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022f  */
    @Override // io.sentry.InterfaceC5315y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.rrweb.b a(io.sentry.C5191e r10) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.a.a(io.sentry.e):io.sentry.rrweb.b");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C5322z3 options) {
        this();
        AbstractC5504s.h(options, "options");
        this.f50131a = options;
        if (options == null) {
            return;
        }
        options.setBeforeBreadcrumb(new c(options.getBeforeBreadcrumb()));
    }
}
