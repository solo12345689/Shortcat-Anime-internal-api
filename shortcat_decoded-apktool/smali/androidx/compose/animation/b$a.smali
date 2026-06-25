.class final Landroidx/compose/animation/b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/b;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroidx/compose/ui/layout/s;

.field final synthetic b:Landroidx/compose/animation/b;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>([Landroidx/compose/ui/layout/s;Landroidx/compose/animation/b;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/b$a;->a:[Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/b$a;->b:Landroidx/compose/animation/b;

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/animation/b$a;->c:I

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/animation/b$a;->d:I

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/b$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 14

    .line 2
    iget-object v0, p0, Landroidx/compose/animation/b$a;->a:[Landroidx/compose/ui/layout/s;

    iget-object v1, p0, Landroidx/compose/animation/b$a;->b:Landroidx/compose/animation/b;

    iget v2, p0, Landroidx/compose/animation/b$a;->c:I

    iget v3, p0, Landroidx/compose/animation/b$a;->d:I

    .line 3
    array-length v4, v0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v7, v0, v5

    if-eqz v7, :cond_0

    .line 4
    invoke-virtual {v1}, Landroidx/compose/animation/b;->a()Landroidx/compose/animation/e;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/animation/e;->g()Ll0/e;

    move-result-object v8

    .line 5
    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v6

    invoke-virtual {v7}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v9

    invoke-static {v6, v9}, Li1/s;->a(II)J

    move-result-wide v9

    .line 6
    invoke-static {v2, v3}, Li1/s;->a(II)J

    move-result-wide v11

    .line 7
    sget-object v13, Li1/t;->a:Li1/t;

    .line 8
    invoke-interface/range {v8 .. v13}, Ll0/e;->a(JJLi1/t;)J

    move-result-wide v8

    move-wide v9, v8

    .line 9
    invoke-static {v9, v10}, Li1/n;->k(J)I

    move-result v8

    invoke-static {v9, v10}, Li1/n;->l(J)I

    move-result v9

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v6, p1

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/s$a;->N(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    goto :goto_1

    :cond_0
    move-object v6, p1

    :goto_1
    add-int/lit8 v5, v5, 0x1

    move-object p1, v6

    goto :goto_0

    :cond_1
    return-void
.end method
