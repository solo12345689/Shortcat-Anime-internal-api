package U6;

import Td.z;
import Ud.S;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f19362a = new c();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f19363a = c.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19364b = true;

        public final Map a() {
            if (!this.f19364b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f19364b = false;
            return this.f19363a;
        }

        public final a b(Object obj, Object obj2) {
            if (!this.f19364b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f19363a.put(obj, obj2);
            return this;
        }
    }

    private c() {
    }

    public static final a a() {
        return new a();
    }

    public static final HashMap b() {
        return new HashMap();
    }

    public static final Map c(Object obj, Object obj2) {
        return S.k(z.a(obj, obj2));
    }

    public static final Map d(Object obj, Object obj2, Object obj3, Object obj4) {
        return S.k(z.a(obj, obj2), z.a(obj3, obj4));
    }

    public static final Map e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return S.k(z.a(obj, obj2), z.a(obj3, obj4), z.a(obj5, obj6));
    }

    public static final Map f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return S.k(z.a(obj, obj2), z.a(obj3, obj4), z.a(obj5, obj6), z.a(obj7, obj8), z.a(obj9, obj10), z.a(obj11, obj12), z.a(obj13, obj14));
    }
}
