package If;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f9163b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f9164c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9165a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f9166a;

        public a(Throwable th2) {
            this.f9166a = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC5504s.c(this.f9166a, ((a) obj).f9166a);
        }

        public int hashCode() {
            Throwable th2 = this.f9166a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        @Override // If.k.c
        public String toString() {
            return "Closed(" + this.f9166a + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th2) {
            return k.c(new a(th2));
        }

        public final Object b() {
            return k.c(k.f9164c);
        }

        public final Object c(Object obj) {
            return k.c(obj);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ k(Object obj) {
        this.f9165a = obj;
    }

    public static final /* synthetic */ k b(Object obj) {
        return new k(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof k) && AbstractC5504s.c(obj, ((k) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f9166a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f9165a, obj);
    }

    public int hashCode() {
        return g(this.f9165a);
    }

    public final /* synthetic */ Object k() {
        return this.f9165a;
    }

    public String toString() {
        return j(this.f9165a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
