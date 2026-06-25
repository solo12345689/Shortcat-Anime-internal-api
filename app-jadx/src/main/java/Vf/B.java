package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class B extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f20121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20122b;

    public B(float[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20121a = bufferWithData;
        this.f20122b = bufferWithData.length;
        b(10);
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        float[] fArr = this.f20121a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, AbstractC5874j.e(i10, fArr.length * 2));
            AbstractC5504s.g(fArrCopyOf, "copyOf(...)");
            this.f20121a = fArrCopyOf;
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20122b;
    }

    public final void e(float f10) {
        AbstractC2343n0.c(this, 0, 1, null);
        float[] fArr = this.f20121a;
        int iD = d();
        this.f20122b = iD + 1;
        fArr[iD] = f10;
    }

    @Override // Vf.AbstractC2343n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f20121a, d());
        AbstractC5504s.g(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }
}
