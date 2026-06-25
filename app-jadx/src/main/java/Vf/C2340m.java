package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: Vf.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2340m extends AbstractC2343n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f20215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20216b;

    public C2340m(char[] bufferWithData) {
        AbstractC5504s.h(bufferWithData, "bufferWithData");
        this.f20215a = bufferWithData;
        this.f20216b = bufferWithData.length;
        b(10);
    }

    @Override // Vf.AbstractC2343n0
    public void b(int i10) {
        char[] cArr = this.f20215a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, AbstractC5874j.e(i10, cArr.length * 2));
            AbstractC5504s.g(cArrCopyOf, "copyOf(...)");
            this.f20215a = cArrCopyOf;
        }
    }

    @Override // Vf.AbstractC2343n0
    public int d() {
        return this.f20216b;
    }

    public final void e(char c10) {
        AbstractC2343n0.c(this, 0, 1, null);
        char[] cArr = this.f20215a;
        int iD = d();
        this.f20216b = iD + 1;
        cArr[iD] = c10;
    }

    @Override // Vf.AbstractC2343n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f20215a, d());
        AbstractC5504s.g(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }
}
