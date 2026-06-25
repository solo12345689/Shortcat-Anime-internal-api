package Yf;

import Rf.k;
import Td.r;
import Yf.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a */
    private final Map f22934a;

    /* JADX INFO: renamed from: b */
    public final Map f22935b;

    /* JADX INFO: renamed from: c */
    private final Map f22936c;

    /* JADX INFO: renamed from: d */
    private final Map f22937d;

    /* JADX INFO: renamed from: e */
    private final Map f22938e;

    /* JADX INFO: renamed from: f */
    private final boolean f22939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z10) {
        super(null);
        AbstractC5504s.h(class2ContextualFactory, "class2ContextualFactory");
        AbstractC5504s.h(polyBase2Serializers, "polyBase2Serializers");
        AbstractC5504s.h(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        AbstractC5504s.h(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        AbstractC5504s.h(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f22934a = class2ContextualFactory;
        this.f22935b = polyBase2Serializers;
        this.f22936c = polyBase2DefaultSerializerProvider;
        this.f22937d = polyBase2NamedSerializers;
        this.f22938e = polyBase2DefaultDeserializerProvider;
        this.f22939f = z10;
    }

    @Override // Yf.e
    public void a(i collector) {
        AbstractC5504s.h(collector, "collector");
        for (Map.Entry entry : this.f22934a.entrySet()) {
            InterfaceC6014d interfaceC6014d = (InterfaceC6014d) entry.getKey();
            a aVar = (a) entry.getValue();
            if (aVar instanceof a.C0393a) {
                AbstractC5504s.f(interfaceC6014d, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Rf.b bVarB = ((a.C0393a) aVar).b();
                AbstractC5504s.f(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.b(interfaceC6014d, bVarB);
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new r();
                }
                collector.a(interfaceC6014d, ((a.b) aVar).b());
            }
        }
        for (Map.Entry entry2 : this.f22935b.entrySet()) {
            InterfaceC6014d interfaceC6014d2 = (InterfaceC6014d) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                InterfaceC6014d interfaceC6014d3 = (InterfaceC6014d) entry3.getKey();
                Rf.b bVar = (Rf.b) entry3.getValue();
                AbstractC5504s.f(interfaceC6014d2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC5504s.f(interfaceC6014d3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC5504s.f(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.e(interfaceC6014d2, interfaceC6014d3, bVar);
            }
        }
        for (Map.Entry entry4 : this.f22936c.entrySet()) {
            InterfaceC6014d interfaceC6014d4 = (InterfaceC6014d) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            AbstractC5504s.f(interfaceC6014d4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC5504s.f(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.c(interfaceC6014d4, (Function1) V.e(function1, 1));
        }
        for (Map.Entry entry5 : this.f22938e.entrySet()) {
            InterfaceC6014d interfaceC6014d5 = (InterfaceC6014d) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            AbstractC5504s.f(interfaceC6014d5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            AbstractC5504s.f(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.d(interfaceC6014d5, (Function1) V.e(function12, 1));
        }
    }

    @Override // Yf.e
    public Rf.b b(InterfaceC6014d kClass, List typeArgumentsSerializers) {
        AbstractC5504s.h(kClass, "kClass");
        AbstractC5504s.h(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = (a) this.f22934a.get(kClass);
        Rf.b bVarA = aVar != null ? aVar.a(typeArgumentsSerializers) : null;
        if (bVarA != null) {
            return bVarA;
        }
        return null;
    }

    @Override // Yf.e
    public Rf.a d(InterfaceC6014d baseClass, String str) {
        AbstractC5504s.h(baseClass, "baseClass");
        Map map = (Map) this.f22937d.get(baseClass);
        Rf.b bVar = map != null ? (Rf.b) map.get(str) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f22938e.get(baseClass);
        Function1 function1 = V.k(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (Rf.a) function1.invoke(str);
        }
        return null;
    }

    @Override // Yf.e
    public k e(InterfaceC6014d baseClass, Object value) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(value, "value");
        if (!baseClass.t(value)) {
            return null;
        }
        Map map = (Map) this.f22935b.get(baseClass);
        Rf.b bVar = map != null ? (Rf.b) map.get(O.b(value.getClass())) : null;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        Object obj = this.f22936c.get(baseClass);
        Function1 function1 = V.k(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (k) function1.invoke(value);
        }
        return null;
    }
}
