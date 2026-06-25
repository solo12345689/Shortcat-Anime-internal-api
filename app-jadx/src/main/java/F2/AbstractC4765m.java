package f2;

import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: f2.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4765m extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractComponentCallbacksC2838q f46829a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4765m(AbstractComponentCallbacksC2838q fragment, String str) {
        super(str);
        AbstractC5504s.h(fragment, "fragment");
        this.f46829a = fragment;
    }

    public final AbstractComponentCallbacksC2838q a() {
        return this.f46829a;
    }
}
