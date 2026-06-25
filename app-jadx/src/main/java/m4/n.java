package m4;

import android.content.Context;
import kotlin.jvm.internal.AbstractC5504s;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a */
    private final h f53206a;

    /* JADX INFO: renamed from: b */
    private final c f53207b;

    /* JADX INFO: renamed from: c */
    private final h f53208c;

    /* JADX INFO: renamed from: d */
    private final h f53209d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, InterfaceC5931b taskExecutor) {
        this(context, taskExecutor, null, null, null, null, 60, null);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(taskExecutor, "taskExecutor");
    }

    public final h a() {
        return this.f53206a;
    }

    public final c b() {
        return this.f53207b;
    }

    public final h c() {
        return this.f53208c;
    }

    public final h d() {
        return this.f53209d;
    }

    public n(Context context, InterfaceC5931b taskExecutor, h batteryChargingTracker, c batteryNotLowTracker, h networkStateTracker, h storageNotLowTracker) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(taskExecutor, "taskExecutor");
        AbstractC5504s.h(batteryChargingTracker, "batteryChargingTracker");
        AbstractC5504s.h(batteryNotLowTracker, "batteryNotLowTracker");
        AbstractC5504s.h(networkStateTracker, "networkStateTracker");
        AbstractC5504s.h(storageNotLowTracker, "storageNotLowTracker");
        this.f53206a = batteryChargingTracker;
        this.f53207b = batteryNotLowTracker;
        this.f53208c = networkStateTracker;
        this.f53209d = storageNotLowTracker;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ n(android.content.Context r8, p4.InterfaceC5931b r9, m4.h r10, m4.c r11, m4.h r12, m4.h r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            java.lang.String r1 = "context.applicationContext"
            if (r0 == 0) goto L14
            m4.a r0 = new m4.a
            android.content.Context r3 = r8.getApplicationContext()
            kotlin.jvm.internal.AbstractC5504s.g(r3, r1)
            r0.<init>(r3, r9)
            r3 = r0
            goto L15
        L14:
            r3 = r10
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L27
            m4.c r0 = new m4.c
            android.content.Context r4 = r8.getApplicationContext()
            kotlin.jvm.internal.AbstractC5504s.g(r4, r1)
            r0.<init>(r4, r9)
            r4 = r0
            goto L28
        L27:
            r4 = r11
        L28:
            r0 = r14 & 16
            if (r0 == 0) goto L39
            android.content.Context r0 = r8.getApplicationContext()
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            m4.h r0 = m4.k.a(r0, r9)
            r5 = r0
            goto L3a
        L39:
            r5 = r12
        L3a:
            r0 = r14 & 32
            if (r0 == 0) goto L4f
            m4.l r0 = new m4.l
            android.content.Context r6 = r8.getApplicationContext()
            kotlin.jvm.internal.AbstractC5504s.g(r6, r1)
            r0.<init>(r6, r9)
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L53
        L4f:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L53:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.n.<init>(android.content.Context, p4.b, m4.h, m4.c, m4.h, m4.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
