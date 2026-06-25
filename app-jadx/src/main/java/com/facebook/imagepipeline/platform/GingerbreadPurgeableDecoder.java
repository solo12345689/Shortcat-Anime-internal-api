package com.facebook.imagepipeline.platform;

import B5.h;
import B5.j;
import C5.a;
import H5.b;
import H5.c;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import y5.AbstractC7203a;
import y5.AbstractC7204b;
import y5.k;
import y5.p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f36003d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f36004c = c.i();

    private static MemoryFile h(a aVar, int i10, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        E5.a aVar2;
        j jVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i10);
        memoryFile.allowPurging(false);
        try {
            j jVar2 = new j((h) aVar.C());
            try {
                aVar2 = new E5.a(jVar2, i10);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    AbstractC7203a.a(aVar2, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i10, bArr.length);
                    }
                    a.m(aVar);
                    AbstractC7204b.b(jVar2);
                    AbstractC7204b.b(aVar2);
                    AbstractC7204b.a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStream2;
                    jVar = jVar2;
                    a.m(aVar);
                    AbstractC7204b.b(jVar);
                    AbstractC7204b.b(aVar2);
                    AbstractC7204b.a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                aVar2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            aVar2 = null;
        }
    }

    private Bitmap i(a aVar, int i10, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile memoryFileH = h(aVar, i10, bArr);
                try {
                    FileDescriptor fileDescriptorK = k(memoryFileH);
                    b bVar = this.f36004c;
                    if (bVar == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmap = (Bitmap) k.h(bVar.a(fileDescriptorK, null, options), "BitmapFactory returned null");
                    if (memoryFileH != null) {
                        memoryFileH.close();
                    }
                    return bitmap;
                } catch (IOException e10) {
                    e = e10;
                    memoryFile = memoryFileH;
                    throw p.a(e);
                } catch (Throwable th2) {
                    th = th2;
                    memoryFile = memoryFileH;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    private synchronized Method j() {
        if (f36003d == null) {
            try {
                f36003d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
            } catch (Exception e10) {
                throw p.a(e10);
            }
        }
        return f36003d;
    }

    private FileDescriptor k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) k.g(j().invoke(memoryFile, null));
        } catch (Exception e10) {
            throw p.a(e10);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap c(a aVar, BitmapFactory.Options options) {
        return i(aVar, ((h) aVar.C()).size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap d(a aVar, int i10, BitmapFactory.Options options) {
        return i(aVar, i10, DalvikPurgeableDecoder.e(aVar, i10) ? null : DalvikPurgeableDecoder.f35991b, options);
    }
}
