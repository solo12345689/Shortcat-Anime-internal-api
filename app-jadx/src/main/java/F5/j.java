package f5;

import U4.v;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements S4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f46903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S4.j f46904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V4.b f46905c;

    public j(List list, S4.j jVar, V4.b bVar) {
        this.f46903a = list;
        this.f46904b = jVar;
        this.f46905c = bVar;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException e10) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            return null;
        }
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(InputStream inputStream, int i10, int i11, S4.h hVar) {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f46904b.a(ByteBuffer.wrap(bArrE), i10, i11, hVar);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, S4.h hVar) {
        return !((Boolean) hVar.c(i.f46902b)).booleanValue() && com.bumptech.glide.load.a.f(this.f46903a, inputStream, this.f46905c) == ImageHeaderParser.ImageType.GIF;
    }
}
