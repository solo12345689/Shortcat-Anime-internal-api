package io.sentry.android.replay.video;

import Df.r;
import Td.AbstractC2163n;
import Td.q;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import ie.InterfaceC5082a;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    private final C5322z3 f50461a;

    /* JADX INFO: renamed from: b */
    private final io.sentry.android.replay.video.a f50462b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5082a f50463c;

    /* JADX INFO: renamed from: d */
    private final Lazy f50464d;

    /* JADX INFO: renamed from: e */
    private final MediaCodec f50465e;

    /* JADX INFO: renamed from: f */
    private final Lazy f50466f;

    /* JADX INFO: renamed from: g */
    private final MediaCodec.BufferInfo f50467g;

    /* JADX INFO: renamed from: h */
    private final io.sentry.android.replay.video.b f50468h;

    /* JADX INFO: renamed from: i */
    private Surface f50469i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final a f50470a = new a();

        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            boolean z10 = false;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            AbstractC5504s.g(codecInfos, "getCodecInfos(...)");
            int length = codecInfos.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                String name = codecInfos[i10].getName();
                AbstractC5504s.g(name, "getName(...)");
                if (r.W(name, "c2.exynos", false, 2, null)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a */
        public final MediaFormat invoke() {
            int iA = c.this.g().a();
            try {
                MediaCodecInfo.VideoCapabilities videoCapabilities = c.this.e().getCodecInfo().getCapabilitiesForType(c.this.g().d()).getVideoCapabilities();
                if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(iA))) {
                    c.this.h().getLogger().c(EnumC5215i3.DEBUG, "Encoder doesn't support the provided bitRate: " + iA + ", the value will be clamped to the closest one", new Object[0]);
                    Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(iA));
                    AbstractC5504s.g(objClamp, "clamp(...)");
                    iA = ((Number) objClamp).intValue();
                }
            } catch (Throwable th2) {
                c.this.h().getLogger().b(EnumC5215i3.DEBUG, "Could not retrieve MediaCodec info", th2);
            }
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(c.this.g().d(), c.this.g().f(), c.this.g().e());
            AbstractC5504s.g(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", iA);
            mediaFormatCreateVideoFormat.setFloat("frame-rate", c.this.g().c());
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
            return mediaFormatCreateVideoFormat;
        }
    }

    public c(C5322z3 options, io.sentry.android.replay.video.a muxerConfig, InterfaceC5082a interfaceC5082a) {
        AbstractC5504s.h(options, "options");
        AbstractC5504s.h(muxerConfig, "muxerConfig");
        this.f50461a = options;
        this.f50462b = muxerConfig;
        this.f50463c = interfaceC5082a;
        q qVar = q.f17463c;
        this.f50464d = AbstractC2163n.a(qVar, a.f50470a);
        MediaCodec mediaCodecCreateByCodecName = d() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.d());
        AbstractC5504s.e(mediaCodecCreateByCodecName);
        this.f50465e = mediaCodecCreateByCodecName;
        this.f50466f = AbstractC2163n.a(qVar, new b());
        this.f50467g = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.b().getAbsolutePath();
        AbstractC5504s.g(absolutePath, "getAbsolutePath(...)");
        this.f50468h = new io.sentry.android.replay.video.b(absolutePath, muxerConfig.c());
    }

    private final void a(boolean z10) {
        int iDequeueOutputBuffer;
        ByteBuffer byteBuffer;
        if (this.f50461a.getSessionReplay().u()) {
            this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: drainCodec(" + z10 + ')', new Object[0]);
        }
        if (z10) {
            if (this.f50461a.getSessionReplay().u()) {
                this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            this.f50465e.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.f50465e.getOutputBuffers();
        while (true) {
            iDequeueOutputBuffer = this.f50465e.dequeueOutputBuffer(this.f50467g, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z10) {
                    return;
                }
                if (this.f50461a.getSessionReplay().u()) {
                    this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.f50465e.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.f50468h.b()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.f50465e.getOutputFormat();
                AbstractC5504s.g(outputFormat, "getOutputFormat(...)");
                if (this.f50461a.getSessionReplay().u()) {
                    this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                }
                this.f50468h.e(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                if (this.f50461a.getSessionReplay().u()) {
                    this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: " + iDequeueOutputBuffer, new Object[0]);
                }
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    break;
                }
                if ((this.f50467g.flags & 2) != 0) {
                    if (this.f50461a.getSessionReplay().u()) {
                        this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                    }
                    this.f50467g.size = 0;
                }
                if (this.f50467g.size != 0) {
                    if (!this.f50468h.b()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.f50468h.c(byteBuffer, this.f50467g);
                    if (this.f50461a.getSessionReplay().u()) {
                        this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: sent " + this.f50467g.size + " bytes to muxer", new Object[0]);
                    }
                }
                this.f50465e.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.f50467g.flags & 4) != 0) {
                    if (this.f50461a.getSessionReplay().u()) {
                        if (z10) {
                            this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            this.f50461a.getLogger().c(EnumC5215i3.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                    return;
                }
            }
        }
        throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
    }

    private final boolean d() {
        return ((Boolean) this.f50464d.getValue()).booleanValue();
    }

    private final MediaFormat f() {
        return (MediaFormat) this.f50466f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Bitmap r8) {
        /*
            r7 = this;
            java.lang.String r0 = "image"
            kotlin.jvm.internal.AbstractC5504s.h(r8, r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            java.lang.String r2 = "xiaomi"
            r3 = 1
            boolean r2 = Df.r.U(r0, r2, r3)
            r4 = 0
            if (r2 != 0) goto L4a
            kotlin.jvm.internal.AbstractC5504s.g(r0, r1)
            java.lang.String r1 = "motorola"
            boolean r0 = Df.r.U(r0, r1, r3)
            if (r0 != 0) goto L4a
            io.sentry.android.replay.util.o r0 = io.sentry.android.replay.util.o.f50437a
            io.sentry.android.replay.util.o$a r1 = io.sentry.android.replay.util.o.a.SOC_MANUFACTURER
            r2 = 2
            java.lang.String r5 = io.sentry.android.replay.util.o.b(r0, r1, r4, r2, r4)
            java.lang.String r6 = "spreadtrum"
            boolean r5 = Df.r.B(r5, r6, r3)
            if (r5 != 0) goto L4a
            java.lang.String r0 = io.sentry.android.replay.util.o.b(r0, r1, r4, r2, r4)
            java.lang.String r1 = "unisoc"
            boolean r0 = Df.r.B(r0, r1, r3)
            if (r0 == 0) goto L3f
            goto L4a
        L3f:
            android.view.Surface r0 = r7.f50469i
            if (r0 == 0) goto L48
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
            goto L52
        L48:
            r0 = r4
            goto L52
        L4a:
            android.view.Surface r0 = r7.f50469i
            if (r0 == 0) goto L48
            android.graphics.Canvas r0 = r0.lockCanvas(r4)
        L52:
            if (r0 == 0) goto L58
            r1 = 0
            r0.drawBitmap(r8, r1, r1, r4)
        L58:
            android.view.Surface r8 = r7.f50469i
            if (r8 == 0) goto L5f
            r8.unlockCanvasAndPost(r0)
        L5f:
            r8 = 0
            r7.a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.c.b(android.graphics.Bitmap):void");
    }

    public final long c() {
        return this.f50468h.a();
    }

    public final MediaCodec e() {
        return this.f50465e;
    }

    public final io.sentry.android.replay.video.a g() {
        return this.f50462b;
    }

    public final C5322z3 h() {
        return this.f50461a;
    }

    public final void i() {
        try {
            InterfaceC5082a interfaceC5082a = this.f50463c;
            if (interfaceC5082a != null) {
                interfaceC5082a.invoke();
            }
            a(true);
            this.f50465e.stop();
            this.f50465e.release();
            Surface surface = this.f50469i;
            if (surface != null) {
                surface.release();
            }
            this.f50468h.d();
        } catch (Throwable th2) {
            this.f50461a.getLogger().b(EnumC5215i3.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    public final void j() {
        this.f50465e.configure(f(), (Surface) null, (MediaCrypto) null, 1);
        this.f50469i = this.f50465e.createInputSurface();
        this.f50465e.start();
        a(false);
    }

    public /* synthetic */ c(C5322z3 c5322z3, io.sentry.android.replay.video.a aVar, InterfaceC5082a interfaceC5082a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5322z3, aVar, (i10 & 4) != 0 ? null : interfaceC5082a);
    }
}
