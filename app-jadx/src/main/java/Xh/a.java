package Xh;

import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class a implements Xh.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BitSet f22045a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BitSet f22046a;

        public a b() {
            return new a(this);
        }

        public b c(char c10) {
            if (c10 > 127) {
                throw new IllegalArgumentException("Can only match ASCII characters");
            }
            this.f22046a.set(c10);
            return this;
        }

        public b d(char c10, char c11) {
            while (c10 <= c11) {
                c(c10);
                c10 = (char) (c10 + 1);
            }
            return this;
        }

        private b(BitSet bitSet) {
            this.f22046a = bitSet;
        }
    }

    public static b b() {
        return new b(new BitSet());
    }

    @Override // Xh.b
    public boolean a(char c10) {
        return this.f22045a.get(c10);
    }

    public b c() {
        return new b((BitSet) this.f22045a.clone());
    }

    private a(b bVar) {
        this.f22045a = bVar.f22046a;
    }
}
