.class final Landroidx/compose/ui/platform/P$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/P;->b(Landroidx/compose/ui/platform/g1;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/g1;

.field final synthetic b:Landroidx/compose/ui/platform/P;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/g1;Landroidx/compose/ui/platform/P;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/P$b;->a:Landroidx/compose/ui/platform/g1;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/P$b;->b:Landroidx/compose/ui/platform/P;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LGf/O;)Landroidx/compose/ui/platform/R0;
    .locals 3

    .line 1
    new-instance p1, Landroidx/compose/ui/platform/R0;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/ui/platform/P$b;->a:Landroidx/compose/ui/platform/g1;

    .line 4
    .line 5
    new-instance v1, Landroidx/compose/ui/platform/P$b$a;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/compose/ui/platform/P$b;->b:Landroidx/compose/ui/platform/P;

    .line 8
    .line 9
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/P$b$a;-><init>(Landroidx/compose/ui/platform/P;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, v0, v1}, Landroidx/compose/ui/platform/R0;-><init>(Landroidx/compose/ui/platform/g1;Lie/a;)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/O;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/P$b;->a(LGf/O;)Landroidx/compose/ui/platform/R0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
