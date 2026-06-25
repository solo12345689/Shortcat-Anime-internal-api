package a3;

import U2.O;
import q2.C6080L;
import t2.C6609I;

/* JADX INFO: renamed from: a3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2564e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final O f23754a;

    /* JADX INFO: renamed from: a3.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends C6080L {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected AbstractC2564e(O o10) {
        this.f23754a = o10;
    }

    public final boolean a(C6609I c6609i, long j10) {
        return b(c6609i) && c(c6609i, j10);
    }

    protected abstract boolean b(C6609I c6609i);

    protected abstract boolean c(C6609I c6609i, long j10);
}
