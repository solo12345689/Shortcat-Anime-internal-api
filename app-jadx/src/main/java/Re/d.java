package re;

import Se.j;
import Se.u;
import Td.InterfaceC2158i;
import We.e;
import We.h;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;
import mf.K;
import pe.InterfaceC6018h;
import se.C6494i0;
import se.C6497k;
import se.j1;
import ye.g0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58770a = new a();

        a() {
            super(2, K.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final g0 invoke(K p02, j p12) {
            AbstractC5504s.h(p02, "p0");
            AbstractC5504s.h(p12, "p1");
            return p02.s(p12);
        }
    }

    public static final InterfaceC6018h a(InterfaceC2158i interfaceC2158i) {
        AbstractC5504s.h(interfaceC2158i, "<this>");
        Metadata metadata = (Metadata) interfaceC2158i.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        Pair pairJ = h.j(strArrD1, metadata.d2());
        e eVar = (e) pairJ.getFirst();
        j jVar = (j) pairJ.getSecond();
        Ue.c cVar = new Ue.c(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = interfaceC2158i.getClass();
        u uVarR0 = jVar.r0();
        AbstractC5504s.g(uVarR0, "getTypeTable(...)");
        return new C6494i0(C6497k.f59520d, (g0) j1.h(cls, jVar, eVar, new Ue.h(uVarR0), cVar, a.f58770a));
    }
}
