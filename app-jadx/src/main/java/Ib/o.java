package Ib;

import Td.L;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import expo.modules.image.ExpoImageViewWrapper;
import expo.modules.image.enums.ContentFit;
import java.lang.ref.WeakReference;
import k5.InterfaceC5451c;
import kotlin.jvm.internal.AbstractC5504s;
import m5.InterfaceC5642b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements l5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f8991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ContentFit f8999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC5451c f9000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v f9001k;

    public o(WeakReference imageViewHolder) {
        AbstractC5504s.h(imageViewHolder, "imageViewHolder");
        this.f8991a = imageViewHolder;
        this.f8994d = -1;
        this.f8995e = -1;
        this.f8996f = -1;
        this.f8997g = -1;
        this.f8998h = -1;
        this.f9001k = new v(imageViewHolder);
    }

    private final void g() {
        synchronized (this) {
            if (this.f8998h >= 0) {
                y yVar = y.f9018a;
                String strC = yVar.c();
                String strA = yVar.a();
                X3.a.d("[" + strC + "] " + strA, this.f8998h);
                this.f8998h = -1;
            }
            L l10 = L.f17438a;
        }
    }

    public final void A(int i10) {
        this.f8994d = i10;
    }

    public final void B(int i10) {
        this.f8995e = i10;
    }

    public final void C(boolean z10) {
        this.f8993c = z10;
    }

    @Override // l5.d
    public InterfaceC5451c c() {
        return this.f9000j;
    }

    public final void e(com.bumptech.glide.k requestManager) {
        AbstractC5504s.h(requestManager, "requestManager");
        this.f9001k.d();
        requestManager.p(this);
    }

    @Override // l5.d
    public void f(l5.c cb2) {
        AbstractC5504s.h(cb2, "cb");
        this.f9001k.l(cb2);
    }

    @Override // l5.d
    public void j(InterfaceC5451c interfaceC5451c) {
        this.f9000j = interfaceC5451c;
    }

    public final boolean k() {
        return this.f8992b;
    }

    @Override // l5.d
    public void l(Drawable drawable) {
        g();
    }

    @Override // l5.d
    public void n(l5.c cb2) {
        AbstractC5504s.h(cb2, "cb");
        if (this.f8991a.get() == null) {
            cb2.c(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            this.f9001k.e(cb2);
        }
    }

    public final ContentFit o() {
        return this.f8999i;
    }

    public final int p() {
        return this.f8996f;
    }

    public final int q() {
        return this.f8997g;
    }

    public final int r() {
        return this.f8994d;
    }

    public final int s() {
        return this.f8995e;
    }

    public final boolean t() {
        return this.f8993c;
    }

    @Override // l5.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m(Drawable resource, InterfaceC5642b interfaceC5642b) {
        InterfaceC5451c interfaceC5451cB;
        AbstractC5504s.h(resource, "resource");
        Object obj = this.f8991a.get();
        if (obj == null) {
            g();
            Log.w("ExpoImage", "The `ExpoImageViewWrapper` was deallocated, but the target wasn't canceled in time.");
            return;
        }
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) obj;
        InterfaceC5451c interfaceC5451c = this.f9000j;
        boolean z10 = false;
        if (interfaceC5451c instanceof ThumbnailRequestCoordinator) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator = interfaceC5451c instanceof ThumbnailRequestCoordinator ? (ThumbnailRequestCoordinator) interfaceC5451c : null;
            if (thumbnailRequestCoordinator != null && (interfaceC5451cB = x.b(thumbnailRequestCoordinator)) != null && !interfaceC5451cB.isComplete()) {
                z10 = true;
            }
        }
        if (!z10) {
            g();
        }
        expoImageViewWrapper.onResourceReady(this, resource, z10);
    }

    public final void v(int i10) {
        g();
        synchronized (this) {
            this.f8998h = i10;
            L l10 = L.f17438a;
        }
    }

    public final void w(boolean z10) {
        this.f8992b = z10;
    }

    public final void x(ContentFit contentFit) {
        this.f8999i = contentFit;
    }

    public final void y(int i10) {
        this.f8996f = i10;
    }

    public final void z(int i10) {
        this.f8997g = i10;
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
    public void h(Drawable drawable) {
    }

    @Override // l5.d
    public void i(Drawable drawable) {
    }
}
