package J;

import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a */
    private static final b f9192a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements b {
        a() {
        }

        @Override // J.b
        public float a(long j10, InterfaceC5011d interfaceC5011d) {
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final b a(float f10) {
        return new g(f10);
    }

    public static final b b(int i10) {
        return new f(i10);
    }

    public static final b c(float f10) {
        return new d(f10, null);
    }
}
