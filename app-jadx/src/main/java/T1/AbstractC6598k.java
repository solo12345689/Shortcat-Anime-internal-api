package t1;

import m1.C5625d;
import t1.C6592e;

/* JADX INFO: renamed from: t1.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6598k {

    /* JADX INFO: renamed from: a */
    static boolean[] f60495a = new boolean[3];

    static void a(C6593f c6593f, C5625d c5625d, C6592e c6592e) {
        c6592e.f60391t = -1;
        c6592e.f60393u = -1;
        C6592e.b bVar = c6593f.f60352Z[0];
        C6592e.b bVar2 = C6592e.b.WRAP_CONTENT;
        if (bVar != bVar2 && c6592e.f60352Z[0] == C6592e.b.MATCH_PARENT) {
            int i10 = c6592e.f60341O.f60303g;
            int iV = c6593f.V() - c6592e.f60343Q.f60303g;
            C6591d c6591d = c6592e.f60341O;
            c6591d.f60305i = c5625d.q(c6591d);
            C6591d c6591d2 = c6592e.f60343Q;
            c6591d2.f60305i = c5625d.q(c6591d2);
            c5625d.f(c6592e.f60341O.f60305i, i10);
            c5625d.f(c6592e.f60343Q.f60305i, iV);
            c6592e.f60391t = 2;
            c6592e.K0(i10, iV);
        }
        if (c6593f.f60352Z[1] == bVar2 || c6592e.f60352Z[1] != C6592e.b.MATCH_PARENT) {
            return;
        }
        int i11 = c6592e.f60342P.f60303g;
        int iX = c6593f.x() - c6592e.f60344R.f60303g;
        C6591d c6591d3 = c6592e.f60342P;
        c6591d3.f60305i = c5625d.q(c6591d3);
        C6591d c6591d4 = c6592e.f60344R;
        c6591d4.f60305i = c5625d.q(c6591d4);
        c5625d.f(c6592e.f60342P.f60305i, i11);
        c5625d.f(c6592e.f60344R.f60305i, iX);
        if (c6592e.f60376l0 > 0 || c6592e.U() == 8) {
            C6591d c6591d5 = c6592e.f60345S;
            c6591d5.f60305i = c5625d.q(c6591d5);
            c5625d.f(c6592e.f60345S.f60305i, c6592e.f60376l0 + i11);
        }
        c6592e.f60393u = 2;
        c6592e.b1(i11, iX);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
