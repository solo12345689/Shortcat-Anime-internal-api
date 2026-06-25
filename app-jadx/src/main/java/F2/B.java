package F2;

import java.util.UUID;
import z2.InterfaceC7277b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC7277b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f6147d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f6148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6150c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            F2.B.f6147d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.B.<clinit>():void");
    }

    public B(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    public B(UUID uuid, byte[] bArr, boolean z10) {
        this.f6148a = uuid;
        this.f6149b = bArr;
        this.f6150c = z10;
    }
}
