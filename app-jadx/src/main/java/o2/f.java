package O2;

import P9.AbstractC2011u;
import P9.AbstractC2014x;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f12908a = new ArrayList();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f12908a.size(); i10++) {
            if (j10 < ((r3.d) this.f12908a.get(i10)).f58495b) {
                return i10;
            }
        }
        return this.f12908a.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // O2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(r3.d r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f58495b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            t2.AbstractC6614a.a(r0)
            long r5 = r10.f58495b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f58497d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList r2 = r9.f12908a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f58495b
            java.util.ArrayList r3 = r9.f12908a
            java.lang.Object r3 = r3.get(r2)
            r3.d r3 = (r3.d) r3
            long r7 = r3.f58495b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList r11 = r9.f12908a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList r3 = r9.f12908a
            java.lang.Object r3 = r3.get(r2)
            r3.d r3 = (r3.d) r3
            long r5 = r3.f58495b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList r11 = r9.f12908a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.f.a(r3.d, long):boolean");
    }

    @Override // O2.a
    public AbstractC2011u b(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return AbstractC2011u.A();
        }
        r3.d dVar = (r3.d) this.f12908a.get(iF - 1);
        long j11 = dVar.f58497d;
        return (j11 == -9223372036854775807L || j10 < j11) ? dVar.f58494a : AbstractC2011u.A();
    }

    @Override // O2.a
    public long c(long j10) {
        if (this.f12908a.isEmpty() || j10 < ((r3.d) this.f12908a.get(0)).f58495b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f12908a.size(); i10++) {
            long j11 = ((r3.d) this.f12908a.get(i10)).f58495b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                r3.d dVar = (r3.d) this.f12908a.get(i10 - 1);
                long j12 = dVar.f58497d;
                return (j12 == -9223372036854775807L || j12 > j10) ? dVar.f58495b : j12;
            }
        }
        r3.d dVar2 = (r3.d) AbstractC2014x.d(this.f12908a);
        long j13 = dVar2.f58497d;
        return (j13 == -9223372036854775807L || j10 < j13) ? dVar2.f58495b : j13;
    }

    @Override // O2.a
    public void clear() {
        this.f12908a.clear();
    }

    @Override // O2.a
    public long d(long j10) {
        if (this.f12908a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < ((r3.d) this.f12908a.get(0)).f58495b) {
            return ((r3.d) this.f12908a.get(0)).f58495b;
        }
        for (int i10 = 1; i10 < this.f12908a.size(); i10++) {
            r3.d dVar = (r3.d) this.f12908a.get(i10);
            if (j10 < dVar.f58495b) {
                long j11 = ((r3.d) this.f12908a.get(i10 - 1)).f58497d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= dVar.f58495b) ? dVar.f58495b : j11;
            }
        }
        long j12 = ((r3.d) AbstractC2014x.d(this.f12908a)).f58497d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // O2.a
    public void e(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return;
        }
        long j11 = ((r3.d) this.f12908a.get(iF - 1)).f58497d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iF--;
        }
        this.f12908a.subList(0, iF).clear();
    }
}
