package Wh;

import Yh.A;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Xh.a f20952a = Xh.a.b().d('0', '9').d('A', 'F').d('a', 'f').b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Xh.a f20953b = Xh.a.b().d('0', '9').b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Xh.a f20954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Xh.a f20955d;

    static {
        Xh.a aVarB = Xh.a.b().d('A', 'Z').d('a', 'z').b();
        f20954c = aVarB;
        f20955d = aVarB.c().d('0', '9').b();
    }

    private j b(m mVar, l lVar) {
        return j.b(new A(Xh.d.a(mVar.d(lVar, mVar.o()).c())), mVar.o());
    }

    @Override // Wh.h
    public j a(i iVar) {
        m mVarA = iVar.a();
        l lVarO = mVarA.o();
        mVarA.h();
        char cL = mVarA.l();
        if (cL == '#') {
            mVarA.h();
            if (mVarA.i('x') || mVarA.i('X')) {
                int iF = mVarA.f(f20952a);
                if (1 <= iF && iF <= 6 && mVarA.i(';')) {
                    return b(mVarA, lVarO);
                }
            } else {
                int iF2 = mVarA.f(f20953b);
                if (1 <= iF2 && iF2 <= 7 && mVarA.i(';')) {
                    return b(mVarA, lVarO);
                }
            }
        } else if (f20954c.a(cL)) {
            mVarA.f(f20955d);
            if (mVarA.i(';')) {
                return b(mVarA, lVarO);
            }
        }
        return j.a();
    }
}
