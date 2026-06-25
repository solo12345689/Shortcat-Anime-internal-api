package T7;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f17327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17328c;

    public f(Context context, int i10) {
        this.f17326a = context;
        this.f17328c = i10;
        a aVar = new a(5);
        this.f17327b = aVar;
        aVar.a(context.getApplicationInfo().sourceDir);
    }

    @Override // T7.i
    public h get() {
        return new e(new g(this.f17326a, this.f17327b), new b(this.f17326a, this.f17327b), new l(), new c(this.f17326a), new j(this.f17328c), new d(), new k(), new l());
    }
}
