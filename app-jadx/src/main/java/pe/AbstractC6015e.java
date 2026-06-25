package pe;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: pe.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6015e {
    public static final Object a(InterfaceC6014d interfaceC6014d, Object obj) {
        AbstractC5504s.h(interfaceC6014d, "<this>");
        if (interfaceC6014d.t(obj)) {
            AbstractC5504s.f(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC6014d.u());
    }
}
