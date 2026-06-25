package U7;

import H2.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f19389a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f19390b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {
        public abstract a a(String str, int i10);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* JADX INFO: renamed from: U7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0331b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f19391a;

        public C0331b(long j10) {
            this.f19391a = j10;
        }

        @Override // U7.b.a
        public a a(String key, int i10) {
            AbstractC5504s.h(key, "key");
            return this;
        }

        @Override // U7.b.a
        public a b(String key, Object value) {
            AbstractC5504s.h(key, "key");
            AbstractC5504s.h(value, "value");
            return this;
        }

        @Override // U7.b.a
        public void c() {
            U7.a.i(this.f19391a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f19392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f19393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f19394c;

        public c(long j10, String sectionName) {
            AbstractC5504s.h(sectionName, "sectionName");
            this.f19392a = j10;
            this.f19393b = sectionName;
            this.f19394c = new ArrayList();
        }

        private final void d(String str, String str2) {
            this.f19394c.add(str + ": " + str2);
        }

        @Override // U7.b.a
        public a a(String key, int i10) {
            AbstractC5504s.h(key, "key");
            d(key, String.valueOf(i10));
            return this;
        }

        @Override // U7.b.a
        public a b(String key, Object value) {
            AbstractC5504s.h(key, "key");
            AbstractC5504s.h(value, "value");
            d(key, value.toString());
            return this;
        }

        @Override // U7.b.a
        public void c() {
            String str;
            long j10 = this.f19392a;
            String str2 = this.f19393b;
            if (!b.f19390b || this.f19394c.isEmpty()) {
                str = "";
            } else {
                str = " (" + h.a(", ", this.f19394c) + ")";
            }
            U7.a.c(j10, str2 + str);
        }
    }

    private b() {
    }

    public static final a a(long j10, String sectionName) {
        AbstractC5504s.h(sectionName, "sectionName");
        return new c(j10, sectionName);
    }

    public static final a b(long j10) {
        return new C0331b(j10);
    }
}
