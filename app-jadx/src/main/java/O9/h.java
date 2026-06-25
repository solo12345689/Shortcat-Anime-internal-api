package O9;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f13082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f13083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f13084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f13085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13086e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f13087a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f13088b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            a f13089c;

            a() {
            }
        }

        private a a() {
            a aVar = new a();
            this.f13084c.f13089c = aVar;
            this.f13084c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f13088b = obj;
            return this;
        }

        private static boolean d(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof k ? !((k) obj).c() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b c(Object obj) {
            return b(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r7 = this;
                boolean r0 = r7.f13085d
                boolean r1 = r7.f13086e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r7.f13082a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                O9.h$b$a r3 = r7.f13083b
                O9.h$b$a r3 = r3.f13089c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L61
                java.lang.Object r5 = r3.f13088b
                if (r5 != 0) goto L24
                if (r0 != 0) goto L5e
                goto L2c
            L24:
                if (r1 == 0) goto L2c
                boolean r6 = d(r5)
                if (r6 != 0) goto L5e
            L2c:
                r2.append(r4)
                java.lang.String r4 = r3.f13087a
                if (r4 == 0) goto L3b
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3b:
                if (r5 == 0) goto L59
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L59
                java.lang.Object[] r4 = new java.lang.Object[]{r5}
                java.lang.String r4 = java.util.Arrays.deepToString(r4)
                int r5 = r4.length()
                r6 = 1
                int r5 = r5 - r6
                r2.append(r4, r6, r5)
                goto L5c
            L59:
                r2.append(r5)
            L5c:
                java.lang.String r4 = ", "
            L5e:
                O9.h$b$a r3 = r3.f13089c
                goto L1b
            L61:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: O9.h.b.toString():java.lang.String");
        }

        private b(String str) {
            a aVar = new a();
            this.f13083b = aVar;
            this.f13084c = aVar;
            this.f13085d = false;
            this.f13086e = false;
            this.f13082a = (String) n.j(str);
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
