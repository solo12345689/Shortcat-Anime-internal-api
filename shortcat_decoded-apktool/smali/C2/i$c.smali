.class final LC2/i$c;
.super Landroid/media/AudioDeviceCallback;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:LC2/i;


# direct methods
.method private constructor <init>(LC2/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, LC2/i$c;->a:LC2/i;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LC2/i;LC2/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LC2/i$c;-><init>(LC2/i;)V

    return-void
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object p1, p0, LC2/i$c;->a:LC2/i;

    .line 2
    .line 3
    invoke-static {p1}, LC2/i;->e(LC2/i;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LC2/i$c;->a:LC2/i;

    .line 8
    .line 9
    invoke-static {v1}, LC2/i;->a(LC2/i;)Lq2/c;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LC2/i$c;->a:LC2/i;

    .line 14
    .line 15
    invoke-static {v2}, LC2/i;->b(LC2/i;)LC2/j;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v1, v2}, LC2/e;->f(Landroid/content/Context;Lq2/c;LC2/j;)LC2/e;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p1, v0}, LC2/i;->d(LC2/i;LC2/e;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, LC2/i$c;->a:LC2/i;

    .line 2
    .line 3
    invoke-static {v0}, LC2/i;->b(LC2/i;)LC2/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, Lt2/a0;->u([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, LC2/i$c;->a:LC2/i;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p1, v0}, LC2/i;->c(LC2/i;LC2/j;)LC2/j;

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, LC2/i$c;->a:LC2/i;

    .line 20
    .line 21
    invoke-static {p1}, LC2/i;->e(LC2/i;)Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, LC2/i$c;->a:LC2/i;

    .line 26
    .line 27
    invoke-static {v1}, LC2/i;->a(LC2/i;)Lq2/c;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, LC2/i$c;->a:LC2/i;

    .line 32
    .line 33
    invoke-static {v2}, LC2/i;->b(LC2/i;)LC2/j;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v0, v1, v2}, LC2/e;->f(Landroid/content/Context;Lq2/c;LC2/j;)LC2/e;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {p1, v0}, LC2/i;->d(LC2/i;LC2/e;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
