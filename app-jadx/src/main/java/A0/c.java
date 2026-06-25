package A0;

import Y.C0;
import Y.b2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0 f101b;

    public /* synthetic */ c(int i10, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, function1);
    }

    @Override // A0.b
    public int a() {
        return ((a) this.f101b.getValue()).i();
    }

    public void b(int i10) {
        this.f101b.setValue(a.c(i10));
    }

    private c(int i10, Function1 function1) {
        this.f100a = function1;
        this.f101b = b2.e(a.c(i10), null, 2, null);
    }
}
