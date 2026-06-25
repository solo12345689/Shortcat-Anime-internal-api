package a1;

import Ud.AbstractC2273n;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: a1.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2548p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private char[] f23625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23627d;

    public C2548p(char[] cArr, int i10, int i11) {
        this.f23624a = cArr.length;
        this.f23625b = cArr;
        this.f23626c = i10;
        this.f23627d = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.f23626c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f23625b;
            AbstractC2273n.i(cArr, cArr, this.f23627d - i13, i11, i12);
            this.f23626c = i10;
            this.f23627d -= i13;
            return;
        }
        if (i10 < i12 && i11 >= i12) {
            this.f23627d = i11 + c();
            this.f23626c = i10;
            return;
        }
        int iC = i10 + c();
        int iC2 = i11 + c();
        int i14 = this.f23627d;
        char[] cArr2 = this.f23625b;
        AbstractC2273n.i(cArr2, cArr2, this.f23626c, i14, iC);
        this.f23626c += iC - i14;
        this.f23627d = iC2;
    }

    private final int c() {
        return this.f23627d - this.f23626c;
    }

    private final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int iC = i10 - c();
        int i11 = this.f23624a;
        do {
            i11 *= 2;
        } while (i11 - this.f23624a < iC);
        char[] cArr = new char[i11];
        AbstractC2273n.i(this.f23625b, cArr, 0, 0, this.f23626c);
        int i12 = this.f23624a;
        int i13 = this.f23627d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        AbstractC2273n.i(this.f23625b, cArr, i15, i13, i14 + i13);
        this.f23625b = cArr;
        this.f23624a = i11;
        this.f23627d = i15;
    }

    public final void a(StringBuilder sb2) {
        sb2.append(this.f23625b, 0, this.f23626c);
        AbstractC5504s.g(sb2, "append(...)");
        char[] cArr = this.f23625b;
        int i10 = this.f23627d;
        sb2.append(cArr, i10, this.f23624a - i10);
        AbstractC5504s.g(sb2, "append(...)");
    }

    public final char d(int i10) {
        int i11 = this.f23626c;
        return i10 < i11 ? this.f23625b[i10] : this.f23625b[(i10 - i11) + this.f23627d];
    }

    public final int e() {
        return this.f23624a - c();
    }

    public final void g(int i10, int i11, String str) {
        f(str.length() - (i11 - i10));
        b(i10, i11);
        AbstractC2549q.b(str, this.f23625b, this.f23626c);
        this.f23626c += str.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        return sb2.toString();
    }
}
