package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import c2.C3064b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a */
    private final C3064b f29611a;

    /* JADX INFO: renamed from: b */
    private final char[] f29612b;

    /* JADX INFO: renamed from: c */
    private final a f29613c = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);

    /* JADX INFO: renamed from: d */
    private final Typeface f29614d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a */
        private final SparseArray f29615a;

        /* JADX INFO: renamed from: b */
        private o f29616b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f29615a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final o b() {
            return this.f29616b;
        }

        void c(o oVar, int i10, int i11) {
            a aVarA = a(oVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f29615a.put(oVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(oVar, i10 + 1, i11);
            } else {
                aVarA.f29616b = oVar;
            }
        }

        a(int i10) {
            this.f29615a = new SparseArray(i10);
        }
    }

    private m(Typeface typeface, C3064b c3064b) {
        this.f29614d = typeface;
        this.f29611a = c3064b;
        this.f29612b = new char[c3064b.k() * 2];
        a(c3064b);
    }

    private void a(C3064b c3064b) {
        int iK = c3064b.k();
        for (int i10 = 0; i10 < iK; i10++) {
            o oVar = new o(this, i10);
            Character.toChars(oVar.f(), this.f29612b, i10 * 2);
            h(oVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            G1.n.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            G1.n.b();
        }
    }

    public char[] c() {
        return this.f29612b;
    }

    public C3064b d() {
        return this.f29611a;
    }

    int e() {
        return this.f29611a.l();
    }

    a f() {
        return this.f29613c;
    }

    Typeface g() {
        return this.f29614d;
    }

    void h(o oVar) {
        K1.f.h(oVar, "emoji metadata cannot be null");
        K1.f.b(oVar.c() > 0, "invalid metadata codepoint length");
        this.f29613c.c(oVar, 0, oVar.c() - 1);
    }
}
