package Xf;

import Wf.AbstractC2358b;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class I {
    public static final void a(AbstractC2358b json, InterfaceC2385w writer, Rf.k serializer, Object obj) {
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(writer, "writer");
        AbstractC5504s.h(serializer, "serializer");
        new V(writer, json, e0.f21988c, new Wf.s[e0.b().size()]).t(serializer, obj);
    }
}
