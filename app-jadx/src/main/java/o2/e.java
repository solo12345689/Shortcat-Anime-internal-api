package O2;

import P9.AbstractC2011u;
import P9.K;
import java.util.ArrayList;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final K f12906b = K.c().d(new O9.f() { // from class: O2.c
        @Override // O9.f
        public final Object apply(Object obj) {
            return Long.valueOf(((r3.d) obj).f58495b);
        }
    }).a(K.c().e().d(new O9.f() { // from class: O2.d
        @Override // O9.f
        public final Object apply(Object obj) {
            return Long.valueOf(((r3.d) obj).f58496c);
        }
    }));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f12907a = new ArrayList();

    @Override // O2.a
    public boolean a(r3.d dVar, long j10) {
        AbstractC6614a.a(dVar.f58495b != -9223372036854775807L);
        AbstractC6614a.a(dVar.f58496c != -9223372036854775807L);
        boolean z10 = dVar.f58495b <= j10 && j10 < dVar.f58497d;
        for (int size = this.f12907a.size() - 1; size >= 0; size--) {
            if (dVar.f58495b >= ((r3.d) this.f12907a.get(size)).f58495b) {
                this.f12907a.add(size + 1, dVar);
                return z10;
            }
        }
        this.f12907a.add(0, dVar);
        return z10;
    }

    @Override // O2.a
    public AbstractC2011u b(long j10) {
        if (!this.f12907a.isEmpty()) {
            if (j10 >= ((r3.d) this.f12907a.get(0)).f58495b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f12907a.size(); i10++) {
                    r3.d dVar = (r3.d) this.f12907a.get(i10);
                    if (j10 >= dVar.f58495b && j10 < dVar.f58497d) {
                        arrayList.add(dVar);
                    }
                    if (j10 < dVar.f58495b) {
                        break;
                    }
                }
                AbstractC2011u abstractC2011uL = AbstractC2011u.L(f12906b, arrayList);
                AbstractC2011u.a aVarT = AbstractC2011u.t();
                for (int i11 = 0; i11 < abstractC2011uL.size(); i11++) {
                    aVarT.j(((r3.d) abstractC2011uL.get(i11)).f58494a);
                }
                return aVarT.k();
            }
        }
        return AbstractC2011u.A();
    }

    @Override // O2.a
    public long c(long j10) {
        if (this.f12907a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < ((r3.d) this.f12907a.get(0)).f58495b) {
            return -9223372036854775807L;
        }
        long jMax = ((r3.d) this.f12907a.get(0)).f58495b;
        for (int i10 = 0; i10 < this.f12907a.size(); i10++) {
            long j11 = ((r3.d) this.f12907a.get(i10)).f58495b;
            long j12 = ((r3.d) this.f12907a.get(i10)).f58497d;
            if (j12 > j10) {
                if (j11 > j10) {
                    break;
                }
                jMax = Math.max(jMax, j11);
            } else {
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // O2.a
    public void clear() {
        this.f12907a.clear();
    }

    @Override // O2.a
    public long d(long j10) {
        int i10 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f12907a.size()) {
                break;
            }
            long j11 = ((r3.d) this.f12907a.get(i10)).f58495b;
            long j12 = ((r3.d) this.f12907a.get(i10)).f58497d;
            if (j10 < j11) {
                jMin = jMin == -9223372036854775807L ? j11 : Math.min(jMin, j11);
            } else {
                if (j10 < j12) {
                    jMin = jMin == -9223372036854775807L ? j12 : Math.min(jMin, j12);
                }
                i10++;
            }
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // O2.a
    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f12907a.size()) {
            long j11 = ((r3.d) this.f12907a.get(i10)).f58495b;
            if (j10 > j11 && j10 > ((r3.d) this.f12907a.get(i10)).f58497d) {
                this.f12907a.remove(i10);
                i10--;
            } else if (j10 < j11) {
                return;
            }
            i10++;
        }
    }
}
