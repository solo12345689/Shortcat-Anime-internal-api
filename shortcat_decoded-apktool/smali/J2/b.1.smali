.class public final synthetic LJ2/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/media/MediaCodec$OnFrameRenderedListener;


# instance fields
.field public final synthetic a:LJ2/c;

.field public final synthetic b:LJ2/q$d;


# direct methods
.method public synthetic constructor <init>(LJ2/c;LJ2/q$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ2/b;->a:LJ2/c;

    .line 5
    .line 6
    iput-object p2, p0, LJ2/b;->b:LJ2/q$d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onFrameRendered(Landroid/media/MediaCodec;JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, LJ2/b;->a:LJ2/c;

    .line 2
    .line 3
    iget-object v1, p0, LJ2/b;->b:LJ2/q$d;

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    move-wide v3, p2

    .line 7
    move-wide v5, p4

    .line 8
    invoke-static/range {v0 .. v6}, LJ2/c;->r(LJ2/c;LJ2/q$d;Landroid/media/MediaCodec;JJ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
