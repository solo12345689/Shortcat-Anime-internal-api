package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.io.File;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D0 f36618a = new D0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f36619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f36620c;

    static {
        Pattern patternCompile = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
        AbstractC5504s.g(patternCompile, "compile(...)");
        f36619b = patternCompile;
        Pattern patternCompile2 = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");
        AbstractC5504s.g(patternCompile2, "compile(...)");
        f36620c = patternCompile2;
    }

    private D0() {
    }

    public static final c7.k[] a(Throwable exception) {
        AbstractC5504s.h(exception, "exception");
        StackTraceElement[] stackTrace = exception.getStackTrace();
        int length = stackTrace.length;
        c7.k[] kVarArr = new c7.k[length];
        for (int i10 = 0; i10 < length; i10++) {
            String className = stackTrace[i10].getClassName();
            String fileName = stackTrace[i10].getFileName();
            String methodName = stackTrace[i10].getMethodName();
            AbstractC5504s.g(methodName, "getMethodName(...)");
            kVarArr[i10] = new a(className, fileName, methodName, stackTrace[i10].getLineNumber(), -1, false, 32, null);
        }
        return kVarArr;
    }

    public static final JavaOnlyMap b(ReactJsExceptionHandler.ProcessedError error) {
        AbstractC5504s.h(error, "error");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (ReactJsExceptionHandler.ProcessedError.StackFrame stackFrame : error.getStack()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (stackFrame.getColumn() != null) {
                javaOnlyMap.putDouble("column", r4.intValue());
            }
            if (stackFrame.getLineNumber() != null) {
                javaOnlyMap.putDouble("lineNumber", r4.intValue());
            }
            javaOnlyMap.putString("file", stackFrame.getFile());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            javaOnlyArray.pushMap(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", error.getMessage());
        String originalMessage = error.getOriginalMessage();
        if (originalMessage != null) {
            javaOnlyMap2.putString("originalMessage", originalMessage);
        }
        String name = error.getName();
        if (name != null) {
            javaOnlyMap2.putString("name", name);
        }
        String componentStack = error.getComponentStack();
        if (componentStack != null) {
            javaOnlyMap2.putString("componentStack", componentStack);
        }
        javaOnlyMap2.putArray("stack", javaOnlyArray);
        javaOnlyMap2.putInt(DiagnosticsEntry.ID_KEY, error.getId());
        javaOnlyMap2.putBoolean("isFatal", error.isFatal());
        javaOnlyMap2.putMap("extraData", error.getExtraData());
        return javaOnlyMap2;
    }

    public final String c(c7.k frame) {
        AbstractC5504s.h(frame, "frame");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(frame.getFileName());
        int iA = frame.a();
        if (iA > 0) {
            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb2.append(iA);
            int column = frame.getColumn();
            if (column > 0) {
                sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                sb2.append(column);
            }
        }
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements c7.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f36621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f36622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f36624d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f36625e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f36626f;

        public a(String str, String str2, String method, int i10, int i11, boolean z10) {
            AbstractC5504s.h(method, "method");
            this.f36621a = str;
            this.f36622b = str2;
            this.f36623c = method;
            this.f36624d = i10;
            this.f36625e = i11;
            this.f36626f = z10;
        }

        @Override // c7.k
        public int a() {
            return this.f36624d;
        }

        @Override // c7.k
        public boolean b() {
            return this.f36626f;
        }

        @Override // c7.k
        public int getColumn() {
            return this.f36625e;
        }

        @Override // c7.k
        public String getFile() {
            return this.f36621a;
        }

        @Override // c7.k
        public String getFileName() {
            return this.f36622b;
        }

        @Override // c7.k
        public String getMethod() {
            return this.f36623c;
        }

        public /* synthetic */ a(String str, String str2, String str3, int i10, int i11, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i12 & 2) != 0 ? str != null ? new File(str).getName() : null : str2, str3, i10, i11, (i12 & 32) != 0 ? false : z10);
        }
    }
}
