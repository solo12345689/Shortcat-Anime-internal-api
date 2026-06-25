package androidx.compose.ui.layout;

import I0.InterfaceC1690p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f27023a;

    public /* synthetic */ y(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    public abstract float a(float f10, InterfaceC1690p interfaceC1690p, InterfaceC1690p interfaceC1690p2);

    public final Function2 b() {
        return this.f27023a;
    }

    private y(Function2 function2) {
        this.f27023a = function2;
    }
}
