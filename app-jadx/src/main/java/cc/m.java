package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC3094b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String methodName, String moduleName, CodedException cause) {
        super("Call to function '" + moduleName + "." + methodName + "' has been rejected.", cause);
        AbstractC5504s.h(methodName, "methodName");
        AbstractC5504s.h(moduleName, "moduleName");
        AbstractC5504s.h(cause, "cause");
    }
}
