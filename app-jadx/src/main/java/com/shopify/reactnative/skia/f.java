package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.Point;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f44226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f44227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaExtractor f44228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MediaCodec f44229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageReader f44230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Surface f44231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MediaPlayer f44232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f44233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f44234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f44235j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f44236k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f44237l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44238m = false;

    f(Context context, String str) {
        this.f44226a = Uri.parse(str);
        this.f44227b = context;
        d();
    }

    private void b() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = this.f44229d.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            int sampleData = this.f44228c.readSampleData(this.f44229d.getInputBuffer(iDequeueInputBuffer), 0);
            if (sampleData < 0) {
                this.f44229d.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.f44229d.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.f44228c.getSampleTime(), 0);
                this.f44228c.advance();
            }
        }
        int iDequeueOutputBuffer = this.f44229d.dequeueOutputBuffer(bufferInfo, 10000L);
        if (iDequeueOutputBuffer >= 0) {
            this.f44229d.releaseOutputBuffer(iDequeueOutputBuffer, true);
        }
    }

    private boolean c() {
        int iDequeueOutputBuffer = this.f44229d.dequeueOutputBuffer(new MediaCodec.BufferInfo(), 0L);
        if (iDequeueOutputBuffer < 0) {
            return false;
        }
        this.f44229d.releaseOutputBuffer(iDequeueOutputBuffer, true);
        return true;
    }

    private void d() {
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f44228c = mediaExtractor;
        try {
            mediaExtractor.setDataSource(this.f44227b, this.f44226a, (Map<String, String>) null);
            int iF = f(this.f44228c);
            if (iF < 0) {
                throw new RuntimeException("No video track found in " + this.f44226a);
            }
            this.f44228c.selectTrack(iF);
            MediaFormat trackFormat = this.f44228c.getTrackFormat(iF);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f44232g = mediaPlayer;
            mediaPlayer.setDataSource(this.f44227b, this.f44226a);
            this.f44232g.setAudioStreamType(3);
            this.f44232g.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.shopify.reactnative.skia.e
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.f44225a.e(mediaPlayer2);
                }
            });
            this.f44232g.prepareAsync();
            if (trackFormat.containsKey("durationUs")) {
                this.f44233h = trackFormat.getLong("durationUs") / 1000;
            }
            if (trackFormat.containsKey("frame-rate")) {
                this.f44234i = trackFormat.getInteger("frame-rate");
            }
            if (trackFormat.containsKey("rotation-degrees")) {
                this.f44235j = trackFormat.getInteger("rotation-degrees");
            }
            this.f44236k = trackFormat.getInteger("width");
            int integer = trackFormat.getInteger("height");
            this.f44237l = integer;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f44230e = ImageReader.newInstance(this.f44236k, integer, 34, 2, 256L);
            } else {
                this.f44230e = ImageReader.newInstance(this.f44236k, integer, 34, 2);
            }
            this.f44231f = this.f44230e.getSurface();
            MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
            this.f44229d = mediaCodecCreateDecoderByType;
            mediaCodecCreateDecoderByType.configure(trackFormat, this.f44231f, (MediaCrypto) null, 0);
            this.f44229d.start();
        } catch (IOException e10) {
            throw new RuntimeException("Failed to initialize extractor or decoder", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(MediaPlayer mediaPlayer) {
        this.f44233h = mediaPlayer.getDuration();
        mediaPlayer.start();
        this.f44238m = true;
    }

    private int f(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            if (mediaExtractor.getTrackFormat(i10).getString("mime").startsWith("video/")) {
                return i10;
            }
        }
        return -1;
    }

    public double getDuration() {
        return this.f44233h;
    }

    public double getFrameRate() {
        return this.f44234i;
    }

    public int getRotationDegrees() {
        return this.f44235j;
    }

    public Point getSize() {
        return new Point(this.f44236k, this.f44237l);
    }

    public HardwareBuffer nextImage() {
        if (!c()) {
            b();
        }
        Image imageAcquireLatestImage = this.f44230e.acquireLatestImage();
        if (imageAcquireLatestImage == null) {
            return null;
        }
        HardwareBuffer hardwareBuffer = imageAcquireLatestImage.getHardwareBuffer();
        imageAcquireLatestImage.close();
        return hardwareBuffer;
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f44232g;
        if (mediaPlayer == null || !this.f44238m) {
            return;
        }
        mediaPlayer.pause();
        this.f44238m = false;
    }

    public void play() {
        MediaPlayer mediaPlayer = this.f44232g;
        if (mediaPlayer == null || this.f44238m) {
            return;
        }
        mediaPlayer.start();
        this.f44238m = true;
    }

    public void seek(double d10) {
        long j10 = (long) (1000.0d * d10);
        this.f44228c.seekTo(j10, 2);
        MediaPlayer mediaPlayer = this.f44232g;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) d10, 3);
        }
        MediaCodec mediaCodec = this.f44229d;
        if (mediaCodec != null) {
            mediaCodec.flush();
            boolean z10 = true;
            while (z10) {
                b();
                if (this.f44228c.getSampleTime() >= j10) {
                    z10 = false;
                }
            }
        }
    }

    public void setVolume(float f10) {
        MediaPlayer mediaPlayer = this.f44232g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f10, f10);
        }
    }
}
