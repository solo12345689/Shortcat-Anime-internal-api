.class final LU/F$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/F;->measure-3p2s80s(Landroidx/compose/ui/layout/l;LI0/A;J)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroidx/compose/ui/layout/s;

.field final synthetic c:I


# direct methods
.method constructor <init>(ILandroidx/compose/ui/layout/s;I)V
    .locals 0

    .line 1
    iput p1, p0, LU/F$a;->a:I

    .line 2
    .line 3
    iput-object p2, p0, LU/F$a;->b:Landroidx/compose/ui/layout/s;

    .line 4
    .line 5
    iput p3, p0, LU/F$a;->c:I

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, LU/F$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 9

    .line 2
    iget v0, p0, LU/F$a;->a:I

    iget-object v1, p0, LU/F$a;->b:Landroidx/compose/ui/layout/s;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/s;->W0()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lke/a;->d(F)I

    move-result v4

    .line 3
    iget v0, p0, LU/F$a;->c:I

    iget-object v2, p0, LU/F$a;->b:Landroidx/compose/ui/layout/s;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/s;->P0()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    div-float/2addr v0, v1

    invoke-static {v0}, Lke/a;->d(F)I

    move-result v5

    .line 4
    iget-object v3, p0, LU/F$a;->b:Landroidx/compose/ui/layout/s;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/s$a;->N(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    return-void
.end method
