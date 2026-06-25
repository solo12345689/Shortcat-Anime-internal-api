package Yf;

import Ud.S;
import Vf.AbstractC2323d0;
import Yf.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22940a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f22941b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f22942c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f22943d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f22944e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22945f;

    public static /* synthetic */ void j(f fVar, InterfaceC6014d interfaceC6014d, InterfaceC6014d interfaceC6014d2, Rf.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        fVar.i(interfaceC6014d, interfaceC6014d2, bVar, z10);
    }

    public static /* synthetic */ void l(f fVar, InterfaceC6014d interfaceC6014d, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        fVar.k(interfaceC6014d, aVar, z10);
    }

    @Override // Yf.i
    public void a(InterfaceC6014d kClass, Function1 provider) {
        AbstractC5504s.h(kClass, "kClass");
        AbstractC5504s.h(provider, "provider");
        l(this, kClass, new a.b(provider), false, 4, null);
    }

    @Override // Yf.i
    public void b(InterfaceC6014d kClass, Rf.b serializer) {
        AbstractC5504s.h(kClass, "kClass");
        AbstractC5504s.h(serializer, "serializer");
        l(this, kClass, new a.C0393a(serializer), false, 4, null);
    }

    @Override // Yf.i
    public void c(InterfaceC6014d baseClass, Function1 defaultSerializerProvider) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(defaultSerializerProvider, "defaultSerializerProvider");
        h(baseClass, defaultSerializerProvider, false);
    }

    @Override // Yf.i
    public void d(InterfaceC6014d baseClass, Function1 defaultDeserializerProvider) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(defaultDeserializerProvider, "defaultDeserializerProvider");
        g(baseClass, defaultDeserializerProvider, false);
    }

    @Override // Yf.i
    public void e(InterfaceC6014d baseClass, InterfaceC6014d actualClass, Rf.b actualSerializer) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(actualClass, "actualClass");
        AbstractC5504s.h(actualSerializer, "actualSerializer");
        j(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    public final e f() {
        return new c(this.f22940a, this.f22941b, this.f22942c, this.f22943d, this.f22944e, this.f22945f);
    }

    public final void g(InterfaceC6014d baseClass, Function1 defaultDeserializerProvider, boolean z10) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(defaultDeserializerProvider, "defaultDeserializerProvider");
        Function1 function1 = (Function1) this.f22944e.get(baseClass);
        if (function1 == null || AbstractC5504s.c(function1, defaultDeserializerProvider) || z10) {
            this.f22944e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
    }

    public final void h(InterfaceC6014d baseClass, Function1 defaultSerializerProvider, boolean z10) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(defaultSerializerProvider, "defaultSerializerProvider");
        Function1 function1 = (Function1) this.f22942c.get(baseClass);
        if (function1 == null || AbstractC5504s.c(function1, defaultSerializerProvider) || z10) {
            this.f22942c.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
    }

    public final void i(InterfaceC6014d baseClass, InterfaceC6014d concreteClass, Rf.b concreteSerializer, boolean z10) {
        Object next;
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(concreteClass, "concreteClass");
        AbstractC5504s.h(concreteSerializer, "concreteSerializer");
        String strO = concreteSerializer.getDescriptor().o();
        Map map = this.f22941b;
        Object map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(baseClass, map2);
        }
        Map map3 = (Map) map2;
        Rf.b bVar = (Rf.b) map3.get(concreteClass);
        Map map4 = this.f22943d;
        Object map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(baseClass, map5);
        }
        Map map6 = (Map) map5;
        if (z10) {
            if (bVar != null) {
                map6.remove(bVar.getDescriptor().o());
            }
            map3.put(concreteClass, concreteSerializer);
            map6.put(strO, concreteSerializer);
            return;
        }
        if (bVar != null) {
            if (!AbstractC5504s.c(bVar, concreteSerializer)) {
                throw new d(baseClass, concreteClass);
            }
        }
        Rf.b bVar2 = (Rf.b) map6.get(strO);
        if (bVar2 == null) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(strO, concreteSerializer);
            return;
        }
        Object obj = this.f22941b.get(baseClass);
        AbstractC5504s.e(obj);
        Iterator it = S.C((Map) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == bVar2) {
                    break;
                }
            }
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers for base class '" + baseClass + "' have the same serial name '" + strO + "': '" + concreteClass + "' and '" + ((Map.Entry) next) + '\'');
    }

    public final void k(InterfaceC6014d forClass, a provider, boolean z10) {
        a aVar;
        AbstractC5504s.h(forClass, "forClass");
        AbstractC5504s.h(provider, "provider");
        if (z10 || (aVar = (a) this.f22940a.get(forClass)) == null || AbstractC5504s.c(aVar, provider)) {
            this.f22940a.put(forClass, provider);
            if (AbstractC2323d0.b(forClass)) {
                this.f22945f = true;
                return;
            }
            return;
        }
        throw new d("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }
}
