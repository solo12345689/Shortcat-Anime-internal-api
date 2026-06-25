package qf;

import kotlin.jvm.internal.AbstractC5504s;
import le.InterfaceC5592c;
import pe.InterfaceC6023m;
import xf.C7162n;
import ze.InterfaceC7374h;

/* JADX INFO: renamed from: qf.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6209t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ InterfaceC6023m[] f58092a = {kotlin.jvm.internal.O.k(new kotlin.jvm.internal.F(AbstractC6209t.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC5592c f58093b;

    static {
        C7162n c7162nD = r0.f58089b.d(kotlin.jvm.internal.O.b(C6208s.class));
        AbstractC5504s.f(c7162nD, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f58093b = c7162nD;
    }

    public static final InterfaceC7374h a(r0 r0Var) {
        InterfaceC7374h interfaceC7374hE;
        AbstractC5504s.h(r0Var, "<this>");
        C6208s c6208sB = b(r0Var);
        return (c6208sB == null || (interfaceC7374hE = c6208sB.e()) == null) ? InterfaceC7374h.f66223k0.b() : interfaceC7374hE;
    }

    public static final C6208s b(r0 r0Var) {
        AbstractC5504s.h(r0Var, "<this>");
        return (C6208s) f58093b.a(r0Var, f58092a[0]);
    }
}
