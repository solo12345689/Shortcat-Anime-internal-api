package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "", "eTagData", "Lcom/revenuecat/purchases/common/networking/ETagData;", HTTPResultWithETag.SERIALIZATION_NAME_HTTPRESULT, "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "(Lcom/revenuecat/purchases/common/networking/ETagData;Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "getETagData", "()Lcom/revenuecat/purchases/common/networking/ETagData;", "getHttpResult", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "serialize", "", "toString", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HTTPResultWithETag {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String SERIALIZATION_NAME_ETAG = "eTag";
    private static final String SERIALIZATION_NAME_HTTPRESULT = "httpResult";
    private static final String SERIALIZATION_NAME_LAST_REFRESH_TIME = "lastRefreshTime";
    private final ETagData eTagData;
    private final HTTPResult httpResult;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag$Companion;", "", "()V", "SERIALIZATION_NAME_ETAG", "", "SERIALIZATION_NAME_HTTPRESULT", "SERIALIZATION_NAME_LAST_REFRESH_TIME", "deserialize", "Lcom/revenuecat/purchases/common/networking/HTTPResultWithETag;", "serialized", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HTTPResultWithETag deserialize(String serialized) throws JSONException {
            AbstractC5504s.h(serialized, "serialized");
            JSONObject jSONObject = new JSONObject(serialized);
            String eTag = jSONObject.getString(HTTPResultWithETag.SERIALIZATION_NAME_ETAG);
            Long lValueOf = Long.valueOf(jSONObject.optLong(HTTPResultWithETag.SERIALIZATION_NAME_LAST_REFRESH_TIME, -1L));
            if (lValueOf.longValue() == -1) {
                lValueOf = null;
            }
            Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
            String serializedHTTPResult = jSONObject.getString(HTTPResultWithETag.SERIALIZATION_NAME_HTTPRESULT);
            AbstractC5504s.g(eTag, "eTag");
            ETagData eTagData = new ETagData(eTag, date);
            HTTPResult.Companion companion = HTTPResult.INSTANCE;
            AbstractC5504s.g(serializedHTTPResult, "serializedHTTPResult");
            return new HTTPResultWithETag(eTagData, companion.deserialize$purchases_defaultsBc8Release(serializedHTTPResult));
        }

        private Companion() {
        }
    }

    public HTTPResultWithETag(ETagData eTagData, HTTPResult httpResult) {
        AbstractC5504s.h(eTagData, "eTagData");
        AbstractC5504s.h(httpResult, "httpResult");
        this.eTagData = eTagData;
        this.httpResult = httpResult;
    }

    public static /* synthetic */ HTTPResultWithETag copy$default(HTTPResultWithETag hTTPResultWithETag, ETagData eTagData, HTTPResult hTTPResult, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eTagData = hTTPResultWithETag.eTagData;
        }
        if ((i10 & 2) != 0) {
            hTTPResult = hTTPResultWithETag.httpResult;
        }
        return hTTPResultWithETag.copy(eTagData, hTTPResult);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ETagData getETagData() {
        return this.eTagData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HTTPResult getHttpResult() {
        return this.httpResult;
    }

    public final HTTPResultWithETag copy(ETagData eTagData, HTTPResult httpResult) {
        AbstractC5504s.h(eTagData, "eTagData");
        AbstractC5504s.h(httpResult, "httpResult");
        return new HTTPResultWithETag(eTagData, httpResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HTTPResultWithETag)) {
            return false;
        }
        HTTPResultWithETag hTTPResultWithETag = (HTTPResultWithETag) other;
        return AbstractC5504s.c(this.eTagData, hTTPResultWithETag.eTagData) && AbstractC5504s.c(this.httpResult, hTTPResultWithETag.httpResult);
    }

    public final ETagData getETagData() {
        return this.eTagData;
    }

    public final HTTPResult getHttpResult() {
        return this.httpResult;
    }

    public int hashCode() {
        return (this.eTagData.hashCode() * 31) + this.httpResult.hashCode();
    }

    public final String serialize() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SERIALIZATION_NAME_ETAG, this.eTagData.getETag());
        Date lastRefreshTime = this.eTagData.getLastRefreshTime();
        if (lastRefreshTime != null) {
            jSONObject.put(SERIALIZATION_NAME_LAST_REFRESH_TIME, lastRefreshTime.getTime());
        }
        jSONObject.put(SERIALIZATION_NAME_HTTPRESULT, this.httpResult.serialize$purchases_defaultsBc8Release());
        String string = jSONObject.toString();
        AbstractC5504s.g(string, "JSONObject().apply {\n   …e())\n        }.toString()");
        return string;
    }

    public String toString() {
        return "HTTPResultWithETag(eTagData=" + this.eTagData + ", httpResult=" + this.httpResult + ')';
    }
}
