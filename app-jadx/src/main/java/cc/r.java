package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC6027q forType) {
        super("Cannot find type converter for '" + forType + "'. Make sure the class implements `expo.modules.kotlin.records.Record` (i.e. `class MyObj : Record`).", null, 2, null);
        AbstractC5504s.h(forType, "forType");
    }
}
