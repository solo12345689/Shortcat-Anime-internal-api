package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class O extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f20157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20158b;

    public O(long[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20157a = bufferWithData;
        this.f20158b = bufferWithData.length;
        b(10);
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        long[] jArr = this.f20157a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, AbstractC5874j.e(i10, jArr.length * 2));
            AbstractC5504s.g(jArrCopyOf, "copyOf(...)");
            this.f20157a = jArrCopyOf;
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20158b;
    }

    public final void e(long j10) {
        AbstractC2343n0.c(this, 0, 1, null);
        long[] jArr = this.f20157a;
        int iD = d();
        this.f20158b = iD + 1;
        jArr[iD] = j10;
    }

    @Override // Vf.AbstractC2343n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f20157a, d());
        AbstractC5504s.g(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }
}
