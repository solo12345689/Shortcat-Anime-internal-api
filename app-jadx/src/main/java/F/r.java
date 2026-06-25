package F;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final int a(q qVar, Object obj, int i10) {
        int iC;
        return (obj == null || qVar.a() == 0 || (i10 < qVar.a() && AbstractC5504s.c(obj, qVar.d(i10))) || (iC = qVar.c(obj)) == -1) ? i10 : iC;
    }
}
