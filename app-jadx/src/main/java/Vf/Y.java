package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Y implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y f20177a = new Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Tf.e f20178b = X.f20174a;

    private Y() {
    }

    @Override // Rf.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        throw new Rf.j("'kotlin.Nothing' does not have instances");
    }

    @Override // Rf.k
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(Uf.f encoder, Void value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        throw new Rf.j("'kotlin.Nothing' cannot be serialized");
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return f20178b;
    }
}
