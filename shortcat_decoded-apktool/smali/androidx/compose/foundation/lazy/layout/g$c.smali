.class final Landroidx/compose/foundation/lazy/layout/g$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/g;->J1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/lazy/layout/g;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/g$c;->a:Landroidx/compose/foundation/lazy/layout/g;

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
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/g$c;->a:Landroidx/compose/foundation/lazy/layout/g;

    invoke-static {v0}, Landroidx/compose/foundation/lazy/layout/g;->F1(Landroidx/compose/foundation/lazy/layout/g;)LF/C;

    move-result-object v0

    invoke-interface {v0}, LF/C;->e()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/layout/g$c;->invoke()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
