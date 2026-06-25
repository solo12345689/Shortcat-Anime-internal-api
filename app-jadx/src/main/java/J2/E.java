package J2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f9326a = new E() { // from class: J2.C
        @Override // J2.E
        public final List b(String str, boolean z10, boolean z11) {
            return N.k(str, z10, z11);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f9327b = new E() { // from class: J2.D
        @Override // J2.E
        public final List b(String str, boolean z10, boolean z11) {
            return N.o(E.f9326a.b(str, z10, z11));
        }
    };

    List b(String str, boolean z10, boolean z11);
}
