package io.sentry.android.replay;

import Td.z;
import android.content.Context;
import io.sentry.B3;
import ke.AbstractC5466a;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f50347g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f50350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f50351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50353f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(int i10) {
            int i11 = i10 % 16;
            return i11 <= 8 ? Math.max(16, i10 - i11) : i10 + (16 - i11);
        }

        public final s b(Context context, B3 sessionReplay, int i10, int i11) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(sessionReplay, "sessionReplay");
            float f10 = i11;
            float f11 = i10;
            Pair pairA = z.a(Integer.valueOf(a(AbstractC5466a.d((f10 / context.getResources().getDisplayMetrics().density) * sessionReplay.m().sizeScale))), Integer.valueOf(a(AbstractC5466a.d((f11 / context.getResources().getDisplayMetrics().density) * sessionReplay.m().sizeScale))));
            int iIntValue = ((Number) pairA.getFirst()).intValue();
            int iIntValue2 = ((Number) pairA.getSecond()).intValue();
            return new s(iIntValue2, iIntValue, iIntValue2 / f11, iIntValue / f10, sessionReplay.d(), sessionReplay.m().bitRate);
        }

        private a() {
        }
    }

    public s(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f50348a = i10;
        this.f50349b = i11;
        this.f50350c = f10;
        this.f50351d = f11;
        this.f50352e = i12;
        this.f50353f = i13;
    }

    public final int a() {
        return this.f50353f;
    }

    public final int b() {
        return this.f50352e;
    }

    public final int c() {
        return this.f50349b;
    }

    public final int d() {
        return this.f50348a;
    }

    public final float e() {
        return this.f50350c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f50348a == sVar.f50348a && this.f50349b == sVar.f50349b && Float.compare(this.f50350c, sVar.f50350c) == 0 && Float.compare(this.f50351d, sVar.f50351d) == 0 && this.f50352e == sVar.f50352e && this.f50353f == sVar.f50353f;
    }

    public final float f() {
        return this.f50351d;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f50348a) * 31) + Integer.hashCode(this.f50349b)) * 31) + Float.hashCode(this.f50350c)) * 31) + Float.hashCode(this.f50351d)) * 31) + Integer.hashCode(this.f50352e)) * 31) + Integer.hashCode(this.f50353f);
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.f50348a + ", recordingHeight=" + this.f50349b + ", scaleFactorX=" + this.f50350c + ", scaleFactorY=" + this.f50351d + ", frameRate=" + this.f50352e + ", bitRate=" + this.f50353f + ')';
    }
}
