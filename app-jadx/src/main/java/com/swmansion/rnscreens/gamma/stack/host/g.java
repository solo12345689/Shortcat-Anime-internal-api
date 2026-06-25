package com.swmansion.rnscreens.gamma.stack.host;

import androidx.fragment.app.K;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {

    /* JADX INFO: renamed from: a */
    private final com.swmansion.rnscreens.gamma.stack.screen.d f44499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.swmansion.rnscreens.gamma.stack.screen.d fragment) {
        super(null);
        AbstractC5504s.h(fragment, "fragment");
        this.f44499a = fragment;
    }

    @Override // com.swmansion.rnscreens.gamma.stack.host.b
    public void a(K fragmentManager, c executor) {
        AbstractC5504s.h(fragmentManager, "fragmentManager");
        AbstractC5504s.h(executor, "executor");
        executor.i(fragmentManager, this);
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.d b() {
        return this.f44499a;
    }
}
