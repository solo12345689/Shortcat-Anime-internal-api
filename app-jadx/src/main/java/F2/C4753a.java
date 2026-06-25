package f2;

import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: f2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4753a extends AbstractC4765m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f46806b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4753a(AbstractComponentCallbacksC2838q fragment, String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(previousFragmentId, "previousFragmentId");
        this.f46806b = previousFragmentId;
    }
}
