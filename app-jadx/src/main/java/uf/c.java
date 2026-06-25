package Uf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public static int a(c cVar, Tf.e descriptor) {
            AbstractC5504s.h(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, Tf.e eVar, int i10, Rf.a aVar, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return cVar.e(eVar, i10, aVar, obj);
        }
    }

    Object B(Tf.e eVar, int i10, Rf.a aVar, Object obj);

    char F(Tf.e eVar, int i10);

    double G(Tf.e eVar, int i10);

    short H(Tf.e eVar, int i10);

    Yf.e a();

    void c(Tf.e eVar);

    Object e(Tf.e eVar, int i10, Rf.a aVar, Object obj);

    int f(Tf.e eVar);

    int i(Tf.e eVar);

    String l(Tf.e eVar, int i10);

    int m(Tf.e eVar, int i10);

    long o(Tf.e eVar, int i10);

    boolean p();

    float t(Tf.e eVar, int i10);

    boolean w(Tf.e eVar, int i10);

    byte x(Tf.e eVar, int i10);

    e y(Tf.e eVar, int i10);
}
