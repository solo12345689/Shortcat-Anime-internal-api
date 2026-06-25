package com.revenuecat.purchases.common.verification;

import Df.C1271d;
import Df.r;
import Td.L;
import Ud.AbstractC2279u;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0007J,\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0011\u0018\u00010\u0010J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eJJ\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager;", "", "signatureVerificationMode", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "apiKey", "", "(Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;Lcom/revenuecat/purchases/common/AppConfig;Ljava/lang/String;)V", "getSignatureVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "createRandomNonce", "getPostParamsForSigningHeaderIfNeeded", "endpoint", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "postFieldsToSign", "", "Lkotlin/Pair;", "shouldVerifyEndpoint", "", "verifyResponse", "Lcom/revenuecat/purchases/VerificationResult;", "urlPath", "signatureString", "nonce", "body", "requestTime", "eTag", "postFieldsToSignHeader", "Companion", "Parameters", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Companion;", "", "()V", "NONCE_BYTES_SIZE", "", "POST_PARAMS_ALGORITHM", "", "POST_PARAMS_SEPARATOR", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Parameters;", "", "salt", "", "apiKey", "", "nonce", "urlPath", "postParamsHashHeader", "requestTime", "eTag", "body", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getBody", "getETag", "getNonce", "getPostParamsHashHeader", "getRequestTime", "getSalt", "()[B", "getUrlPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toSignatureToVerify", "toString", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] salt, String apiKey, String str, String urlPath, String str2, String requestTime, String str3, String str4) {
            AbstractC5504s.h(salt, "salt");
            AbstractC5504s.h(apiKey, "apiKey");
            AbstractC5504s.h(urlPath, "urlPath");
            AbstractC5504s.h(requestTime, "requestTime");
            this.salt = salt;
            this.apiKey = apiKey;
            this.nonce = str;
            this.urlPath = urlPath;
            this.postParamsHashHeader = str2;
            this.requestTime = requestTime;
            this.eTag = str3;
            this.body = str4;
        }

        public static /* synthetic */ Parameters copy$default(Parameters parameters, byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bArr = parameters.salt;
            }
            if ((i10 & 2) != 0) {
                str = parameters.apiKey;
            }
            if ((i10 & 4) != 0) {
                str2 = parameters.nonce;
            }
            if ((i10 & 8) != 0) {
                str3 = parameters.urlPath;
            }
            if ((i10 & 16) != 0) {
                str4 = parameters.postParamsHashHeader;
            }
            if ((i10 & 32) != 0) {
                str5 = parameters.requestTime;
            }
            if ((i10 & 64) != 0) {
                str6 = parameters.eTag;
            }
            if ((i10 & 128) != 0) {
                str7 = parameters.body;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str4;
            String str11 = str5;
            return parameters.copy(bArr, str, str2, str3, str10, str11, str8, str9);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final byte[] getSalt() {
            return this.salt;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUrlPath() {
            return this.urlPath;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getRequestTime() {
            return this.requestTime;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getETag() {
            return this.eTag;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        public final Parameters copy(byte[] salt, String apiKey, String nonce, String urlPath, String postParamsHashHeader, String requestTime, String eTag, String body) {
            AbstractC5504s.h(salt, "salt");
            AbstractC5504s.h(apiKey, "apiKey");
            AbstractC5504s.h(urlPath, "urlPath");
            AbstractC5504s.h(requestTime, "requestTime");
            return new Parameters(salt, apiKey, nonce, urlPath, postParamsHashHeader, requestTime, eTag, body);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!AbstractC5504s.c(Parameters.class, other != null ? other.getClass() : null)) {
                return false;
            }
            AbstractC5504s.f(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) other;
            return Arrays.equals(this.salt, parameters.salt) && AbstractC5504s.c(this.apiKey, parameters.apiKey) && AbstractC5504s.c(this.nonce, parameters.nonce) && AbstractC5504s.c(this.urlPath, parameters.urlPath) && AbstractC5504s.c(this.postParamsHashHeader, parameters.postParamsHashHeader) && AbstractC5504s.c(this.requestTime, parameters.requestTime) && AbstractC5504s.c(this.eTag, parameters.eTag) && AbstractC5504s.c(this.body, parameters.body);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int iHashCode = ((Arrays.hashCode(this.salt) * 31) + this.apiKey.hashCode()) * 31;
            String str = this.nonce;
            int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.urlPath.hashCode()) * 31;
            String str2 = this.postParamsHashHeader;
            int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.requestTime.hashCode()) * 31;
            String str3 = this.eTag;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final byte[] toSignatureToVerify() {
            /*
                r5 = this;
                byte[] r0 = r5.salt
                java.lang.String r1 = r5.apiKey
                java.nio.charset.Charset r2 = Df.C1271d.f3718b
                byte[] r1 = r1.getBytes(r2)
                java.lang.String r3 = "getBytes(...)"
                kotlin.jvm.internal.AbstractC5504s.g(r1, r3)
                byte[] r0 = Ud.AbstractC2273n.A(r0, r1)
                java.lang.String r1 = r5.nonce
                r4 = 0
                if (r1 == 0) goto L1d
                byte[] r1 = android.util.Base64.decode(r1, r4)
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L22
                byte[] r1 = new byte[r4]
            L22:
                byte[] r0 = Ud.AbstractC2273n.A(r0, r1)
                java.lang.String r1 = r5.urlPath
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.AbstractC5504s.g(r1, r3)
                byte[] r0 = Ud.AbstractC2273n.A(r0, r1)
                java.lang.String r1 = r5.postParamsHashHeader
                if (r1 == 0) goto L40
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.AbstractC5504s.g(r1, r3)
                if (r1 != 0) goto L42
            L40:
                byte[] r1 = new byte[r4]
            L42:
                byte[] r0 = Ud.AbstractC2273n.A(r0, r1)
                java.lang.String r1 = r5.requestTime
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.AbstractC5504s.g(r1, r3)
                byte[] r0 = Ud.AbstractC2273n.A(r0, r1)
                java.lang.String r1 = r5.eTag
                if (r1 == 0) goto L60
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.AbstractC5504s.g(r1, r3)
                if (r1 != 0) goto L62
            L60:
                byte[] r1 = new byte[r4]
            L62:
                byte[] r0 = Ud.AbstractC2273n.A(r0, r1)
                java.lang.String r1 = r5.body
                if (r1 == 0) goto L73
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.AbstractC5504s.g(r1, r3)
                if (r1 != 0) goto L75
            L73:
                byte[] r1 = new byte[r4]
            L75:
                byte[] r0 = Ud.AbstractC2273n.A(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.verification.SigningManager.Parameters.toSignatureToVerify():byte[]");
        }

        public String toString() {
            return "Parameters(salt=" + Arrays.toString(this.salt) + ", apiKey=" + this.apiKey + ", nonce=" + this.nonce + ", urlPath=" + this.urlPath + ", postParamsHashHeader=" + this.postParamsHashHeader + ", requestTime=" + this.requestTime + ", eTag=" + this.eTag + ", body=" + this.body + ')';
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String apiKey) {
        AbstractC5504s.h(signatureVerificationMode, "signatureVerificationMode");
        AbstractC5504s.h(appConfig, "appConfig");
        AbstractC5504s.h(apiKey, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = apiKey;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] bArrEncode = Base64.encode(bArr, 0);
        AbstractC5504s.g(bArrEncode, "encode(bytes, Base64.DEFAULT)");
        return r.k1(new String(bArrEncode, C1271d.f3718b)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<Pair<String, String>> postFieldsToSign) {
        AbstractC5504s.h(endpoint, "endpoint");
        if (postFieldsToSign == null || postFieldsToSign.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(postFieldsToSign, 10));
        int i10 = 0;
        for (Object obj : postFieldsToSign) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2279u.w();
            }
            Pair pair = (Pair) obj;
            if (i10 > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) pair.d()).getBytes(C1271d.f3718b);
            AbstractC5504s.g(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            arrayList.add(L.f17438a);
            i10 = i11;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC5504s.g(bArrDigest, "sha256Digest.digest()");
        String string = "";
        for (byte b10 : bArrDigest) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            AbstractC5504s.g(str, "format(...)");
            sb2.append(str);
            string = sb2.toString();
        }
        return AbstractC2279u.w0(AbstractC2279u.p(AbstractC2279u.w0(postFieldsToSign, f.f34694a, null, null, 0, null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30, null), POST_PARAMS_ALGORITHM, string), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        AbstractC5504s.h(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final VerificationResult verifyResponse(String urlPath, String signatureString, String nonce, String body, String requestTime, String eTag, String postFieldsToSignHeader) {
        AbstractC5504s.h(urlPath, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Forcing signing error for request with path: " + urlPath);
            }
            return VerificationResult.FAILED;
        }
        IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
        if (intermediateSignatureHelper == null) {
            return VerificationResult.NOT_REQUESTED;
        }
        if (signatureString == null) {
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            String str = String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{urlPath}, 1));
            AbstractC5504s.g(str, "format(...)");
            currentLogHandler2.e("[Purchases] - ERROR", str, null);
            return VerificationResult.FAILED;
        }
        if (requestTime == null) {
            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
            String str2 = String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{urlPath}, 1));
            AbstractC5504s.g(str2, "format(...)");
            currentLogHandler3.e("[Purchases] - ERROR", str2, null);
            return VerificationResult.FAILED;
        }
        if (body == null && eTag == null) {
            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
            String str3 = String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{urlPath}, 1));
            AbstractC5504s.g(str3, "format(...)");
            currentLogHandler4.e("[Purchases] - ERROR", str3, null);
            return VerificationResult.FAILED;
        }
        try {
            Signature signatureFromString$purchases_defaultsBc8Release = Signature.INSTANCE.fromString$purchases_defaultsBc8Release(signatureString);
            Result<SignatureVerifier, PurchasesError> resultCreateIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(signatureFromString$purchases_defaultsBc8Release);
            if (resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Error) {
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                String str4 = String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{urlPath, ((PurchasesError) ((Result.Error) resultCreateIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2));
                AbstractC5504s.g(str4, "format(...)");
                currentLogHandler5.e("[Purchases] - ERROR", str4, null);
                return VerificationResult.FAILED;
            }
            if (!(resultCreateIntermediateKeyVerifierIfVerified instanceof Result.Success)) {
                throw new Td.r();
            }
            if (!((SignatureVerifier) ((Result.Success) resultCreateIntermediateKeyVerifierIfVerified).getValue()).verify(signatureFromString$purchases_defaultsBc8Release.getPayload(), new Parameters(signatureFromString$purchases_defaultsBc8Release.getSalt(), this.apiKey, nonce, urlPath, postFieldsToSignHeader, requestTime, eTag, body).toSignatureToVerify())) {
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                String str5 = String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{urlPath}, 1));
                AbstractC5504s.g(str5, "format(...)");
                currentLogHandler6.e("[Purchases] - ERROR", str5, null);
                return VerificationResult.FAILED;
            }
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                String str6 = "[Purchases] - " + logLevel2.name();
                String str7 = String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{urlPath}, 1));
                AbstractC5504s.g(str7, "format(...)");
                currentLogHandler7.v(str6, str7);
            }
            return VerificationResult.VERIFIED;
        } catch (InvalidSignatureSizeException e10) {
            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
            String str8 = String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{urlPath, e10.getMessage()}, 2));
            AbstractC5504s.g(str8, "format(...)");
            currentLogHandler8.e("[Purchases] - ERROR", str8, null);
            return VerificationResult.FAILED;
        }
    }
}
