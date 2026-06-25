package w;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6539E;
import t.C6540F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC6874C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f62421a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Q {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f62422c;

        public /* synthetic */ a(Object obj, InterfaceC6875D interfaceC6875D, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, interfaceC6875D, i10);
        }

        public final int d() {
            return this.f62422c;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(aVar.b(), b()) && AbstractC5504s.c(aVar.a(), a()) && AbstractC6915t.c(aVar.f62422c, this.f62422c);
        }

        public int hashCode() {
            Object objB = b();
            return ((((objB != null ? objB.hashCode() : 0) * 31) + AbstractC6915t.d(this.f62422c)) * 31) + a().hashCode();
        }

        public /* synthetic */ a(Object obj, InterfaceC6875D interfaceC6875D, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i11 & 2) != 0 ? AbstractC6877F.e() : interfaceC6875D, (i11 & 4) != 0 ? AbstractC6915t.f62668a.a() : i10, null);
        }

        private a(Object obj, InterfaceC6875D interfaceC6875D, int i10) {
            super(obj, interfaceC6875D, null);
            this.f62422c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends T {
        public b() {
            super(null);
        }

        public a f(Object obj, int i10) {
            a aVar = new a(obj, null, 0, 6, null);
            c().s(i10, aVar);
            return aVar;
        }
    }

    public S(b bVar) {
        this.f62421a = bVar;
    }

    @Override // w.InterfaceC6874C, w.InterfaceC6904i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public E0 a(s0 s0Var) {
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int i10;
        C6539E c6539e = new C6539E(this.f62421a.c().e() + 2);
        C6540F c6540f = new C6540F(this.f62421a.c().e());
        C6540F c6540fC = this.f62421a.c();
        int[] iArr3 = c6540fC.f60106b;
        Object[] objArr = c6540fC.f60107c;
        long[] jArr3 = c6540fC.f60105a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j10 = jArr3[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            int i16 = iArr3[i15];
                            a aVar = (a) objArr[i15];
                            c6539e.h(i16);
                            i10 = i12;
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            c6540f.s(i16, new D0((AbstractC6913q) s0Var.a().invoke(aVar.b()), aVar.a(), aVar.d(), null));
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            i10 = i12;
                        }
                        j10 >>= i10;
                        i14++;
                        i12 = i10;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    if (i13 != i12) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                }
                if (i11 == length) {
                    break;
                }
                i11++;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        }
        if (!this.f62421a.c().a(0)) {
            c6539e.g(0, 0);
        }
        if (!this.f62421a.c().a(this.f62421a.b())) {
            c6539e.h(this.f62421a.b());
        }
        c6539e.o();
        return new E0(c6539e, c6540f, this.f62421a.b(), this.f62421a.a(), AbstractC6877F.e(), AbstractC6915t.f62668a.a(), null);
    }
}
