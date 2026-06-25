package com.adjust.sdk.network;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustSigner;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.PackageBuilder;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.Util;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityPackageSender implements IActivityPackageSender {
    private String basePath;
    private String clientSdk;
    private int connectionTimeout;
    private Context context;
    private String gdprPath;
    private String purchaseVerificationPath;
    private String subscriptionPath;
    private UrlStrategy urlStrategy;
    private ILogger logger = AdjustFactory.getLogger();
    private ThreadExecutor executor = new SingleThreadCachedScheduler("ActivityPackageSender");
    private UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = AdjustFactory.getHttpsURLConnectionProvider();
    private UtilNetworking.IConnectionOptions connectionOptions = AdjustFactory.getConnectionOptions();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IActivityPackageSender.ResponseDataCallbackSubscriber f34156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActivityPackage f34157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f34158c;

        public a(IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber, ActivityPackage activityPackage, Map map) {
            this.f34156a = responseDataCallbackSubscriber;
            this.f34157b = activityPackage;
            this.f34158c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f34156a.onResponseDataCallback(ActivityPackageSender.this.sendActivityPackageSync(this.f34157b, this.f34158c));
        }
    }

    public ActivityPackageSender(List<String> list, boolean z10, String str, String str2, String str3, String str4, String str5, int i10, Context context) {
        this.basePath = str;
        this.gdprPath = str2;
        this.subscriptionPath = str3;
        this.purchaseVerificationPath = str4;
        this.clientSdk = str5;
        this.connectionTimeout = i10;
        this.context = context;
        this.urlStrategy = new UrlStrategy(AdjustFactory.getBaseUrl(), AdjustFactory.getGdprUrl(), AdjustFactory.getSubscriptionUrl(), AdjustFactory.getPurchaseVerificationUrl(), list, z10);
    }

    private DataOutputStream configConnectionForGET(HttpsURLConnection httpsURLConnection) throws ProtocolException {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    private DataOutputStream configConnectionForPOST(HttpsURLConnection httpsURLConnection, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws IOException {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String strGeneratePOSTBodyString = generatePOSTBodyString(map, map2, map3);
        if (strGeneratePOSTBodyString == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(strGeneratePOSTBodyString);
        return dataOutputStream;
    }

    private String errorMessage(Throwable th2, String str, ActivityPackage activityPackage) {
        return Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th2));
    }

    private static String extractAuthorizationHeader(Map<String, String> map) {
        return map.remove("authorization");
    }

    private static String extractTargetUrl(Map<String, String> map, ActivityKind activityKind, UrlStrategy urlStrategy) {
        String strRemove = map.remove("endpoint");
        return strRemove != null ? strRemove : urlStrategy.targetUrlByActivityKind(activityKind);
    }

    private String generatePOSTBodyString(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws UnsupportedEncodingException {
        StringBuilder sb2 = new StringBuilder();
        if (map3 == null || map3.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                injectParametersToPOSTStringBuilder(map, sb2);
            }
            if (map2 != null && !map2.isEmpty()) {
                injectParametersToPOSTStringBuilder(map2, sb2);
            }
        } else {
            injectParametersToPOSTStringBuilder(map3, sb2);
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '&') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private String generateUrlStringForGET(ActivityKind activityKind, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        URL url = new URL(urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map3, activityKind, this.urlStrategy)));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.logger.debug("Making request to url: %s", builder.toString());
        if (map3 == null || map3.isEmpty()) {
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                    builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                builder.appendQueryParameter(entry3.getKey(), entry3.getValue());
            }
        }
        return builder.build().toString();
    }

    private String generateUrlStringForPOST(ActivityKind activityKind, String str, Map<String, String> map) {
        String string = Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map, activityKind, this.urlStrategy)), str);
        this.logger.debug("Making request to url : %s", string);
        return string;
    }

    private void injectParametersToPOSTStringBuilder(Map<String, String> map, StringBuilder sb2) throws UnsupportedEncodingException {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strEncode = URLEncoder.encode(entry.getKey(), Constants.ENCODING);
            String value = entry.getValue();
            String strEncode2 = value != null ? URLEncoder.encode(value, Constants.ENCODING) : "";
            sb2.append(strEncode);
            sb2.append(f.f34695b);
            sb2.append(strEncode2);
            sb2.append("&");
        }
    }

    private void localError(Throwable th2, String str, ResponseData responseData, int i10) {
        String strErrorMessage = errorMessage(th2, str, responseData.activityPackage);
        this.logger.error(strErrorMessage, new Object[0]);
        responseData.message = strErrorMessage;
        responseData.willRetry = false;
        responseData.activityPackage.addError(i10);
    }

    private void parseResponse(ResponseData responseData, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e10) {
            this.logger.error(errorMessage(e10, "Failed to parse JSON response", responseData.activityPackage), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        responseData.jsonResponse = jSONObject;
        responseData.message = UtilNetworking.extractJsonString(jSONObject, "message");
        responseData.adid = UtilNetworking.extractJsonString(jSONObject, "adid");
        responseData.timestamp = UtilNetworking.extractJsonString(jSONObject, DiagnosticsEntry.TIMESTAMP_KEY);
        String strExtractJsonString = UtilNetworking.extractJsonString(jSONObject, "tracking_state");
        if (strExtractJsonString != null && strExtractJsonString.equals("opted_out")) {
            responseData.trackingState = TrackingState.OPTED_OUT;
        }
        responseData.askIn = UtilNetworking.extractJsonLong(jSONObject, "ask_in");
        responseData.retryIn = UtilNetworking.extractJsonLong(jSONObject, "retry_in");
        responseData.continueIn = UtilNetworking.extractJsonLong(jSONObject, "continue_in");
        responseData.attribution = Util.attributionFromJson(jSONObject.optJSONObject("attribution"), Util.getSdkPrefixPlatform(this.clientSdk));
        responseData.resolvedDeeplink = UtilNetworking.extractJsonString(jSONObject, "resolved_click_url");
        responseData.controlParams = jSONObject.optJSONObject("control_params");
    }

    private void remoteError(Throwable th2, String str, ResponseData responseData, Integer num) {
        String str2 = errorMessage(th2, str, responseData.activityPackage) + " Will retry later";
        this.logger.error(str2, new Object[0]);
        responseData.message = str2;
        responseData.willRetry = true;
        responseData.activityPackage.addError(num.intValue());
    }

    private boolean shouldRetryToSendWithUrlStrategy(ResponseData responseData) {
        if (responseData.jsonResponse != null) {
            this.logger.debug("Will not retry with current url strategy, already got a valid json response", new Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        }
        if (this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind)) {
            this.logger.error("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        }
        this.logger.error("Failed with current url strategy and it will not retry", new Object[0]);
        return false;
    }

    private Map<String, String> signParameters(ActivityPackage activityPackage, Map<String, String> map) {
        HashMap map2 = new HashMap(activityPackage.getParameters());
        if (map != null) {
            map2.putAll(map);
        }
        HashMap map3 = new HashMap();
        map3.put("client_sdk", activityPackage.getClientSdk());
        map3.put("activity_kind", activityPackage.getActivityKind().toString());
        map3.put("endpoint", this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind()));
        JSONObject controlParamsJson = SharedPreferencesManager.getDefaultInstance(this.context).getControlParamsJson();
        if (controlParamsJson != null) {
            Iterator<String> itKeys = controlParamsJson.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    if (controlParamsJson.get(next) instanceof String) {
                        map3.put(next, (String) controlParamsJson.get(next));
                    }
                } catch (JSONException unused) {
                    this.logger.error("JSONException while iterating control params", new Object[0]);
                }
            }
        }
        return AdjustSigner.sign(map2, map3, this.context, this.logger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void tryToGetResponse(ResponseData responseData) {
        ActivityPackageSender activityPackageSender;
        ActivityPackageSender activityPackageSender2;
        ActivityPackageSender activityPackageSender3;
        ActivityPackageSender activityPackageSender4;
        ActivityPackageSender activityPackageSender5;
        ActivityPackageSender activityPackageSender6;
        ActivityPackageSender activityPackageSender7;
        ActivityPackageSender activityPackageSender8;
        ActivityPackageSender activityPackageSender9;
        String strGenerateUrlStringForPOST;
        String str = "Flushing and closing connection output stream";
        DataOutputStream dataOutputStream = null;
        try {
            try {
                String strExtractAuthorizationHeader = extractAuthorizationHeader(responseData.signedParameters);
                this.logger.verbose("authorizationHeader: %s", strExtractAuthorizationHeader);
                boolean z10 = true;
                boolean z11 = responseData.activityPackage.getActivityKind() == ActivityKind.ATTRIBUTION;
                try {
                    if (z11) {
                        ActivityPackageSender activityPackageSender10 = this;
                        strGenerateUrlStringForPOST = activityPackageSender10.generateUrlStringForGET(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                        activityPackageSender9 = activityPackageSender10;
                    } else {
                        activityPackageSender9 = this;
                        strGenerateUrlStringForPOST = generateUrlStringForPOST(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.signedParameters);
                    }
                    HttpsURLConnection httpsURLConnectionGenerateHttpsURLConnection = activityPackageSender9.httpsURLConnectionProvider.generateHttpsURLConnection(new URL(strGenerateUrlStringForPOST));
                    activityPackageSender9.connectionOptions.applyConnectionOptions(httpsURLConnectionGenerateHttpsURLConnection, activityPackageSender9.clientSdk, activityPackageSender9.connectionTimeout);
                    if (strExtractAuthorizationHeader != null) {
                        httpsURLConnectionGenerateHttpsURLConnection.setRequestProperty("Authorization", strExtractAuthorizationHeader);
                    }
                    DataOutputStream dataOutputStreamConfigConnectionForGET = z11 ? configConnectionForGET(httpsURLConnectionGenerateHttpsURLConnection) : configConnectionForPOST(httpsURLConnectionGenerateHttpsURLConnection, responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                    Integer connectionResponse = readConnectionResponse(httpsURLConnectionGenerateHttpsURLConnection, responseData);
                    responseData.success = responseData.jsonResponse != null && responseData.retryIn == null && connectionResponse != null && connectionResponse.intValue() == 200;
                    JSONObject jSONObject = responseData.jsonResponse;
                    if (jSONObject != null && responseData.retryIn == null) {
                        z10 = false;
                    }
                    responseData.willRetry = z10;
                    if (jSONObject == null) {
                        responseData.activityPackage.addError(1000);
                    } else if (responseData.retryIn != null) {
                        responseData.activityPackage.addError(ErrorCodes.SERVER_RETRY_IN);
                    }
                    if (dataOutputStreamConfigConnectionForGET != null) {
                        try {
                            dataOutputStreamConfigConnectionForGET.flush();
                            dataOutputStreamConfigConnectionForGET.close();
                        } catch (IOException e10) {
                            activityPackageSender9.logger.error(errorMessage(e10, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                        }
                    }
                } catch (UnsupportedEncodingException e11) {
                    e = e11;
                    localError(e, "Failed to encode parameters", responseData, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
                    str = str;
                    activityPackageSender8 = activityPackageSender7;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender7;
                            responseData = responseData;
                        } catch (IOException e12) {
                            String strErrorMessage = errorMessage(e12, "Flushing and closing connection output stream", responseData.activityPackage);
                            Object[] objArr = new Object[0];
                            activityPackageSender7.logger.error(strErrorMessage, objArr);
                            str = objArr;
                            activityPackageSender8 = activityPackageSender7;
                            responseData = strErrorMessage;
                        }
                    }
                } catch (MalformedURLException e13) {
                    e = e13;
                    localError(e, "Malformed URL", responseData, ErrorCodes.MALFORMED_URL_EXCEPTION);
                    str = str;
                    activityPackageSender8 = activityPackageSender6;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender6;
                            responseData = responseData;
                        } catch (IOException e14) {
                            String strErrorMessage2 = errorMessage(e14, "Flushing and closing connection output stream", responseData.activityPackage);
                            Object[] objArr2 = new Object[0];
                            activityPackageSender6.logger.error(strErrorMessage2, objArr2);
                            str = objArr2;
                            activityPackageSender8 = activityPackageSender6;
                            responseData = strErrorMessage2;
                        }
                    }
                } catch (ProtocolException e15) {
                    e = e15;
                    localError(e, "Protocol Error", responseData, ErrorCodes.PROTOCOL_EXCEPTION);
                    str = str;
                    activityPackageSender8 = activityPackageSender5;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender5;
                            responseData = responseData;
                        } catch (IOException e16) {
                            String strErrorMessage3 = errorMessage(e16, "Flushing and closing connection output stream", responseData.activityPackage);
                            Object[] objArr3 = new Object[0];
                            activityPackageSender5.logger.error(strErrorMessage3, objArr3);
                            str = objArr3;
                            activityPackageSender8 = activityPackageSender5;
                            responseData = strErrorMessage3;
                        }
                    }
                } catch (SocketTimeoutException e17) {
                    e = e17;
                    remoteError(e, "Request timed out", responseData, Integer.valueOf(ErrorCodes.SOCKET_TIMEOUT_EXCEPTION));
                    str = str;
                    activityPackageSender8 = activityPackageSender4;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender4;
                            responseData = responseData;
                        } catch (IOException e18) {
                            String strErrorMessage4 = errorMessage(e18, "Flushing and closing connection output stream", responseData.activityPackage);
                            Object[] objArr4 = new Object[0];
                            activityPackageSender4.logger.error(strErrorMessage4, objArr4);
                            str = objArr4;
                            activityPackageSender8 = activityPackageSender4;
                            responseData = strErrorMessage4;
                        }
                    }
                } catch (SSLHandshakeException e19) {
                    e = e19;
                    remoteError(e, "Certificate failed", responseData, Integer.valueOf(ErrorCodes.SSL_HANDSHAKE_EXCEPTION));
                    str = str;
                    activityPackageSender8 = activityPackageSender3;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender3;
                            responseData = responseData;
                        } catch (IOException e20) {
                            String strErrorMessage5 = errorMessage(e20, "Flushing and closing connection output stream", responseData.activityPackage);
                            Object[] objArr5 = new Object[0];
                            activityPackageSender3.logger.error(strErrorMessage5, objArr5);
                            str = objArr5;
                            activityPackageSender8 = activityPackageSender3;
                            responseData = strErrorMessage5;
                        }
                    }
                } catch (IOException e21) {
                    e = e21;
                    remoteError(e, "Request failed", responseData, Integer.valueOf(ErrorCodes.IO_EXCEPTION));
                    str = str;
                    activityPackageSender8 = activityPackageSender2;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender2;
                            responseData = responseData;
                        } catch (IOException e22) {
                            String strErrorMessage6 = errorMessage(e22, "Flushing and closing connection output stream", responseData.activityPackage);
                            Object[] objArr6 = new Object[0];
                            activityPackageSender2.logger.error(strErrorMessage6, objArr6);
                            str = objArr6;
                            activityPackageSender8 = activityPackageSender2;
                            responseData = strErrorMessage6;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    localError(th, "Sending SDK package", responseData, ErrorCodes.THROWABLE);
                    str = str;
                    activityPackageSender8 = activityPackageSender;
                    responseData = responseData;
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                            str = str;
                            activityPackageSender8 = activityPackageSender;
                            responseData = responseData;
                        } catch (IOException e23) {
                            String strErrorMessage7 = errorMessage(e23, "Flushing and closing connection output stream", responseData.activityPackage);
                            Object[] objArr7 = new Object[0];
                            activityPackageSender.logger.error(strErrorMessage7, objArr7);
                            str = objArr7;
                            activityPackageSender8 = activityPackageSender;
                            responseData = strErrorMessage7;
                        }
                    }
                }
            } catch (UnsupportedEncodingException e24) {
                e = e24;
                activityPackageSender7 = this;
            } catch (MalformedURLException e25) {
                e = e25;
                activityPackageSender6 = this;
            } catch (ProtocolException e26) {
                e = e26;
                activityPackageSender5 = this;
            } catch (SocketTimeoutException e27) {
                e = e27;
                activityPackageSender4 = this;
            } catch (SSLHandshakeException e28) {
                e = e28;
                activityPackageSender3 = this;
            } catch (IOException e29) {
                e = e29;
                activityPackageSender2 = this;
            } catch (Throwable th3) {
                th = th3;
                activityPackageSender = this;
            }
        } finally {
        }
    }

    private Map<String, String> updateSendingParameters(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        PackageBuilder.addString(map, "sent_at", Util.dateFormatter.format(Long.valueOf(System.currentTimeMillis())));
        return map;
    }

    private String urlWithExtraPathByActivityKind(ActivityKind activityKind, String str) {
        if (activityKind == ActivityKind.GDPR) {
            if (this.gdprPath != null) {
                return str + this.gdprPath;
            }
        } else if (activityKind == ActivityKind.SUBSCRIPTION) {
            if (this.subscriptionPath != null) {
                return str + this.subscriptionPath;
            }
        } else if (activityKind == ActivityKind.PURCHASE_VERIFICATION) {
            if (this.purchaseVerificationPath != null) {
                return str + this.purchaseVerificationPath;
            }
        } else if (this.basePath != null) {
            return str + this.basePath;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer readConnectionResponse(javax.net.ssl.HttpsURLConnection r7, com.adjust.sdk.ResponseData r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r7.connect()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            int r3 = r7.getResponseCode()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L20
            java.io.InputStream r3 = r7.getErrorStream()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            goto L24
        L1b:
            r8 = move-exception
            goto Lb2
        L1e:
            r3 = move-exception
            goto L38
        L20:
            java.io.InputStream r3 = r7.getInputStream()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
        L24:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
        L2e:
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            if (r4 == 0) goto L49
            r0.append(r4)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1e
            goto L2e
        L38:
            java.lang.String r4 = "Connecting and reading response"
            com.adjust.sdk.ActivityPackage r5 = r8.activityPackage     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r6.errorMessage(r3, r4, r5)     // Catch: java.lang.Throwable -> L1b
            com.adjust.sdk.ILogger r4 = r6.logger     // Catch: java.lang.Throwable -> L1b
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1b
            r4.error(r3, r5)     // Catch: java.lang.Throwable -> L1b
            if (r7 == 0) goto L4c
        L49:
            r7.disconnect()
        L4c:
            int r7 = r0.length()
            if (r7 != 0) goto L5c
            com.adjust.sdk.ILogger r7 = r6.logger
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "Empty response string buffer"
            r7.error(r0, r8)
            return r2
        L5c:
            int r7 = r2.intValue()
            r3 = 429(0x1ad, float:6.01E-43)
            if (r7 != r3) goto L6e
            com.adjust.sdk.ILogger r7 = r6.logger
            java.lang.Object[] r8 = new java.lang.Object[r1]
            java.lang.String r0 = "Too frequent requests to the endpoint (429)"
            r7.error(r0, r8)
            return r2
        L6e:
            java.lang.String r7 = r0.toString()
            com.adjust.sdk.ILogger r0 = r6.logger
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r3 = "Response string: %s"
            r0.debug(r3, r1)
            r6.parseResponse(r8, r7)
            org.json.JSONObject r7 = r8.controlParams
            if (r7 == 0) goto L8f
            android.content.Context r7 = r6.context
            com.adjust.sdk.SharedPreferencesManager r7 = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(r7)
            org.json.JSONObject r0 = r8.controlParams
            r7.saveControlParams(r0)
        L8f:
            java.lang.String r7 = r8.message
            if (r7 != 0) goto L94
            goto Lb1
        L94:
            int r8 = r2.intValue()
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "Response message: %s"
            if (r8 != r0) goto La8
            com.adjust.sdk.ILogger r8 = r6.logger
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8.info(r1, r7)
            goto Lb1
        La8:
            com.adjust.sdk.ILogger r8 = r6.logger
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            r8.error(r1, r7)
        Lb1:
            return r2
        Lb2:
            if (r7 == 0) goto Lb7
            r7.disconnect()
        Lb7:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.network.ActivityPackageSender.readConnectionResponse(javax.net.ssl.HttpsURLConnection, com.adjust.sdk.ResponseData):java.lang.Integer");
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public void sendActivityPackage(ActivityPackage activityPackage, Map<String, String> map, IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new a(responseDataCallbackSubscriber, activityPackage, map));
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map) {
        ResponseData responseDataBuildResponseData;
        do {
            Map<String, String> mapUpdateSendingParameters = updateSendingParameters(map);
            responseDataBuildResponseData = ResponseData.buildResponseData(activityPackage, mapUpdateSendingParameters, signParameters(activityPackage, mapUpdateSendingParameters));
            tryToGetResponse(responseDataBuildResponseData);
        } while (shouldRetryToSendWithUrlStrategy(responseDataBuildResponseData));
        return responseDataBuildResponseData;
    }
}
