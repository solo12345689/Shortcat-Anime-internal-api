package T7;

import com.facebook.soloader.E;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h[] f17324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17325b = 0;

    public e(h... hVarArr) {
        this.f17324a = hVarArr;
    }

    @Override // T7.h
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        int i10;
        h[] hVarArr;
        do {
            i10 = this.f17325b;
            hVarArr = this.f17324a;
            if (i10 >= hVarArr.length) {
                return false;
            }
            this.f17325b = i10 + 1;
        } while (!hVarArr[i10].a(unsatisfiedLinkError, eArr));
        return true;
    }
}
