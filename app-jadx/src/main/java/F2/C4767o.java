package f2;

import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: f2.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4767o extends AbstractC4765m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractComponentCallbacksC2838q f46831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4767o(AbstractComponentCallbacksC2838q fragment, AbstractComponentCallbacksC2838q expectedParentFragment, int i10) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i10 + " without using parent's childFragmentManager");
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(expectedParentFragment, "expectedParentFragment");
        this.f46831b = expectedParentFragment;
        this.f46832c = i10;
    }
}
