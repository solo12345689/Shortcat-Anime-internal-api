package ye;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f65112a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a implements h0 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // ye.h0
        public i0 b() {
            i0 i0Var = i0.f65113a;
            if (i0Var == null) {
                d(0);
            }
            return i0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    i0 b();
}
