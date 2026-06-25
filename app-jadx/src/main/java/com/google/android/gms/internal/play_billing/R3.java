package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class R3 extends N3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ S3 f40395h;

    R3(S3 s32) {
        Objects.requireNonNull(s32);
        this.f40395h = s32;
    }

    @Override // com.google.android.gms.internal.play_billing.N3
    protected final String a() {
        O3 o32 = (O3) this.f40395h.f40409a.get();
        if (o32 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(o32.f40242a) + "]";
    }
}
