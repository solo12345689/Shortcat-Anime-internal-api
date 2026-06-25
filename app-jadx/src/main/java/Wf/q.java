package Wf;

import Td.L;
import Tf.c;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class q implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f20939a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20940b = Tf.k.d("kotlinx.serialization.json.JsonElement", c.a.f17502a, new Tf.e[0], new Function1() { // from class: Wf.k
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return q.g((Tf.a) obj);
        }
    });

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L g(Tf.a buildSerialDescriptor) {
        AbstractC5504s.h(buildSerialDescriptor, "$this$buildSerialDescriptor");
        Tf.a.b(buildSerialDescriptor, "JsonPrimitive", r.f(new InterfaceC5082a() { // from class: Wf.l
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return q.h();
            }
        }), null, false, 12, null);
        Tf.a.b(buildSerialDescriptor, "JsonNull", r.f(new InterfaceC5082a() { // from class: Wf.m
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return q.i();
            }
        }), null, false, 12, null);
        Tf.a.b(buildSerialDescriptor, "JsonLiteral", r.f(new InterfaceC5082a() { // from class: Wf.n
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return q.j();
            }
        }), null, false, 12, null);
        Tf.a.b(buildSerialDescriptor, "JsonObject", r.f(new InterfaceC5082a() { // from class: Wf.o
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return q.k();
            }
        }), null, false, 12, null);
        Tf.a.b(buildSerialDescriptor, "JsonArray", r.f(new InterfaceC5082a() { // from class: Wf.p
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return q.l();
            }
        }), null, false, 12, null);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tf.e h() {
        return F.f20888a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tf.e i() {
        return A.f20880a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tf.e j() {
        return w.f20945a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tf.e k() {
        return D.f20883a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tf.e l() {
        return C2360d.f20900a.getDescriptor();
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20940b;
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public i deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return r.d(decoder).g();
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void serialize(Uf.f encoder, i value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        r.h(encoder);
        if (value instanceof E) {
            encoder.t(F.f20888a, value);
        } else if (value instanceof C) {
            encoder.t(D.f20883a, value);
        } else {
            if (!(value instanceof C2359c)) {
                throw new Td.r();
            }
            encoder.t(C2360d.f20900a, value);
        }
    }
}
