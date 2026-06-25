package Xf;

import Wf.AbstractC2358b;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Y {
    public static final X a(AbstractC2358b json, String source) {
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(source, "source");
        return !json.f().a() ? new X(source) : new Z(source);
    }
}
