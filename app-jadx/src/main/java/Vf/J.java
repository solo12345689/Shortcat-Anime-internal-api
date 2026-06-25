package Vf;

import Tf.d;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class J implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f20144a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20145b = new q0("kotlin.Int", d.f.f17508a);

    private J() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return Integer.valueOf(decoder.h());
    }

    public void b(Uf.f encoder, int i10) {
        AbstractC5504s.h(encoder, "encoder");
        encoder.E(i10);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20145b;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        b(fVar, ((Number) obj).intValue());
    }
}
