package t;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;
import oe.C5870f;
import u.AbstractC6705d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a */
    public Object[] f60006a;

    /* JADX INFO: renamed from: b */
    public int f60007b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final CharSequence invoke(Object obj) {
            return obj == V.this ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ V(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public static /* synthetic */ String i(V v10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
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
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function12 = function1;
        return v10.h(charSequence, charSequence2, charSequence3, i10, charSequence5, function12);
    }

    public final boolean a(Object obj) {
        return e(obj) >= 0;
    }

    public final Object b() {
        if (f()) {
            AbstractC6705d.d("ObjectList is empty.");
        }
        return this.f60006a[0];
    }

    public final Object c(int i10) {
        if (i10 < 0 || i10 >= this.f60007b) {
            j(i10);
        }
        return this.f60006a[i10];
    }

    public final int d() {
        return this.f60007b;
    }

    public final int e(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f60006a;
            int i11 = this.f60007b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f60006a;
        int i12 = this.f60007b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof V) {
            V v10 = (V) obj;
            int i10 = v10.f60007b;
            int i11 = this.f60007b;
            if (i10 == i11) {
                Object[] objArr = this.f60006a;
                Object[] objArr2 = v10.f60006a;
                C5870f c5870fX = AbstractC5874j.x(0, i11);
                int iF = c5870fX.f();
                int i12 = c5870fX.i();
                if (iF > i12) {
                    return true;
                }
                while (AbstractC5504s.c(objArr[iF], objArr2[iF])) {
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

    public final boolean f() {
        return this.f60007b == 0;
    }

    public final boolean g() {
        return this.f60007b != 0;
    }

    public final String h(CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, Function1 function1) {
        AbstractC5504s.h(separator, "separator");
        AbstractC5504s.h(prefix, "prefix");
        AbstractC5504s.h(postfix, "postfix");
        AbstractC5504s.h(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        Object[] objArr = this.f60006a;
        int i11 = this.f60007b;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                sb2.append(postfix);
                break;
            }
            Object obj = objArr[i12];
            if (i12 == i10) {
                sb2.append(truncated);
                break;
            }
            if (i12 != 0) {
                sb2.append(separator);
            }
            if (function1 == null) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) function1.invoke(obj));
            }
            i12++;
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public int hashCode() {
        Object[] objArr = this.f60006a;
        int i10 = this.f60007b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final void j(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Index ");
        sb2.append(i10);
        sb2.append(" must be in 0..");
        sb2.append(this.f60007b - 1);
        AbstractC6705d.c(sb2.toString());
    }

    public String toString() {
        return i(this, null, "[", "]", 0, null, new a(), 25, null);
    }

    private V(int i10) {
        this.f60006a = i10 == 0 ? W.f60009a : new Object[i10];
    }
}
