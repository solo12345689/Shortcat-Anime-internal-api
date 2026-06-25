package com.facebook.react.devsupport;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 J\t\u0010\u0006\u001a\u00020\u0005H\u0087 J\t\u0010\u0007\u001a\u00020\u0005H\u0087 J\t\u0010\b\u001a\u00020\u0005H\u0087 ¨\u0006\t"}, d2 = {"Lcom/facebook/react/devsupport/InspectorFlags;", "", "<init>", "()V", "getScreenshotCaptureEnabled", "", "getFuseboxEnabled", "getIsProfilingBuild", "getFrameRecordingEnabled", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InspectorFlags {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InspectorFlags f36639a = new InspectorFlags();

    static {
        SoLoader.t("react_devsupportjni");
    }

    private InspectorFlags() {
    }

    public static final native boolean getFrameRecordingEnabled();

    public static final native boolean getFuseboxEnabled();

    public static final native boolean getIsProfilingBuild();

    public static final native boolean getScreenshotCaptureEnabled();
}
