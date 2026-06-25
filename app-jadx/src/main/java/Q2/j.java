package Q2;

import Q2.k;
import Q2.m;
import java.io.FileNotFoundException;
import java.io.IOException;
import q2.C6080L;
import w2.u;
import w2.x;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14314a;

    public j() {
        this(-1);
    }

    @Override // Q2.k
    public int a(int i10) {
        int i11 = this.f14314a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // Q2.k
    public k.b b(k.a aVar, k.c cVar) {
        if (!e(cVar.f14323c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new k.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new k.b(2, 60000L);
        }
        return null;
    }

    @Override // Q2.k
    public long c(k.c cVar) {
        IOException iOException = cVar.f14323c;
        if ((iOException instanceof C6080L) || (iOException instanceof FileNotFoundException) || (iOException instanceof u) || (iOException instanceof m.h) || w2.l.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f14324d - 1) * 1000, 5000);
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof x)) {
            return false;
        }
        int i10 = ((x) iOException).f62894d;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    public j(int i10) {
        this.f14314a = i10;
    }
}
