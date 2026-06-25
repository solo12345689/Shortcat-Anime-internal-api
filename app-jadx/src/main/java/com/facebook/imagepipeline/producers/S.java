package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class S implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f36090b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends m0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f36091f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0 f36092g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ K6.b f36093h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f36094i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3194n interfaceC3194n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, K6.b bVar, CancellationSignal cancellationSignal) {
            super(interfaceC3194n, g0Var, e0Var, str);
            this.f36091f = g0Var2;
            this.f36092g = e0Var2;
            this.f36093h = bVar;
            this.f36094i = cancellationSignal;
        }

        @Override // com.facebook.imagepipeline.producers.m0, w5.h
        protected void d() {
            super.d();
            this.f36094i.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.m0, w5.h
        protected void e(Exception exc) {
            super.e(exc);
            this.f36091f.b(this.f36092g, "LocalThumbnailBitmapSdk29Producer", false);
            this.f36092g.h("local", "thumbnail_bitmap");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w5.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(C5.a aVar) {
            C5.a.m(aVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(C5.a aVar) {
            return y5.g.of("createdThumbnail", String.valueOf(aVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w5.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public C5.a c() throws IOException {
            String strE;
            Size size = new Size(this.f36093h.n(), this.f36093h.m());
            try {
                strE = S.this.e(this.f36093h);
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strE != null ? A5.a.c(A5.a.b(strE)) ? ThumbnailUtils.createVideoThumbnail(new File(strE), size, this.f36094i) : ThumbnailUtils.createImageThumbnail(new File(strE), size, this.f36094i) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = S.this.f36090b.loadThumbnail(this.f36093h.v(), size, this.f36094i);
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            E6.f fVarZ0 = E6.f.z0(bitmapCreateVideoThumbnail, w6.f.b(), E6.o.f5692d, 0);
            this.f36092g.k("image_format", "thumbnail");
            fVarZ0.w(this.f36092g.getExtras());
            return C5.a.J(fVarZ0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0, w5.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(C5.a aVar) {
            super.f(aVar);
            this.f36091f.b(this.f36092g, "LocalThumbnailBitmapSdk29Producer", aVar != null);
            this.f36092g.h("local", "thumbnail_bitmap");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f36096a;

        b(m0 m0Var) {
            this.f36096a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f36096a.a();
        }
    }

    public S(Executor executor, ContentResolver contentResolver) {
        this.f36089a = executor;
        this.f36090b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(K6.b bVar) {
        return G5.f.e(this.f36090b, bVar.v());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        g0 g0VarM = e0Var.m();
        K6.b bVarQ = e0Var.q();
        e0Var.h("local", "thumbnail_bitmap");
        a aVar = new a(interfaceC3194n, g0VarM, e0Var, "LocalThumbnailBitmapSdk29Producer", g0VarM, e0Var, bVarQ, new CancellationSignal());
        e0Var.b(new b(aVar));
        this.f36089a.execute(aVar);
    }
}
