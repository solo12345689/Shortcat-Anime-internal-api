package t;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5870f;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6563m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f60102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60103b;

    public /* synthetic */ AbstractC6563m(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String e(AbstractC6563m abstractC6563m, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return abstractC6563m.d(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final int a() {
        if (this.f60103b == 0) {
            AbstractC6705d.d("IntList is empty.");
        }
        return this.f60102a[0];
    }

    public final int b(int i10) {
        if (i10 < 0 || i10 >= this.f60103b) {
            AbstractC6705d.c("Index must be between 0 and size");
        }
        return this.f60102a[i10];
    }

    public final int c() {
        return this.f60103b;
    }

    public final String d(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int[] iArr = this.f60102a;
        int i11 = this.f60103b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(postfix);
                break;
            }
            int i13 = iArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                break;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(i13);
            i12++;
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC6563m) {
            AbstractC6563m abstractC6563m = (AbstractC6563m) obj;
            int i10 = abstractC6563m.f60103b;
            int i11 = this.f60103b;
            if (i10 == i11) {
                int[] iArr = this.f60102a;
                int[] iArr2 = abstractC6563m.f60102a;
                C5870f c5870fX = AbstractC5874j.x(0, i11);
                int iF = c5870fX.f();
                int i12 = c5870fX.i();
                if (iF > i12) {
                    return true;
                }
                while (iArr[iF] == iArr2[iF]) {
                    if (iF == i12) {
                        return true;
                    }
                    iF++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f() {
        if (this.f60103b == 0) {
            AbstractC6705d.d("IntList is empty.");
        }
        return this.f60102a[this.f60103b - 1];
    }

    public int hashCode() {
        int[] iArr = this.f60102a;
        int i10 = this.f60103b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return e(this, null, "[", "]", 0, null, 25, null);
    }

    private AbstractC6563m(int i10) {
        this.f60102a = i10 == 0 ? r.a() : new int[i10];
    }
}
