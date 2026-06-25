package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends CodedException {
    public /* synthetic */ n(InterfaceC6014d interfaceC6014d, InterfaceC6014d interfaceC6014d2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6014d, interfaceC6014d2, (i10 & 4) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC6014d argumentType, InterfaceC6014d desiredType, Throwable th2) {
        super("Argument type '" + argumentType + "' is not compatible with expected type '" + desiredType + "'.", th2);
        AbstractC5504s.h(argumentType, "argumentType");
        AbstractC5504s.h(desiredType, "desiredType");
    }
}
