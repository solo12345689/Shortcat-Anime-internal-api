.class public final synthetic Landroidx/media3/exoplayer/Z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Z

.field public final synthetic c:Landroidx/media3/exoplayer/Y;

.field public final synthetic d:LB2/K1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLandroidx/media3/exoplayer/Y;LB2/K1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/Z;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/media3/exoplayer/Z;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/media3/exoplayer/Z;->c:Landroidx/media3/exoplayer/Y;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/media3/exoplayer/Z;->d:LB2/K1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/Z;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/media3/exoplayer/Z;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/media3/exoplayer/Z;->c:Landroidx/media3/exoplayer/Y;

    .line 6
    .line 7
    iget-object v3, p0, Landroidx/media3/exoplayer/Z;->d:LB2/K1;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Landroidx/media3/exoplayer/Y$b;->a(Landroid/content/Context;ZLandroidx/media3/exoplayer/Y;LB2/K1;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
