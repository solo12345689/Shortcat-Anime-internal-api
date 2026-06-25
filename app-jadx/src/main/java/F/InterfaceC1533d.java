package F;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: F.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1533d {

    /* JADX INFO: renamed from: F.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f6043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f6044c;

        public a(int i10, int i11, Object obj) {
            this.f6042a = i10;
            this.f6043b = i11;
            this.f6044c = obj;
            if (i10 < 0) {
                throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i10).toString());
            }
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("size should be >0, but was " + i11).toString());
        }

        public final int a() {
            return this.f6043b;
        }

        public final int b() {
            return this.f6042a;
        }

        public final Object c() {
            return this.f6044c;
        }
    }

    void a(int i10, int i11, Function1 function1);

    a get(int i10);

    int getSize();
}
