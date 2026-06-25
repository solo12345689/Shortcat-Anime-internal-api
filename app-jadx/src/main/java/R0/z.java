package R0;

import Td.InterfaceC2158i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC5506u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f15089a = new z();

    public z() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2092a invoke(C2092a c2092a, C2092a c2092a2) {
        String strB;
        InterfaceC2158i interfaceC2158iA;
        if (c2092a == null || (strB = c2092a.b()) == null) {
            strB = c2092a2.b();
        }
        if (c2092a == null || (interfaceC2158iA = c2092a.a()) == null) {
            interfaceC2158iA = c2092a2.a();
        }
        return new C2092a(strB, interfaceC2158iA);
    }
}
