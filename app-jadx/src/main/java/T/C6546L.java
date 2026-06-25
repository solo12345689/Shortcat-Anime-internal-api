package t;

import Ud.AbstractC2273n;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u.AbstractC6705d;

/* JADX INFO: renamed from: t.L, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6546L extends V {
    public C6546L(int i10) {
        super(i10, null);
    }

    public final boolean k(Object obj) {
        int i10 = this.f60007b + 1;
        Object[] objArr = this.f60006a;
        if (objArr.length < i10) {
            t(i10, objArr);
        }
        Object[] objArr2 = this.f60006a;
        int i11 = this.f60007b;
        objArr2[i11] = obj;
        this.f60007b = i11 + 1;
        return true;
    }

    public final boolean l(List elements) {
        AbstractC5504s.h(elements, "elements");
        int i10 = this.f60007b;
        o(elements);
        return i10 != this.f60007b;
    }

    public final boolean m(V elements) {
        AbstractC5504s.h(elements, "elements");
        int i10 = this.f60007b;
        p(elements);
        return i10 != this.f60007b;
    }

    public final void n() {
        AbstractC2273n.w(this.f60006a, null, 0, this.f60007b);
        this.f60007b = 0;
    }

    public final void o(List elements) {
        AbstractC5504s.h(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i10 = this.f60007b;
        int size = elements.size() + i10;
        Object[] objArr = this.f60006a;
        if (objArr.length < size) {
            t(size, objArr);
        }
        Object[] objArr2 = this.f60006a;
        int size2 = elements.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = elements.get(i11);
        }
        this.f60007b += elements.size();
    }

    public final void p(V elements) {
        AbstractC5504s.h(elements, "elements");
        if (elements.f()) {
            return;
        }
        int i10 = this.f60007b + elements.f60007b;
        Object[] objArr = this.f60006a;
        if (objArr.length < i10) {
            t(i10, objArr);
        }
        AbstractC2273n.m(elements.f60006a, this.f60006a, this.f60007b, 0, elements.f60007b);
        this.f60007b += elements.f60007b;
    }

    public final boolean q(Object obj) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        r(iE);
        return true;
    }

    public final Object r(int i10) {
        if (i10 < 0 || i10 >= this.f60007b) {
            j(i10);
        }
        Object[] objArr = this.f60006a;
        Object obj = objArr[i10];
        int i11 = this.f60007b;
        if (i10 != i11 - 1) {
            AbstractC2273n.m(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f60007b - 1;
        this.f60007b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void s(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f60007b) || i11 < 0 || i11 > i12) {
            AbstractC6705d.c("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f60007b);
        }
        if (i11 < i10) {
            AbstractC6705d.a("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            int i13 = this.f60007b;
            if (i11 < i13) {
                Object[] objArr = this.f60006a;
                AbstractC2273n.m(objArr, objArr, i10, i11, i13);
            }
            int i14 = this.f60007b;
            int i15 = i14 - (i11 - i10);
            AbstractC2273n.w(this.f60006a, null, i15, i14);
            this.f60007b = i15;
        }
    }

    public final void t(int i10, Object[] oldContent) {
        AbstractC5504s.h(oldContent, "oldContent");
        int length = oldContent.length;
        this.f60006a = AbstractC2273n.m(oldContent, new Object[Math.max(i10, (length * 3) / 2)], 0, 0, length);
    }

    public final Object u(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f60007b) {
            j(i10);
        }
        Object[] objArr = this.f60006a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public /* synthetic */ C6546L(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 16 : i10);
    }
}
