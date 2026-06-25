.class public Lb2/c$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lb2/c$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field a:Landroid/animation/ValueAnimator$DurationScaleChangeListener;

.field final synthetic b:Lb2/c;


# direct methods
.method public constructor <init>(Lb2/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb2/c$d;->b:Lb2/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c(Lb2/c$d;F)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb2/c$d;->b:Lb2/c;

    .line 2
    .line 3
    iput p1, p0, Lb2/c;->h:F

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb2/c$d;->a:Landroid/animation/ValueAnimator$DurationScaleChangeListener;

    .line 2
    .line 3
    invoke-static {v0}, Lb2/d;->a(Landroid/animation/ValueAnimator$DurationScaleChangeListener;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lb2/c$d;->a:Landroid/animation/ValueAnimator$DurationScaleChangeListener;

    .line 9
    .line 10
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/c$d;->a:Landroid/animation/ValueAnimator$DurationScaleChangeListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lb2/f;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lb2/f;-><init>(Lb2/c$d;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lb2/c$d;->a:Landroid/animation/ValueAnimator$DurationScaleChangeListener;

    .line 11
    .line 12
    invoke-static {v0}, Lb2/e;->a(Landroid/animation/ValueAnimator$DurationScaleChangeListener;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    return v0
.end method
