package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InterfaceC6014d viewType, int i10) {
        super("Unable to find the " + viewType + " view with tag " + i10, null, 2, null);
        AbstractC5504s.h(viewType, "viewType");
    }
}
