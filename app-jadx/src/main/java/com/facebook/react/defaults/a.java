package com.facebook.react.defaults;

import com.facebook.react.C3279t;
import com.facebook.react.ReactActivity;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends C3279t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f36597f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactActivity activity, String mainComponentName, boolean z10) {
        super(activity, mainComponentName);
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(mainComponentName, "mainComponentName");
        this.f36597f = z10;
    }

    @Override // com.facebook.react.C3279t
    protected boolean isFabricEnabled() {
        return this.f36597f;
    }
}
