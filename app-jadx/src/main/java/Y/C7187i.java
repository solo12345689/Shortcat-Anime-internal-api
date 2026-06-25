package y;

import Y.C0;
import Y.b2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6225g;
import r0.C6224f;

/* JADX INFO: renamed from: y.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7187i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f64647a;

    /* JADX INFO: renamed from: y.i$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {

        /* JADX INFO: renamed from: y.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0974a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0974a f64648a = new C0974a();

            private C0974a() {
                super(null);
            }

            public String toString() {
                return "Closed";
            }
        }

        /* JADX INFO: renamed from: y.i$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f64649a;

            public /* synthetic */ b(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this(j10);
            }

            public final long a() {
                return this.f64649a;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof b) {
                    return C6224f.j(this.f64649a, ((b) obj).f64649a);
                }
                return false;
            }

            public int hashCode() {
                return C6224f.o(this.f64649a);
            }

            public String toString() {
                return "Open(offset=" + ((Object) C6224f.s(this.f64649a)) + ')';
            }

            private b(long j10) {
                super(null);
                this.f64649a = j10;
                if (!AbstractC6225g.b(j10)) {
                    throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C7187i(a aVar) {
        this.f64647a = b2.e(aVar, null, 2, null);
    }

    public final a a() {
        return (a) this.f64647a.getValue();
    }

    public final void b(a aVar) {
        this.f64647a.setValue(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7187i) {
            return AbstractC5504s.c(((C7187i) obj).a(), a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public /* synthetic */ C7187i(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.C0974a.f64648a : aVar);
    }
}
