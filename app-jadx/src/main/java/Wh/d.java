package Wh;

import Yh.A;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class d implements h {
    @Override // Wh.h
    public j a(i iVar) {
        m mVarA = iVar.a();
        l lVarO = mVarA.o();
        int iG = mVarA.g('`');
        l lVarO2 = mVarA.o();
        while (mVarA.b('`') > 0) {
            l lVarO3 = mVarA.o();
            if (mVarA.g('`') == iG) {
                Yh.d dVar = new Yh.d();
                String strReplace = mVarA.d(lVarO2, lVarO3).c().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && Xh.f.e(strReplace)) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                dVar.o(strReplace);
                return j.b(dVar, mVarA.o());
            }
        }
        return j.b(new A(mVarA.d(lVarO, lVarO2).c()), lVarO2);
    }
}
