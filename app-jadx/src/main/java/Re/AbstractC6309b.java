package re;

import Ud.AbstractC2279u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pe.InterfaceC6014d;
import pe.InterfaceC6016f;
import pe.InterfaceC6027q;
import pe.InterfaceC6028r;
import se.U0;
import se.Y0;
import ye.EnumC7228f;
import ye.InterfaceC7227e;
import ye.InterfaceC7230h;

/* JADX INFO: renamed from: re.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6309b {
    public static final InterfaceC6014d a(InterfaceC6016f interfaceC6016f) {
        Object obj;
        InterfaceC6014d interfaceC6014dB;
        AbstractC5504s.h(interfaceC6016f, "<this>");
        if (interfaceC6016f instanceof InterfaceC6014d) {
            return (InterfaceC6014d) interfaceC6016f;
        }
        if (!(interfaceC6016f instanceof InterfaceC6028r)) {
            throw new Y0("Cannot calculate JVM erasure for type: " + interfaceC6016f);
        }
        List upperBounds = ((InterfaceC6028r) interfaceC6016f).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC6027q interfaceC6027q = (InterfaceC6027q) next;
            AbstractC5504s.f(interfaceC6027q, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            InterfaceC7230h interfaceC7230hP = ((U0) interfaceC6027q).A().N0().p();
            InterfaceC7227e interfaceC7227e = interfaceC7230hP instanceof InterfaceC7227e ? (InterfaceC7227e) interfaceC7230hP : null;
            if (interfaceC7227e != null && interfaceC7227e.h() != EnumC7228f.f65098c && interfaceC7227e.h() != EnumC7228f.f65101f) {
                obj = next;
                break;
            }
        }
        InterfaceC6027q interfaceC6027q2 = (InterfaceC6027q) obj;
        if (interfaceC6027q2 == null) {
            interfaceC6027q2 = (InterfaceC6027q) AbstractC2279u.o0(upperBounds);
        }
        return (interfaceC6027q2 == null || (interfaceC6014dB = b(interfaceC6027q2)) == null) ? O.b(Object.class) : interfaceC6014dB;
    }

    public static final InterfaceC6014d b(InterfaceC6027q interfaceC6027q) {
        InterfaceC6014d interfaceC6014dA;
        AbstractC5504s.h(interfaceC6027q, "<this>");
        InterfaceC6016f interfaceC6016fC = interfaceC6027q.c();
        if (interfaceC6016fC != null && (interfaceC6014dA = a(interfaceC6016fC)) != null) {
            return interfaceC6014dA;
        }
        throw new Y0("Cannot calculate JVM erasure for type: " + interfaceC6027q);
    }
}
