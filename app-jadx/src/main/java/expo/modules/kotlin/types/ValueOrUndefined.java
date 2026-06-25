package expo.modules.kotlin.types;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/types/ValueOrUndefined;", "T", "", "a", "c", "b", "Lexpo/modules/kotlin/types/ValueOrUndefined$b;", "Lexpo/modules/kotlin/types/ValueOrUndefined$c;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ValueOrUndefined<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f46195a;

    /* JADX INFO: renamed from: expo.modules.kotlin.types.ValueOrUndefined$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f46195a = new Companion();

        private Companion() {
        }

        public final Object getUndefined() {
            return b.f46196b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements ValueOrUndefined {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f46196b = new b();

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements ValueOrUndefined {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f46197b;

        public c(Object obj) {
            this.f46197b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC5504s.c(this.f46197b, ((c) obj).f46197b);
        }

        public int hashCode() {
            Object obj = this.f46197b;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Value(value=" + this.f46197b + ")";
        }
    }

    static Object getUndefined() {
        return INSTANCE.getUndefined();
    }
}
