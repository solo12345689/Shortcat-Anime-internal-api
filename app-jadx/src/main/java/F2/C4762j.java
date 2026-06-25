package f2;

import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: f2.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4762j extends AbstractC4764l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractComponentCallbacksC2838q f46826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4762j(AbstractComponentCallbacksC2838q fragment, AbstractComponentCallbacksC2838q targetFragment, int i10) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i10 + " for fragment " + fragment);
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(targetFragment, "targetFragment");
        this.f46826b = targetFragment;
        this.f46827c = i10;
    }
}
