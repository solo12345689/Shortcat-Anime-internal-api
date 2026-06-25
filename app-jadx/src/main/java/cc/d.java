package cc;

import Ud.AbstractC2273n;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC6014d enumType, Enum[] enumConstants, Object obj) {
        super("'" + obj + "' is not present in " + enumType.v() + " enum, it must be one of: " + AbstractC2273n.y0(enumConstants, ", ", null, null, 0, null, new Function1() { // from class: cc.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return d.b((Enum) obj2);
            }
        }, 30, null), null, 2, null);
        AbstractC5504s.h(enumType, "enumType");
        AbstractC5504s.h(enumConstants, "enumConstants");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence b(Enum it) {
        AbstractC5504s.h(it, "it");
        return "'" + it.name() + "'";
    }
}
