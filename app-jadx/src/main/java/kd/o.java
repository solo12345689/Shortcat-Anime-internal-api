package Kd;

import Kd.a;
import expo.modules.video.records.BufferOptions;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5504s;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends a {
    private final long s() {
        return this.f10977c / ((long) 1000);
    }

    private final void t(long j10) {
        this.f10979e = a0.V0(j10);
    }

    private final void u(long j10) {
        this.f10978d = a0.V0(j10);
    }

    private final void v(long j10) {
        this.f10976b = a0.V0(j10);
        this.f10977c = a0.V0(j10);
    }

    public final void r(BufferOptions bufferOptions) {
        AbstractC5504s.h(bufferOptions, "bufferOptions");
        Double preferredForwardBufferDuration = bufferOptions.getPreferredForwardBufferDuration();
        v(preferredForwardBufferDuration != null ? (long) (preferredForwardBufferDuration.doubleValue() * ((double) 1000)) : 50000L);
        int maxBufferBytes = bufferOptions.getMaxBufferBytes() == 0 ? -1 : (int) bufferOptions.getMaxBufferBytes();
        this.f10980f = maxBufferBytes;
        if (maxBufferBytes != -1) {
            Iterator it = this.f10984j.values().iterator();
            while (it.hasNext()) {
                ((a.C0173a) it.next()).f10987b = this.f10980f;
            }
        }
        this.f10981g = bufferOptions.getPrioritizeTimeOverSizeThreshold();
        double d10 = 1000;
        long jS = bufferOptions.getMinBufferForPlayback() * d10 > ((double) s()) ? s() : (long) (bufferOptions.getMinBufferForPlayback() * d10);
        u(jS);
        t(jS);
        q();
    }
}
