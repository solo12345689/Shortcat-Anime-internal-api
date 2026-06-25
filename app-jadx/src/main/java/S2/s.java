package S2;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import t2.C6630q;
import t2.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends GLSurfaceView implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15833b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f15834a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final float[] f15835j = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final float[] f15836k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float[] f15837l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String[] f15838m = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final FloatBuffer f15839n = t2.r.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f15840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f15841b = new int[3];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f15842c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f15843d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f15844e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AtomicReference f15845f = new AtomicReference();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f15846g = new FloatBuffer[3];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private C6630q f15847h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f15848i;

        public a(GLSurfaceView gLSurfaceView) {
            this.f15840a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f15843d;
                this.f15844e[i10] = -1;
                iArr[i10] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f15841b, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f15847h.j(f15838m[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    t2.r.a(3553, this.f15841b[i10], 9729);
                }
                t2.r.b();
            } catch (r.a e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        public void a(z2.i iVar) {
            android.support.v4.media.session.b.a(this.f15845f.getAndSet(iVar));
            this.f15840a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            android.support.v4.media.session.b.a(this.f15845f.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                C6630q c6630q = new C6630q("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f15847h = c6630q;
                GLES20.glVertexAttribPointer(c6630q.e("in_pos"), 2, 5126, false, 0, (Buffer) f15839n);
                this.f15842c[0] = this.f15847h.e("in_tc_y");
                this.f15842c[1] = this.f15847h.e("in_tc_u");
                this.f15842c[2] = this.f15847h.e("in_tc_v");
                this.f15848i = this.f15847h.j("mColorConversion");
                t2.r.b();
                b();
                t2.r.b();
            } catch (r.a e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public s(Context context) {
        this(context, null);
    }

    public void setOutputBuffer(z2.i iVar) {
        this.f15834a.a(iVar);
    }

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f15834a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public t getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
