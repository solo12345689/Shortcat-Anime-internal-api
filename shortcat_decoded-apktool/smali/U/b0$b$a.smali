.class final LU/b0$b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/b0$b;->measure-3p2s80s(Landroidx/compose/ui/layout/l;Ljava/util/List;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/s;

.field final synthetic b:I

.field final synthetic c:Landroidx/compose/ui/layout/s;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Landroidx/compose/ui/layout/s;

.field final synthetic g:I

.field final synthetic h:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/s;ILandroidx/compose/ui/layout/s;IILandroidx/compose/ui/layout/s;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LU/b0$b$a;->a:Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput p2, p0, LU/b0$b$a;->b:I

    .line 4
    .line 5
    iput-object p3, p0, LU/b0$b$a;->c:Landroidx/compose/ui/layout/s;

    .line 6
    .line 7
    iput p4, p0, LU/b0$b$a;->d:I

    .line 8
    .line 9
    iput p5, p0, LU/b0$b$a;->e:I

    .line 10
    .line 11
    iput-object p6, p0, LU/b0$b$a;->f:Landroidx/compose/ui/layout/s;

    .line 12
    .line 13
    iput p7, p0, LU/b0$b$a;->g:I

    .line 14
    .line 15
    iput p8, p0, LU/b0$b$a;->h:I

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, LU/b0$b$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 14

    .line 2
    iget-object v1, p0, LU/b0$b$a;->a:Landroidx/compose/ui/layout/s;

    iget v3, p0, LU/b0$b$a;->b:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    move-object v7, v0

    .line 3
    iget-object v8, p0, LU/b0$b$a;->c:Landroidx/compose/ui/layout/s;

    if-eqz v8, :cond_0

    iget v9, p0, LU/b0$b$a;->d:I

    iget v10, p0, LU/b0$b$a;->e:I

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    .line 4
    :cond_0
    iget-object v8, p0, LU/b0$b$a;->f:Landroidx/compose/ui/layout/s;

    if-eqz v8, :cond_1

    iget v9, p0, LU/b0$b$a;->g:I

    iget v10, p0, LU/b0$b$a;->h:I

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/s$a;->W(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    :cond_1
    return-void
.end method
