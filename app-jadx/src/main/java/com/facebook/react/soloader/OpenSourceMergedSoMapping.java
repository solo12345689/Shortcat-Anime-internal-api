package com.facebook.react.soloader;

import com.facebook.soloader.l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u0019\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001b\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001c\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001d\u0010\u000eJ\u0010\u0010\u001e\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001e\u0010\u000eJ\u0010\u0010\u001f\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;", "Lcom/facebook/soloader/l;", "<init>", "()V", "", "input", "b", "(Ljava/lang/String;)Ljava/lang/String;", "libraryName", "LTd/L;", "a", "(Ljava/lang/String;)V", "", "libfabricjni_so", "()I", "libhermes_executor_so", "libhermesinstancejni_so", "libhermestooling_so", "libjsijniprofiler_so", "libjsinspector_so", "libmapbufferjni_so", "libreact_devsupportjni_so", "libreact_featureflagsjni_so", "libreact_newarchdefaults_so", "libreactnative_so", "libreactnativeblob_so", "libreactnativejni_so", "libreactnativejni_common_so", "librninstance_so", "libturbomodulejsijni_so", "libuimanagerjni_so", "libyoga_so", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenSourceMergedSoMapping implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OpenSourceMergedSoMapping f37352a = new OpenSourceMergedSoMapping();

    private OpenSourceMergedSoMapping() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.soloader.l
    public void a(String libraryName) {
        AbstractC5504s.h(libraryName, "libraryName");
        switch (libraryName.hashCode()) {
            case -1793638007:
                if (libraryName.equals("mapbufferjni")) {
                    libmapbufferjni_so();
                    break;
                }
                break;
            case -1624070447:
                if (libraryName.equals("rninstance")) {
                    librninstance_so();
                    break;
                }
                break;
            case -1570429553:
                if (libraryName.equals("reactnativejni")) {
                    libreactnativejni_so();
                    break;
                }
                break;
            case -1438915853:
                if (libraryName.equals("reactnativeblob")) {
                    libreactnativeblob_so();
                    break;
                }
                break;
            case -1382694412:
                if (libraryName.equals("react_featureflagsjni")) {
                    libreact_featureflagsjni_so();
                    break;
                }
                break;
            case -1259441509:
                if (libraryName.equals("reactnativejni_common")) {
                    libreactnativejni_common_so();
                    break;
                }
                break;
            case -1033318826:
                if (libraryName.equals("reactnative")) {
                    libreactnative_so();
                    break;
                }
                break;
            case -579037304:
                if (libraryName.equals("react_newarchdefaults")) {
                    libreact_newarchdefaults_so();
                    break;
                }
                break;
            case -49345041:
                if (libraryName.equals("turbomodulejsijni")) {
                    libturbomodulejsijni_so();
                    break;
                }
                break;
            case 3714672:
                if (libraryName.equals("yoga")) {
                    libyoga_so();
                    break;
                }
                break;
            case 65536138:
                if (libraryName.equals("hermesinstancejni")) {
                    libhermesinstancejni_so();
                    break;
                }
                break;
            case 86183502:
                if (libraryName.equals("jsijniprofiler")) {
                    libjsijniprofiler_so();
                    break;
                }
                break;
            case 352552524:
                if (libraryName.equals("hermes_executor")) {
                    libhermes_executor_so();
                    break;
                }
                break;
            case 614482404:
                if (libraryName.equals("hermestooling")) {
                    libhermestooling_so();
                    break;
                }
                break;
            case 688235659:
                if (libraryName.equals("react_devsupportjni")) {
                    libreact_devsupportjni_so();
                    break;
                }
                break;
            case 716617324:
                if (libraryName.equals("uimanagerjni")) {
                    libuimanagerjni_so();
                    break;
                }
                break;
            case 1590431694:
                if (libraryName.equals("jsinspector")) {
                    libjsinspector_so();
                    break;
                }
                break;
            case 2016911584:
                if (libraryName.equals("fabricjni")) {
                    libfabricjni_so();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5 A[ORIG_RETURN, RETURN] */
    @Override // com.facebook.soloader.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.soloader.OpenSourceMergedSoMapping.b(java.lang.String):java.lang.String");
    }

    public final native int libfabricjni_so();

    public final native int libhermes_executor_so();

    public final native int libhermesinstancejni_so();

    public final native int libhermestooling_so();

    public final native int libjsijniprofiler_so();

    public final native int libjsinspector_so();

    public final native int libmapbufferjni_so();

    public final native int libreact_devsupportjni_so();

    public final native int libreact_featureflagsjni_so();

    public final native int libreact_newarchdefaults_so();

    public final native int libreactnative_so();

    public final native int libreactnativeblob_so();

    public final native int libreactnativejni_common_so();

    public final native int libreactnativejni_so();

    public final native int librninstance_so();

    public final native int libturbomodulejsijni_so();

    public final native int libuimanagerjni_so();

    public final native int libyoga_so();
}
