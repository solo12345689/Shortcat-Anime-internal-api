package w2;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static void a(InterfaceC6940g interfaceC6940g) {
        if (interfaceC6940g != null) {
            try {
                interfaceC6940g.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(InterfaceC6940g interfaceC6940g) {
        byte[] bArrCopyOf = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            if (i11 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i10 = interfaceC6940g.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
            if (i10 != -1) {
                i11 += i10;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i11);
    }
}
