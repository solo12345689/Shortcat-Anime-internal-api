package kg;

import Df.r;
import dg.EnumC4619B;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f52222d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC4619B f52223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52225c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String statusLine) throws ProtocolException {
            EnumC4619B enumC4619B;
            int i10;
            String strSubstring;
            AbstractC5504s.h(statusLine, "statusLine");
            if (r.Q(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    enumC4619B = EnumC4619B.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    enumC4619B = EnumC4619B.HTTP_1_1;
                }
            } else {
                if (!r.Q(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                enumC4619B = EnumC4619B.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                AbstractC5504s.g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    AbstractC5504s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new k(enumC4619B, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        private a() {
        }
    }

    public k(EnumC4619B protocol, int i10, String message) {
        AbstractC5504s.h(protocol, "protocol");
        AbstractC5504s.h(message, "message");
        this.f52223a = protocol;
        this.f52224b = i10;
        this.f52225c = message;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f52223a == EnumC4619B.HTTP_1_0) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f52224b);
        sb2.append(' ');
        sb2.append(this.f52225c);
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
