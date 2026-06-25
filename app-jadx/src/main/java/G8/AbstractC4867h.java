package g8;

import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g8.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4867h {

    /* JADX INFO: renamed from: g8.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a extends IOException {
        a() {
            super("Gif Format error");
        }
    }

    private static void a(GifReader gifReader) throws a {
        byte bPeek;
        if (gifReader.peek() != 71 || gifReader.peek() != 73 || gifReader.peek() != 70 || gifReader.peek() != 56 || (((bPeek = gifReader.peek()) != 55 && bPeek != 57) || gifReader.peek() != 97)) {
            throw new a();
        }
    }

    public static boolean b(Reader reader) {
        try {
            a(reader instanceof GifReader ? (GifReader) reader : new GifReader(reader));
            return true;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List c(GifReader gifReader) throws a {
        a(gifReader);
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        kVar.a(gifReader);
        arrayList.add(kVar);
        if (kVar.b()) {
            C4862c c4862c = new C4862c(kVar.c());
            c4862c.a(gifReader);
            arrayList.add(c4862c);
        }
        while (true) {
            try {
                byte bPeek = gifReader.peek();
                if (bPeek == 59) {
                    return arrayList;
                }
                InterfaceC4861b jVar = bPeek != 33 ? bPeek != 44 ? null : new j() : AbstractC4865f.b(gifReader);
                if (jVar == null) {
                    throw new a();
                }
                jVar.a(gifReader);
                arrayList.add(jVar);
            } catch (Exception e10) {
                e10.printStackTrace();
                return arrayList;
            }
        }
    }
}
