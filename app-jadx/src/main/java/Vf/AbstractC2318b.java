package Vf;

import Uf.c;
import kotlin.jvm.internal.AbstractC5504s;
import pe.InterfaceC6014d;

/* JADX INFO: renamed from: Vf.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2318b implements Rf.b {
    public final Object b(Uf.c cVar) {
        return c.a.c(cVar, getDescriptor(), 1, Rf.d.a(this, cVar, cVar.l(getDescriptor(), 0)), null, 8, null);
    }

    public Rf.a c(Uf.c decoder, String str) {
        AbstractC5504s.h(decoder, "decoder");
        return decoder.a().d(e(), str);
    }

    public Rf.k d(Uf.f encoder, Object value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        return encoder.a().e(e(), value);
    }

    @Override // Rf.a
    public final Object deserialize(Uf.e decoder) {
        Object objB;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor = getDescriptor();
        Uf.c cVarB = decoder.b(descriptor);
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        if (cVarB.p()) {
            objB = b(cVarB);
        } else {
            Object objC = null;
            while (true) {
                int i10 = cVarB.i(getDescriptor());
                if (i10 != -1) {
                    if (i10 == 0) {
                        n10.f52259a = cVarB.l(getDescriptor(), i10);
                    } else {
                        if (i10 != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) n10.f52259a;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(i10);
                            throw new Rf.j(sb2.toString());
                        }
                        Object obj = n10.f52259a;
                        if (obj == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        n10.f52259a = obj;
                        objC = c.a.c(cVarB, getDescriptor(), i10, Rf.d.a(this, cVarB, (String) obj), null, 8, null);
                    }
                } else {
                    if (objC == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) n10.f52259a)).toString());
                    }
                    AbstractC5504s.f(objC, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    objB = objC;
                }
            }
        }
        cVarB.c(descriptor);
        return objB;
    }

    public abstract InterfaceC6014d e();

    @Override // Rf.k
    public final void serialize(Uf.f encoder, Object value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Rf.k kVarB = Rf.d.b(this, encoder, value);
        Tf.e descriptor = getDescriptor();
        Uf.d dVarB = encoder.b(descriptor);
        dVarB.k(getDescriptor(), 0, kVarB.getDescriptor().o());
        Tf.e descriptor2 = getDescriptor();
        AbstractC5504s.f(kVarB, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        dVarB.m(descriptor2, 1, kVarB, value);
        dVarB.c(descriptor);
    }
}
