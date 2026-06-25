package H6;

import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f7970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7974g;

    public E(int i10, int i11, SparseIntArray sparseIntArray) {
        this(i10, i11, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public E(int i10, int i11, SparseIntArray sparseIntArray, int i12, int i13, int i14) {
        y5.k.i(i10 >= 0 && i11 >= i10);
        this.f7969b = i10;
        this.f7968a = i11;
        this.f7970c = sparseIntArray;
        this.f7971d = i12;
        this.f7972e = i13;
        this.f7974g = i14;
    }
}
