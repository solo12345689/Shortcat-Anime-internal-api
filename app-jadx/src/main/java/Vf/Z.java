package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Z implements Rf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rf.b f20179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Tf.e f20180b;

    public Z(Rf.b serializer) {
        AbstractC5504s.h(serializer, "serializer");
        this.f20179a = serializer;
        this.f20180b = new s0(serializer.getDescriptor());
    }

    @Override // Rf.a
    public Object deserialize(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return decoder.D() ? decoder.C(this.f20179a) : decoder.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Z.class == obj.getClass() && AbstractC5504s.c(this.f20179a, ((Z) obj).f20179a);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return this.f20180b;
    }

    public int hashCode() {
        return this.f20179a.hashCode();
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, Object obj) {
        AbstractC5504s.h(encoder, "encoder");
        if (obj == null) {
            encoder.v();
        } else {
            encoder.A();
            encoder.t(this.f20179a, obj);
        }
    }
}
