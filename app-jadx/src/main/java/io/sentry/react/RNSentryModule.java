package io.sentry.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class RNSentryModule extends NativeRNSentrySpec {
    private final n impl;

    RNSentryModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.impl = new n(reactApplicationContext);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void addBreadcrumb(ReadableMap readableMap) {
        this.impl.l(readableMap);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void addListener(String str) {
        this.impl.m(str);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void captureEnvelope(String str, ReadableMap readableMap, Promise promise) {
        this.impl.o(str, readableMap, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void captureReplay(boolean z10, Promise promise) {
        this.impl.p(z10, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void captureScreenshot(Promise promise) {
        this.impl.q(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void clearBreadcrumbs() {
        this.impl.s();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void closeNativeSdk(Promise promise) {
        this.impl.t(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void crash() {
        this.impl.v();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void crashedLastRun(Promise promise) {
        this.impl.w(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void disableNativeFramesTracking() {
        this.impl.y();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void enableNativeFramesTracking() {
        this.impl.z();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void encodeToBase64(ReadableArray readableArray, Promise promise) {
        this.impl.A(readableArray, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchModules(Promise promise) {
        this.impl.B(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeAppStart(Promise promise) {
        this.impl.C(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeDeviceContexts(Promise promise) {
        this.impl.E(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeFrames(Promise promise) {
        this.impl.G(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeLogAttributes(Promise promise) {
        this.impl.H(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public String fetchNativePackageName() {
        return this.impl.J();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeRelease(Promise promise) {
        this.impl.K(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchNativeSdkInfo(Promise promise) {
        this.impl.L(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public WritableMap fetchNativeStackFramesBy(ReadableArray readableArray) {
        return null;
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void fetchViewHierarchy(Promise promise) {
        this.impl.M(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public String getCurrentReplayId() {
        return this.impl.P();
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void getDataFromUri(String str, Promise promise) {
        this.impl.Q(str, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeRNSentrySpec.NAME;
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void getNewScreenTimeToDisplay(Promise promise) {
        this.impl.R(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void initNativeReactNavigationNewFrameTracking(Promise promise) {
        this.impl.b0(promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void initNativeSdk(ReadableMap readableMap, Promise promise) {
        this.impl.c0(readableMap, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void popTimeToDisplayFor(String str, Promise promise) {
        this.impl.l0(str, promise);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void removeListeners(double d10) {
        this.impl.n0(d10);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public boolean setActiveSpanId(String str) {
        return this.impl.o0(str);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setAttribute(String str, String str2) {
        this.impl.p0(str, str2);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setAttributes(ReadableMap readableMap) {
        this.impl.q0(readableMap);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setContext(String str, ReadableMap readableMap) {
        this.impl.r0(str, readableMap);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setExtra(String str, String str2) {
        this.impl.u0(str, str2);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setTag(String str, String str2) {
        this.impl.v0(str, str2);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public void setUser(ReadableMap readableMap, ReadableMap readableMap2) {
        this.impl.w0(readableMap, readableMap2);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public WritableMap startProfiling(boolean z10) {
        return this.impl.x0(z10);
    }

    @Override // io.sentry.react.NativeRNSentrySpec
    public WritableMap stopProfiling() {
        return this.impl.y0();
    }
}
