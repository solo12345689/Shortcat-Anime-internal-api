package Cf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class w implements i, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f3120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3122c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f3123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3124b;

        a() {
            this.f3123a = w.this.f3120a.iterator();
        }

        private final void b() {
            while (this.f3124b < w.this.f3121b && this.f3123a.hasNext()) {
                this.f3123a.next();
                this.f3124b++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.f3124b < w.this.f3122c && this.f3123a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (this.f3124b >= w.this.f3122c) {
                throw new NoSuchElementException();
            }
            this.f3124b++;
            return this.f3123a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(i sequence, int i10, int i11) {
        AbstractC5504s.h(sequence, "sequence");
        this.f3120a = sequence;
        this.f3121b = i10;
        this.f3122c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        }
        if (i11 >= i10) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
    }

    private final int f() {
        return this.f3122c - this.f3121b;
    }

    @Override // Cf.c
    public i a(int i10) {
        return i10 >= f() ? s.i() : new w(this.f3120a, this.f3121b + i10, this.f3122c);
    }

    @Override // Cf.c
    public i b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        i iVar = this.f3120a;
        int i11 = this.f3121b;
        return new w(iVar, i11, i10 + i11);
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a();
    }
}
