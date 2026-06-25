package U0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f18721c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final E f18722d = new E();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18724b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a() {
            return E.f18722d;
        }

        private a() {
        }
    }

    public /* synthetic */ E(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z10);
    }

    public final int b() {
        return this.f18724b;
    }

    public final boolean c() {
        return this.f18723a;
    }

    public final E d(E e10) {
        return e10 == null ? this : e10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return this.f18723a == e10.f18723a && C2205i.g(this.f18724b, e10.f18724b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f18723a) * 31) + C2205i.h(this.f18724b);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f18723a + ", emojiSupportMatch=" + ((Object) C2205i.i(this.f18724b)) + ')';
    }

    public E(boolean z10) {
        this.f18723a = z10;
        this.f18724b = C2205i.f18836b.b();
    }

    private E(int i10, boolean z10) {
        this.f18723a = z10;
        this.f18724b = i10;
    }

    public E() {
        this(C2205i.f18836b.b(), false, null);
    }
}
