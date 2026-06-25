package dg;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dg.B, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC4619B {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f45242b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45250a;

    /* JADX INFO: renamed from: dg.B$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC4619B a(String protocol) throws IOException {
            AbstractC5504s.h(protocol, "protocol");
            EnumC4619B enumC4619B = EnumC4619B.HTTP_1_0;
            if (AbstractC5504s.c(protocol, enumC4619B.f45250a)) {
                return enumC4619B;
            }
            EnumC4619B enumC4619B2 = EnumC4619B.HTTP_1_1;
            if (AbstractC5504s.c(protocol, enumC4619B2.f45250a)) {
                return enumC4619B2;
            }
            EnumC4619B enumC4619B3 = EnumC4619B.H2_PRIOR_KNOWLEDGE;
            if (AbstractC5504s.c(protocol, enumC4619B3.f45250a)) {
                return enumC4619B3;
            }
            EnumC4619B enumC4619B4 = EnumC4619B.HTTP_2;
            if (AbstractC5504s.c(protocol, enumC4619B4.f45250a)) {
                return enumC4619B4;
            }
            EnumC4619B enumC4619B5 = EnumC4619B.SPDY_3;
            if (AbstractC5504s.c(protocol, enumC4619B5.f45250a)) {
                return enumC4619B5;
            }
            EnumC4619B enumC4619B6 = EnumC4619B.QUIC;
            if (AbstractC5504s.c(protocol, enumC4619B6.f45250a)) {
                return enumC4619B6;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private a() {
        }
    }

    EnumC4619B(String str) {
        this.f45250a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f45250a;
    }
}
