package T;

import Y.InterfaceC2425m;
import s0.AbstractC6387s0;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16741a = a.f16742a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f16742a = new a();

        private a() {
        }

        public final d a(long j10, boolean z10) {
            return z10 ? ((double) AbstractC6387s0.j(j10)) > 0.5d ? n.f16744b : n.f16745c : n.f16746d;
        }

        public final long b(long j10, boolean z10) {
            return (z10 || ((double) AbstractC6387s0.j(j10)) >= 0.5d) ? j10 : C6385r0.f58985b.k();
        }
    }

    d a(InterfaceC2425m interfaceC2425m, int i10);

    long b(InterfaceC2425m interfaceC2425m, int i10);
}
