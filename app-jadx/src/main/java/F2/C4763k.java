package f2;

import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: f2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4763k extends AbstractC4765m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f46828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4763k(AbstractComponentCallbacksC2838q fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        AbstractC5504s.h(fragment, "fragment");
        this.f46828b = z10;
    }
}
