package ze;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: ze.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC7376j {
    public static final InterfaceC7374h a(InterfaceC7374h first, InterfaceC7374h second) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new C7381o(first, second);
    }
}
