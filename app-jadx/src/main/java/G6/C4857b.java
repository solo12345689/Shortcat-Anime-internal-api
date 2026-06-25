package g6;

import android.graphics.Bitmap;
import android.graphics.Rect;
import b6.InterfaceC3025b;
import b6.c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r6.InterfaceC6273a;
import t6.C6648d;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: g6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4857b implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f47356f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Class f47357g = C4857b.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3025b f47358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC6273a f47359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C6648d f47361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6648d.b f47362e;

    /* JADX INFO: renamed from: g6.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: g6.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0760b implements C6648d.b {
        C0760b() {
        }

        @Override // t6.C6648d.b
        public void a(int i10, Bitmap bitmap) {
            AbstractC5504s.h(bitmap, "bitmap");
        }

        @Override // t6.C6648d.b
        public C5.a b(int i10) {
            return C4857b.this.f47358a.M(i10);
        }
    }

    public C4857b(InterfaceC3025b bitmapFrameCache, InterfaceC6273a animatedDrawableBackend, boolean z10) {
        AbstractC5504s.h(bitmapFrameCache, "bitmapFrameCache");
        AbstractC5504s.h(animatedDrawableBackend, "animatedDrawableBackend");
        this.f47358a = bitmapFrameCache;
        this.f47359b = animatedDrawableBackend;
        this.f47360c = z10;
        C0760b c0760b = new C0760b();
        this.f47362e = c0760b;
        this.f47361d = new C6648d(this.f47359b, z10, c0760b);
    }

    @Override // b6.c
    public boolean a(int i10, Bitmap targetBitmap) {
        AbstractC5504s.h(targetBitmap, "targetBitmap");
        try {
            this.f47361d.h(i10, targetBitmap);
            return true;
        } catch (IllegalStateException e10) {
            AbstractC7283a.l(f47357g, e10, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i10));
            return false;
        }
    }

    @Override // b6.c
    public int c() {
        return this.f47359b.getHeight();
    }

    @Override // b6.c
    public void d(Rect rect) {
        InterfaceC6273a interfaceC6273aF = this.f47359b.f(rect);
        AbstractC5504s.g(interfaceC6273aF, "forNewBounds(...)");
        if (interfaceC6273aF != this.f47359b) {
            this.f47359b = interfaceC6273aF;
            this.f47361d = new C6648d(interfaceC6273aF, this.f47360c, this.f47362e);
        }
    }

    @Override // b6.c
    public int e() {
        return this.f47359b.getWidth();
    }
}
