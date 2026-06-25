package Tf;

import Df.r;
import Td.L;
import Tf.m;
import Ud.AbstractC2273n;
import Vf.r0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k {
    public static final e b(String serialName, d kind) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(kind, "kind");
        if (r.l0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return r0.a(serialName, kind);
    }

    public static final e c(String serialName, e[] typeParameters, Function1 builderAction) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(typeParameters, "typeParameters");
        AbstractC5504s.h(builderAction, "builderAction");
        if (r.l0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new h(serialName, m.a.f17534a, aVar.f().size(), AbstractC2273n.V0(typeParameters), aVar);
    }

    public static final e d(String serialName, l kind, e[] typeParameters, Function1 builder) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(kind, "kind");
        AbstractC5504s.h(typeParameters, "typeParameters");
        AbstractC5504s.h(builder, "builder");
        if (r.l0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (AbstractC5504s.c(kind, m.a.f17534a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new h(serialName, kind, aVar.f().size(), AbstractC2273n.V0(typeParameters), aVar);
    }

    public static /* synthetic */ e e(String str, l lVar, e[] eVarArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: Tf.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k.f((a) obj2);
                }
            };
        }
        return d(str, lVar, eVarArr, function1);
    }

    public static final L f(a aVar) {
        AbstractC5504s.h(aVar, "<this>");
        return L.f17438a;
    }
}
