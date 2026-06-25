package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: s0.o1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6380o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58972a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58973b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58974c = c(1);

    /* JADX INFO: renamed from: s0.o1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractC6380o1.f58974c;
        }

        public final int b() {
            return AbstractC6380o1.f58973b;
        }

        private a() {
        }
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static int c(int i10) {
        return i10;
    }
}
