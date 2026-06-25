package bf;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7224b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class n {
    public abstract void a(InterfaceC7224b interfaceC7224b);

    public abstract void b(InterfaceC7224b interfaceC7224b, InterfaceC7224b interfaceC7224b2);

    public abstract void c(InterfaceC7224b interfaceC7224b, InterfaceC7224b interfaceC7224b2);

    public void d(InterfaceC7224b member, Collection overridden) {
        AbstractC5504s.h(member, "member");
        AbstractC5504s.h(overridden, "overridden");
        member.E0(overridden);
    }
}
