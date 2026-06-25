package xf;

import kotlin.jvm.internal.AbstractC5504s;
import ye.InterfaceC7247z;

/* JADX INFO: renamed from: xf.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC7154f {

    /* JADX INFO: renamed from: xf.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static String a(InterfaceC7154f interfaceC7154f, InterfaceC7247z functionDescriptor) {
            AbstractC5504s.h(functionDescriptor, "functionDescriptor");
            if (interfaceC7154f.b(functionDescriptor)) {
                return null;
            }
            return interfaceC7154f.getDescription();
        }
    }

    String a(InterfaceC7247z interfaceC7247z);

    boolean b(InterfaceC7247z interfaceC7247z);

    String getDescription();
}
