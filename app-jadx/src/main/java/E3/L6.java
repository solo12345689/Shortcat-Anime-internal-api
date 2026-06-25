package E3;

import E3.C1375h3;
import E3.M6;
import F3.g;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import q2.C6071C;
import q2.InterfaceC6084P;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g.e f4573a = new g.e("androidx.media3.session.MediaLibraryService", null);

    public static boolean a(F3.v vVar, F3.v vVar2) {
        boolean z10 = vVar != null && vVar.o() == 7;
        boolean z11 = vVar2 != null && vVar2.o() == 7;
        return (z10 && z11) ? ((F3.v) t2.a0.l(vVar)).g() == ((F3.v) t2.a0.l(vVar2)).g() && TextUtils.equals(((F3.v) t2.a0.l(vVar)).h(), ((F3.v) t2.a0.l(vVar2)).h()) : z10 == z11;
    }

    public static boolean b(W6 w62, W6 w63) {
        InterfaceC6084P.e eVar = w62.f5042a;
        int i10 = eVar.f56619c;
        InterfaceC6084P.e eVar2 = w63.f5042a;
        return i10 == eVar2.f56619c && eVar.f56622f == eVar2.f56622f && eVar.f56625i == eVar2.f56625i && eVar.f56626j == eVar2.f56626j;
    }

    public static int c(long j10, long j11) {
        if (j10 == -9223372036854775807L || j11 == -9223372036854775807L) {
            return 0;
        }
        if (j11 == 0) {
            return 100;
        }
        return t2.a0.r(t2.a0.f1(j10, j11), 0, 100);
    }

    public static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    public static long e(M6 m62, long j10, long j11, long j12) {
        boolean z10 = m62.f4668c.equals(W6.f5031l) || j11 < m62.f4668c.f5044c;
        if (m62.f4687v) {
            if (z10 || j10 == -9223372036854775807L) {
                if (j12 == -9223372036854775807L) {
                    j12 = SystemClock.elapsedRealtime() - m62.f4668c.f5044c;
                }
                W6 w62 = m62.f4668c;
                long j13 = w62.f5042a.f56623g + ((long) (j12 * m62.f4672g.f56601a));
                long j14 = w62.f5045d;
                return j14 != -9223372036854775807L ? Math.min(j13, j14) : j13;
            }
        } else if (z10 || j10 == -9223372036854775807L) {
            return m62.f4668c.f5042a.f56623g;
        }
        return j10;
    }

    public static InterfaceC6084P.b f(InterfaceC6084P.b bVar, InterfaceC6084P.b bVar2) {
        if (bVar == null || bVar2 == null) {
            return InterfaceC6084P.b.f56604b;
        }
        InterfaceC6084P.b.a aVar = new InterfaceC6084P.b.a();
        for (int i10 = 0; i10 < bVar.g(); i10++) {
            if (bVar2.c(bVar.f(i10))) {
                aVar.a(bVar.f(i10));
            }
        }
        return aVar.f();
    }

    public static M6 g(M6 m62, M6 m63, M6.c cVar, InterfaceC6084P.b bVar) {
        if (cVar.f4726a && bVar.c(17)) {
            m63 = m63.u(m62.f4675j);
        }
        return (cVar.f4727b && bVar.c(30)) ? m63.b(m62.f4664D) : m63;
    }

    public static List h(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void i(InterfaceC6084P interfaceC6084P, C1375h3.i iVar) {
        if (iVar.f5339b == -1) {
            if (interfaceC6084P.k(20)) {
                interfaceC6084P.L(iVar.f5338a, true);
                return;
            } else {
                if (iVar.f5338a.isEmpty()) {
                    return;
                }
                interfaceC6084P.d0((C6071C) iVar.f5338a.get(0), true);
                return;
            }
        }
        if (interfaceC6084P.k(20)) {
            interfaceC6084P.D0(iVar.f5338a, iVar.f5339b, iVar.f5340c);
        } else {
            if (iVar.f5338a.isEmpty()) {
                return;
            }
            interfaceC6084P.f0((C6071C) iVar.f5338a.get(0), iVar.f5340c);
        }
    }
}
