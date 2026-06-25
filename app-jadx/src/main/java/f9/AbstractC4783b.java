package f9;

import java.util.Arrays;

/* JADX INFO: renamed from: f9.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC4783b extends AbstractC4784c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object[] f46967a = new Object[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f46968b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f46969c;

    AbstractC4783b(int i10) {
    }

    public final AbstractC4783b a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f46967a.length;
        int i11 = this.f46968b;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.f46969c) {
            this.f46967a = Arrays.copyOf(this.f46967a, i10);
            this.f46969c = false;
        }
        Object[] objArr = this.f46967a;
        int i13 = this.f46968b;
        this.f46968b = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
