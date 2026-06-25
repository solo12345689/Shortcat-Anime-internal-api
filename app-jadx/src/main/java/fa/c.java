package fa;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f46988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f46989b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f46990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f46991b = null;

        b(String str) {
            this.f46990a = str;
        }

        public c a() {
            return new c(this.f46990a, this.f46991b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f46991b)));
        }

        public b b(Annotation annotation) {
            if (this.f46991b == null) {
                this.f46991b = new HashMap();
            }
            this.f46991b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f46988a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f46989b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f46988a.equals(cVar.f46988a) && this.f46989b.equals(cVar.f46989b);
    }

    public int hashCode() {
        return (this.f46988a.hashCode() * 31) + this.f46989b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f46988a + ", properties=" + this.f46989b.values() + "}";
    }

    private c(String str, Map map) {
        this.f46988a = str;
        this.f46989b = map;
    }
}
