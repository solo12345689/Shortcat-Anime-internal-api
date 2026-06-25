package qd;

import Ud.AbstractC2279u;
import be.AbstractC3048a;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import rd.C6307b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57924b = new a("STATIC_BUILD_DATA", 0, "staticBuildData");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f57925c = new a("EXTRA_PARAMS", 1, "extraParams");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f57926d = new a("MANIFEST_SERVER_DEFINED_HEADERS", 2, "serverDefinedHeaders");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f57927e = new a("MANIFEST_FILTERS", 3, "manifestFilters");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ a[] f57928f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f57929g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f57930a;

        static {
            a[] aVarArrA = a();
            f57928f = aVarArrA;
            f57929g = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10, String str2) {
            this.f57930a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f57924b, f57925c, f57926d, f57927e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f57928f.clone();
        }

        public final String b() {
            return this.f57930a;
        }
    }

    protected abstract void a(String str, String str2);

    public void b(List keys) {
        AbstractC5504s.h(keys, "keys");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(keys, 10));
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).b());
        }
        c(arrayList);
    }

    protected abstract void c(List list);

    protected abstract void d(C6307b c6307b);

    protected abstract List e(String str, String str2);

    public final String f(a key, String scopeKey) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(scopeKey, "scopeKey");
        List listE = e(key.b(), scopeKey);
        if (listE.isEmpty()) {
            return null;
        }
        return ((C6307b) listE.get(0)).e();
    }

    public void g(a key, String value, String scopeKey) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(value, "value");
        AbstractC5504s.h(scopeKey, "scopeKey");
        a(key.b(), scopeKey);
        d(new C6307b(key.b(), value, new Date(), scopeKey));
    }

    public void h(Map fields, String scopeKey) {
        AbstractC5504s.h(fields, "fields");
        AbstractC5504s.h(scopeKey, "scopeKey");
        for (Map.Entry entry : fields.entrySet()) {
            a(((a) entry.getKey()).b(), scopeKey);
            d(new C6307b(((a) entry.getKey()).b(), (String) entry.getValue(), new Date(), scopeKey));
        }
    }

    public void i(a key, String scopeKey, Function1 updater) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(scopeKey, "scopeKey");
        AbstractC5504s.h(updater, "updater");
        String strF = f(key, scopeKey);
        a(key.b(), scopeKey);
        d(new C6307b(key.b(), (String) updater.invoke(strF), new Date(), scopeKey));
    }
}
