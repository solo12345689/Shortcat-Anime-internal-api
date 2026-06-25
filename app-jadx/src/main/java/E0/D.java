package E0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6573x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6573x f4044a = new C6573x(0, 1, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f4045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f4046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f4047c;

        public /* synthetic */ a(long j10, long j11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, j11, z10);
        }

        public final boolean a() {
            return this.f4047c;
        }

        public final long b() {
            return this.f4046b;
        }

        public final long c() {
            return this.f4045a;
        }

        private a(long j10, long j11, boolean z10) {
            this.f4045a = j10;
            this.f4046b = j11;
            this.f4047c = z10;
        }
    }

    public final void a() {
        this.f4044a.a();
    }

    public final C1297g b(E e10, S s10) {
        long jC;
        boolean zA;
        long jQ;
        C6573x c6573x = new C6573x(e10.b().size());
        List listB = e10.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            F f10 = (F) listB.get(i10);
            a aVar = (a) this.f4044a.e(f10.d());
            if (aVar == null) {
                zA = false;
                jC = f10.k();
                jQ = f10.f();
            } else {
                jC = aVar.c();
                zA = aVar.a();
                jQ = s10.q(aVar.b());
            }
            c6573x.i(f10.d(), new C(f10.d(), f10.k(), f10.f(), f10.b(), f10.h(), jC, jQ, zA, false, f10.j(), f10.c(), f10.i(), f10.e(), null));
            if (f10.b()) {
                this.f4044a.i(f10.d(), new a(f10.k(), f10.g(), f10.b(), null));
            } else {
                this.f4044a.j(f10.d());
            }
        }
        return new C1297g(c6573x, e10);
    }
}
