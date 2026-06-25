package l5;

import android.graphics.drawable.Drawable;
import k5.InterfaceC5451c;
import o5.l;

/* JADX INFO: renamed from: l5.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5555a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5451c f52546c;

    public AbstractC5555a() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // l5.d
    public final InterfaceC5451c c() {
        return this.f52546c;
    }

    @Override // l5.d
    public final void j(InterfaceC5451c interfaceC5451c) {
        this.f52546c = interfaceC5451c;
    }

    @Override // l5.d
    public final void n(c cVar) {
        cVar.c(this.f52544a, this.f52545b);
    }

    public AbstractC5555a(int i10, int i11) {
        if (l.u(i10, i11)) {
            this.f52544a = i10;
            this.f52545b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // h5.l
    public void a() {
    }

    @Override // h5.l
    public void b() {
    }

    @Override // h5.l
    public void d() {
    }

    @Override // l5.d
    public final void f(c cVar) {
    }

    @Override // l5.d
    public void h(Drawable drawable) {
    }

    @Override // l5.d
    public void l(Drawable drawable) {
    }
}
