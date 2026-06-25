package Eb;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {
    public static final boolean a(Y1.a aVar) {
        AbstractC5504s.h(aVar, "<this>");
        if (aVar.l()) {
            Y1.a[] aVarArrP = aVar.p();
            AbstractC5504s.g(aVarArrP, "listFiles(...)");
            for (Y1.a aVar2 : aVarArrP) {
                AbstractC5504s.e(aVar2);
                a(aVar2);
            }
        }
        return aVar.e();
    }
}
