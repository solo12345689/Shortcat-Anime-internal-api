package xf;

import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import xf.AbstractC7155g;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: xf.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7150b {
    public final AbstractC7155g a(InterfaceC7247z functionDescriptor) {
        AbstractC5504s.h(functionDescriptor, "functionDescriptor");
        for (C7156h c7156h : b()) {
            if (c7156h.b(functionDescriptor)) {
                return c7156h.a(functionDescriptor);
            }
        }
        return AbstractC7155g.a.f64478b;
    }

    public abstract List b();
}
