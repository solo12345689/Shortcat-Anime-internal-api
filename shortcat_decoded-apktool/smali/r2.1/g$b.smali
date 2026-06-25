.class public final Lr2/g$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private c:Landroid/os/Handler;

.field private d:Lq2/c;

.field private e:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, Lq2/c;->h:Lq2/c;

    iput-object v0, p0, Lr2/g$b;->d:Lq2/c;

    .line 4
    iput p1, p0, Lr2/g$b;->a:I

    return-void
.end method

.method private constructor <init>(Lr2/g;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    invoke-virtual {p1}, Lr2/g;->e()I

    move-result v0

    iput v0, p0, Lr2/g$b;->a:I

    .line 7
    invoke-virtual {p1}, Lr2/g;->f()Landroid/media/AudioManager$OnAudioFocusChangeListener;

    move-result-object v0

    iput-object v0, p0, Lr2/g$b;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 8
    invoke-virtual {p1}, Lr2/g;->d()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lr2/g$b;->c:Landroid/os/Handler;

    .line 9
    invoke-virtual {p1}, Lr2/g;->b()Lq2/c;

    move-result-object v0

    iput-object v0, p0, Lr2/g$b;->d:Lq2/c;

    .line 10
    invoke-virtual {p1}, Lr2/g;->g()Z

    move-result p1

    iput-boolean p1, p0, Lr2/g$b;->e:Z

    return-void
.end method

.method synthetic constructor <init>(Lr2/g;Lr2/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lr2/g$b;-><init>(Lr2/g;)V

    return-void
.end method


# virtual methods
.method public a()Lr2/g;
    .locals 6

    .line 1
    iget-object v2, p0, Lr2/g$b;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 2
    .line 3
    if-eqz v2, :cond_0

    .line 4
    .line 5
    new-instance v0, Lr2/g;

    .line 6
    .line 7
    iget v1, p0, Lr2/g$b;->a:I

    .line 8
    .line 9
    iget-object v3, p0, Lr2/g$b;->c:Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {v3}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v4, p0, Lr2/g$b;->d:Lq2/c;

    .line 18
    .line 19
    iget-boolean v5, p0, Lr2/g$b;->e:Z

    .line 20
    .line 21
    invoke-direct/range {v0 .. v5}, Lr2/g;-><init>(ILandroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;Lq2/c;Z)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "Can\'t build an AudioFocusRequestCompat instance without a listener"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public b(Lq2/c;)Lr2/g$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr2/g$b;->d:Lq2/c;

    .line 5
    .line 6
    return-object p0
.end method

.method public c(Landroid/media/AudioManager$OnAudioFocusChangeListener;Landroid/os/Handler;)Lr2/g$b;
    .locals 0

    .line 1
    invoke-static {p1}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lr2/g$b;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 8
    .line 9
    iput-object p2, p0, Lr2/g$b;->c:Landroid/os/Handler;

    .line 10
    .line 11
    return-object p0
.end method

.method public d(Z)Lr2/g$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr2/g$b;->e:Z

    .line 2
    .line 3
    return-object p0
.end method
