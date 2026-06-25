package com.swmansion.rnscreens;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f44444a;

    public final void a(a0 config, C4546y c4546y) {
        AbstractC5504s.h(config, "config");
        int height = config.h() ? 0 : config.getToolbar().getHeight();
        Integer num = this.f44444a;
        if (num != null && height == num.intValue()) {
            return;
        }
        this.f44444a = Integer.valueOf(height);
        if (c4546y != null) {
            c4546y.t(height);
        }
    }
}
