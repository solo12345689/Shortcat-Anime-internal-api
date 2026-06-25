package ye;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface k0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f65115a = new a();

        private a() {
        }

        @Override // ye.k0
        public Collection a(qf.v0 currentTypeConstructor, Collection superTypes, Function1 neighbors, Function1 reportLoop) {
            AbstractC5504s.h(currentTypeConstructor, "currentTypeConstructor");
            AbstractC5504s.h(superTypes, "superTypes");
            AbstractC5504s.h(neighbors, "neighbors");
            AbstractC5504s.h(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection a(qf.v0 v0Var, Collection collection, Function1 function1, Function1 function12);
}
