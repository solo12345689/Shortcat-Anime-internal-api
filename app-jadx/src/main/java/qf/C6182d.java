package qf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: qf.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C6182d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C6182d f58037a = new C6182d();

    private C6182d() {
    }

    private final boolean a(uf.r rVar, uf.j jVar, uf.j jVar2) {
        if (rVar.m(jVar) != rVar.m(jVar2) || rVar.b0(jVar) != rVar.b0(jVar2) || rVar.q(jVar) != rVar.q(jVar2) || !rVar.j0(rVar.e(jVar), rVar.e(jVar2))) {
            return false;
        }
        if (rVar.S(jVar, jVar2)) {
            return true;
        }
        int iM = rVar.m(jVar);
        for (int i10 = 0; i10 < iM; i10++) {
            uf.m mVarB0 = rVar.B0(jVar, i10);
            uf.m mVarB02 = rVar.B0(jVar2, i10);
            if (rVar.c(mVarB0) != rVar.c(mVarB02)) {
                return false;
            }
            if (!rVar.c(mVarB0)) {
                if (rVar.o0(mVarB0) != rVar.o0(mVarB02)) {
                    return false;
                }
                uf.i iVarM0 = rVar.m0(mVarB0);
                AbstractC5504s.e(iVarM0);
                uf.i iVarM02 = rVar.m0(mVarB02);
                AbstractC5504s.e(iVarM02);
                if (!c(rVar, iVarM0, iVarM02)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean c(uf.r rVar, uf.i iVar, uf.i iVar2) {
        if (iVar == iVar2) {
            return true;
        }
        uf.j jVarD = rVar.d(iVar);
        uf.j jVarD2 = rVar.d(iVar2);
        if (jVarD != null && jVarD2 != null) {
            return a(rVar, jVarD, jVarD2);
        }
        uf.g gVarJ0 = rVar.J0(iVar);
        uf.g gVarJ02 = rVar.J0(iVar2);
        return gVarJ0 != null && gVarJ02 != null && a(rVar, rVar.g(gVarJ0), rVar.g(gVarJ02)) && a(rVar, rVar.h(gVarJ0), rVar.h(gVarJ02));
    }

    public final boolean b(uf.r context, uf.i a10, uf.i b10) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(a10, "a");
        AbstractC5504s.h(b10, "b");
        return c(context, a10, b10);
    }
}
