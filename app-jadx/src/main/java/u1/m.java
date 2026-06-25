package u1;

import java.util.ArrayList;
import t1.C6593f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: h */
    public static int f61177h;

    /* JADX INFO: renamed from: c */
    p f61180c;

    /* JADX INFO: renamed from: d */
    p f61181d;

    /* JADX INFO: renamed from: f */
    int f61183f;

    /* JADX INFO: renamed from: g */
    int f61184g;

    /* JADX INFO: renamed from: a */
    public int f61178a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f61179b = false;

    /* JADX INFO: renamed from: e */
    ArrayList f61182e = new ArrayList();

    m(p pVar, int i10) {
        this.f61180c = null;
        this.f61181d = null;
        int i11 = f61177h;
        this.f61183f = i11;
        f61177h = i11 + 1;
        this.f61180c = pVar;
        this.f61181d = pVar;
        this.f61184g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f61153d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f61160k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f61160k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f61153d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f61155f) + j10));
                }
            }
        }
        if (fVar != pVar.f61210i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f61209h, j11)), j11 - ((long) pVar.f61209h.f61155f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f61153d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f61160k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f61160k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f61153d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f61155f) + j10));
                }
            }
        }
        if (fVar != pVar.f61209h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f61210i, j11)), j11 - ((long) pVar.f61210i.f61155f));
    }

    public void a(p pVar) {
        this.f61182e.add(pVar);
        this.f61181d = pVar;
    }

    public long b(C6593f c6593f, int i10) {
        long j10;
        int i11;
        p pVar = this.f61180c;
        if (pVar instanceof c) {
            if (((c) pVar).f61207f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar = (i10 == 0 ? c6593f.f60361e : c6593f.f60363f).f61209h;
        f fVar2 = (i10 == 0 ? c6593f.f60361e : c6593f.f60363f).f61210i;
        boolean zContains = pVar.f61209h.f61161l.contains(fVar);
        boolean zContains2 = this.f61180c.f61210i.f61161l.contains(fVar2);
        long j11 = this.f61180c.j();
        if (zContains && zContains2) {
            long jD = d(this.f61180c.f61209h, 0L);
            long jC = c(this.f61180c.f61210i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f61180c;
            int i12 = pVar2.f61210i.f61155f;
            if (j12 >= (-i12)) {
                j12 += (long) i12;
            }
            int i13 = pVar2.f61209h.f61155f;
            long j13 = ((-jC) - j11) - ((long) i13);
            if (j13 >= i13) {
                j13 -= (long) i13;
            }
            float fQ = pVar2.f61203b.q(i10);
            float f10 = fQ > 0.0f ? (long) ((j13 / fQ) + (j12 / (1.0f - fQ))) : 0L;
            long j14 = ((long) ((f10 * fQ) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fQ)) + 0.5f));
            p pVar3 = this.f61180c;
            j10 = ((long) pVar3.f61209h.f61155f) + j14;
            i11 = pVar3.f61210i.f61155f;
        } else {
            if (zContains) {
                return Math.max(d(this.f61180c.f61209h, r12.f61155f), ((long) this.f61180c.f61209h.f61155f) + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f61180c.f61210i, r12.f61155f), ((long) (-this.f61180c.f61210i.f61155f)) + j11);
            }
            p pVar4 = this.f61180c;
            j10 = ((long) pVar4.f61209h.f61155f) + pVar4.j();
            i11 = this.f61180c.f61210i.f61155f;
        }
        return j10 - ((long) i11);
    }
}
