package h3;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q2.C6078J;

/* JADX INFO: renamed from: h3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4900a extends d3.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f47594c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f47595a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f47596b = StandardCharsets.ISO_8859_1.newDecoder();

    private String c(ByteBuffer byteBuffer) {
        try {
            return this.f47595a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.f47596b.decode(byteBuffer).toString();
                this.f47596b.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.f47596b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f47596b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f47595a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // d3.c
    protected C6078J b(d3.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strC == null) {
            return new C6078J(new C4902c(bArr, null, null));
        }
        Matcher matcher = f47594c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strE = O9.c.e(strGroup);
                strE.getClass();
                if (strE.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strE.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C6078J(new C4902c(bArr, str, str2));
    }
}
