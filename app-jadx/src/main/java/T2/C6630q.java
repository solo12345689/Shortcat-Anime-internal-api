package t2;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Map;
import t2.r;

/* JADX INFO: renamed from: t2.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6630q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f60617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a[] f60618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f60619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f60620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f60621e;

    /* JADX INFO: renamed from: t2.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f60623b;

        private a(String str, int i10) {
            this.f60622a = str;
            this.f60623b = i10;
        }

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C6630q.h(bArr));
            return new a(str, C6630q.f(i10, str));
        }
    }

    /* JADX INFO: renamed from: t2.q$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f60625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f60626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f60627d = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f60628e = new int[4];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f60629f = 9729;

        private b(String str, int i10, int i11) {
            this.f60624a = str;
            this.f60625b = i10;
            this.f60626c = i11;
        }

        public static b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C6630q.h(bArr));
            return new b(str, C6630q.i(i10, str), iArr2[0]);
        }
    }

    public C6630q(String str, String str2) throws r.a {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f60617a = iGlCreateProgram;
        r.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        r.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f60620d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f60618b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f60617a, i10);
            this.f60618b[i10] = aVarA;
            this.f60620d.put(aVarA.f60622a, aVarA);
        }
        this.f60621e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f60617a, 35718, iArr3, 0);
        this.f60619c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b bVarA = b.a(this.f60617a, i11);
            this.f60619c[i11] = bVarA;
            this.f60621e.put(bVarA.f60624a, bVarA);
        }
        r.b();
    }

    private static void d(int i10, int i11, String str) throws r.a {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        r.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        r.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int g(String str) {
        return f(this.f60617a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) throws r.a {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        r.b();
        return iG;
    }

    public int j(String str) {
        return i(this.f60617a, str);
    }
}
