package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends AbstractC3094b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(InterfaceC6014d viewType, CodedException cause) {
        super("Error occurred when invoking 'onViewDidUpdateProps' on '" + viewType.v() + "'", cause);
        AbstractC5504s.h(viewType, "viewType");
        AbstractC5504s.h(cause, "cause");
    }
}
