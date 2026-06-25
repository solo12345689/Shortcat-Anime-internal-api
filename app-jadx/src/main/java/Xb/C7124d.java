package xb;

import kotlin.jvm.internal.AbstractC5504s;
import rb.AbstractC6300a;

/* JADX INFO: renamed from: xb.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7124d extends AbstractC6300a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7124d(Throwable cause) {
        super("AES encryption failed: " + cause.getMessage(), cause);
        AbstractC5504s.h(cause, "cause");
    }
}
