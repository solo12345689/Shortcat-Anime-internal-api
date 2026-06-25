package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class r extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f20226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20227b;

    public r(double[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20226a = bufferWithData;
        this.f20227b = bufferWithData.length;
        b(10);
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        double[] dArr = this.f20226a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, AbstractC5874j.e(i10, dArr.length * 2));
            AbstractC5504s.g(dArrCopyOf, "copyOf(...)");
            this.f20226a = dArrCopyOf;
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20227b;
    }

    public final void e(double d10) {
        AbstractC2343n0.c(this, 0, 1, null);
        double[] dArr = this.f20226a;
        int iD = d();
        this.f20227b = iD + 1;
        dArr[iD] = d10;
    }

    @Override // Vf.AbstractC2343n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f20226a, d());
        AbstractC5504s.g(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }
}
