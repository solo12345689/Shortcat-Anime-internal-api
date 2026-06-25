package E9;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f5789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0056a f5790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5791c;

    /* JADX INFO: renamed from: E9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0056a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0056a interfaceC0056a, Typeface typeface) {
        this.f5789a = typeface;
        this.f5790b = interfaceC0056a;
    }

    private void d(Typeface typeface) {
        if (this.f5791c) {
            return;
        }
        this.f5790b.a(typeface);
    }

    @Override // E9.g
    public void a(int i10) {
        d(this.f5789a);
    }

    @Override // E9.g
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f5791c = true;
    }
}
