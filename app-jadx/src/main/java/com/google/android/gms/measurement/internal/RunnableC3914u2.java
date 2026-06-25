package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3914u2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f41645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f41646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3900s2 f41647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f41649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3921v2 f41650f;

    public RunnableC3914u2(C3921v2 c3921v2, String str, URL url, byte[] bArr, Map map, InterfaceC3900s2 interfaceC3900s2) {
        Objects.requireNonNull(c3921v2);
        this.f41650f = c3921v2;
        AbstractC2115p.f(str);
        AbstractC2115p.l(url);
        AbstractC2115p.l(interfaceC3900s2);
        this.f41645a = url;
        this.f41646b = bArr;
        this.f41647c = interfaceC3900s2;
        this.f41648d = str;
        this.f41649e = map;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00fe: MOVE (r9 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:255), block:B:51:0x00fc */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0101: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:258), block:B:52:0x0100 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.RunnableC3914u2.run():void");
    }
}
