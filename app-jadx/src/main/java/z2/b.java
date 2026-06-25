package Z2;

import U2.AbstractC2244e;
import U2.InterfaceC2256q;
import U2.v;
import U2.y;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class b extends AbstractC2244e {

    /* JADX INFO: renamed from: Z2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0395b implements AbstractC2244e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f23129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v.a f23131c;

        private long c(InterfaceC2256q interfaceC2256q) {
            while (interfaceC2256q.j() < interfaceC2256q.getLength() - 6 && !v.h(interfaceC2256q, this.f23129a, this.f23130b, this.f23131c)) {
                interfaceC2256q.k(1);
            }
            if (interfaceC2256q.j() < interfaceC2256q.getLength() - 6) {
                return this.f23131c.f19094a;
            }
            interfaceC2256q.k((int) (interfaceC2256q.getLength() - interfaceC2256q.j()));
            return this.f23129a.f19107j;
        }

        @Override // U2.AbstractC2244e.f
        public AbstractC2244e.C0323e a(InterfaceC2256q interfaceC2256q, long j10) {
            long position = interfaceC2256q.getPosition();
            long jC = c(interfaceC2256q);
            long j11 = interfaceC2256q.j();
            interfaceC2256q.k(Math.max(6, this.f23129a.f19100c));
            long jC2 = c(interfaceC2256q);
            return (jC > j10 || jC2 <= j10) ? jC2 <= j10 ? AbstractC2244e.C0323e.f(jC2, interfaceC2256q.j()) : AbstractC2244e.C0323e.d(jC, position) : AbstractC2244e.C0323e.e(j11);
        }

        private C0395b(y yVar, int i10) {
            this.f23129a = yVar;
            this.f23130b = i10;
            this.f23131c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i10, long j10, long j11) {
        super(new AbstractC2244e.d() { // from class: Z2.a
            @Override // U2.AbstractC2244e.d
            public final long a(long j12) {
                return yVar.i(j12);
            }
        }, new C0395b(yVar, i10), yVar.f(), 0L, yVar.f19107j, j10, j11, yVar.d(), Math.max(6, yVar.f19100c));
        Objects.requireNonNull(yVar);
    }
}
