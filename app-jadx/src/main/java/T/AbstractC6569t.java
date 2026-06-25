package t;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5870f;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.t */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6569t {

    /* JADX INFO: renamed from: a */
    public long[] f60128a;

    /* JADX INFO: renamed from: b */
    public int f60129b;

    public /* synthetic */ AbstractC6569t(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String c(AbstractC6569t abstractC6569t, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return abstractC6569t.b(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public final long a(int i10) {
        if (i10 < 0 || i10 >= this.f60129b) {
            AbstractC6705d.c("Index must be between 0 and size");
        }
        return this.f60128a[i10];
    }

    public final String b(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated) {
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        long[] jArr = this.f60128a;
        int i11 = this.f60129b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(postfix);
                break;
            }
            long j10 = jArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                break;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            sb2.append(j10);
            i12++;
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC6569t) {
            AbstractC6569t abstractC6569t = (AbstractC6569t) obj;
            int i10 = abstractC6569t.f60129b;
            int i11 = this.f60129b;
            if (i10 == i11) {
                long[] jArr = this.f60128a;
                long[] jArr2 = abstractC6569t.f60128a;
                C5870f c5870fX = AbstractC5874j.x(0, i11);
                int iF = c5870fX.f();
                int i12 = c5870fX.i();
                if (iF > i12) {
                    return true;
                }
                while (jArr[iF] == jArr2[iF]) {
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

    public int hashCode() {
        long[] jArr = this.f60128a;
        int i10 = this.f60129b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public String toString() {
        return c(this, null, "[", "]", 0, null, 25, null);
    }

    private AbstractC6569t(int i10) {
        this.f60128a = i10 == 0 ? AbstractC6572w.a() : new long[i10];
    }
}
