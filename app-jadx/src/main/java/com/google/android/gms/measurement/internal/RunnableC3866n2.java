package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.Constants;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.n2 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3866n2 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f41455a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f41456b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f41457c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Object f41458d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Object f41459e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C3887q2 f41460f;

    RunnableC3866n2(C3887q2 c3887q2, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f41455a = i10;
        this.f41456b = str;
        this.f41457c = obj;
        this.f41458d = obj2;
        this.f41459e = obj3;
        Objects.requireNonNull(c3887q2);
        this.f41460f = c3887q2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3887q2 c3887q2 = this.f41460f;
        E2 e2X = c3887q2.f40611a.x();
        if (!e2X.k()) {
            Log.println(6, c3887q2.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c3887q2.D() == 0) {
            X2 x22 = c3887q2.f40611a;
            if (x22.w().B()) {
                x22.c();
                c3887q2.E('C');
            } else {
                x22.c();
                c3887q2.E('c');
            }
        }
        if (c3887q2.F() < 0) {
            c3887q2.f40611a.w().A();
            c3887q2.G(133005L);
        }
        int i10 = this.f41455a;
        char cD = c3887q2.D();
        long jF = c3887q2.F();
        String str = this.f41456b;
        Object obj = this.f41457c;
        Object obj2 = this.f41458d;
        Object obj3 = this.f41459e;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strA = C3887q2.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(cD).length() + String.valueOf(jF).length() + 1 + strA.length());
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(cD);
        sb2.append(jF);
        sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb2.append(strA);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str.substring(0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        C2 c22 = e2X.f40716e;
        if (c22 != null) {
            c22.a(string, 1L);
        }
    }
}
