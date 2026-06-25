package sa;

import com.google.firebase.messaging.O;

/* JADX INFO: renamed from: sa.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6445b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C6445b f59342b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6444a f59343a;

    /* JADX INFO: renamed from: sa.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private C6444a f59344a = null;

        a() {
        }

        public C6445b a() {
            return new C6445b(this.f59344a);
        }

        public a b(C6444a c6444a) {
            this.f59344a = c6444a;
            return this;
        }
    }

    C6445b(C6444a c6444a) {
        this.f59343a = c6444a;
    }

    public static a b() {
        return new a();
    }

    public C6444a a() {
        return this.f59343a;
    }

    public byte[] c() {
        return O.a(this);
    }
}
