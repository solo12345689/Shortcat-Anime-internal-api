package fe;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class r implements Cf.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BufferedReader f47043a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Iterator, InterfaceC5371a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47045b;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f47044a;
            this.f47044a = null;
            AbstractC5504s.e(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f47044a == null && !this.f47045b) {
                String line = r.this.f47043a.readLine();
                this.f47044a = line;
                if (line == null) {
                    this.f47045b = true;
                }
            }
            return this.f47044a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r(BufferedReader reader) {
        AbstractC5504s.h(reader, "reader");
        this.f47043a = reader;
    }

    @Override // Cf.i
    public Iterator iterator() {
        return new a();
    }
}
