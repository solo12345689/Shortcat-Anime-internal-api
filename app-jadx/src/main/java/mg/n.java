package mg;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f53687a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b errorCode) {
        super("stream was reset: " + errorCode);
        AbstractC5504s.h(errorCode, "errorCode");
        this.f53687a = errorCode;
    }
}
