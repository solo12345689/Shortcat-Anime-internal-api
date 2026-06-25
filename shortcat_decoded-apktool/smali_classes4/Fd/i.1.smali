.class public final synthetic LFd/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Lexpo/modules/video/FullscreenPlayerActivity;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/video/FullscreenPlayerActivity;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LFd/i;->a:Lexpo/modules/video/FullscreenPlayerActivity;

    .line 5
    .line 6
    iput-boolean p2, p0, LFd/i;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 11

    .line 1
    iget-object v0, p0, LFd/i;->a:Lexpo/modules/video/FullscreenPlayerActivity;

    .line 2
    .line 3
    iget-boolean v1, p0, LFd/i;->b:Z

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    move v3, p2

    .line 7
    move v4, p3

    .line 8
    move v5, p4

    .line 9
    move/from16 v6, p5

    .line 10
    .line 11
    move/from16 v7, p6

    .line 12
    .line 13
    move/from16 v8, p7

    .line 14
    .line 15
    move/from16 v9, p8

    .line 16
    .line 17
    move/from16 v10, p9

    .line 18
    .line 19
    invoke-static/range {v0 .. v10}, Lexpo/modules/video/FullscreenPlayerActivity;->g(Lexpo/modules/video/FullscreenPlayerActivity;ZLandroid/view/View;IIIIIIII)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
