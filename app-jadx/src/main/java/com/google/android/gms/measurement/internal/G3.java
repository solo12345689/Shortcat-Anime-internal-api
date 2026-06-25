package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class G3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f40772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Boolean f40773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f40774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.gms.internal.measurement.H0 f40775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f40776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Long f40777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f40778g;

    public G3(Context context, com.google.android.gms.internal.measurement.H0 h02, Long l10) {
        this.f40776e = true;
        AbstractC2115p.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC2115p.l(applicationContext);
        this.f40772a = applicationContext;
        this.f40777f = l10;
        if (h02 != null) {
            this.f40775d = h02;
            this.f40776e = h02.f39357c;
            this.f40774c = h02.f39356b;
            this.f40778g = h02.f39359e;
            Bundle bundle = h02.f39358d;
            if (bundle != null) {
                this.f40773b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
