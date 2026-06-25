package Vf;

import Vf.E;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class G {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements E {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rf.b f20135a;

        a(Rf.b bVar) {
            this.f20135a = bVar;
        }

        @Override // Vf.E
        public Rf.b[] childSerializers() {
            return new Rf.b[]{this.f20135a};
        }

        @Override // Rf.a
        public Object deserialize(Uf.e decoder) {
            AbstractC5504s.h(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // Rf.b, Rf.k, Rf.a
        public Tf.e getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // Rf.k
        public void serialize(Uf.f encoder, Object obj) {
            AbstractC5504s.h(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // Vf.E
        public Rf.b[] typeParametersSerializers() {
            return E.a.a(this);
        }
    }

    public static final Tf.e a(String name, Rf.b primitiveSerializer) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(primitiveSerializer, "primitiveSerializer");
        return new F(name, new a(primitiveSerializer));
    }
}
