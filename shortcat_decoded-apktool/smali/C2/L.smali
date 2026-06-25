.class public final synthetic LC2/L;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/media/AudioTrack;

.field public final synthetic b:LC2/z$d;

.field public final synthetic c:Landroid/os/Handler;

.field public final synthetic d:LC2/z$a;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;LC2/z$d;Landroid/os/Handler;LC2/z$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC2/L;->a:Landroid/media/AudioTrack;

    .line 5
    .line 6
    iput-object p2, p0, LC2/L;->b:LC2/z$d;

    .line 7
    .line 8
    iput-object p3, p0, LC2/L;->c:Landroid/os/Handler;

    .line 9
    .line 10
    iput-object p4, p0, LC2/L;->d:LC2/z$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, LC2/L;->a:Landroid/media/AudioTrack;

    .line 2
    .line 3
    iget-object v1, p0, LC2/L;->b:LC2/z$d;

    .line 4
    .line 5
    iget-object v2, p0, LC2/L;->c:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v3, p0, LC2/L;->d:LC2/z$a;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, LC2/P;->h(Landroid/media/AudioTrack;LC2/z$d;Landroid/os/Handler;LC2/z$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
