package Q8;

import R8.AbstractC2102c;
import R8.C2104e;
import R8.C2112m;
import R8.C2116q;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import n9.InterfaceC5760d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class O implements InterfaceC5760d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2057e f14423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f14424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2054b f14425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f14426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f14427e;

    O(C2057e c2057e, int i10, C2054b c2054b, long j10, long j11, String str, String str2) {
        this.f14423a = c2057e;
        this.f14424b = i10;
        this.f14425c = c2054b;
        this.f14426d = j10;
        this.f14427e = j11;
    }

    static O b(C2057e c2057e, int i10, C2054b c2054b) {
        boolean zF;
        if (!c2057e.e()) {
            return null;
        }
        R8.r rVarA = C2116q.b().a();
        if (rVarA == null) {
            zF = true;
        } else {
            if (!rVarA.e()) {
                return null;
            }
            zF = rVarA.f();
            E eT = c2057e.t(c2054b);
            if (eT != null) {
                if (!(eT.v() instanceof AbstractC2102c)) {
                    return null;
                }
                AbstractC2102c abstractC2102c = (AbstractC2102c) eT.v();
                if (abstractC2102c.I() && !abstractC2102c.c()) {
                    C2104e c2104eC = c(eT, abstractC2102c, i10);
                    if (c2104eC == null) {
                        return null;
                    }
                    eT.G();
                    zF = c2104eC.i();
                }
            }
        }
        return new O(c2057e, i10, c2054b, zF ? System.currentTimeMillis() : 0L, zF ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static C2104e c(E e10, AbstractC2102c abstractC2102c, int i10) {
        int[] iArrD;
        int[] iArrE;
        C2104e c2104eG = abstractC2102c.G();
        if (c2104eG == null || !c2104eG.f() || ((iArrD = c2104eG.d()) != null ? !com.google.android.gms.common.util.b.a(iArrD, i10) : !((iArrE = c2104eG.e()) == null || !com.google.android.gms.common.util.b.a(iArrE, i10))) || e10.t() >= c2104eG.c()) {
            return null;
        }
        return c2104eG;
    }

    @Override // n9.InterfaceC5760d
    public final void a(n9.i iVar) {
        E eT;
        int i10;
        int i11;
        int i12;
        int iD;
        long j10;
        long j11;
        if (this.f14423a.e()) {
            R8.r rVarA = C2116q.b().a();
            if ((rVarA == null || rVarA.e()) && (eT = this.f14423a.t(this.f14425c)) != null && (eT.v() instanceof AbstractC2102c)) {
                AbstractC2102c abstractC2102c = (AbstractC2102c) eT.v();
                int i13 = 0;
                boolean zF = this.f14426d > 0;
                int iX = abstractC2102c.x();
                int iD2 = 100;
                if (rVarA != null) {
                    zF &= rVarA.f();
                    int iC = rVarA.c();
                    int iD3 = rVarA.d();
                    i10 = rVarA.i();
                    if (abstractC2102c.I() && !abstractC2102c.c()) {
                        C2104e c2104eC = c(eT, abstractC2102c, this.f14424b);
                        if (c2104eC == null) {
                            return;
                        }
                        boolean z10 = c2104eC.i() && this.f14426d > 0;
                        iD3 = c2104eC.c();
                        zF = z10;
                    }
                    i12 = iC;
                    i11 = iD3;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                C2057e c2057e = this.f14423a;
                int iElapsedRealtime = -1;
                if (iVar.o()) {
                    iD = 0;
                } else if (iVar.m()) {
                    i13 = iD2;
                    iD = -1;
                } else {
                    Exception excJ = iVar.j();
                    if (excJ instanceof P8.b) {
                        Status statusA = ((P8.b) excJ).a();
                        iD2 = statusA.d();
                        ConnectionResult connectionResultC = statusA.c();
                        if (connectionResultC != null) {
                            iD = connectionResultC.d();
                            i13 = iD2;
                        }
                        i13 = iD2;
                        iD = -1;
                    } else {
                        i13 = 101;
                        iD = -1;
                    }
                }
                if (zF) {
                    long j12 = this.f14426d;
                    long j13 = this.f14427e;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = jCurrentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                c2057e.C(new C2112m(this.f14424b, i13, iD, j10, j11, null, null, iX, iElapsedRealtime), i10, i12, i11);
            }
        }
    }
}
