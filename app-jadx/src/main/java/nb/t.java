package nb;

import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Throwable th2, String kind) {
        super("Failed to get " + kind + " from clipboard", th2);
        AbstractC5504s.h(kind, "kind");
    }
}
