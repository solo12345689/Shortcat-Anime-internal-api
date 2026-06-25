package F2;

import B2.K1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import z2.InterfaceC7277b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface A {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f6142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f6144c;

        public a(byte[] bArr, String str, int i10) {
            this.f6142a = bArr;
            this.f6143b = str;
            this.f6144c = i10;
        }

        public byte[] a() {
            return this.f6142a;
        }

        public String b() {
            return this.f6143b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(A a10, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        A a(UUID uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f6145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6146b;

        public d(byte[] bArr, String str) {
            this.f6145a = bArr;
            this.f6146b = str;
        }

        public byte[] a() {
            return this.f6145a;
        }

        public String b() {
            return this.f6146b;
        }
    }

    void a();

    Map b(byte[] bArr);

    d c();

    void d(b bVar);

    byte[] e();

    void f(byte[] bArr, byte[] bArr2);

    void g(byte[] bArr);

    int h();

    InterfaceC7277b i(byte[] bArr);

    boolean j(byte[] bArr, String str);

    void k(byte[] bArr);

    byte[] l(byte[] bArr, byte[] bArr2);

    a m(byte[] bArr, List list, int i10, HashMap map);

    default void n(byte[] bArr, K1 k12) {
    }
}
