package Vf;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2339l0 {
    public static final int a(Tf.e eVar, Tf.e[] typeParams) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(typeParams, "typeParams");
        int iHashCode = (eVar.o().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableA = Tf.i.a(eVar);
        Iterator it = iterableA.iterator();
        int iHashCode2 = 1;
        int i10 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i11 = i10 * 31;
            String strO = ((Tf.e) it.next()).o();
            if (strO != null) {
                iHashCode3 = strO.hashCode();
            }
            i10 = i11 + iHashCode3;
        }
        Iterator it2 = iterableA.iterator();
        while (it2.hasNext()) {
            int i12 = iHashCode2 * 31;
            Tf.l lVarH = ((Tf.e) it2.next()).h();
            iHashCode2 = i12 + (lVarH != null ? lVarH.hashCode() : 0);
        }
        return (((iHashCode * 31) + i10) * 31) + iHashCode2;
    }
}
