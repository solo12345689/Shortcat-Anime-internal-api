package Y4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f22791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Map f22792d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final String f22793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Map f22794e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22795a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f22796b = f22794e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f22797c = true;

        static {
            String strG = g();
            f22793d = strG;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(strG)) {
                map.put("User-Agent", Collections.singletonList(new b(strG)));
            }
            f22794e = Collections.unmodifiableMap(map);
        }

        private Map d() {
            HashMap map = new HashMap(this.f22796b.size());
            for (Map.Entry entry : this.f22796b.entrySet()) {
                map.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return map;
        }

        private void e() {
            if (this.f22795a) {
                this.f22795a = false;
                this.f22796b = d();
            }
        }

        private List f(String str) {
            List list = (List) this.f22796b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f22796b.put(str, arrayList);
            return arrayList;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(String str, j jVar) {
            if (this.f22797c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public a b(String str, String str2) {
            return a(str, new b(str2));
        }

        public k c() {
            this.f22795a = true;
            return new k(this.f22796b);
        }

        public a h(String str, j jVar) {
            e();
            if (jVar == null) {
                this.f22796b.remove(str);
            } else {
                List listF = f(str);
                listF.clear();
                listF.add(jVar);
            }
            if (this.f22797c && "User-Agent".equalsIgnoreCase(str)) {
                this.f22797c = false;
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22798a;

        b(String str) {
            this.f22798a = str;
        }

        @Override // Y4.j
        public String a() {
            return this.f22798a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f22798a.equals(((b) obj).f22798a);
            }
            return false;
        }

        public int hashCode() {
            return this.f22798a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f22798a + "'}";
        }
    }

    k(Map map) {
        this.f22791c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(strA)) {
                sb2.append(strA);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f22791c.entrySet()) {
            String strB = b((List) entry.getValue());
            if (!TextUtils.isEmpty(strB)) {
                map.put((String) entry.getKey(), strB);
            }
        }
        return map;
    }

    @Override // Y4.i
    public Map a() {
        if (this.f22792d == null) {
            synchronized (this) {
                try {
                    if (this.f22792d == null) {
                        this.f22792d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f22792d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f22791c.equals(((k) obj).f22791c);
        }
        return false;
    }

    public int hashCode() {
        return this.f22791c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f22791c + '}';
    }
}
