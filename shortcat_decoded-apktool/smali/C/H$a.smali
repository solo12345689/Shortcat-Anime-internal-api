.class final LC/H$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC/H;->c([Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/l;I[III[IIII)LI0/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroidx/compose/ui/layout/s;

.field final synthetic b:LC/H;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:[I


# direct methods
.method constructor <init>([Landroidx/compose/ui/layout/s;LC/H;II[I)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/H$a;->a:[Landroidx/compose/ui/layout/s;

    .line 2
    .line 3
    iput-object p2, p0, LC/H$a;->b:LC/H;

    .line 4
    .line 5
    iput p3, p0, LC/H$a;->c:I

    .line 6
    .line 7
    iput p4, p0, LC/H$a;->d:I

    .line 8
    .line 9
    iput-object p5, p0, LC/H$a;->e:[I

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/s$a;

    invoke-virtual {p0, p1}, LC/H$a;->invoke(Landroidx/compose/ui/layout/s$a;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/s$a;)V
    .locals 17

    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, LC/H$a;->a:[Landroidx/compose/ui/layout/s;

    iget-object v2, v0, LC/H$a;->b:LC/H;

    iget v3, v0, LC/H$a;->c:I

    iget v4, v0, LC/H$a;->d:I

    iget-object v5, v0, LC/H$a;->e:[I

    .line 3
    array-length v6, v1

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v10, v1, v7

    add-int/lit8 v16, v8, 0x1

    .line 4
    invoke-static {v10}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 5
    invoke-static {v10}, LC/C;->d(Landroidx/compose/ui/layout/s;)LC/F;

    move-result-object v9

    .line 6
    invoke-static {v2, v10, v9, v3, v4}, LC/H;->g(LC/H;Landroidx/compose/ui/layout/s;LC/F;II)I

    move-result v12

    .line 7
    aget v11, v5, v8

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    .line 8
    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/s$a;->N(Landroidx/compose/ui/layout/s$a;Landroidx/compose/ui/layout/s;IIFILjava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    move/from16 v8, v16

    goto :goto_0

    :cond_0
    return-void
.end method
