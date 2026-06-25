.class public final LSa/o$f;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSa/o;->k(Landroid/animation/AnimatorSet;ZLcom/swmansion/rnscreens/X;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LSa/o;


# direct methods
.method constructor <init>(LSa/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LSa/o$f;->a:LSa/o;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LSa/o$f;->a:LSa/o;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, LSa/o;->j(LSa/o;Z)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LSa/o$f;->a:LSa/o;

    .line 13
    .line 14
    invoke-virtual {p1}, LSa/o;->A()Lcom/swmansion/rnscreens/y;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->y()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LSa/o$f;->a:LSa/o;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {p1, v0}, LSa/o;->j(LSa/o;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
