.class final Landroidx/compose/foundation/layout/g$c;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/g;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroidx/compose/ui/layout/s;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Landroidx/compose/ui/layout/l;

.field final synthetic d:Lkotlin/jvm/internal/L;

.field final synthetic e:Lkotlin/jvm/internal/L;

.field final synthetic f:Landroidx/compose/foundation/layout/g;


# direct methods
.method constructor <init>([Landroidx/compose/ui/layout/s;Ljava/util/List;Landroidx/compose/ui/layout/l;Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;Landroidx/compose/foundation/layout/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/g$c;->a:[Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/layout/g$c;->b:Ljava/util/List;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/layout/g$c;->c:Landroidx/compose/ui/layout/l;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/layout/g$c;->d:Lkotlin/jvm/internal/L;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/layout/g$c;->e:Lkotlin/jvm/internal/L;

    .line 10
    .line 11
    iput-object p6, p0, Landroidx/compose/foundation/layout/g$c;->f:Landroidx/compose/foundation/layout/g;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/g$c;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 18

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Landroidx/compose/foundation/layout/g$c;->a:[Landroidx/compose/ui/layout/s;

    iget-object v2, v0, Landroidx/compose/foundation/layout/g$c;->b:Ljava/util/List;

    iget-object v3, v0, Landroidx/compose/foundation/layout/g$c;->c:Landroidx/compose/ui/layout/l;

    iget-object v4, v0, Landroidx/compose/foundation/layout/g$c;->d:Lkotlin/jvm/internal/L;

    iget-object v5, v0, Landroidx/compose/foundation/layout/g$c;->e:Lkotlin/jvm/internal/L;

    iget-object v6, v0, Landroidx/compose/foundation/layout/g$c;->f:Landroidx/compose/foundation/layout/g;

    .line 3
    array-length v7, v1

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    if-ge v8, v7, :cond_0

    aget-object v11, v1, v8

    add-int/lit8 v17, v9, 0x1

    .line 4
    const-string v10, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    invoke-static {v11, v10}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, LI0/A;

    .line 6
    invoke-interface {v3}, LI0/m;->getLayoutDirection()Li1/t;

    move-result-object v13

    iget v14, v4, Lkotlin/jvm/internal/L;->a:I

    iget v15, v5, Lkotlin/jvm/internal/L;->a:I

    invoke-static {v6}, Landroidx/compose/foundation/layout/g;->a(Landroidx/compose/foundation/layout/g;)Ll0/e;

    move-result-object v16

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/f;->c(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;LI0/A;Li1/t;IILl0/e;)V

    add-int/lit8 v8, v8, 0x1

    move/from16 v9, v17

    goto :goto_0

    :cond_0
    return-void
.end method
