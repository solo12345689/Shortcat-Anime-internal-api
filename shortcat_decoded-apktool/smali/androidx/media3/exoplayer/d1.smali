.class public final synthetic Landroidx/media3/exoplayer/d1;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LO9/f;


# instance fields
.field public final synthetic a:Landroidx/media3/exoplayer/e1;

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/e1;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/media3/exoplayer/d1;->a:Landroidx/media3/exoplayer/e1;

    .line 5
    .line 6
    iput-boolean p2, p0, Landroidx/media3/exoplayer/d1;->b:Z

    .line 7
    .line 8
    iput p3, p0, Landroidx/media3/exoplayer/d1;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/d1;->a:Landroidx/media3/exoplayer/e1;

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/media3/exoplayer/d1;->b:Z

    .line 4
    .line 5
    iget v2, p0, Landroidx/media3/exoplayer/d1;->c:I

    .line 6
    .line 7
    check-cast p1, Landroidx/media3/exoplayer/e1$c;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, p1}, Landroidx/media3/exoplayer/e1;->j(Landroidx/media3/exoplayer/e1;ZILandroidx/media3/exoplayer/e1$c;)Landroidx/media3/exoplayer/e1$c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
