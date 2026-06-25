package Uf;

import Rf.k;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface f {
    void A();

    f D(Tf.e eVar);

    void E(int i10);

    void F(String str);

    Yf.e a();

    d b(Tf.e eVar);

    void e(Tf.e eVar, int i10);

    void i(double d10);

    void j(byte b10);

    d r(Tf.e eVar, int i10);

    void s(long j10);

    void t(k kVar, Object obj);

    void v();

    void w(short s10);

    void x(boolean z10);

    void y(float f10);

    void z(char c10);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static d a(f fVar, Tf.e descriptor, int i10) {
            AbstractC5504s.h(descriptor, "descriptor");
            return fVar.b(descriptor);
        }

        public static void c(f fVar, k serializer, Object obj) {
            AbstractC5504s.h(serializer, "serializer");
            if (serializer.getDescriptor().i()) {
                fVar.t(serializer, obj);
            } else if (obj == null) {
                fVar.v();
            } else {
                fVar.A();
                fVar.t(serializer, obj);
            }
        }

        public static void d(f fVar, k serializer, Object obj) {
            AbstractC5504s.h(serializer, "serializer");
            serializer.serialize(fVar, obj);
        }

        public static void b(f fVar) {
        }
    }
}
