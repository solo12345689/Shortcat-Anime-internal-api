package s8;

import java.util.Arrays;
import s8.f;

/* JADX INFO: renamed from: s8.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6439a extends f {

    /* JADX INFO: renamed from: a */
    private final Iterable f59266a;

    /* JADX INFO: renamed from: b */
    private final byte[] f59267b;

    /* JADX INFO: renamed from: s8.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends f.a {

        /* JADX INFO: renamed from: a */
        private Iterable f59268a;

        /* JADX INFO: renamed from: b */
        private byte[] f59269b;

        b() {
        }

        @Override // s8.f.a
        public f a() {
            String str = "";
            if (this.f59268a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C6439a(this.f59268a, this.f59269b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s8.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f59268a = iterable;
            return this;
        }

        @Override // s8.f.a
        public f.a c(byte[] bArr) {
            this.f59269b = bArr;
            return this;
        }
    }

    /* synthetic */ C6439a(Iterable iterable, byte[] bArr, C0897a c0897a) {
        this(iterable, bArr);
    }

    @Override // s8.f
    public Iterable b() {
        return this.f59266a;
    }

    @Override // s8.f
    public byte[] c() {
        return this.f59267b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f59266a.equals(fVar.b())) {
                if (Arrays.equals(this.f59267b, fVar instanceof C6439a ? ((C6439a) fVar).f59267b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f59266a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f59267b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f59266a + ", extras=" + Arrays.toString(this.f59267b) + "}";
    }

    private C6439a(Iterable iterable, byte[] bArr) {
        this.f59266a = iterable;
        this.f59267b = bArr;
    }
}
