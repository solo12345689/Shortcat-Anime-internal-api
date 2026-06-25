package Xf;

import Tf.l;
import Tf.m;
import Yf.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class T implements Yf.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21942b;

    public T(boolean z10, String discriminator) {
        AbstractC5504s.h(discriminator, "discriminator");
        this.f21941a = z10;
        this.f21942b = discriminator;
    }

    private final void f(Tf.e eVar, InterfaceC6014d interfaceC6014d) {
        int iK = eVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            String strL = eVar.l(i10);
            if (AbstractC5504s.c(strL, this.f21942b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC6014d + " has property '" + strL + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void g(Tf.e eVar, InterfaceC6014d interfaceC6014d) {
        Tf.l lVarH = eVar.h();
        if ((lVarH instanceof Tf.c) || AbstractC5504s.c(lVarH, l.a.f17532a)) {
            throw new IllegalArgumentException("Serializer for " + interfaceC6014d.v() + " can't be registered as a subclass for polymorphic serialization because its kind " + lVarH + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f21941a) {
            return;
        }
        if (AbstractC5504s.c(lVarH, m.b.f17535a) || AbstractC5504s.c(lVarH, m.c.f17536a) || (lVarH instanceof Tf.d) || (lVarH instanceof l.b)) {
            throw new IllegalArgumentException("Serializer for " + interfaceC6014d.v() + " of kind " + lVarH + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // Yf.i
    public void a(InterfaceC6014d kClass, Function1 provider) {
        AbstractC5504s.h(kClass, "kClass");
        AbstractC5504s.h(provider, "provider");
    }

    @Override // Yf.i
    public void b(InterfaceC6014d interfaceC6014d, Rf.b bVar) {
        i.a.b(this, interfaceC6014d, bVar);
    }

    @Override // Yf.i
    public void c(InterfaceC6014d baseClass, Function1 defaultSerializerProvider) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // Yf.i
    public void d(InterfaceC6014d baseClass, Function1 defaultDeserializerProvider) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // Yf.i
    public void e(InterfaceC6014d baseClass, InterfaceC6014d actualClass, Rf.b actualSerializer) {
        AbstractC5504s.h(baseClass, "baseClass");
        AbstractC5504s.h(actualClass, "actualClass");
        AbstractC5504s.h(actualSerializer, "actualSerializer");
        Tf.e descriptor = actualSerializer.getDescriptor();
        g(descriptor, actualClass);
        if (this.f21941a) {
            return;
        }
        f(descriptor, actualClass);
    }
}
