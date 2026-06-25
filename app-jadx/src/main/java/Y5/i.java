package y5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f64821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0980a f64822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0980a f64823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f64824d;

        /* JADX INFO: renamed from: y5.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class C0980a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            String f64825a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f64826b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            C0980a f64827c;

            private C0980a() {
            }
        }

        private C0980a d() {
            C0980a c0980a = new C0980a();
            this.f64823c.f64827c = c0980a;
            this.f64823c = c0980a;
            return c0980a;
        }

        private a e(String str, Object obj) {
            C0980a c0980aD = d();
            c0980aD.f64826b = obj;
            c0980aD.f64825a = (String) k.g(str);
            return this;
        }

        public a a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        public a b(String str, Object obj) {
            return e(str, obj);
        }

        public a c(String str, boolean z10) {
            return e(str, String.valueOf(z10));
        }

        public String toString() {
            boolean z10 = this.f64824d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f64821a);
            sb2.append('{');
            String str = "";
            for (C0980a c0980a = this.f64822b.f64827c; c0980a != null; c0980a = c0980a.f64827c) {
                Object obj = c0980a.f64826b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = c0980a.f64825a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private a(String str) {
            C0980a c0980a = new C0980a();
            this.f64822b = c0980a;
            this.f64823c = c0980a;
            this.f64824d = false;
            this.f64821a = (String) k.g(str);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
