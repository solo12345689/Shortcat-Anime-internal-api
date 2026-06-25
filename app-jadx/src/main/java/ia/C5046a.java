package ia;

import ia.InterfaceC5049d;

/* JADX INFO: renamed from: ia.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5046a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC5049d.a f48738b = InterfaceC5049d.a.DEFAULT;

    /* JADX INFO: renamed from: ia.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0776a implements InterfaceC5049d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC5049d.a f48740b;

        C0776a(int i10, InterfaceC5049d.a aVar) {
            this.f48739a = i10;
            this.f48740b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return InterfaceC5049d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC5049d)) {
                return false;
            }
            InterfaceC5049d interfaceC5049d = (InterfaceC5049d) obj;
            return this.f48739a == interfaceC5049d.tag() && this.f48740b.equals(interfaceC5049d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f48739a) + (this.f48740b.hashCode() ^ 2041407134);
        }

        @Override // ia.InterfaceC5049d
        public InterfaceC5049d.a intEncoding() {
            return this.f48740b;
        }

        @Override // ia.InterfaceC5049d
        public int tag() {
            return this.f48739a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48739a + "intEncoding=" + this.f48740b + ')';
        }
    }

    public static C5046a b() {
        return new C5046a();
    }

    public InterfaceC5049d a() {
        return new C0776a(this.f48737a, this.f48738b);
    }

    public C5046a c(int i10) {
        this.f48737a = i10;
        return this;
    }
}
