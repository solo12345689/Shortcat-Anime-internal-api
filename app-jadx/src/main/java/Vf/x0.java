package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class x0 implements Rf.b {

    /* JADX INFO: renamed from: a */
    public static final x0 f20253a = new x0();

    /* JADX INFO: renamed from: b */
    private static final Tf.e f20254b = new q0("kotlin.String", d.i.f17511a);

    private x0() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a */
    public String deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return decoder.A();
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b */
    public void serialize(Uf.f encoder, String value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        encoder.F(value);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20254b;
    }
}
