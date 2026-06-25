package S4;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: e */
    private static final b f15943e = new a();

    /* JADX INFO: renamed from: a */
    private final Object f15944a;

    /* JADX INFO: renamed from: b */
    private final b f15945b;

    /* JADX INFO: renamed from: c */
    private final String f15946c;

    /* JADX INFO: renamed from: d */
    private volatile byte[] f15947d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private g(String str, Object obj, b bVar) {
        this.f15946c = o5.k.c(str);
        this.f15944a = obj;
        this.f15945b = (b) o5.k.e(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    private static b b() {
        return f15943e;
    }

    private byte[] d() {
        if (this.f15947d == null) {
            this.f15947d = this.f15946c.getBytes(f.f15942a);
        }
        return this.f15947d;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f15944a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f15946c.equals(((g) obj).f15946c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f15945b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f15946c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f15946c + "'}";
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements b {
        a() {
        }

        @Override // S4.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
