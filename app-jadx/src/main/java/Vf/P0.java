package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class P0 implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P0 f20162a = new P0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20163b = new q0("kotlin.uuid.Uuid", d.i.f17511a);

    private P0() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Ff.a deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Ff.a.f6658c.c(decoder.A());
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Uf.f encoder, Ff.a value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        encoder.F(value.toString());
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20163b;
    }
}
