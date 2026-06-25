package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class H extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f20137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20138b;

    public H(int[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20137a = bufferWithData;
        this.f20138b = bufferWithData.length;
        b(10);
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        int[] iArr = this.f20137a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, AbstractC5874j.e(i10, iArr.length * 2));
            AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
            this.f20137a = iArrCopyOf;
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20138b;
    }

    public final void e(int i10) {
        AbstractC2343n0.c(this, 0, 1, null);
        int[] iArr = this.f20137a;
        int iD = d();
        this.f20138b = iD + 1;
        iArr[iD] = i10;
    }

    @Override // Vf.AbstractC2343n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f20137a, d());
        AbstractC5504s.g(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }
}
