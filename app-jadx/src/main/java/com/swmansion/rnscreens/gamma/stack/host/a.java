package com.swmansion.rnscreens.gamma.stack.host;

import androidx.fragment.app.K;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a */
    private final com.swmansion.rnscreens.gamma.stack.screen.d f44492a;

    /* JADX INFO: renamed from: b */
    private final int f44493b;

    /* JADX INFO: renamed from: c */
    private final boolean f44494c;

    /* JADX INFO: renamed from: d */
    private final boolean f44495d;

    public /* synthetic */ a(com.swmansion.rnscreens.gamma.stack.screen.d dVar, int i10, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i10, z10, (i11 & 8) != 0 ? true : z11);
    }

    @Override // com.swmansion.rnscreens.gamma.stack.host.b
    public void a(K fragmentManager, c executor) {
        AbstractC5504s.h(fragmentManager, "fragmentManager");
        AbstractC5504s.h(executor, "executor");
        executor.e(fragmentManager, this);
    }

    public final boolean b() {
        return this.f44494c;
    }

    public final boolean c() {
        return this.f44495d;
    }

    public final int d() {
        return this.f44493b;
    }

    public final com.swmansion.rnscreens.gamma.stack.screen.d e() {
        return this.f44492a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.swmansion.rnscreens.gamma.stack.screen.d fragment, int i10, boolean z10, boolean z11) {
        super(null);
        AbstractC5504s.h(fragment, "fragment");
        this.f44492a = fragment;
        this.f44493b = i10;
        this.f44494c = z10;
        this.f44495d = z11;
    }
}
