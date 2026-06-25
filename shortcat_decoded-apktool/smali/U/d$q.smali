.class final LU/d$q;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->g(Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function2;LU0/Y0;FLkotlin/jvm/functions/Function2;LU0/Y0;Lkotlin/jvm/functions/Function2;Lie/o;FFLC/P;LU/k0;LU/m0;LY/m;III)V
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
    iput-object p1, p0, LU/d$q;->a:LU/m0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 2

    .line 1
    iget-object v0, p0, LU/d$q;->a:LU/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LU/m0;->getState()LU/n0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LU/n0;->d()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-float/2addr v1, p1

    .line 12
    invoke-virtual {v0, v1}, LU/n0;->h(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, LU/d$q;->a(F)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p1
.end method
