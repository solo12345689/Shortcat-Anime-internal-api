package s0;

import android.graphics.Path;
import s0.InterfaceC6374m1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f58916a;

        static {
            int[] iArr = new int[InterfaceC6374m1.b.values().length];
            try {
                iArr[InterfaceC6374m1.b.f58968a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC6374m1.b.f58969b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f58916a = iArr;
        }
    }

    public static final InterfaceC6374m1 a() {
        return new S(null, 1, null);
    }

    public static final InterfaceC6374m1 c(Path path) {
        return new S(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    public static final Path.Direction e(InterfaceC6374m1.b bVar) {
        int i10 = a.f58916a[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new Td.r();
    }
}
