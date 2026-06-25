package Td;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class I implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17433b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final short f17434a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ I(short s10) {
        this.f17434a = s10;
    }

    public static final /* synthetic */ I a(short s10) {
        return new I(s10);
    }

    public static boolean c(short s10, Object obj) {
        return (obj instanceof I) && s10 == ((I) obj).m();
    }

    public static int h(short s10) {
        return Short.hashCode(s10);
    }

    public static String k(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC5504s.i(m() & 65535, ((I) obj).m() & 65535);
    }

    public boolean equals(Object obj) {
        return c(this.f17434a, obj);
    }

    public int hashCode() {
        return h(this.f17434a);
    }

    public final /* synthetic */ short m() {
        return this.f17434a;
    }

    public String toString() {
        return k(this.f17434a);
    }

    public static short b(short s10) {
        return s10;
    }
}
