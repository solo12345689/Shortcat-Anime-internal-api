package Wf;

import Tf.l;
import Xf.C2387y;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class A implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f20880a = new A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20881b = Tf.k.e("kotlinx.serialization.json.JsonNull", l.b.f17533a, new Tf.e[0], null, 8, null);

    private A() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        r.g(decoder);
        if (decoder.D()) {
            throw new C2387y("Expected 'null' literal");
        }
        decoder.j();
        return z.INSTANCE;
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Uf.f encoder, z value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        r.h(encoder);
        encoder.v();
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20881b;
    }
}
