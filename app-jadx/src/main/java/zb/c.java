package Zb;

import Td.r;
import ub.EnumC6751c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23262a;

        static {
            int[] iArr = new int[EnumC6751c.values().length];
            try {
                iArr[EnumC6751c.f61468c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6751c.f61469d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6751c.f61470e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6751c.f61471f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC6751c.f61472g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC6751c.f61473h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC6751c.f61474i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC6751c.f61475j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f23262a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(EnumC6751c enumC6751c) {
        switch (a.f23262a[enumC6751c.ordinal()]) {
            case 1:
                return "ExpoModulesCoreJSLogger.onNewTrace";
            case 2:
                return "ExpoModulesCoreJSLogger.onNewDebug";
            case 3:
                return "ExpoModulesCoreJSLogger.onNewTrace";
            case 4:
                return "ExpoModulesCoreJSLogger.onNewDebug";
            case 5:
                return "ExpoModulesCoreJSLogger.onNewInfo";
            case 6:
                return "ExpoModulesCoreJSLogger.onNewWarning";
            case 7:
            case 8:
                return "ExpoModulesCoreJSLogger.onNewError";
            default:
                throw new r();
        }
    }
}
