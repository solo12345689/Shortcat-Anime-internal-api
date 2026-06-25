package Xf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class J implements InterfaceC2385w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private char[] f21909a = C2374k.f21997c.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21910b;

    private final void d(int i10, int i11, String str) {
        byte b10;
        int length = str.length();
        while (i10 < length) {
            int iF = f(i11, 2);
            char cCharAt = str.charAt(i10);
            if (cCharAt >= a0.a().length || (b10 = a0.a()[cCharAt]) == 0) {
                int i12 = iF + 1;
                this.f21909a[iF] = cCharAt;
                i11 = i12;
                i10++;
            } else {
                if (b10 == 1) {
                    String str2 = a0.b()[cCharAt];
                    AbstractC5504s.e(str2);
                    int iF2 = f(iF, str2.length());
                    str2.getChars(0, str2.length(), this.f21909a, iF2);
                    i11 = iF2 + str2.length();
                    this.f21910b = i11;
                } else {
                    char[] cArr = this.f21909a;
                    cArr[iF] = '\\';
                    cArr[iF + 1] = (char) b10;
                    i11 = iF + 2;
                    this.f21910b = i11;
                }
                i10++;
            }
        }
        int iF3 = f(i11, 1);
        this.f21909a[iF3] = '\"';
        this.f21910b = iF3 + 1;
    }

    private final void e(int i10) {
        f(this.f21910b, i10);
    }

    private final int f(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.f21909a;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, AbstractC5874j.e(i12, i10 * 2));
            AbstractC5504s.g(cArrCopyOf, "copyOf(...)");
            this.f21909a = cArrCopyOf;
        }
        return i10;
    }

    @Override // Xf.InterfaceC2385w
    public void a(char c10) {
        e(1);
        char[] cArr = this.f21909a;
        int i10 = this.f21910b;
        this.f21910b = i10 + 1;
        cArr[i10] = c10;
    }

    @Override // Xf.InterfaceC2385w
    public void b(String text) {
        AbstractC5504s.h(text, "text");
        e(text.length() + 2);
        char[] cArr = this.f21909a;
        int i10 = this.f21910b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        for (int i13 = i11; i13 < i12; i13++) {
            char c10 = cArr[i13];
            if (c10 < a0.a().length && a0.a()[c10] != 0) {
                d(i13 - i11, i13, text);
                return;
            }
        }
        cArr[i12] = '\"';
        this.f21910b = i12 + 1;
    }

    @Override // Xf.InterfaceC2385w
    public void c(String text) {
        AbstractC5504s.h(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        e(length);
        text.getChars(0, text.length(), this.f21909a, this.f21910b);
        this.f21910b += length;
    }

    public void g() {
        C2374k.f21997c.c(this.f21909a);
    }

    public String toString() {
        return new String(this.f21909a, 0, this.f21910b);
    }

    @Override // Xf.InterfaceC2385w
    public void writeLong(long j10) {
        c(String.valueOf(j10));
    }
}
