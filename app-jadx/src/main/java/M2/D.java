package M2;

import B2.K1;
import android.os.Handler;
import q2.C6071C;
import r3.r;
import w2.InterfaceC6932F;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface D {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f11662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f11665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11666e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f11662a.equals(obj) ? this : new b(obj, this.f11663b, this.f11664c, this.f11665d, this.f11666e);
        }

        public boolean b() {
            return this.f11663b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11662a.equals(bVar.f11662a) && this.f11663b == bVar.f11663b && this.f11664c == bVar.f11664c && this.f11665d == bVar.f11665d && this.f11666e == bVar.f11666e;
        }

        public int hashCode() {
            return ((((((((527 + this.f11662a.hashCode()) * 31) + this.f11663b) * 31) + this.f11664c) * 31) + ((int) this.f11665d)) * 31) + this.f11666e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f11662a = obj;
            this.f11663b = i10;
            this.f11664c = i11;
            this.f11665d = j10;
            this.f11666e = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface c {
        void a(D d10, q2.Y y10);
    }

    C6071C a();

    void b(Handler handler, F2.t tVar);

    void c(F2.t tVar);

    void d(c cVar);

    default boolean e(C6071C c6071c) {
        return false;
    }

    C f(b bVar, Q2.b bVar2, long j10);

    void h(c cVar);

    void k(L l10);

    void l();

    void m(C c10);

    default boolean n() {
        return true;
    }

    default q2.Y o() {
        return null;
    }

    void p(c cVar);

    void q(Handler handler, L l10);

    void r(c cVar, InterfaceC6932F interfaceC6932F, K1 k12);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11661a = M.f11694b;

        a d(Q2.k kVar);

        D e(C6071C c6071c);

        a f(F2.w wVar);

        default a a(r.a aVar) {
            return this;
        }

        default a b(int i10) {
            return this;
        }

        default a c(boolean z10) {
            return this;
        }
    }

    default void j(C6071C c6071c) {
    }
}
