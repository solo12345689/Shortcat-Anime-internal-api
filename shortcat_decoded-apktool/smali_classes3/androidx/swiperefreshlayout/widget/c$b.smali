.class Landroidx/swiperefreshlayout/widget/c$b;
.super Landroid/view/animation/Animation;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/swiperefreshlayout/widget/c;->A(Landroid/view/animation/Animation$AnimationListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/swiperefreshlayout/widget/c;


# direct methods
.method constructor <init>(Landroidx/swiperefreshlayout/widget/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/swiperefreshlayout/widget/c$b;->a:Landroidx/swiperefreshlayout/widget/c;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 0

    .line 1
    iget-object p2, p0, Landroidx/swiperefreshlayout/widget/c$b;->a:Landroidx/swiperefreshlayout/widget/c;

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Landroidx/swiperefreshlayout/widget/c;->setAnimationProgress(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
