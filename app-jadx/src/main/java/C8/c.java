package c8;

import com.github.penfeizhou.animation.io.Reader;
import d8.C4570a;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static boolean a(Reader reader) {
        try {
            return AvifDecoder.isAvifImage((reader instanceof C4570a ? (C4570a) reader : new C4570a(reader)).a());
        } catch (IOException unused) {
            return false;
        }
    }
}
