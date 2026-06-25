package oe;

import Ud.O;
import ce.AbstractC3098c;
import je.InterfaceC5371a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: oe.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5868d implements Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: d */
    public static final a f55395d = new a(null);

    /* JADX INFO: renamed from: a */
    private final int f55396a;

    /* JADX INFO: renamed from: b */
    private final int f55397b;

    /* JADX INFO: renamed from: c */
    private final int f55398c;

    /* JADX INFO: renamed from: oe.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5868d a(int i10, int i11, int i12) {
            return new C5868d(i10, i11, i12);
        }

        private a() {
        }
    }

    public C5868d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f55396a = i10;
        this.f55397b = AbstractC3098c.c(i10, i11, i12);
        this.f55398c = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5868d)) {
            return false;
        }
        if (isEmpty() && ((C5868d) obj).isEmpty()) {
            return true;
        }
        C5868d c5868d = (C5868d) obj;
        return this.f55396a == c5868d.f55396a && this.f55397b == c5868d.f55397b && this.f55398c == c5868d.f55398c;
    }

    public final int f() {
        return this.f55396a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f55396a * 31) + this.f55397b) * 31) + this.f55398c;
    }

    public final int i() {
        return this.f55397b;
    }

    public boolean isEmpty() {
        return this.f55398c > 0 ? this.f55396a > this.f55397b : this.f55396a < this.f55397b;
    }

    public final int l() {
        return this.f55398c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: n */
    public O iterator() {
        return new C5869e(this.f55396a, this.f55397b, this.f55398c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f55398c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f55396a);
            sb2.append("..");
            sb2.append(this.f55397b);
            sb2.append(" step ");
            i10 = this.f55398c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f55396a);
            sb2.append(" downTo ");
            sb2.append(this.f55397b);
            sb2.append(" step ");
            i10 = -this.f55398c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
