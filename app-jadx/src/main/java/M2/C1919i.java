package M2;

import P9.AbstractC2011u;
import androidx.media3.exoplayer.C2905q0;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: renamed from: M2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1919i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2011u f11982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f11983b;

    /* JADX INFO: renamed from: M2.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f11984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC2011u f11985b;

        public a(d0 d0Var, List list) {
            this.f11984a = d0Var;
            this.f11985b = AbstractC2011u.w(list);
        }

        @Override // M2.d0
        public boolean a(C2905q0 c2905q0) {
            return this.f11984a.a(c2905q0);
        }

        public AbstractC2011u b() {
            return this.f11985b;
        }

        @Override // M2.d0
        public long c() {
            return this.f11984a.c();
        }

        @Override // M2.d0
        public long f() {
            return this.f11984a.f();
        }

        @Override // M2.d0
        public void g(long j10) {
            this.f11984a.g(j10);
        }

        @Override // M2.d0
        public boolean q() {
            return this.f11984a.q();
        }
    }

    public C1919i(List list, List list2) {
        AbstractC2011u.a aVarT = AbstractC2011u.t();
        AbstractC6614a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarT.a(new a((d0) list.get(i10), (List) list2.get(i10)));
        }
        this.f11982a = aVarT.k();
        this.f11983b = -9223372036854775807L;
    }

    @Override // M2.d0
    public boolean a(C2905q0 c2905q0) {
        boolean zA;
        boolean z10 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                return z10;
            }
            zA = false;
            for (int i10 = 0; i10 < this.f11982a.size(); i10++) {
                long jC2 = ((a) this.f11982a.get(i10)).c();
                boolean z11 = jC2 != Long.MIN_VALUE && jC2 <= c2905q0.f31187a;
                if (jC2 == jC || z11) {
                    zA |= ((a) this.f11982a.get(i10)).a(c2905q0);
                }
            }
            z10 |= zA;
        } while (zA);
        return z10;
    }

    @Override // M2.d0
    public long c() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f11982a.size(); i10++) {
            long jC = ((a) this.f11982a.get(i10)).c();
            if (jC != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // M2.d0
    public long f() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f11982a.size(); i10++) {
            a aVar = (a) this.f11982a.get(i10);
            long jF = aVar.f();
            if ((aVar.b().contains(1) || aVar.b().contains(2) || aVar.b().contains(4)) && jF != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jF);
            }
            if (jF != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jF);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f11983b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f11983b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // M2.d0
    public void g(long j10) {
        for (int i10 = 0; i10 < this.f11982a.size(); i10++) {
            ((a) this.f11982a.get(i10)).g(j10);
        }
    }

    @Override // M2.d0
    public boolean q() {
        for (int i10 = 0; i10 < this.f11982a.size(); i10++) {
            if (((a) this.f11982a.get(i10)).q()) {
                return true;
            }
        }
        return false;
    }
}
