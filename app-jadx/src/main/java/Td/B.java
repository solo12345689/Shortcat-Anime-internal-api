package Td;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17417b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f17418a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ B(byte b10) {
        this.f17418a = b10;
    }

    public static final /* synthetic */ B a(byte b10) {
        return new B(b10);
    }

    public static boolean c(byte b10, Object obj) {
        return (obj instanceof B) && b10 == ((B) obj).m();
    }

    public static int h(byte b10) {
        return Byte.hashCode(b10);
    }

    public static String k(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC5504s.i(m() & 255, ((B) obj).m() & 255);
    }

    public boolean equals(Object obj) {
        return c(this.f17418a, obj);
    }

    public int hashCode() {
        return h(this.f17418a);
    }

    public final /* synthetic */ byte m() {
        return this.f17418a;
    }

    public String toString() {
        return k(this.f17418a);
    }

    public static byte b(byte b10) {
        return b10;
    }
}
