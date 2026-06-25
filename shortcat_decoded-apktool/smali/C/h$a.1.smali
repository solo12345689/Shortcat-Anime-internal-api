.class final LC/h$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/h;->c([Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;I[III[IIII)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroidx/compose/ui/layout/s;

.field final synthetic b:LC/h;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Landroidx/compose/ui/layout/l;

.field final synthetic f:[I


# direct methods
.method constructor <init>([Landroidx/compose/ui/layout/s;LC/h;IILandroidx/compose/ui/layout/l;[I)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/h$a;->a:[Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, LC/h$a;->b:LC/h;

    .line 4
    .line 5
    iput p3, p0, LC/h$a;->c:I

    .line 6
    .line 7
    iput p4, p0, LC/h$a;->d:I

    .line 8
    .line 9
    iput-object p5, p0, LC/h$a;->e:Landroidx/compose/ui/layout/l;

    .line 10
    .line 11
    iput-object p6, p0, LC/h$a;->f:[I

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

    invoke-virtual {p0, p1}, LC/h$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 21

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, LC/h$a;->a:[Landroidx/compose/ui/layout/s;

    iget-object v2, v0, LC/h$a;->b:LC/h;

    iget v5, v0, LC/h$a;->c:I

    iget v6, v0, LC/h$a;->d:I

    iget-object v8, v0, LC/h$a;->e:Landroidx/compose/ui/layout/l;

    iget-object v9, v0, LC/h$a;->f:[I

    .line 3
    array-length v10, v1

    const/4 v3, 0x0

    move v11, v3

    move v12, v11

    :goto_0
    if-ge v11, v10, :cond_0

    aget-object v14, v1, v11

    add-int/lit8 v20, v12, 0x1

    .line 4
    invoke-static {v14}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 5
    invoke-static {v14}, LC/C;->d(Landroidx/compose/ui/layout/s;)LC/F;

    move-result-object v4

    .line 6
    invoke-interface {v8}, LI0/m;->getLayoutDirection()Li1/t;

    move-result-object v7

    move-object v3, v14

    .line 7
    invoke-static/range {v2 .. v7}, LC/h;->g(LC/h;Landroidx/compose/ui/layout/s;LC/F;IILi1/t;)I

    move-result v15

    .line 8
    aget v16, v9, v12

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-object/from16 v13, p1

    .line 9
    invoke-static/range {v13 .. v19}, Landroidx/compose/ui/layout/s$a;->N(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    add-int/lit8 v11, v11, 0x1

    move/from16 v12, v20

    goto :goto_0

    :cond_0
    return-void
.end method
