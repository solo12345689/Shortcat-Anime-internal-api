package Td;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class D implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final a f17422b = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f17423a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ D(int i10) {
        this.f17423a = i10;
    }

    public static final /* synthetic */ D a(int i10) {
        return new D(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof D) && i10 == ((D) obj).m();
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return String.valueOf(((long) i10) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return N.b(m(), ((D) obj).m());
    }

    public boolean equals(Object obj) {
        return c(this.f17423a, obj);
    }

    public int hashCode() {
        return h(this.f17423a);
    }

    public final /* synthetic */ int m() {
        return this.f17423a;
    }

    public String toString() {
        return k(this.f17423a);
    }

    public static int b(int i10) {
        return i10;
    }
}
