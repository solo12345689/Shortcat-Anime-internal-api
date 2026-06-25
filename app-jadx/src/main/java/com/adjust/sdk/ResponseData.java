package com.adjust.sdk;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ResponseData {
    public ActivityKind activityKind;
    public ActivityPackage activityPackage;
    public String adid;
    public Long askIn;
    public AdjustAttribution attribution;
    public Long continueIn;
    public JSONObject controlParams;
    public JSONObject jsonResponse;
    public String message;
    public String resolvedDeeplink;
    public Long retryIn;
    public Map<String, String> sendingParameters;
    public Map<String, String> signedParameters;
    public String timestamp;
    public TrackingState trackingState;
    public boolean success = false;
    public boolean willRetry = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34084a;

        static {
            int[] iArr = new int[ActivityKind.values().length];
            f34084a = iArr;
            try {
                iArr[ActivityKind.SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34084a[ActivityKind.CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34084a[ActivityKind.ATTRIBUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34084a[ActivityKind.EVENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34084a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static ResponseData buildResponseData(ActivityPackage activityPackage, Map<String, String> map, Map<String, String> map2) {
        ActivityKind activityKind = activityPackage.getActivityKind();
        int i10 = a.f34084a[activityKind.ordinal()];
        ResponseData responseData = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new ResponseData() : new PurchaseVerificationResponseData() : new EventResponseData(activityPackage) : new AttributionResponseData() : new SdkClickResponseData() : new SessionResponseData(activityPackage);
        responseData.activityKind = activityKind;
        responseData.activityPackage = activityPackage;
        responseData.sendingParameters = map;
        responseData.signedParameters = map2;
        return responseData;
    }

    public String toString() {
        return Util.formatString("message:%s timestamp:%s json:%s", this.message, this.timestamp, this.jsonResponse);
    }
}
