package Gf;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Gf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC1621m extends Q0 {

    /* JADX INFO: renamed from: Gf.m$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC1621m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function1 f7589a;

        public a(Function1 function1) {
            this.f7589a = function1;
        }

        @Override // Gf.InterfaceC1621m
        public void a(Throwable th2) {
            this.f7589a.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + T.a(this.f7589a) + '@' + T.b(this) + ']';
        }
    }

    void a(Throwable th2);
}
