package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class l extends AbstractC4865f {

    /* JADX INFO: renamed from: a */
    private List f47396a = new ArrayList();

    @Override // g8.InterfaceC4861b
    public void a(GifReader gifReader) {
        gifReader.peek();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        while (true) {
            C4864e c4864eC = C4864e.c(gifReader);
            if (c4864eC.b()) {
                return;
            } else {
                this.f47396a.add(c4864eC);
            }
        }
    }
}
