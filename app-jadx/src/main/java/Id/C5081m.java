package id;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: id.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class C5081m extends IllegalArgumentException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f48873b;

    public C5081m(String str, String str2, int i10, Throwable th2) {
        super(str, th2);
        this.f48872a = i10;
        this.f48873b = str2;
    }

    private static String a(CharBuffer charBuffer) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charBuffer.position() + charBuffer.remaining(); i10++) {
            sb2.append(charBuffer.get(i10));
        }
        return sb2.toString();
    }

    public C5081m(String str, String str2, int i10) {
        this(str, str2, i10, null);
    }

    public C5081m(String str, CharBuffer charBuffer, Throwable th2) {
        this(str, a(charBuffer), charBuffer.position(), th2);
    }

    public C5081m(String str, CharBuffer charBuffer) {
        this(str, a(charBuffer), charBuffer.position(), null);
    }
}
