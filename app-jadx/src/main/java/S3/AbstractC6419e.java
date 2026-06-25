package s3;

import java.util.ArrayDeque;
import r3.j;
import r3.k;
import r3.o;
import r3.p;
import s3.AbstractC6419e;
import t2.AbstractC6614a;
import t2.a0;
import z2.g;

/* JADX INFO: renamed from: s3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC6419e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque f59193a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f59194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f59195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f59196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f59197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f59198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f59199g;

    /* JADX INFO: renamed from: s3.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends o implements Comparable {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f59200k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (q() != bVar.q()) {
                return q() ? 1 : -1;
            }
            long j10 = this.f65557f - bVar.f65557f;
            if (j10 == 0) {
                j10 = this.f59200k - bVar.f59200k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends p {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g.a f59201g;

        public c(g.a aVar) {
            this.f59201g = aVar;
        }

        @Override // z2.g
        public final void w() {
            this.f59201g.a(this);
        }
    }

    public AbstractC6419e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f59193a.add(new b());
        }
        this.f59194b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f59194b.add(new c(new g.a() { // from class: s3.d
                @Override // z2.g.a
                public final void a(g gVar) {
                    this.f59192a.q((AbstractC6419e.c) gVar);
                }
            }));
        }
        this.f59195c = new ArrayDeque();
        this.f59199g = -9223372036854775807L;
    }

    private void p(b bVar) {
        bVar.m();
        this.f59193a.add(bVar);
    }

    @Override // r3.k
    public void c(long j10) {
        this.f59197e = j10;
    }

    @Override // z2.InterfaceC7279d
    public final void f(long j10) {
        this.f59199g = j10;
    }

    @Override // z2.InterfaceC7279d
    public void flush() {
        this.f59198f = 0L;
        this.f59197e = 0L;
        while (!this.f59195c.isEmpty()) {
            p((b) a0.l((b) this.f59195c.poll()));
        }
        b bVar = this.f59196d;
        if (bVar != null) {
            p(bVar);
            this.f59196d = null;
        }
    }

    protected abstract j h();

    protected abstract void i(o oVar);

    @Override // z2.InterfaceC7279d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o g() {
        AbstractC6614a.g(this.f59196d == null);
        if (this.f59193a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f59193a.pollFirst();
        this.f59196d = bVar;
        return bVar;
    }

    @Override // z2.InterfaceC7279d, I2.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public p b() {
        if (this.f59194b.isEmpty()) {
            return null;
        }
        while (!this.f59195c.isEmpty() && ((b) a0.l((b) this.f59195c.peek())).f65557f <= this.f59197e) {
            b bVar = (b) a0.l((b) this.f59195c.poll());
            if (bVar.q()) {
                p pVar = (p) a0.l((p) this.f59194b.pollFirst());
                pVar.k(4);
                p(bVar);
                return pVar;
            }
            i(bVar);
            if (n()) {
                j jVarH = h();
                p pVar2 = (p) a0.l((p) this.f59194b.pollFirst());
                pVar2.x(bVar.f65557f, jVarH, Long.MAX_VALUE);
                p(bVar);
                return pVar2;
            }
            p(bVar);
        }
        return null;
    }

    protected final p l() {
        return (p) this.f59194b.pollFirst();
    }

    protected final long m() {
        return this.f59197e;
    }

    protected abstract boolean n();

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // z2.InterfaceC7279d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(r3.o r7) {
        /*
            r6 = this;
            s3.e$b r0 = r6.f59196d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            t2.AbstractC6614a.a(r0)
            s3.e$b r7 = (s3.AbstractC6419e.b) r7
            boolean r0 = r7.q()
            if (r0 != 0) goto L2d
            long r0 = r7.f65557f
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2d
            long r2 = r6.f59199g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L2d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L2d
            r6.p(r7)
            goto L3c
        L2d:
            long r0 = r6.f59198f
            r2 = 1
            long r2 = r2 + r0
            r6.f59198f = r2
            s3.AbstractC6419e.b.C(r7, r0)
            java.util.ArrayDeque r0 = r6.f59195c
            r0.add(r7)
        L3c:
            r7 = 0
            r6.f59196d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.AbstractC6419e.e(r3.o):void");
    }

    protected void q(p pVar) {
        pVar.m();
        this.f59194b.add(pVar);
    }

    @Override // z2.InterfaceC7279d
    public void a() {
    }
}
