package I5;

import y5.n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f8825a;

        a(Throwable th2) {
            this.f8825a = th2;
        }

        @Override // y5.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c get() {
            return d.b(this.f8825a);
        }
    }

    public static n a(Throwable th2) {
        return new a(th2);
    }

    public static c b(Throwable th2) {
        i iVarW = i.w();
        iVarW.o(th2);
        return iVarW;
    }
}
