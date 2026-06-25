.class final Landroidx/compose/ui/graphics/vector/VectorPainter$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/graphics/vector/VectorPainter;-><init>(Lx0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/graphics/vector/VectorPainter;


# direct methods
.method constructor <init>(Landroidx/compose/ui/graphics/vector/VectorPainter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter$a;->a:Landroidx/compose/ui/graphics/vector/VectorPainter;

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
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/graphics/vector/VectorPainter$a;->invoke()V

    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorPainter$a;->a:Landroidx/compose/ui/graphics/vector/VectorPainter;

    invoke-static {v0}, Landroidx/compose/ui/graphics/vector/VectorPainter;->n(Landroidx/compose/ui/graphics/vector/VectorPainter;)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter$a;->a:Landroidx/compose/ui/graphics/vector/VectorPainter;

    invoke-static {v1}, Landroidx/compose/ui/graphics/vector/VectorPainter;->o(Landroidx/compose/ui/graphics/vector/VectorPainter;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/graphics/vector/VectorPainter$a;->a:Landroidx/compose/ui/graphics/vector/VectorPainter;

    invoke-static {v0}, Landroidx/compose/ui/graphics/vector/VectorPainter;->o(Landroidx/compose/ui/graphics/vector/VectorPainter;)I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/graphics/vector/VectorPainter$a;->a:Landroidx/compose/ui/graphics/vector/VectorPainter;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Landroidx/compose/ui/graphics/vector/VectorPainter;->p(Landroidx/compose/ui/graphics/vector/VectorPainter;I)V

    :cond_0
    return-void
.end method
