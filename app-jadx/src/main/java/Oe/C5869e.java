package oe;

import Ud.O;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: oe.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5869e extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55402d;

    public C5869e(int i10, int i11, int i12) {
        this.f55399a = i12;
        this.f55400b = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.f55401c = z10;
        this.f55402d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f55401c;
    }

    @Override // Ud.O
    public int nextInt() {
        int i10 = this.f55402d;
        if (i10 != this.f55400b) {
            this.f55402d = this.f55399a + i10;
            return i10;
        }
        if (!this.f55401c) {
            throw new NoSuchElementException();
        }
        this.f55401c = false;
        return i10;
    }
}
