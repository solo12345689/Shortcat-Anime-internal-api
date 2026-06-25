package N2;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f12660a = new a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements n {
        a() {
        }

        @Override // N2.n
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // N2.n
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // N2.n
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
