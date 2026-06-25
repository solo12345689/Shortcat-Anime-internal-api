package Gf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f7488b = AtomicIntegerFieldUpdater.newUpdater(C.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f7489a;

    public C(Throwable th2, boolean z10) {
        this.f7489a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final boolean a() {
        return f7488b.get(this) == 1;
    }

    public final boolean c() {
        return f7488b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return T.a(this) + '[' + this.f7489a + ']';
    }

    public /* synthetic */ C(Throwable th2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? false : z10);
    }
}
