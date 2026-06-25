package c4;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC3075c extends InterfaceC3073a {

    /* JADX INFO: renamed from: c4.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0563a f33460b = new C0563a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33461c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f33462d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33463a;

        /* JADX INFO: renamed from: c4.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0563a {
            public /* synthetic */ C0563a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0563a() {
            }
        }

        private a(String str) {
            this.f33463a = str;
        }

        public String toString() {
            return this.f33463a;
        }
    }

    /* JADX INFO: renamed from: c4.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33464b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f33465c = new b("VERTICAL");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f33466d = new b("HORIZONTAL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33467a;

        /* JADX INFO: renamed from: c4.c$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private b(String str) {
            this.f33467a = str;
        }

        public String toString() {
            return this.f33467a;
        }
    }

    /* JADX INFO: renamed from: c4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0564c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f33468b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0564c f33469c = new C0564c("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0564c f33470d = new C0564c("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33471a;

        /* JADX INFO: renamed from: c4.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        private C0564c(String str) {
            this.f33471a = str;
        }

        public String toString() {
            return this.f33471a;
        }
    }

    b a();

    boolean b();

    a c();

    C0564c getState();
}
