package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(InterfaceC6014d clazz) {
        super("Unsupported type: '" + clazz + "'", null, 2, null);
        AbstractC5504s.h(clazz, "clazz");
    }
}
