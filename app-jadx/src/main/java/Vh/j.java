package Vh;

import Yh.AbstractC2491a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class j extends ai.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Yh.j f20437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Zh.g f20438b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a extends ai.b {
        @Override // ai.e
        public ai.f a(ai.h hVar, ai.g gVar) {
            j jVarL;
            if (hVar.b() >= Xh.f.f22055a) {
                return ai.f.c();
            }
            Zh.f fVarA = hVar.a();
            int iD = hVar.d();
            if (fVarA.a().charAt(iD) == '#' && (jVarL = j.l(fVarA.d(iD, fVarA.a().length()))) != null) {
                return ai.f.d(jVarL).b(fVarA.a().length());
            }
            int iM = j.m(fVarA.a(), iD);
            if (iM > 0) {
                Zh.g gVarB = gVar.b();
                if (!gVarB.f()) {
                    return ai.f.d(new j(iM, gVarB)).b(fVarA.a().length()).e();
                }
            }
            return ai.f.c();
        }
    }

    public j(int i10, Zh.g gVar) {
        Yh.j jVar = new Yh.j();
        this.f20437a = jVar;
        jVar.p(i10);
        this.f20438b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j l(Zh.f fVar) {
        Wh.m mVarK = Wh.m.k(Zh.g.g(fVar));
        int iG = mVarK.g('#');
        if (iG == 0 || iG > 6) {
            return null;
        }
        if (!mVarK.e()) {
            return new j(iG, Zh.g.b());
        }
        char cL = mVarK.l();
        if (cL != ' ' && cL != '\t') {
            return null;
        }
        mVarK.r();
        Wh.l lVarO = mVarK.o();
        Wh.l lVarO2 = lVarO;
        loop0: while (true) {
            boolean z10 = true;
            while (mVarK.e()) {
                char cL2 = mVarK.l();
                if (cL2 == '\t' || cL2 == ' ') {
                    mVarK.h();
                } else {
                    if (cL2 != '#') {
                        mVarK.h();
                        lVarO2 = mVarK.o();
                    } else if (z10) {
                        mVarK.g('#');
                        int iR = mVarK.r();
                        if (mVarK.e()) {
                            lVarO2 = mVarK.o();
                        }
                        if (iR > 0) {
                            break;
                        }
                    } else {
                        mVarK.h();
                        lVarO2 = mVarK.o();
                    }
                    z10 = false;
                }
            }
            break loop0;
        }
        Zh.g gVarD = mVarK.d(lVarO, lVarO2);
        return gVarD.c().isEmpty() ? new j(iG, Zh.g.b()) : new j(iG, gVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '-') {
            if (cCharAt != '=') {
                return 0;
            }
            if (n(charSequence, i10 + 1, '=')) {
                return 1;
            }
        }
        return n(charSequence, i10 + 1, '-') ? 2 : 0;
    }

    private static boolean n(CharSequence charSequence, int i10, char c10) {
        return Xh.f.o(charSequence, Xh.f.m(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // ai.a, ai.d
    public void b(Zh.b bVar) {
        bVar.b(this.f20438b, this.f20437a);
    }

    @Override // ai.d
    public AbstractC2491a f() {
        return this.f20437a;
    }

    @Override // ai.d
    public ai.c i(ai.h hVar) {
        return ai.c.d();
    }
}
