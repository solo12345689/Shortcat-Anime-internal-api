package Oe;

import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p {
    private static final boolean a(r rVar) {
        Xe.c cVarF;
        B b10 = (B) AbstractC2279u.O0(rVar.j());
        x type = b10 != null ? b10.getType() : null;
        j jVar = type instanceof j ? (j) type : null;
        if (jVar == null) {
            return false;
        }
        i iVarC = jVar.c();
        return (iVarC instanceof g) && (cVarF = ((g) iVarC).f()) != null && AbstractC5504s.c(cVarF.a(), "java.lang.Object");
    }

    private static final boolean b(r rVar) {
        String strB = rVar.getName().b();
        int iHashCode = strB.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strB.equals("equals")) {
                    return a(rVar);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strB.equals("hashCode")) {
                return false;
            }
        } else if (!strB.equals("toString")) {
            return false;
        }
        return rVar.j().isEmpty();
    }

    public static final boolean c(q qVar) {
        AbstractC5504s.h(qVar, "<this>");
        return qVar.O().J() && (qVar instanceof r) && b((r) qVar);
    }
}
