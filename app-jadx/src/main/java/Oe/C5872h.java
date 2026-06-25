package oe;

import Ud.P;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: oe.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5872h extends P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f55409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f55410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f55412d;

    public C5872h(long j10, long j11, long j12) {
        this.f55409a = j12;
        this.f55410b = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f55411c = z10;
        this.f55412d = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f55411c;
    }

    @Override // Ud.P
    public long nextLong() {
        long j10 = this.f55412d;
        if (j10 != this.f55410b) {
            this.f55412d = this.f55409a + j10;
            return j10;
        }
        if (!this.f55411c) {
            throw new NoSuchElementException();
        }
        this.f55411c = false;
        return j10;
    }
}
