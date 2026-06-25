package Y0;

import Y.h2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface t0 extends h2 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements t0, h2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C2478m f22723a;

        public a(C2478m c2478m) {
            this.f22723a = c2478m;
        }

        @Override // Y0.t0
        public boolean e() {
            return this.f22723a.l();
        }

        @Override // Y.h2
        public Object getValue() {
            return this.f22723a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements t0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f22724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22725b;

        public b(Object obj, boolean z10) {
            this.f22724a = obj;
            this.f22725b = z10;
        }

        @Override // Y0.t0
        public boolean e() {
            return this.f22725b;
        }

        @Override // Y.h2
        public Object getValue() {
            return this.f22724a;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }

    boolean e();
}
