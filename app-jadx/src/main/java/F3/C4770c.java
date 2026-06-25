package f3;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: f3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4770c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f46841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f46842b;

    public C4770c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        this.f46841a = byteArrayOutputStream;
        this.f46842b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(C4768a c4768a) {
        this.f46841a.reset();
        try {
            b(this.f46842b, c4768a.f46835a);
            String str = c4768a.f46836b;
            if (str == null) {
                str = "";
            }
            b(this.f46842b, str);
            this.f46842b.writeLong(c4768a.f46837c);
            this.f46842b.writeLong(c4768a.f46838d);
            this.f46842b.write(c4768a.f46839e);
            this.f46842b.flush();
            return this.f46841a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
