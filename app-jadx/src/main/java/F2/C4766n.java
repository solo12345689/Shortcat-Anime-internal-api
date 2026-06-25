package f2;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: f2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4766n extends AbstractC4765m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f46830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4766n(AbstractComponentCallbacksC2838q fragment, ViewGroup container) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(container, "container");
        this.f46830b = container;
    }
}
