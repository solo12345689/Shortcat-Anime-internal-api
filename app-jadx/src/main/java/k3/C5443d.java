package k3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t2.C6609I;
import t2.O;

/* JADX INFO: renamed from: k3.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5443d extends AbstractC5441b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f52016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f52017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f52019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f52020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f52021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f52022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f52023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f52024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f52025j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f52026k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f52027l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f52028m;

    /* JADX INFO: renamed from: k3.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f52030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f52031c;

        private b(int i10, long j10, long j11) {
            this.f52029a = i10;
            this.f52030b = j10;
            this.f52031c = j11;
        }
    }

    private C5443d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f52016a = j10;
        this.f52017b = z10;
        this.f52018c = z11;
        this.f52019d = z12;
        this.f52020e = z13;
        this.f52021f = j11;
        this.f52022g = j12;
        this.f52023h = Collections.unmodifiableList(list);
        this.f52024i = z14;
        this.f52025j = j13;
        this.f52026k = i10;
        this.f52027l = i11;
        this.f52028m = i12;
    }

    static C5443d d(C6609I c6609i, long j10, O o10) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iM;
        int iM2;
        boolean z14;
        int i11;
        long jE;
        long jO = c6609i.O();
        boolean z15 = (c6609i.M() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jO2 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iM = 0;
            iM2 = 0;
        } else {
            int iM3 = c6609i.M();
            boolean z16 = (iM3 & 128) != 0;
            boolean z17 = (iM3 & 64) != 0;
            boolean z18 = (iM3 & 32) != 0;
            boolean z19 = (iM3 & 16) != 0;
            long jE2 = (!z17 || z19) ? -9223372036854775807L : g.e(c6609i, j10);
            if (!z17) {
                int iM4 = c6609i.M();
                ArrayList arrayList = new ArrayList(iM4);
                int i12 = 0;
                while (i12 < iM4) {
                    int iM5 = c6609i.M();
                    if (z19) {
                        i11 = iM4;
                        jE = -9223372036854775807L;
                    } else {
                        i11 = iM4;
                        jE = g.e(c6609i, j10);
                    }
                    arrayList.add(new b(iM5, jE, o10.b(jE)));
                    i12++;
                    iM4 = i11;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jM = c6609i.M();
                boolean z20 = (128 & jM) != 0;
                jO2 = ((((jM & 1) << 32) | c6609i.O()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iU = c6609i.U();
            long j12 = jE2;
            j11 = jO2;
            jO2 = j12;
            iM = c6609i.M();
            iM2 = c6609i.M();
            i10 = iU;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new C5443d(jO, z15, z10, z11, z12, jO2, o10.b(jO2), list, z13, j11, i10, iM, iM2);
    }

    @Override // k3.AbstractC5441b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f52021f + ", programSplicePlaybackPositionUs= " + this.f52022g + " }";
    }
}
