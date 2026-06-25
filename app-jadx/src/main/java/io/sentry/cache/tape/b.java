package io.sentry.cache.tape;

import io.sentry.cache.tape.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class b extends c {

    /* JADX INFO: renamed from: a */
    private final d f50583a;

    /* JADX INFO: renamed from: b */
    private final a f50584b = new a();

    /* JADX INFO: renamed from: c */
    final c.a f50585c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: renamed from: io.sentry.cache.tape.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class C0797b implements Iterator {

        /* JADX INFO: renamed from: a */
        final Iterator f50586a;

        C0797b(Iterator it) {
            this.f50586a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f50586a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            try {
                return b.this.f50585c.b((byte[]) this.f50586a.next());
            } catch (IOException e10) {
                throw ((Error) d.D(e10));
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f50586a.remove();
        }
    }

    b(d dVar, c.a aVar) {
        this.f50583a = dVar;
        this.f50585c = aVar;
    }

    @Override // io.sentry.cache.tape.c
    public void B0(int i10) throws IOException {
        this.f50583a.b2(i10);
    }

    @Override // io.sentry.cache.tape.c
    public void b(Object obj) throws IOException {
        this.f50584b.reset();
        this.f50585c.a(obj, this.f50584b);
        this.f50583a.w(this.f50584b.a(), 0, this.f50584b.size());
    }

    @Override // io.sentry.cache.tape.c
    public void clear() throws IOException {
        this.f50583a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f50583a.close();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C0797b(this.f50583a.iterator());
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return this.f50583a.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f50583a + '}';
    }
}
