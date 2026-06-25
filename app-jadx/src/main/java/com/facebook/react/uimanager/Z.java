package com.facebook.react.uimanager;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f37544e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f37545f = {1, 2, 4, 8, 16, 32, 64, 128, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, 2048};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f37546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f37547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37549d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b() {
            float f10 = com.facebook.yoga.g.f38662b;
            return new float[]{f10, f10, f10, f10, f10, f10, f10, f10, f10, f10, f10, f10};
        }

        private a() {
        }
    }

    public Z(float f10, float[] spacing) {
        AbstractC5504s.h(spacing, "spacing");
        this.f37546a = f10;
        this.f37547b = spacing;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r5) {
        /*
            r4 = this;
            r0 = 4
            if (r5 == r0) goto Lc
            r0 = 5
            if (r5 == r0) goto Lc
            switch(r5) {
                case 9: goto Lc;
                case 10: goto Lc;
                case 11: goto Lc;
                default: goto L9;
            }
        L9:
            float r0 = r4.f37546a
            goto Le
        Lc:
            float r0 = com.facebook.yoga.g.f38662b
        Le:
            int r1 = r4.f37548c
            if (r1 != 0) goto L13
            goto L42
        L13:
            int[] r2 = com.facebook.react.uimanager.Z.f37545f
            r3 = r2[r5]
            r3 = r3 & r1
            if (r3 == 0) goto L1f
            float[] r0 = r4.f37547b
            r5 = r0[r5]
            return r5
        L1f:
            boolean r3 = r4.f37549d
            if (r3 == 0) goto L42
            r3 = 1
            if (r5 == r3) goto L2b
            r3 = 3
            if (r5 == r3) goto L2b
            r5 = 6
            goto L2c
        L2b:
            r5 = 7
        L2c:
            r3 = r2[r5]
            r3 = r3 & r1
            if (r3 == 0) goto L36
            float[] r0 = r4.f37547b
            r5 = r0[r5]
            return r5
        L36:
            r5 = 8
            r2 = r2[r5]
            r1 = r1 & r2
            if (r1 == 0) goto L42
            float[] r0 = r4.f37547b
            r5 = r0[r5]
            return r5
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.Z.a(int):float");
    }

    public final float b(int i10) {
        return this.f37547b[i10];
    }

    public final boolean c(int i10, float f10) {
        if (C3295k.a(this.f37547b[i10], f10)) {
            return false;
        }
        this.f37547b[i10] = f10;
        int i11 = com.facebook.yoga.g.a(f10) ? (~f37545f[i10]) & this.f37548c : f37545f[i10] | this.f37548c;
        this.f37548c = i11;
        int[] iArr = f37545f;
        this.f37549d = ((iArr[8] & i11) == 0 && (iArr[7] & i11) == 0 && (iArr[6] & i11) == 0 && (i11 & iArr[9]) == 0) ? false : true;
        return true;
    }

    public Z(float f10) {
        this(f10, f37544e.b());
    }
}
