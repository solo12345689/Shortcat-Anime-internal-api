.class abstract LC2/P$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method public static a(Landroid/media/AudioTrack;LC2/P$h;)J
    .locals 7

    .line 1
    iget v0, p1, LC2/P$h;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    int-to-long v0, p0

    .line 10
    invoke-virtual {p1, v0, v1}, LC2/P$h;->d(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    int-to-long v0, p0

    .line 20
    iget p0, p1, LC2/P$h;->g:I

    .line 21
    .line 22
    invoke-static {p0}, LC2/P;->q(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-long v4, p0

    .line 27
    sget-object v6, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 28
    .line 29
    const-wide/32 v2, 0xf4240

    .line 30
    .line 31
    .line 32
    invoke-static/range {v0 .. v6}, Lt2/a0;->o1(JJJLjava/math/RoundingMode;)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
.end method

.method public static b(Landroid/media/AudioTrack;LC2/j;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p1, LC2/j;->a:Landroid/media/AudioDeviceInfo;

    .line 6
    .line 7
    :goto_0
    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
