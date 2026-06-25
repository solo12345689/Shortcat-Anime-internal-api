package Q2;

import M2.B;
import M2.C1934y;
import java.io.IOException;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f14315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f14318d;

        public a(int i10, int i11, int i12, int i13) {
            this.f14315a = i10;
            this.f14316b = i11;
            this.f14317c = i12;
            this.f14318d = i13;
        }

        public boolean a(int i10) {
            return i10 == 1 ? this.f14315a - this.f14316b > 1 : this.f14317c - this.f14318d > 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f14319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14320b;

        public b(int i10, long j10) {
            AbstractC6614a.a(j10 >= 0);
            this.f14319a = i10;
            this.f14320b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1934y f14321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final B f14322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f14323c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f14324d;

        public c(C1934y c1934y, B b10, IOException iOException, int i10) {
            this.f14321a = c1934y;
            this.f14322b = b10;
            this.f14323c = iOException;
            this.f14324d = i10;
        }
    }

    int a(int i10);

    b b(a aVar, c cVar);

    long c(c cVar);

    default void d(long j10) {
    }
}
