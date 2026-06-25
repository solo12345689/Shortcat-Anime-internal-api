package b5;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z implements S4.j {
    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public U4.v a(Bitmap bitmap, int i10, int i11, S4.h hVar) {
        return new a(bitmap);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Bitmap bitmap, S4.h hVar) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements U4.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f33143a;

        a(Bitmap bitmap) {
            this.f33143a = bitmap;
        }

        @Override // U4.v
        public Class a() {
            return Bitmap.class;
        }

        @Override // U4.v
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f33143a;
        }

        @Override // U4.v
        public int getSize() {
            return o5.l.i(this.f33143a);
        }

        @Override // U4.v
        public void recycle() {
        }
    }
}
