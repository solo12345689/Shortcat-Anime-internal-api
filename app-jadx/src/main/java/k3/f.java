package k3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t2.C6609I;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC5441b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f52032a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f52034b;

        private b(int i10, long j10) {
            this.f52033a = i10;
            this.f52034b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f52035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f52036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f52037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f52038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f52039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f52040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f52041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f52042h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f52043i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f52044j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f52045k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f52035a = j10;
            this.f52036b = z10;
            this.f52037c = z11;
            this.f52038d = z12;
            this.f52040f = Collections.unmodifiableList(list);
            this.f52039e = j11;
            this.f52041g = z13;
            this.f52042h = j12;
            this.f52043i = i10;
            this.f52044j = i11;
            this.f52045k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(C6609I c6609i) {
            boolean z10;
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j10;
            boolean z13;
            long j11;
            int i10;
            int i11;
            int iM;
            boolean z14;
            long jO;
            long jO2 = c6609i.O();
            boolean z15 = true;
            if ((c6609i.M() & 128) != 0) {
                z10 = true;
            } else {
                z10 = true;
                z15 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z15) {
                arrayList = arrayList2;
                z11 = false;
                z12 = false;
                j10 = -9223372036854775807L;
                z13 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iM = 0;
            } else {
                int iM2 = c6609i.M();
                boolean z16 = (iM2 & 128) != 0 ? z10 : false;
                boolean z17 = (iM2 & 64) != 0 ? z10 : false;
                boolean z18 = (iM2 & 32) != 0 ? z10 : false;
                long jO3 = z17 ? c6609i.O() : -9223372036854775807L;
                if (!z17) {
                    int iM3 = c6609i.M();
                    ArrayList arrayList3 = new ArrayList(iM3);
                    int i12 = 0;
                    while (i12 < iM3) {
                        arrayList3.add(new b(c6609i.M(), c6609i.O()));
                        i12++;
                        iM3 = iM3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long jM = c6609i.M();
                    boolean z19 = (128 & jM) != 0;
                    jO = ((((jM & 1) << 32) | c6609i.O()) * 1000) / 90;
                    z14 = z19;
                } else {
                    z14 = false;
                    jO = -9223372036854775807L;
                }
                int iU = c6609i.U();
                int iM4 = c6609i.M();
                boolean z20 = z16;
                z13 = z14;
                z11 = z20;
                iM = c6609i.M();
                long j12 = jO3;
                i10 = iU;
                i11 = iM4;
                long j13 = jO;
                arrayList = arrayList2;
                z12 = z17;
                j10 = j12;
                j11 = j13;
            }
            return new c(jO2, z15, z11, z12, arrayList, j10, z13, j11, i10, i11, iM);
        }
    }

    private f(List list) {
        this.f52032a = Collections.unmodifiableList(list);
    }

    static f d(C6609I c6609i) {
        int iM = c6609i.M();
        ArrayList arrayList = new ArrayList(iM);
        for (int i10 = 0; i10 < iM; i10++) {
            arrayList.add(c.b(c6609i));
        }
        return new f(arrayList);
    }
}
