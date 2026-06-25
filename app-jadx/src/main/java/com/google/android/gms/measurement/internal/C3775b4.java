package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3775b4 implements y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3937x4 f41107a;

    C3775b4(C3937x4 c3937x4) {
        Objects.requireNonNull(c3937x4);
        this.f41107a = c3937x4;
    }

    @Override // com.google.android.gms.measurement.internal.y6
    public final void d(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f41107a.p("auto", "_err", bundle);
        } else {
            this.f41107a.w("auto", "_err", bundle, str);
        }
    }
}
