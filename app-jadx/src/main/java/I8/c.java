package i8;

import S4.h;
import S4.j;
import U4.v;
import com.github.penfeizhou.animation.io.d;
import g8.AbstractC4867h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import l8.m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f48735a;

    public c(j jVar) {
        this.f48735a = jVar;
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
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // S4.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v a(InputStream inputStream, int i10, int i11, h hVar) {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.f48735a.a(ByteBuffer.wrap(bArrE), i10, i11, hVar);
    }

    @Override // S4.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, h hVar) {
        if (!((Boolean) hVar.c(AbstractC5044a.f48727b)).booleanValue() && m.a(new d(inputStream))) {
            return true;
        }
        if (!((Boolean) hVar.c(AbstractC5044a.f48728c)).booleanValue() && Z7.d.a(new d(inputStream))) {
            return true;
        }
        if (((Boolean) hVar.c(AbstractC5044a.f48726a)).booleanValue() || !AbstractC4867h.b(new d(inputStream))) {
            return !((Boolean) hVar.c(AbstractC5044a.f48730e)).booleanValue() && c8.c.a(new d(inputStream));
        }
        return true;
    }
}
