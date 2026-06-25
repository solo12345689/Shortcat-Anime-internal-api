package Vf;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2325e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Tf.e[] f20188a = new Tf.e[0];

    public static final Set a(Tf.e eVar) {
        AbstractC5504s.h(eVar, "<this>");
        if (eVar instanceof InterfaceC2338l) {
            return ((InterfaceC2338l) eVar).a();
        }
        HashSet hashSet = new HashSet(eVar.k());
        int iK = eVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            hashSet.add(eVar.l(i10));
        }
        return hashSet;
    }

    public static final Tf.e[] b(List list) {
        Tf.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (Tf.e[]) list.toArray(new Tf.e[0])) == null) ? f20188a : eVarArr;
    }
}
