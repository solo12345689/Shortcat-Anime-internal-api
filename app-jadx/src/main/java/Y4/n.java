package Y4;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface n {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S4.f f22810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f22811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d f22812c;

        public a(S4.f fVar, com.bumptech.glide.load.data.d dVar) {
            this(fVar, Collections.EMPTY_LIST, dVar);
        }

        public a(S4.f fVar, List list, com.bumptech.glide.load.data.d dVar) {
            this.f22810a = (S4.f) o5.k.e(fVar);
            this.f22811b = (List) o5.k.e(list);
            this.f22812c = (com.bumptech.glide.load.data.d) o5.k.e(dVar);
        }
    }

    boolean a(Object obj);

    a b(Object obj, int i10, int i11, S4.h hVar);
}
