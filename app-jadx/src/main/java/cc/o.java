package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC6027q desiredType, Class receivedClass) {
        super("Cannot convert received '" + receivedClass + "' to the '" + desiredType + "', because of the inner ref type mismatch", null, 2, null);
        AbstractC5504s.h(desiredType, "desiredType");
        AbstractC5504s.h(receivedClass, "receivedClass");
    }
}
