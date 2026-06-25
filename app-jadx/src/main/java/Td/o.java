package Td;

import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17460a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.f17461a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.f17462b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.f17463c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17460a = iArr;
        }
    }

    public static Lazy a(q mode, InterfaceC5082a initializer) {
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(initializer, "initializer");
        int i10 = a.f17460a[mode.ordinal()];
        if (i10 == 1) {
            return new x(initializer, null, 2, null);
        }
        if (i10 == 2) {
            return new w(initializer);
        }
        if (i10 == 3) {
            return new M(initializer);
        }
        throw new r();
    }

    public static Lazy b(InterfaceC5082a initializer) {
        AbstractC5504s.h(initializer, "initializer");
        return new x(initializer, null, 2, null);
    }
}
