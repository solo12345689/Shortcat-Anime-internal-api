.class public final synthetic LF2/E;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic a:LF2/J;

.field public final synthetic b:LF2/A$b;


# direct methods
.method public synthetic constructor <init>(LF2/J;LF2/A$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LF2/E;->a:LF2/J;

    .line 5
    .line 6
    iput-object p2, p0, LF2/E;->b:LF2/A$b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 7

    .line 1
    iget-object v0, p0, LF2/E;->a:LF2/J;

    .line 2
    .line 3
    iget-object v1, p0, LF2/E;->b:LF2/A$b;

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    move v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-static/range {v0 .. v6}, LF2/J;->p(LF2/J;LF2/A$b;Landroid/media/MediaDrm;[BII[B)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
