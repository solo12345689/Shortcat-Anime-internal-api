package Wh;

import Yh.A;
import Yh.o;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f20948a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f20949b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // Wh.h
    public j a(i iVar) {
        String str;
        m mVarA = iVar.a();
        mVarA.h();
        l lVarO = mVarA.o();
        if (mVarA.b('>') > 0) {
            Zh.g gVarD = mVarA.d(lVarO, mVarA.o());
            String strC = gVarD.c();
            mVarA.h();
            if (f20948a.matcher(strC).matches()) {
                str = strC;
            } else if (f20949b.matcher(strC).matches()) {
                str = "mailto:" + strC;
            } else {
                str = null;
            }
            if (str != null) {
                o oVar = new o(str, null);
                A a10 = new A(strC);
                a10.k(gVarD.e());
                oVar.b(a10);
                return j.b(oVar, mVarA.o());
            }
        }
        return j.a();
    }
}
