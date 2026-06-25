package io.sentry;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: renamed from: io.sentry.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class C5196f extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object[] f50663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f50664b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f50665c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient boolean f50666d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f50667e;

    /* JADX INFO: renamed from: io.sentry.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50669b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f50670c;

        a() {
            this.f50668a = C5196f.this.f50664b;
            this.f50670c = C5196f.this.f50666d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50670c || this.f50668a != C5196f.this.f50665c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f50670c = false;
            int i10 = this.f50668a;
            this.f50669b = i10;
            this.f50668a = C5196f.this.u(i10);
            return C5196f.this.f50663a[this.f50669b];
        }

        @Override // java.util.Iterator
        public void remove() {
            int i10 = this.f50669b;
            if (i10 == -1) {
                throw new IllegalStateException();
            }
            if (i10 == C5196f.this.f50664b) {
                C5196f.this.remove();
                this.f50669b = -1;
                return;
            }
            int iU = this.f50669b + 1;
            if (C5196f.this.f50664b >= this.f50669b || iU >= C5196f.this.f50665c) {
                while (iU != C5196f.this.f50665c) {
                    if (iU >= C5196f.this.f50667e) {
                        C5196f.this.f50663a[iU - 1] = C5196f.this.f50663a[0];
                        iU = 0;
                    } else {
                        C5196f.this.f50663a[C5196f.this.t(iU)] = C5196f.this.f50663a[iU];
                        iU = C5196f.this.u(iU);
                    }
                }
            } else {
                System.arraycopy(C5196f.this.f50663a, iU, C5196f.this.f50663a, this.f50669b, C5196f.this.f50665c - iU);
            }
            this.f50669b = -1;
            C5196f c5196f = C5196f.this;
            c5196f.f50665c = c5196f.t(c5196f.f50665c);
            C5196f.this.f50663a[C5196f.this.f50665c] = null;
            C5196f.this.f50666d = false;
            this.f50668a = C5196f.this.t(this.f50668a);
        }
    }

    C5196f(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        Object[] objArr = new Object[i10];
        this.f50663a = objArr;
        this.f50667e = objArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t(int i10) {
        int i11 = i10 - 1;
        return i11 < 0 ? this.f50667e - 1 : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int u(int i10) {
        int i11 = i10 + 1;
        if (i11 >= this.f50667e) {
            return 0;
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        if (v()) {
            remove();
        }
        Object[] objArr = this.f50663a;
        int i10 = this.f50665c;
        int i11 = i10 + 1;
        this.f50665c = i11;
        objArr[i10] = obj;
        if (i11 >= this.f50667e) {
            this.f50665c = 0;
        }
        if (this.f50665c == this.f50664b) {
            this.f50666d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f50666d = false;
        this.f50664b = 0;
        this.f50665c = 0;
        Arrays.fill(this.f50663a, (Object) null);
    }

    @Override // java.util.Queue
    public Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    @Override // java.util.Queue
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f50663a[this.f50664b];
    }

    @Override // java.util.Queue
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        Object[] objArr = this.f50663a;
        int i10 = this.f50664b;
        Object obj = objArr[i10];
        if (obj != null) {
            int i11 = i10 + 1;
            this.f50664b = i11;
            objArr[i10] = null;
            if (i11 >= this.f50667e) {
                this.f50664b = 0;
            }
            this.f50666d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i10 = this.f50665c;
        int i11 = this.f50664b;
        if (i10 < i11) {
            return (this.f50667e - i11) + i10;
        }
        if (i10 != i11) {
            return i10 - i11;
        }
        if (this.f50666d) {
            return this.f50667e;
        }
        return 0;
    }

    public boolean v() {
        return size() == this.f50667e;
    }
}
