package E2;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import q2.U;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class c implements L2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f4214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f4215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f4216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f4217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f4218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f4219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f4220m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List list) {
        this.f4208a = j10;
        this.f4209b = j11;
        this.f4210c = j12;
        this.f4211d = z10;
        this.f4212e = j13;
        this.f4213f = j14;
        this.f4214g = j15;
        this.f4215h = j16;
        this.f4219l = hVar;
        this.f4216i = oVar;
        this.f4218k = uri;
        this.f4217j = lVar;
        this.f4220m = list == null ? Collections.EMPTY_LIST : list;
    }

    private static ArrayList c(List list, LinkedList linkedList) {
        U u10 = (U) linkedList.poll();
        int i10 = u10.f56635a;
        ArrayList arrayList = new ArrayList();
        do {
            int i11 = u10.f56636b;
            a aVar = (a) list.get(i11);
            List list2 = aVar.f4200c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add((j) list2.get(u10.f56637c));
                u10 = (U) linkedList.poll();
                if (u10.f56635a != i10) {
                    break;
                }
            } while (u10.f56636b == i11);
            arrayList.add(new a(aVar.f4198a, aVar.f4199b, arrayList2, aVar.f4201d, aVar.f4202e, aVar.f4203f));
        } while (u10.f56635a == i10);
        linkedList.addFirst(u10);
        return arrayList;
    }

    @Override // L2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new U(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= e()) {
                break;
            }
            if (((U) linkedList.peek()).f56635a != i10) {
                long jF = f(i10);
                if (jF != -9223372036854775807L) {
                    j10 += jF;
                }
            } else {
                g gVarD = d(i10);
                arrayList.add(new g(gVarD.f4244a, gVarD.f4245b - j10, c(gVarD.f4246c, linkedList), gVarD.f4247d));
            }
            i10++;
        }
        long j11 = this.f4209b;
        return new c(this.f4208a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f4210c, this.f4211d, this.f4212e, this.f4213f, this.f4214g, this.f4215h, this.f4219l, this.f4216i, this.f4217j, this.f4218k, arrayList);
    }

    public final g d(int i10) {
        return (g) this.f4220m.get(i10);
    }

    public final int e() {
        return this.f4220m.size();
    }

    public final long f(int i10) {
        long j10;
        long j11;
        if (i10 == this.f4220m.size() - 1) {
            j10 = this.f4209b;
            if (j10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j11 = ((g) this.f4220m.get(i10)).f4245b;
        } else {
            j10 = ((g) this.f4220m.get(i10 + 1)).f4245b;
            j11 = ((g) this.f4220m.get(i10)).f4245b;
        }
        return j10 - j11;
    }

    public final long g(int i10) {
        return a0.V0(f(i10));
    }
}
