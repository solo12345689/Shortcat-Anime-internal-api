package cc;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String functionName) {
        super("Promise passed to '" + functionName + "' was already settled. It will lead to a crash in the production environment!", null, 2, null);
        AbstractC5504s.h(functionName, "functionName");
    }
}
