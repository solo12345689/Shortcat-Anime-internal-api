package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class T implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f36099b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends m0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g0 f36100f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ e0 f36101g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ K6.b f36102h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3194n interfaceC3194n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, K6.b bVar) {
            super(interfaceC3194n, g0Var, e0Var, str);
            this.f36100f = g0Var2;
            this.f36101g = e0Var2;
            this.f36102h = bVar;
        }

        @Override // com.facebook.imagepipeline.producers.m0, w5.h
        protected void e(Exception exc) {
            super.e(exc);
            this.f36100f.b(this.f36101g, "VideoThumbnailProducer", false);
            this.f36101g.h("local", "video");
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
        public C5.a c() throws Throwable {
            String strI;
            try {
                strI = T.this.i(this.f36102h);
            } catch (IllegalArgumentException unused) {
                strI = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strI != null ? ThumbnailUtils.createVideoThumbnail(strI, T.g(this.f36102h)) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = T.h(T.this.f36099b, this.f36102h.v());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            E6.f fVarZ0 = E6.f.z0(bitmapCreateVideoThumbnail, w6.f.b(), E6.o.f5692d, 0);
            this.f36101g.k("image_format", "thumbnail");
            fVarZ0.w(this.f36101g.getExtras());
            return C5.a.J(fVarZ0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0, w5.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(C5.a aVar) {
            super.f(aVar);
            this.f36100f.b(this.f36101g, "VideoThumbnailProducer", aVar != null);
            this.f36101g.h("local", "video");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f36104a;

        b(m0 m0Var) {
            this.f36104a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f36104a.a();
        }
    }

    public T(Executor executor, ContentResolver contentResolver) {
        this.f36098a = executor;
        this.f36099b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(K6.b bVar) {
        return (bVar.n() > 96 || bVar.m() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            y5.k.g(parcelFileDescriptorOpenFileDescriptor);
            mediaMetadataRetriever = new MediaMetadataRetriever();
        } catch (FileNotFoundException unused) {
            mediaMetadataRetriever = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            return frameAtTime;
        } catch (FileNotFoundException unused3) {
            if (mediaMetadataRetriever != null) {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            mediaMetadataRetriever2 = mediaMetadataRetriever;
            if (mediaMetadataRetriever2 != null) {
                try {
                    mediaMetadataRetriever2.release();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(K6.b bVar) {
        return G5.f.e(this.f36099b, bVar.v());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        g0 g0VarM = e0Var.m();
        K6.b bVarQ = e0Var.q();
        e0Var.h("local", "video");
        a aVar = new a(interfaceC3194n, g0VarM, e0Var, "VideoThumbnailProducer", g0VarM, e0Var, bVarQ);
        e0Var.b(new b(aVar));
        this.f36098a.execute(aVar);
    }
}
