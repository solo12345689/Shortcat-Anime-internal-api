package androidx.compose.ui.graphics;

import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.L1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b */
    public static final a f26818b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final long f26819c = L1.a(0.5f, 0.5f);

    /* JADX INFO: renamed from: a */
    private final long f26820a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return j.f26819c;
        }

        private a() {
        }
    }

    private /* synthetic */ j(long j10) {
        this.f26820a = j10;
    }

    public static final /* synthetic */ j b(long j10) {
        return new j(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof j) && j10 == ((j) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final float f(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float g(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f26820a, obj);
    }

    public int hashCode() {
        return h(this.f26820a);
    }

    public final /* synthetic */ long j() {
        return this.f26820a;
    }

    public String toString() {
        return i(this.f26820a);
    }

    public static long c(long j10) {
        return j10;
    }
}
