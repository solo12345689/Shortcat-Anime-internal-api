.class abstract LC2/e$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# direct methods
.method public static a(Landroid/media/AudioManager;Lq2/c;)LC2/e;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lq2/c;->b()Lq2/c$d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, Lq2/c$d;->a:Landroid/media/AudioAttributes;

    .line 6
    .line 7
    invoke-static {p0, p1}, LC2/h;->a(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance p1, LC2/e;

    .line 12
    .line 13
    invoke-static {p0}, LC2/e;->a(Ljava/util/List;)LP9/u;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, v0}, LC2/e;-><init>(Ljava/util/List;LC2/e$a;)V

    .line 19
    .line 20
    .line 21
    return-object p1
.end method

.method public static b(Landroid/media/AudioManager;Lq2/c;)LC2/j;
    .locals 1

    .line 1
    invoke-static {p0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroid/media/AudioManager;

    .line 6
    .line 7
    invoke-virtual {p1}, Lq2/c;->b()Lq2/c$d;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Lq2/c$d;->a:Landroid/media/AudioAttributes;

    .line 12
    .line 13
    invoke-static {p0, p1}, LC2/g;->a(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0

    .line 25
    :cond_0
    new-instance p1, LC2/j;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Landroid/media/AudioDeviceInfo;

    .line 33
    .line 34
    invoke-direct {p1, p0}, LC2/j;-><init>(Landroid/media/AudioDeviceInfo;)V

    .line 35
    .line 36
    .line 37
    return-object p1
.end method
