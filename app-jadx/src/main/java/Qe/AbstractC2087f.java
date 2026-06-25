package Qe;

import Qe.A;
import Ve.a;
import We.d;
import Ze.i;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Qe.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2087f {
    public static final A a(Se.o proto, Ue.d nameResolver, Ue.h typeTable, boolean z10, boolean z11, boolean z12) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        AbstractC5504s.h(typeTable, "typeTable");
        i.f propertySignature = Ve.a.f20031d;
        AbstractC5504s.g(propertySignature, "propertySignature");
        a.d dVar = (a.d) Ue.f.a(proto, propertySignature);
        if (dVar == null) {
            return null;
        }
        if (z10) {
            d.a aVarC = We.h.f20878a.c(proto, nameResolver, typeTable, z12);
            if (aVarC == null) {
                return null;
            }
            return A.f14801b.b(aVarC);
        }
        if (!z11 || !dVar.J()) {
            return null;
        }
        A.a aVar = A.f14801b;
        a.c cVarE = dVar.E();
        AbstractC5504s.g(cVarE, "getSyntheticMethod(...)");
        return aVar.c(nameResolver, cVarE);
    }

    public static /* synthetic */ A b(Se.o oVar, Ue.d dVar, Ue.h hVar, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        if ((i10 & 32) != 0) {
            z12 = true;
        }
        return a(oVar, dVar, hVar, z10, z11, z12);
    }
}
