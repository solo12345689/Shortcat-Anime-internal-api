package Yf;

import Td.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6014d f22929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rf.b f22930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f22931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function1 f22932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function1 f22933e;

    public b(InterfaceC6014d baseClass, Rf.b bVar) {
        AbstractC5504s.h(baseClass, "baseClass");
        this.f22929a = baseClass;
        this.f22930b = bVar;
        this.f22931c = new ArrayList();
    }

    public final void a(f builder) {
        AbstractC5504s.h(builder, "builder");
        Rf.b bVar = this.f22930b;
        if (bVar != null) {
            InterfaceC6014d interfaceC6014d = this.f22929a;
            f.j(builder, interfaceC6014d, interfaceC6014d, bVar, false, 8, null);
        }
        for (Pair pair : this.f22931c) {
            InterfaceC6014d interfaceC6014d2 = (InterfaceC6014d) pair.getFirst();
            Rf.b bVar2 = (Rf.b) pair.getSecond();
            InterfaceC6014d interfaceC6014d3 = this.f22929a;
            AbstractC5504s.f(interfaceC6014d2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            AbstractC5504s.f(bVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            f.j(builder, interfaceC6014d3, interfaceC6014d2, bVar2, false, 8, null);
        }
        Function1 function1 = this.f22932d;
        if (function1 != null) {
            builder.h(this.f22929a, function1, false);
        }
        Function1 function12 = this.f22933e;
        if (function12 != null) {
            builder.g(this.f22929a, function12, false);
        }
    }

    public final void b(InterfaceC6014d subclass, Rf.b serializer) {
        AbstractC5504s.h(subclass, "subclass");
        AbstractC5504s.h(serializer, "serializer");
        this.f22931c.add(z.a(subclass, serializer));
    }
}
