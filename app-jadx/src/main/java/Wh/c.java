package Wh;

import Yh.A;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f20950a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // Wh.h
    public j a(i iVar) {
        m mVarA = iVar.a();
        mVarA.h();
        char cL = mVarA.l();
        if (cL == '\n') {
            mVarA.h();
            return j.b(new Yh.i(), mVarA.o());
        }
        if (!f20950a.matcher(String.valueOf(cL)).matches()) {
            return j.b(new A("\\"), mVarA.o());
        }
        mVarA.h();
        return j.b(new A(String.valueOf(cL)), mVarA.o());
    }
}
