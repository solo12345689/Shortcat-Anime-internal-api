package Yf;

import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class d extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String msg) {
        super(msg);
        AbstractC5504s.h(msg, "msg");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC6014d baseClass, InterfaceC6014d concreteClass) {
        this("Serializer for " + concreteClass + " already registered in the scope of " + baseClass);
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(concreteClass, "concreteClass");
    }
}
