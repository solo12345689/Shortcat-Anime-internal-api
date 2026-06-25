package Vf;

import Td.AbstractC2163n;
import Tf.m;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.c0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2321c0 implements Rf.b {

    /* JADX INFO: renamed from: a */
    private final Object f20184a;

    /* JADX INFO: renamed from: b */
    private List f20185b;

    /* JADX INFO: renamed from: c */
    private final Lazy f20186c;

    public C2321c0(final String serialName, Object objectInstance) {
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(objectInstance, "objectInstance");
        this.f20184a = objectInstance;
        this.f20185b = AbstractC2279u.m();
        this.f20186c = AbstractC2163n.a(Td.q.f17462b, new InterfaceC5082a() { // from class: Vf.a0
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C2321c0.c(serialName, this);
            }
        });
    }

    public static final Tf.e c(String str, final C2321c0 c2321c0) {
        return Tf.k.d(str, m.d.f17537a, new Tf.e[0], new Function1() { // from class: Vf.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2321c0.d(this.f20183a, (Tf.a) obj);
            }
        });
    }

    public static final Td.L d(C2321c0 c2321c0, Tf.a buildSerialDescriptor) {
        AbstractC5504s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.h(c2321c0.f20185b);
        return Td.L.f17438a;
    }

    @Override // Rf.a
    public Object deserialize(Uf.e decoder) {
        int i10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor = getDescriptor();
        Uf.c cVarB = decoder.b(descriptor);
        if (cVarB.p() || (i10 = cVarB.i(getDescriptor())) == -1) {
            Td.L l10 = Td.L.f17438a;
            cVarB.c(descriptor);
            return this.f20184a;
        }
        throw new Rf.j("Unexpected index " + i10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return (Tf.e) this.f20186c.getValue();
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, Object value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        encoder.b(getDescriptor()).c(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2321c0(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        AbstractC5504s.h(serialName, "serialName");
        AbstractC5504s.h(objectInstance, "objectInstance");
        AbstractC5504s.h(classAnnotations, "classAnnotations");
        this.f20185b = AbstractC2273n.e(classAnnotations);
    }
}
