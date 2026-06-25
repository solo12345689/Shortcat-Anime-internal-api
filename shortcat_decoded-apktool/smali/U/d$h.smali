.class final LU/d$h;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->b(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LU0/Y0;ZLkotlin/jvm/functions/Function2;Lie/o;FLC/P;LU/k0;LU/m0;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LU/m0;


# direct methods
.method constructor <init>(LU/m0;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/d$h;->a:LU/m0;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Float;
    .locals 3

    .line 2
    iget-object v0, p0, LU/d$h;->a:LU/m0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LU/m0;->getState()LU/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LU/n0;->f()F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const v2, 0x3c23d70a    # 0.01f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    .line 3
    :cond_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LU/d$h;->invoke()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
