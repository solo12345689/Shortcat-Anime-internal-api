.class final LJ2/A$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJ2/q$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:LJ2/A;


# direct methods
.method private constructor <init>(LJ2/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ2/A$d;->a:LJ2/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LJ2/A;LJ2/A$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LJ2/A$d;-><init>(LJ2/A;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/A$d;->a:LJ2/A;

    .line 2
    .line 3
    invoke-static {v0}, LJ2/A;->r0(LJ2/A;)Landroidx/media3/exoplayer/N0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LJ2/A$d;->a:LJ2/A;

    .line 10
    .line 11
    invoke-static {v0}, LJ2/A;->r0(LJ2/A;)Landroidx/media3/exoplayer/N0$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0$a;->b()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, LJ2/A$d;->a:LJ2/A;

    .line 2
    .line 3
    invoke-static {v0}, LJ2/A;->r0(LJ2/A;)Landroidx/media3/exoplayer/N0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LJ2/A$d;->a:LJ2/A;

    .line 10
    .line 11
    invoke-static {v0}, LJ2/A;->r0(LJ2/A;)Landroidx/media3/exoplayer/N0$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroidx/media3/exoplayer/N0$a;->b()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
