package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class u0 extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private short[] f20237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20238b;

    public u0(short[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20237a = bufferWithData;
        this.f20238b = bufferWithData.length;
        b(10);
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        short[] sArr = this.f20237a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, AbstractC5874j.e(i10, sArr.length * 2));
            AbstractC5504s.g(sArrCopyOf, "copyOf(...)");
            this.f20237a = sArrCopyOf;
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20238b;
    }

    public final void e(short s10) {
        AbstractC2343n0.c(this, 0, 1, null);
        short[] sArr = this.f20237a;
        int iD = d();
        this.f20238b = iD + 1;
        sArr[iD] = s10;
    }

    @Override // Vf.AbstractC2343n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f20237a, d());
        AbstractC5504s.g(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }
}
