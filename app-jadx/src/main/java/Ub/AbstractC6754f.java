package ub;

import Ud.AbstractC2279u;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ub.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6754f {
    public static final String a(Throwable th2) {
        AbstractC5504s.h(th2, "<this>");
        String localizedMessage = th2.getLocalizedMessage();
        Throwable cause = th2.getCause();
        return AbstractC2279u.w0(AbstractC2279u.r(localizedMessage, cause != null ? a(cause) : null), ": ", null, null, 0, null, null, 62, null);
    }
}
