package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class LocalExifThumbnailProducer implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f36078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B5.i f36079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f36080c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class Api24Utils {
        ExifInterface a(FileDescriptor fileDescriptor) {
            return new ExifInterface(fileDescriptor);
        }

        private Api24Utils() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends m0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ K6.b f36082f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3194n interfaceC3194n, g0 g0Var, e0 e0Var, String str, K6.b bVar) {
            super(interfaceC3194n, g0Var, e0Var, str);
            this.f36082f = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w5.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(E6.k kVar) {
            E6.k.g(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(E6.k kVar) {
            return y5.g.of("createdThumbnail", Boolean.toString(kVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // w5.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public E6.k c() {
            ExifInterface exifInterfaceG = LocalExifThumbnailProducer.this.g(this.f36082f.v());
            if (exifInterfaceG == null || !exifInterfaceG.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f36079b.d((byte[]) y5.k.g(exifInterfaceG.getThumbnail())), exifInterfaceG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends AbstractC3186f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f36084a;

        b(m0 m0Var) {
            this.f36084a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f36084a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, B5.i iVar, ContentResolver contentResolver) {
        this.f36078a = executor;
        this.f36079b = iVar;
        this.f36080c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E6.k e(B5.h hVar, ExifInterface exifInterface) {
        Pair<Integer, Integer> pairDecodeDimensions = BitmapUtil.decodeDimensions(new B5.j(hVar));
        int iH = h(exifInterface);
        int iIntValue = pairDecodeDimensions != null ? ((Integer) pairDecodeDimensions.first).intValue() : -1;
        int iIntValue2 = pairDecodeDimensions != null ? ((Integer) pairDecodeDimensions.second).intValue() : -1;
        C5.a aVarJ = C5.a.J(hVar);
        try {
            E6.k kVar = new E6.k(aVarJ);
            C5.a.m(aVarJ);
            kVar.a1(q6.b.f57656b);
            kVar.q1(iH);
            kVar.y1(iIntValue);
            kVar.M0(iIntValue2);
            return kVar;
        } catch (Throwable th2) {
            C5.a.m(aVarJ);
            throw th2;
        }
    }

    private int h(ExifInterface exifInterface) {
        return JfifUtil.getAutoRotateAngleFromOrientation(Integer.parseInt((String) y5.k.g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void a(InterfaceC3194n interfaceC3194n, e0 e0Var) {
        g0 g0VarM = e0Var.m();
        K6.b bVarQ = e0Var.q();
        e0Var.h("local", "exif");
        a aVar = new a(interfaceC3194n, g0VarM, e0Var, "LocalExifThumbnailProducer", bVarQ);
        e0Var.b(new b(aVar));
        this.f36078a.execute(aVar);
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean b(y6.g gVar) {
        return v0.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, gVar);
    }

    boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    ExifInterface g(Uri uri) {
        String strE = G5.f.e(this.f36080c, uri);
        if (strE == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            AbstractC7283a.i(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (f(strE)) {
            return new ExifInterface(strE);
        }
        AssetFileDescriptor assetFileDescriptorA = G5.f.a(this.f36080c, uri);
        if (assetFileDescriptorA != null) {
            ExifInterface exifInterfaceA = new Api24Utils().a(assetFileDescriptorA.getFileDescriptor());
            assetFileDescriptorA.close();
            return exifInterfaceA;
        }
        return null;
    }
}
