package com.google.android.gms.internal.measurement;

import R8.AbstractC2115p;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class V0 extends AbstractRunnableC3546p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f39594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Bundle f39595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3632z1 f39596g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    V0(C3632z1 c3632z1, Context context, Bundle bundle) {
        super(c3632z1, true);
        this.f39594e = context;
        this.f39595f = bundle;
        Objects.requireNonNull(c3632z1);
        this.f39596g = c3632z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3546p1
    public final void a() {
        try {
            Context context = this.f39594e;
            AbstractC2115p.l(context);
            String strA = j9.o.a(context);
            AbstractC2115p.l(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strA)) {
                strA = j9.o.a(context);
            }
            Boolean boolC = j9.o.c("google_analytics_force_disable_updates", resources, strA);
            C3632z1 c3632z1 = this.f39596g;
            c3632z1.o(c3632z1.u(context, boolC == null || !boolC.booleanValue()));
            if (c3632z1.n() == null) {
                Log.w(c3632z1.l(), "Failed to connect to measurement client.");
                return;
            }
            int iA = DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
            ((InterfaceC3598v0) AbstractC2115p.l(c3632z1.n())).initialize(Y8.b.G3(context), new H0(133005L, Math.max(iA, r0), Boolean.TRUE.equals(boolC) || DynamiteModule.b(context, ModuleDescriptor.MODULE_ID) < iA, this.f39595f, j9.o.a(context)), this.f39921a);
        } catch (Exception e10) {
            this.f39596g.k(e10, true, false);
        }
    }
}
