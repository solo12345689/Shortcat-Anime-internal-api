.class final Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->h()Lkotlin/jvm/functions/Function1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;


# direct methods
.method constructor <init>(Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$a;->a:Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/g;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$a;->invoke(Landroidx/compose/ui/graphics/g;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/g;)V
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$a;->a:Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    invoke-virtual {v0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->k()F

    move-result v0

    invoke-interface {p1, v0}, Li1/d;->l1(F)F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->v(F)V

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$a;->a:Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    invoke-virtual {v0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->l()Ls0/E1;

    move-result-object v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->s1(Ls0/E1;)V

    .line 4
    iget-object v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$a;->a:Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    invoke-virtual {v0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->j()Z

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/g;->n(Z)V

    .line 5
    iget-object v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$a;->a:Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    invoke-virtual {v0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->i()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/g;->k(J)V

    .line 6
    iget-object v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$a;->a:Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    invoke-virtual {v0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->m()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/g;->o(J)V

    return-void
.end method
