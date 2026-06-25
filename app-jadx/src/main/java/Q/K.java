package Q;

import Y.AbstractC2394b1;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5506u;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC2394b1 f14063a = Y.H.h(null, a.f14066a, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f14064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final J f14065c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14066a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            return K.f14065c;
        }
    }

    static {
        long jD = AbstractC6387s0.d(4282550004L);
        f14064b = jD;
        f14065c = new J(jD, C6385r0.q(jD, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final AbstractC2394b1 b() {
        return f14063a;
    }
}
